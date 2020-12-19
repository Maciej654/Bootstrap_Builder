package pl.put.poznan.transformer.logic.html;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeaderTest {
    private static final String CSS_CLASS = "main-header";

    @Test
    public void testStaticHeader(){
        Header header = new Header("static");
        assertEquals(String.format(".%s{\n\n}\n", CSS_CLASS), header.getCSS());
        assertEquals(String.format("<div class=\"%s\">\n<h1>Nagłówek<h1/>\n</div>\n", CSS_CLASS), header.toString());
    }

    @Test
    public void testFixedHeader(){
        Header header = new Header("fixed");
        assertEquals(String.format(".%s{\ntop: 0;\n}\n", CSS_CLASS), header.getCSS());
        assertEquals(String.format("<div class=\"%s\">\n<h1>Nagłówek<h1/>\n</div>\n", CSS_CLASS), header.toString());
    }



}