package pl.put.poznan.bootstrap.GUI;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import pl.put.poznan.bootstrap.rest.BootstrapBuilderController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class UiController {

    //Scene 1
    @FXML private Button buildButton = new Button();
    @FXML private CheckBox ifFooter = new CheckBox();
    @FXML private CheckBox ifHeader = new CheckBox();
    @FXML private ComboBox<String> headerTypes = new ComboBox<>();
    private String selectedHeaderType;
    @FXML private TextField authorTag = new TextField();
    @FXML private TextField descriptionTag = new TextField();
    @FXML private TextField keywordsTag = new TextField();

    //Scene 2
    @FXML private TextArea result = new TextArea();

    public UiController() {
    }

    @FXML
    public void initialize () {
        String[] types = {"static", "fixed"};
        List<String> typesLst = new ArrayList<>();
        Collections.addAll(typesLst, types);
        headerTypes.setItems(FXCollections.observableList(typesLst));
        headerTypes.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String was, String is) {
                if(is != null) selectedHeaderType = is;
            }
        });
        headerTypes.getSelectionModel().select("static");
        this.buildButton.setOnAction(actionEvent -> {
            if(ifHeader.isSelected()){
                // add header
            }
            if(ifFooter.isSelected()){
                // add footer
            }
            if(authorTag.getLength()>0){
                // add author tag
            }
            if(descriptionTag.getLength()>0){
                // add description tag
            }
            if(keywordsTag.getLength()>0){
                // add keywords tag
            }
            // add result HTML code to the result TextArea (like below)
            result.setText("HTML here...");
        });
    }
}
