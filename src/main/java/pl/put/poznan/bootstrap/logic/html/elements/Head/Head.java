package pl.put.poznan.bootstrap.logic.html.elements.Head;

import java.util.ArrayList;
import java.util.List;

public class Head {
    private List<String> styleContent = new ArrayList<>();
    private final String CSS_LINK = "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n";

    public void addStyle(String style){
        styleContent.add(style);
    }

    @Override
    public String toString() {
        return  "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                CSS_LINK +
                "    <title>Szkielet</title>\n" +
                styleSection() +
                " \n </head>\n";
    }

    private String styleSection(){
        if(styleContent.size() == 0)
            return "";
        return "<style>\n" +
                String.join("\n", styleContent) +
                "\n</style> \n";
    }
}
