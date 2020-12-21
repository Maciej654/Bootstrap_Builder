package pl.put.poznan.bootstrap.logic.html.elements.Body;

import lombok.Getter;

public class BodyBuilder {
    @Getter
    private Body body = new Body();

    public void addContent(String content) {
        body.addContent(content);
    }
}
