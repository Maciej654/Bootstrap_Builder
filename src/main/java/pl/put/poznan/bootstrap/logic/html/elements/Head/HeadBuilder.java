package pl.put.poznan.bootstrap.logic.html.elements.Head;

import lombok.Getter;

public class HeadBuilder {
    @Getter
    private Head head = new Head();

    public void addStyleContent(String style){
        head.addStyle(style);
    }


}
