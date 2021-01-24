package pl.put.poznan.bootstrap.logic.html.elements.Head;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

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
        String html = styleNode.html();
        for (String s : styles) {
            assert(html.contains(s));
        }
    }
}