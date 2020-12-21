package pl.put.poznan.transformer.logic.html;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.put.poznan.transformer.logic.BootstrapBuilder;
import pl.put.poznan.transformer.logic.html.elements.Body.Body;
import pl.put.poznan.transformer.logic.html.elements.Head.Head;


/**
 * @author Maciej Hercog
 * HTML class is used to store html elements
 */
public class HTML {

    private Head head;
    private Body body;
    private final String CSS_LINK = "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n";
    private final String JS_LINK =   "    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" +
                                            "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n" +
                                            "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n";
    private static final Logger logger = LoggerFactory.getLogger(HTML.class);

    /**
     * HTML class is used to store html elements
     * @param head represents head section of html
     * @param body represents body section of html
     */
    public HTML(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    /**
     * Generates html page
     * @return html code
     */
    @Override
    public String toString() {

        String html =  "<!doctype html>\n" +
                head.toString() +
                body.toString() +
                "</html>";
        logger.debug(html);
        return html;
    }
}
