package pl.put.poznan.bootstrap.logic;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.put.poznan.bootstrap.logic.html.HTMLDirector;

/**
 * Handles the creation of a Bootstrap HTML template from user input
 * @author Wojciech Koszela
 */
public class BootstrapBuilder {
    private final static String INVALID_INPUT_MSG = "Error: Invalid input";

    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilder.class);
    private StringBuilder specBuilder = new StringBuilder();

    public BootstrapBuilder(){}

    /***
     * Discards specification
     */
    public void dropBuffer() {
        specBuilder = new StringBuilder();
    }

    /***
     * Add structure specification
     * @param input specification in JSON format
     */
    public void feedInput(String input) {
        specBuilder.append(input);
    }

    /***
     * Attempts to build a template based on provided input
     * @return HTML code or error message
     */
    public String makeResponse() {
        String response;

        try {
            response = new HTMLDirector(specBuilder.toString()).constructHTML().toString();
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());
            response = INVALID_INPUT_MSG;
        } finally {
            dropBuffer();
        }

        return response;
    }
}
