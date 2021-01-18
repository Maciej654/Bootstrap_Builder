package pl.put.poznan.bootstrap.app;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.put.poznan.bootstrap.GUI.JavafxApplication;


@SpringBootApplication(scanBasePackages = {"pl.put.poznan.bootstrap.GUI"})
public class BootstrapBuilderJavafxApplication {

    public static void launch(String[] args) {
        Application.launch(JavafxApplication.class, args);
    }
}
