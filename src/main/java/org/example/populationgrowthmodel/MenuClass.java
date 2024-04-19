package org.example.populationgrowthmodel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuClass extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
       
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuClass.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Image image = new Image(getClass().getResourceAsStream("/org/example/populationgrowthmodel/assets/populationdynamicsicon.jpg"));
        primaryStage.getIcons().add(image);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Population Dynamics Simulator");
        primaryStage.show();
    }
}
