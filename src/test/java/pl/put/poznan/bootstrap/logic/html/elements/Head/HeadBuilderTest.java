package pl.put.poznan.bootstrap.logic.html.elements.Head;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

class HeadBuilderTest {

    @Test
    void testAddStyleContent() {
        HeadBuilder headBuilder = new HeadBuilder();
        String[] styles = {"param1: value1", "param2: value2"};
        for (String s : styles) {
            headBuilder.addStyleContent(s);
        }

        Document doc = Jsoup.parse(headBuilder.getHead().toString());
        Element styleNode = doc.selectFirst("head > style");
        assert(styleNode != null);

        String html = styleNode.html();
        for (String s : styles) {
            assert(html.contains(s));
        }
    }
}