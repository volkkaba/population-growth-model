package org.example.populationgrowthmodel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ExponentialGraph extends Application {
    int xAxis;
    int yAxis;
    TextField nameTextField = new TextField("Project Title");
    TextField popSizeTextField = new TextField("Initial Pop. Size");
    TextField growthRateTextField = new TextField("Growth Rate");
    TextField birthRateTextField = new TextField("Birth Rate");
    TextField deathRateTextField = new TextField("Death Rate");
    Button btSave = new Button("Save");

    public void ExponentialGraphView(){

    }
    public void Save(){

    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ExponentialGraph.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Population Dynamics Simulator");
        primaryStage.show();
    }

}
