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
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class FXMLMenuController {

    @FXML
    private Button imageViewExponential;
    @FXML
    private Button imageViewLogistical;
    @FXML
    private Button buttonInfo;

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
    public void handleImageViewLogistical() {
        // Attach event handler to the image
        try {
            // Load the FXML file for the ExponentialGraph pane
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LogisticalGraph.fxml"));
            Parent root = loader.load();

            // Get the primary stage
            Stage primaryStage = (Stage) imageViewLogistical.getScene().getWindow();
            // Set the scene with the ExponentialGraph pane
            Scene logisticalScene = new Scene(root);
            primaryStage.setScene(logisticalScene);

            // Get the controller for the ExponentialGraph pane
            LogisticalGraphController logisticalGraphController = loader.getController();
            // Optionally, initialize the controller or pass data to it
            // exponentialGraphController.initialize();
        } catch (IOException e) {
            System.err.println("Error loading LogisticalGraph.fxml: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @FXML
    public void btInfo(ActionEvent e) throws Exception{
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("InfoWindow.fxml"));
            Parent root = loader.load();
            Stage primaryStage = (Stage) buttonInfo.getScene().getWindow();
            Scene infoScene = new Scene(root);
            primaryStage.setScene(infoScene);
            InfoWindowController infoWindowController = loader.getController();

        }catch (Exception f){
            f.printStackTrace();
        }

    }
}


