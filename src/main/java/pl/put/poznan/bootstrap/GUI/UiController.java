package pl.put.poznan.bootstrap.GUI;

import com.fasterxml.jackson.core.JsonProcessingException;
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
import pl.put.poznan.bootstrap.logic.JSON.JSONContainer;
import pl.put.poznan.bootstrap.logic.JSON.JSONContainerBuilder;
import pl.put.poznan.bootstrap.logic.JSON.MetaTags;
import pl.put.poznan.bootstrap.logic.html.HTMLBuilder;
import pl.put.poznan.bootstrap.logic.html.HTMLDirector;
import pl.put.poznan.bootstrap.rest.BootstrapBuilderController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
        headerTypes.getSelectionModel().selectedItemProperty().addListener((observableValue, was, is) -> {
            if(is != null) selectedHeaderType = is;
        });
        headerTypes.getSelectionModel().select("static");
        this.buildButton.setOnAction(actionEvent -> buttonClicked());
    }

    private void buttonClicked()  {
        var jsonContainer = createJsonContainer();
        var htmlDirector = new HTMLDirector(jsonContainer);
        String html = htmlDirector.constructHTML().toString();
        result.setText(html);
    }

    private JSONContainer createJsonContainer(){
        var builder =  JSONContainer.builder();
        var metaTags = new HashMap<String,String>();

        if(ifHeader.isSelected()){
            builder.header(headerTypes.getSelectionModel().getSelectedItem());
        }
        if(ifFooter.isSelected()){
            builder.footer(true);
        }
        if(authorTag.getLength() > 0){
            metaTags.put(MetaTags.author, authorTag.getText());
        }
        if(descriptionTag.getLength() > 0){
            metaTags.put(MetaTags.description, descriptionTag.getText());
        }
        if(keywordsTag.getLength() > 0){
            metaTags.put(MetaTags.keyword, keywordsTag.getText());
        }
        if(metaTags.size() > 0){
            builder.metaTags(metaTags);
        }
        return builder.build();
    }
}
