package pl.put.poznan.bootstrap.logic.JSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * @author Maciej Hercog
 */
public class JSONContainerBuilder {
    /**
     * reads fields from json file
     * @param json json file
     * @return object corresponding to the json input file
     */
    public static JSONContainer createFromJSON(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, JSONContainer.class);
    }
}
