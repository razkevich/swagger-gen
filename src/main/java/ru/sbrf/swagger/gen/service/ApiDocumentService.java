package ru.sbrf.swagger.gen.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.models.Info;
import io.swagger.models.Scheme;
import io.swagger.models.Swagger;
import io.swagger.util.Yaml;
import org.apache.commons.io.FileUtils;
import org.reflections.Reflections;

import javax.ws.rs.Path;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ApiDocumentService {
    private List<String> locations;
    private Info info;
    private String basePath;
    private String host;
    private List<String> schemes;
    private String swaggerDirectory;

    public ApiDocumentService(List<String> locations, Info info, String basePath, String host, List<String> schemes, String swaggerDirectory) {
        this.locations = locations;
        this.info = info;
        this.basePath = basePath;
        this.host = host;
        this.schemes = schemes;
        this.swaggerDirectory = swaggerDirectory;
    }

    public void execute() throws Exception {
        Swagger swagger = new Swagger();
        swagger.schemes(schemes.stream().map(Scheme::forValue).collect(Collectors.toList()));
        swagger.setHost(host);
        swagger.setInfo(info);
        swagger.setBasePath(basePath);
        Set<Class<?>> classes = new LinkedHashSet<>();
        for (String location : locations) {
            classes.addAll(new Reflections(location).getTypesAnnotatedWith(Path.class, true));
            classes.addAll(new Reflections(location).getTypesAnnotatedWith(Path.class));
        }
        new JaxrsReader(swagger).read(classes);
        File dir = new File(swaggerDirectory);
        FileUtils.forceMkdir(dir);
        FileUtils.write(new File(dir, "swagger-offline.json"), new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).
                writer(new DefaultPrettyPrinter()).writeValueAsString(swagger), "UTF-8");
        FileUtils.write(new File(dir, "swagger-offline.yaml"), Yaml.pretty().writeValueAsString(swagger), "UTF-8");
    }
}
