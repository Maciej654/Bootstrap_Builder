package pl.put.poznan.bootstrap.logic.html.components;

import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * container class that stores all of site's user defined meta tags
 * @author Michał Mędzin
 */
public class MetaTagsContainer {
    private List<MetaTag> metaTags;

    public MetaTagsContainer(Map<String, String> tags){
        metaTags = new ArrayList<>();
        if(tags == null){
            return;
        }
        for(String name : tags.keySet()){
            metaTags.add(new MetaTag(name, tags.get(name)));
        }
    }

    public MetaTagsContainer(MetaTag... metaTags){
        this.metaTags = Arrays.asList(metaTags);
    }
    /**
     * builds and returns site's user defined meta tags HTML definitions
     * @return meta tags definitions HTML
     */
    public String toString(){
        StringBuilder tags = new StringBuilder();
        for(MetaTag metaTag : metaTags){
            tags.append(metaTag.toString()).append("\n");
        }
        return tags.toString();
    }
}
