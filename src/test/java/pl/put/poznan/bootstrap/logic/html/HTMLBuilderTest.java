package pl.put.poznan.bootstrap.logic.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import pl.put.poznan.bootstrap.logic.html.components.Footer;
import pl.put.poznan.bootstrap.logic.html.components.Header;

class HTMLBuilderTest {

    @Test
    public void testBuildHeader() {
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Header header = new Header("fixed");
        htmlBuilder.buildHeader(header);
        Document doc = Jsoup.parse(htmlBuilder.getHtml().toString());
        Element styleNode = doc.selectFirst("html > head > style");
        assert(styleNode != null);

        assert(styleNode.html().contains(header.getCSS().trim()));

        Element bodyNode = doc.selectFirst("html > body");
        assert(bodyNode != null);

        String html = Jsoup.parse(header.toString()).selectFirst("body").html();
        assert(bodyNode.html().contains(html.trim()));
    }

    @Test
    public void testBuildFooter() {
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        htmlBuilder.buildFooter();
        Document doc = Jsoup.parse(htmlBuilder.getHtml().toString());
        Element footerNode = doc.selectFirst("html > body > footer");
        assert(footerNode != null);
    }

}