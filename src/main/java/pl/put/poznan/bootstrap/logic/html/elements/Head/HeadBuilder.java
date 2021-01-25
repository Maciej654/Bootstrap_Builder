package pl.put.poznan.bootstrap.logic.html.elements.Head;

import lombok.Getter;
import pl.put.poznan.bootstrap.logic.html.components.MetaTagsContainer;

public class HeadBuilder {
    @Getter
    private Head head = new Head();

    public void addStyleContent(String style){
        head.addStyle(style);
    }

    public void addMetaTags(MetaTagsContainer metaTagsContainer) { head.addMetaTags(metaTagsContainer.toString()); }

}
