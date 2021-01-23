package pl.put.poznan.bootstrap.logic.html.components;

import org.junit.jupiter.api.Test;
import pl.put.poznan.bootstrap.logic.html.components.Header;

import static org.junit.jupiter.api.Assertions.*;

class HeaderTest {
    private static final String CSS_CLASS = "main-header";

    @Test
    public void testStaticHeader(){
        Header header = new Header("static");
        assertEquals(".main-header{\n" +
                "        width: 100%;\n" +
                "        position: static;\n" +
                "        background: #333;\n" +
                "        padding: 10px 0;\n" +
                "        color: #fff;\n" +
                "        top: 0;\n" +
                "    }\n", header.getCSS());
        assertEquals(String.format("<div class=\"%s\">\n<h1>Nagłówek<h1/>\n</div>\n", CSS_CLASS), header.toString());
    }

    @Test
    public void testFixedHeader(){
        Header header = new Header("fixed");
        assertEquals(".main-header{\n" +
                "        width: 100%;\n" +
                "        position: fixed;\n" +
                "        background: #333;\n" +
                "        padding: 10px 0;\n" +
                "        color: #fff;\n" +
                "        top: 0;\n" +
                "    }\n", header.getCSS());
        assertEquals(String.format("<div class=\"%s\">\n<h1>Nagłówek<h1/>\n</div>\n", CSS_CLASS), header.toString());
    }



}