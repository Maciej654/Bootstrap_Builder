package pl.put.poznan.bootstrap.logic.JSON;

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
}
