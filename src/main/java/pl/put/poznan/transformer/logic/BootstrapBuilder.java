package pl.put.poznan.transformer.logic;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.put.poznan.transformer.logic.html.HTMLDirector;

public class BootstrapBuilder {
    private final static String INVALUD_INPUT_MSG = "Error: Invalid input";

    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilder.class);
    private StringBuilder specBuilder = new StringBuilder();

    public BootstrapBuilder(){}

    public void dropBuffer() {
        specBuilder = new StringBuilder();
    }

    public void feedInput(String input) {
        specBuilder.append(input);
    }

    public String makeResponse() {
        String response;

        try {
            response = new HTMLDirector(specBuilder.toString()).constructHTML().toString();
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());
            response = INVALUD_INPUT_MSG;
        } finally {
            dropBuffer();
        }

        return response;
    }
}
