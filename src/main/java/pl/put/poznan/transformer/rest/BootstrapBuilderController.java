package pl.put.poznan.transformer.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.JSON.JSONContainer;
import pl.put.poznan.transformer.logic.JSON.JSONContainerBuilder;

@RestController
@RequestMapping("/bootstrap_builder")
public class BootstrapBuilderController {

    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilderController.class);


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String get(@RequestBody String input) {

        logger.debug(input);
        System.out.println(input);
        JSONContainer jsonContainer = null;
        try {
            jsonContainer = JSONContainerBuilder.createFromJSON(input);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "ok";
    }


}


