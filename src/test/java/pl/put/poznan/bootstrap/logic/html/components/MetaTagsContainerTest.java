package pl.put.poznan.bootstrap.logic.html.components;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MetaTagsContainerTest {

    @Test
    public void testMetaTagsGeneration(){
        Map<String, String> tagsMap = new HashMap<>();
        tagsMap.put("author", "test");
        tagsMap.put("keywords", "HTML, CSS, JavaScript");
        tagsMap.put("description", "MetaTagsContainer test");
        StringBuilder correctResult = new StringBuilder();
        for(String name : tagsMap.keySet()){
            correctResult.append("<meta name=\"").append(name).append("\" content=\"")
                    .append(tagsMap.get(name)).append("\">\n");
        }
        MetaTagsContainer metaTagsContainer = new MetaTagsContainer(tagsMap);
        assertEquals(correctResult.toString(), metaTagsContainer.toString());
    }

}