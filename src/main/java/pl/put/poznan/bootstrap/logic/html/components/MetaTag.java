package pl.put.poznan.bootstrap.logic.html.components;

/**
 * class storing information about site's user defined HTML meta tag
 * @author Michał Mędzin
 */
public class MetaTag {

    private String name;
    private String content;

    public MetaTag(String name, String content){
        this.name = name;
        this.content = content;
    }

    /**
     * build and returns meta tag's HTML cod
     * @return meta tag code in HTML
     */
    public String toString(){
        return String.format("<meta name=\"%s\" content=\"%s\">", this.name, this.content);
    }
}
