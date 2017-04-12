package ru.sbrf.swagger.gen.it;

import io.swagger.models.Contact;
import io.swagger.models.Info;
import io.swagger.models.License;
import org.junit.Test;
import ru.sbrf.swagger.gen.service.ApiDocumentService;

import java.util.Arrays;
import java.util.Collections;

public class GetOfflineSwaggerTest {

    @Test
    public void performTest() throws Exception {
        new ApiDocumentService(Arrays.asList("ru.sbrf.swagger.gen.example", "ru.sbrf.ufs.eu.bh.services.coarsegrained.admin"),
                new Info() {{
                    setTitle("Swagger Maven Plugin Sample");
                    setVersion("v1");
                    setDescription("This is a sample for swagger-maven-plugin");
                    setTermsOfService("http://www.sberbank.ru");
                    setContact(new Contact() {{
                        setEmail("sberbank@sberbank.com");
                        setName("sberbank");
                        setUrl("http://www.sberbank.ru");
                    }});
                    setLicense(new License() {{
                        setUrl("http://www.sberbank.ru");
                        setName("apache 2.0");
                    }});
                }},
                "/admin",
                "localhost",
                Collections.singletonList("http,https"),
                "target/swagger"
        ).execute();
    }
}
