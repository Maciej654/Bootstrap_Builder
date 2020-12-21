package pl.put.poznan.transformer.logic.html.components;

import java.util.HashMap;
import java.util.Map;

/**
 * site's main header handler
 * @author Michał Mędzin
 */
public class Header {
    private static final Map<String, String> STYLES = new HashMap<>();
    private static final String CSS_CLASS = "main-header";

    static {
        STYLES.put("fixed", ".main-header{\n" +
                            "        width: 100%;\n" +
                            "        position: fixed;\n" +
                            "        background: #333;\n" +
                            "        padding: 10px 0;\n" +
                            "        color: #fff;\n" +
                            "        top: 0;\n" +
                            "    }\n");
        STYLES.put("static", ".main-header{\n" +
                            "        width: 100%;\n" +
                            "        position: static;\n" +
                            "        background: #333;\n" +
                            "        padding: 10px 0;\n" +
                            "        color: #fff;\n" +
                            "        top: 0;\n" +
                            "    }\n");
    }

    private String type;

    public Header(String type){
        this.type = type;
    }


    /**
     * builds and returns CSS style code of the header
     * @return string containing header class properties in css
     */
    public String getCSS(){
        return  STYLES.get(this.type);
    }

    /**
     * builds and returns HTML code of the header
     * @return header code in HTML
     */
    @Override
    public String toString(){
        return String.format("<div class=\"%s\">\n<h1>Nagłówek<h1/>\n</div>\n", CSS_CLASS);
    }

}
