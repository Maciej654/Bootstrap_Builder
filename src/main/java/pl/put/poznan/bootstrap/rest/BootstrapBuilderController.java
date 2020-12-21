package pl.put.poznan.bootstrap.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.bootstrap.logic.BootstrapBuilder;

@RestController
@RequestMapping("/bootstrap_builder")
public class BootstrapBuilderController {

    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilderController.class);
    private final BootstrapBuilder bootstrapBuilder = new BootstrapBuilder();

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String get(@RequestBody String input) {
        logger.info(input);

        bootstrapBuilder.feedInput(input);

        return String.format("{ \"html\" : \"%s\" }", bootstrapBuilder.makeResponse());
    }


}


