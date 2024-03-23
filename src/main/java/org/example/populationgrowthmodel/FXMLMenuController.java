package org.example.populationgrowthmodel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLMenuController {

    @FXML
    private Button imageViewExponential;

    @FXML
    public void handleImageViewExponential() {
        // Attach event handler to the image
        try {
            // Load the FXML file for the ExponentialGraph pane
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ExponentialGraph.fxml"));
            Parent root = loader.load();

            // Get the primary stage
            Stage primaryStage = (Stage) imageViewExponential.getScene().getWindow();
            // Set the scene with the ExponentialGraph pane
            Scene exponentialScene = new Scene(root);
            primaryStage.setScene(exponentialScene);

            // Get the controller for the ExponentialGraph pane
            ExponentialGraphController exponentialGraphController = loader.getController();
            // Optionally, initialize the controller or pass data to it
            // exponentialGraphController.initialize();
        } catch (IOException e) {
            System.err.println("Error loading ExponentialGraph.fxml: " + e.getMessage());
            e.printStackTrace();
        }
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
