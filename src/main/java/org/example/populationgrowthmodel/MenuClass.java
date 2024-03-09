package org.example.populationgrowthmodel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MenuClass extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane mainPane = new Pane();
        Scene scene = new Scene(mainPane, 320, 240);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Population Dynamics Simulator");
        primaryStage.show();
    }
}
