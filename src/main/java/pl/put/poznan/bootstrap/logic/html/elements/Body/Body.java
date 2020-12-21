package pl.put.poznan.bootstrap.logic.html.elements.Body;

import java.util.ArrayList;
import java.util.List;

public class Body {
    private List<String> bodyContent = new ArrayList<>();
    private final String JS_LINK =  "    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" +
                                    "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n" +
                                    "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n";
   private final String MAIN_CONTAINER =   "<main role=\"main\" class=\"container\">\n" +
                                           "</main><!-- /.container -->\n";
    public void addContent(String content) {
        bodyContent.add(content);
    }

    @Override
    public String toString() {
        return "<body>\n" +
                String.join("\n" , bodyContent) + "\n" +
                MAIN_CONTAINER +
                JS_LINK +
                "\n</body>\n";
    }
}
