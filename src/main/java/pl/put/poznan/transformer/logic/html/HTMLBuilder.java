package pl.put.poznan.transformer.logic.html;

import lombok.Getter;
import pl.put.poznan.transformer.logic.html.components.Footer;
import pl.put.poznan.transformer.logic.html.components.Header;
import pl.put.poznan.transformer.logic.html.elements.Body.BodyBuilder;
import pl.put.poznan.transformer.logic.html.elements.Head.HeadBuilder;

public class HTMLBuilder {
    private BodyBuilder bodyBuilder = new BodyBuilder();
    private HeadBuilder headBuilder = new HeadBuilder();

    public void buildHeader(Header header){
        headBuilder.addStyleContent(header.getCSS());
        bodyBuilder.addContent(header.toString());
    }

    public void buildFooter(){

        headBuilder.addStyleContent(Footer.STYLE);
        bodyBuilder.addContent(Footer.BODY);

    }

    public HTML getHtml() {
        return new HTML(headBuilder.getHead(), bodyBuilder.getBody());
    }
}

