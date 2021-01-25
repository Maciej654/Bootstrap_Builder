package pl.put.poznan.bootstrap.logic.html.components;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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


    @Test
    public void testMetaTagsGenerationWithMocks(){
        LinkedHashMap<String, String> tagsMap = new LinkedHashMap<>();
        tagsMap.put("author", "test");
        tagsMap.put("keywords", "HTML, CSS, JavaScript");
        tagsMap.put("description", "MetaTagsContainer test");
        StringBuilder correctResult = new StringBuilder();
        for(String name : tagsMap.keySet()){
            correctResult.append("<meta name=\"").append(name).append("\" content=\"")
                    .append(tagsMap.get(name)).append("\">\n");
        }

        MetaTag metaTag1 = mock(MetaTag.class);
        MetaTag metaTag2 = mock(MetaTag.class);
        MetaTag metaTag3 = mock(MetaTag.class);
        when(metaTag1.toString()).thenReturn("<meta name=\"author\" content=\"test\">");
        when(metaTag2.toString()).thenReturn("<meta name=\"keywords\" content=\"HTML, CSS, JavaScript\">");
        when(metaTag3.toString()).thenReturn("<meta name=\"description\" content=\"MetaTagsContainer test\">");
        MetaTagsContainer metaTagsContainer = new MetaTagsContainer(metaTag1, metaTag2,metaTag3);

        assertEquals(correctResult.toString(), metaTagsContainer.toString());



    }
}