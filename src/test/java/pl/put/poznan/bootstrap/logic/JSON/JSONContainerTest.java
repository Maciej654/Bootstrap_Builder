package pl.put.poznan.bootstrap.logic.JSON;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class JSONContainerTest {
    private static final String pathPrefix = "src/test/resources/";

    @Test
    void testCreateFromJSON() throws IOException {
        Path fileName = Path.of(pathPrefix + "example.json");
        String json = Files.readString(fileName);
        JSONContainer jsonContainer = JSONContainerBuilder.createFromJSON(json);    

        assertEquals( "static", jsonContainer.getHeader());
        assertEquals( "standard", jsonContainer.getSeotype());
        assertTrue(jsonContainer.isFooter());

        var metaTags = jsonContainer.getMetaTags();

        assertEquals( "tytul", metaTags.get(MetaTags.title));
        assertEquals( "deeescription", metaTags.get(MetaTags.description));
        assertEquals( "image1", metaTags.get(MetaTags.image));
        assertEquals("type1", metaTags.get(MetaTags.type));
    }
}