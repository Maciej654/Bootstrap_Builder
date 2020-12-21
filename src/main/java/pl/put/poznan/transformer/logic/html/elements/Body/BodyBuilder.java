package pl.put.poznan.transformer.logic.html.elements.Body;

import lombok.Getter;
import lombok.Setter;
import pl.put.poznan.transformer.logic.html.elements.Head.Head;

public class BodyBuilder {
    @Getter
    private Body body = new Body();

    public void addContent(String content) {
        body.addContent(content);
    }
}
