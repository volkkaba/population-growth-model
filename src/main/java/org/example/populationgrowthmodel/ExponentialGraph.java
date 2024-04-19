package org.example.populationgrowthmodel;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;



public class ExponentialGraph extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ExponentialGraph.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Image image = new Image(getClass().getResourceAsStream("/org/example/populationgrowthmodel/assets/populationdynamicsicon.jpg"));
        primaryStage.getIcons().add(image);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Population Dynamics Simulator");
        primaryStage.show();
    }


}
