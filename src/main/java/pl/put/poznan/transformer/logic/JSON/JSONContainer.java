package pl.put.poznan.transformer.logic.JSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

/**
 * container for json file
 * @author Maciej Hercog
 */
@ToString
public class JSONContainer {
    @Getter @Setter
    private Map<String, String> metaTags;

    @Getter @Setter
    private String header;

    @Getter @Setter
    private boolean footer;

    @Getter @Setter
    private String seotype;

    /**
     * reads fields from json file
     * @param json json file
     * @return object corresponding to the json input file
     */
    public static JSONContainer createFromJSON(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, JSONContainer.class);
    }
}
