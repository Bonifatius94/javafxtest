package de.mtswe.javafxtest.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField textDisplay;

    @FXML
    private Button changeTextButton;

    @FXML
    protected void onChangeText(ActionEvent event) {
        textDisplay.setText("change text button pressed");
    }
}
