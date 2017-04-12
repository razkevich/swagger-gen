package ru.sbrf.swagger.gen.service;

import io.swagger.converter.ModelConverters;
import io.swagger.jaxrs.ext.SwaggerExtension;
import io.swagger.jaxrs.ext.SwaggerExtensions;
import io.swagger.models.*;
import io.swagger.models.Path;
import io.swagger.models.parameters.Parameter;
import io.swagger.models.properties.Property;
import io.swagger.models.properties.RefProperty;
import io.swagger.util.ParameterProcessor;
import io.swagger.util.PathUtils;
import io.swagger.util.ReflectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.annotation.AnnotationUtils;

import javax.ws.rs.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;

public class JaxrsReader {

    private Swagger swagger;

    public JaxrsReader(Swagger swagger) {
        this.swagger = swagger;
        SwaggerExtensions.setExtensions(new ArrayList<>());
    }

    public void read(Set<Class<?>> classes) {
        classes.forEach(this::read);
    }

    private void read(Class<?> cls) {
        for (Method method : cls.getMethods()) {
            javax.ws.rs.Path annotation = AnnotationUtils.findAnnotation(method, javax.ws.rs.Path.class);
            if (annotation != null) {
                String operationPath = getPath(AnnotationUtils.findAnnotation(cls, javax.ws.rs.Path.class), annotation);
                if (operationPath != null) {
                    Map<String, String> regexMap = new HashMap<>();
                    operationPath = PathUtils.parsePath(operationPath, regexMap);
                    String httpMethod = extractOperationMethod(method);
                    Operation operation = parseMethod(method);
                    updateOperationParameters(regexMap, operation);
                    final Consumes consumes = AnnotationUtils.findAnnotation(cls, Consumes.class);
                    final Produces produces = AnnotationUtils.findAnnotation(cls, Produces.class);
                    String[] apiConsumes = ObjectUtils.defaultIfNull(consumes == null ? null : consumes.value(), ArrayUtils.EMPTY_STRING_ARRAY);
                    String[] apiProduces = ObjectUtils.defaultIfNull(produces == null ? null : produces.value(), ArrayUtils.EMPTY_STRING_ARRAY);
                    apiConsumes = updateOperationConsumes(ArrayUtils.EMPTY_STRING_ARRAY, apiConsumes, operation);
                    apiProduces = updateOperationProduces(ArrayUtils.EMPTY_STRING_ARRAY, apiProduces, operation);
                    Class<?> responseClass = method.getReturnType();
                    boolean isSubResource = (responseClass != null) && (AnnotationUtils.findAnnotation(responseClass, javax.ws.rs.Path.class) != null);
                    if (isSubResource) {
                        read(responseClass);
                    }
                    updateOperation(apiConsumes, apiProduces, Collections.emptyMap(), Collections.emptyList(), operation);
                    updatePath(operationPath, httpMethod, operation);
                }
            }
        }
    }

    private void updatePath(String operationPath, String httpMethod, Operation operation) {
        Path path = swagger.getPath(operationPath);
        if (path == null) {
            swagger.path(operationPath, path = new Path());
        }
        path.set(httpMethod, operation);
    }

    private List<Parameter> getParameters(Type type, List<Annotation> annotations) {
        Iterator<SwaggerExtension> chain = SwaggerExtensions.chain();
        List<Parameter> parameters = new ArrayList<>();
        if (chain.hasNext()) {
            SwaggerExtension extension = chain.next();
            parameters = extension.extractParameters(annotations, type, Collections.emptySet(), chain);
        }
        Parameter param = ParameterProcessor.applyAnnotations(swagger, null, type, annotations);
        if (param != null) {
            parameters.add(param);
        }
        return parameters;
    }

