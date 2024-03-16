package org.example.populationgrowthmodel;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class FXMLMenuController {
    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage){
        this.primaryStage = primaryStage;
    }
    @FXML
    private ImageView imageExpo, imageLogis;

    @FXML
    private void imageExpoAction(MouseEvent event){
        // action to open logistical FX window/pane
    }

    @FXML
    private void imageLogisAction(MouseEvent event){
        // action to open exponential FX window/pane
    }
}
