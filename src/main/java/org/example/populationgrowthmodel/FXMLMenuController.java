package org.example.populationgrowthmodel;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLMenuController {
    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage){
        this.primaryStage = primaryStage;
    }
    @FXML
    private ImageView imageExpo, imageLogis;

    @FXML
    private void imageExpoAction(MouseEvent event) throws IOException {
        // action to open logistical FX window/pane, fxml and java controller classes need to be created first

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ExponentialGraph.fxml"));
        Parent root = loader.load();
        ExponentialGraph controller = loader.getController();
        Scene exponentialScene = new Scene(root);
        primaryStage.setScene(exponentialScene);

    }

    @FXML
    private void imageLogisAction(MouseEvent event){
        // action to open exponential FX window/pane, fxml and java controller classes need to be created first
        /*
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogisticalGraph.fxml"));
        Parent root = loader.load();
        LogisticalSceneController controller = loader.getController();
        controller.setPrimaryStage(primaryStage);
        primaryStage.setScene(new Scene(root));
         */
    }
}
