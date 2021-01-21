package pl.put.poznan.bootstrap.logic.html;

import com.fasterxml.jackson.core.JsonProcessingException;
import pl.put.poznan.bootstrap.logic.JSON.JSONContainer;
import pl.put.poznan.bootstrap.logic.JSON.JSONContainerBuilder;
import pl.put.poznan.bootstrap.logic.html.components.Header;

public class HTMLDirector {
    private HTMLBuilder htmlBuilder;
    private JSONContainer jsonContainer;

    public HTMLDirector(String json) throws JsonProcessingException {
        this.jsonContainer = JSONContainerBuilder.createFromJSON(json);
        htmlBuilder = new HTMLBuilder();

    }

    public HTMLDirector(JSONContainer jsonContainer) {
        this.jsonContainer = jsonContainer;
        htmlBuilder = new HTMLBuilder();

    }

    public HTML constructHTML(){
        if(jsonContainer.getHeader() != null){
            Header header = new Header(jsonContainer.getHeader());
            htmlBuilder.buildHeader(header);
        }
        if(jsonContainer.isFooter()){
            htmlBuilder.buildFooter();
        }
        return htmlBuilder.getHtml();
    }
}