    private Operation parseMethod(Method method) {
        Operation operation = new Operation();
        javax.ws.rs.Path apiOperation = AnnotationUtils.findAnnotation(method, javax.ws.rs.Path.class);
        String operationId = method.getName();
        Class<?> responseClass = null;
        Map<String, Property> defaultResponseHeaders = null;

        if (apiOperation != null) {
            defaultResponseHeaders = Collections.emptyMap();
            operation.summary(apiOperation.value()).description(StringUtils.EMPTY);
            responseClass = method.getReturnType();
        }
        operation.operationId(operationId);
        if (responseClass == null) {
            Type t = method.getGenericReturnType();
            responseClass = method.getReturnType();
            if (!responseClass.equals(Void.class) && !responseClass.equals(void.class)
                    && (AnnotationUtils.findAnnotation(responseClass, javax.ws.rs.Path.class) == null)) {
                ModelConverters.getInstance().readAll(t);
            }
        }
        if (!responseClass.equals(Void.class)
                && !responseClass.equals(javax.ws.rs.core.Response.class)
                && (AnnotationUtils.findAnnotation(responseClass, javax.ws.rs.Path.class) == null)) {
            if (isPrimitive(responseClass)) {
                Property property = ModelConverters.getInstance().readAsProperty(responseClass);
                if (property != null) {
                    operation.response(200, new Response()
                            .description("successful operation")
                            .schema(property)
                            .headers(defaultResponseHeaders));
                }
            } else if (!responseClass.equals(Void.class) && !responseClass.equals(void.class)) {
                Map<String, Model> models = ModelConverters.getInstance().read(responseClass);
                if (models.isEmpty()) {
                    Property p = ModelConverters.getInstance().readAsProperty(responseClass);
                    operation.response(200, new Response()
                            .description("successful operation")
                            .schema(p)
                            .headers(defaultResponseHeaders));
                }
                for (String key : models.keySet()) {
                    operation.response(200, new Response()
                            .description("successful operation")
                            .schema(new RefProperty().asDefault(key))
                            .headers(defaultResponseHeaders));
                    swagger.model(key, models.get(key));
                }
                models = ModelConverters.getInstance().readAll(responseClass);
                for (Map.Entry<String, Model> entry : models.entrySet()) {
                    swagger.model(entry.getKey(), entry.getValue());
                }
            }
        }

        Consumes consumes = AnnotationUtils.findAnnotation(method, Consumes.class);
        if (consumes != null) {
            for (String mediaType : consumes.value()) {
                operation.consumes(mediaType);
            }
        }
        Produces produces = AnnotationUtils.findAnnotation(method, Produces.class);
        if (produces != null) {
            for (String mediaType : produces.value()) {
                operation.produces(mediaType);
            }
        }
        if (AnnotationUtils.findAnnotation(method, Deprecated.class) != null) {
            operation.deprecated(true);
        }
        Annotation[][] paramAnnotations = findParamAnnotations(method);
        for (int i = 0; i < method.getParameterTypes().length; i++) {
            getParameters(method.getGenericParameterTypes()[i], Arrays.asList(paramAnnotations[i])).forEach(operation::parameter);
        }
        if (operation.getResponses() == null) {
            operation.defaultResponse(new Response().description("successful operation"));
        }
        processOperationDecorator(operation, method);
        return operation;
    }

    private static String extractOperationMethod(Method method) {
        if (AnnotationUtils.findAnnotation(method, GET.class) != null) {
            return "get";
        } else if (AnnotationUtils.findAnnotation(method, PUT.class) != null) {
            return "put";
        } else if (AnnotationUtils.findAnnotation(method, POST.class) != null) {
            return "post";
        } else if (AnnotationUtils.findAnnotation(method, DELETE.class) != null) {
            return "delete";
        } else if (AnnotationUtils.findAnnotation(method, OPTIONS.class) != null) {
            return "options";
        } else if (AnnotationUtils.findAnnotation(method, HEAD.class) != null) {
            return "head";
        } else if (AnnotationUtils.findAnnotation(method, io.swagger.jaxrs.PATCH.class) != null) {
            return "patch";
        }
        return null;
    }

    private static boolean isPrimitive(Type cls) {
        Property property = ModelConverters.getInstance().readAsProperty(cls);
        return property != null && Arrays.asList("integer", "string", "number", "boolean", "array", "file").contains(property.getType());
    }

