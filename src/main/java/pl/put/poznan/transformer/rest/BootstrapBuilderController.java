package pl.put.poznan.transformer.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.JSON.JSONContainer;
import pl.put.poznan.transformer.logic.JSON.JSONContainerBuilder;
import pl.put.poznan.transformer.logic.html.HTML;
import pl.put.poznan.transformer.logic.html.HTMLDirector;

@RestController
@RequestMapping("/bootstrap_builder")
public class BootstrapBuilderController {

    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilderController.class);


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String get(@RequestBody String input) {
        logger.info(input);
        String html;
        try {
             html =  new HTMLDirector(input).constructHTML().toString();
        } catch (JsonProcessingException e) {
            html = "Error: Invalid input";
        }
        return "{ \"html\" : \"" + html + "\"";
    }


}


