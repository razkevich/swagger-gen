package ru.sbrf.swagger.gen.it;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.*;

public class GetOnlineSwaggerTest {
    private final static String ENDPOINT = "http://localhost:8090/admin";

    @Test
    public void performTest() throws IOException {
        getResource("/swagger.json", "swagger-online.json");
        getResource("/swagger.yaml", "swagger-online.yaml");
    }

    private void getResource(String res, String fileName) throws IOException {
        Path path = Paths.get("target", "swagger"), resource = path.resolve(fileName);
        if (Files.notExists(path) || !Files.isDirectory(path)) {
            Files.createDirectories(path);
        }
        Files.write(resource, IOUtils.readBytesFromStream((InputStream) WebClient.create(ENDPOINT + res).get().getEntity())
                , WRITE, CREATE, TRUNCATE_EXISTING);
    }
}