    private static Annotation[][] findParamAnnotations(Method method) {
        Annotation[][] paramAnnotation = method.getParameterAnnotations();
        method = ReflectionUtils.getOverriddenMethod(method);
        while (method != null) {
            paramAnnotation = merge(paramAnnotation, method.getParameterAnnotations());
            method = ReflectionUtils.getOverriddenMethod(method);
        }
        return paramAnnotation;
    }

    private static Annotation[][] merge(Annotation[][] paramAnnotation, Annotation[][] superMethodParamAnnotations) {
        Annotation[][] mergedAnnotations = new Annotation[paramAnnotation.length][];
        for (int i = 0; i < paramAnnotation.length; i++) {
            Set<Annotation> mergedAnnotation = new HashSet<>();
            mergedAnnotation.addAll(Arrays.asList(paramAnnotation[i]));
            mergedAnnotation.addAll(Arrays.asList(superMethodParamAnnotations[i]));
            mergedAnnotations[i] = mergedAnnotation.toArray(new Annotation[mergedAnnotation.size()]);
        }
        return mergedAnnotations;
    }

    private static void processOperationDecorator(Operation operation, Method method) {
        Iterator<SwaggerExtension> chain = SwaggerExtensions.chain();
        if (chain.hasNext()) {
            chain.next().decorateOperation(operation, method, chain);
        }
    }

    private static String[] updateOperationProduces(String[] parentProduces, String[] apiProduces, Operation operation) {
        if (parentProduces != null) {
            Set<String> both = new LinkedHashSet<>(Arrays.asList(apiProduces));
            both.addAll(Arrays.asList(parentProduces));
            if (operation.getProduces() != null) {
                both.addAll(operation.getProduces());
            }
            apiProduces = both.toArray(new String[both.size()]);
        }
        return apiProduces;
    }

    private static String[] updateOperationConsumes(String[] parentConsumes, String[] apiConsumes, Operation operation) {
        if (parentConsumes != null) {
            Set<String> both = new LinkedHashSet<>(Arrays.asList(apiConsumes));
            both.addAll(Arrays.asList(parentConsumes));
            if (operation.getConsumes() != null) {
                both.addAll(operation.getConsumes());
            }
            apiConsumes = both.toArray(new String[both.size()]);
        }
        return apiConsumes;
    }

    private static String getPath(javax.ws.rs.Path classLevelPath, javax.ws.rs.Path methodLevelPath) {
        if (classLevelPath == null && methodLevelPath == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (classLevelPath != null) {
            stringBuilder.append(classLevelPath.value());
        }
        if (methodLevelPath != null && !methodLevelPath.value().equals("/")) {
            String methodPath = methodLevelPath.value();
            if (!methodPath.startsWith("/") && !stringBuilder.toString().endsWith("/")) {
                stringBuilder.append("/");
            }
            if (methodPath.endsWith("/")) {
                methodPath = methodPath.substring(0, methodPath.length() - 1);
            }
            stringBuilder.append(methodPath);
        }
        String output = stringBuilder.toString();
        if (!output.startsWith("/")) {
            output = "/" + output;
        }
        if (output.endsWith("/") && output.length() > 1) {
            return output.substring(0, output.length() - 1);
        } else {
            return output;
        }
    }

    private static void updateOperation(String[] apiConsumes, String[] apiProduces, Map<String, Tag> tags, List<SecurityRequirement> securities, Operation operation) {
        if (operation != null) {
            if (operation.getConsumes() == null) {
                for (String mediaType : apiConsumes) {
                    operation.consumes(mediaType);
                }
            }
            if (operation.getProduces() == null) {
                for (String mediaType : apiProduces) {
                    operation.produces(mediaType);
                }
            }
            if (operation.getTags() == null) {
                for (String tagString : tags.keySet()) {
                    operation.tag(tagString);
                }
            }
            for (SecurityRequirement security : securities) {
                operation.security(security);
            }
        }
    }

    private static void updateOperationParameters(Map<String, String> regexMap, Operation operation) {
        operation.getParameters().forEach(param -> {
            String pattern = regexMap.get(param.getName());
            if (pattern != null) {
                param.setPattern(pattern);
            }
        });
    }
}
