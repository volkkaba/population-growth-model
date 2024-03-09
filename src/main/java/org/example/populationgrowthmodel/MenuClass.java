package org.example.populationgrowthmodel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MenuClass extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Text
        Text welcomeText = new Text("Welcome to\nPopulation Dynamics\nSimulator");
        Font font = Font.font("Consolas", FontWeight.BOLD, 24);
        welcomeText.setFont(font);
        welcomeText.setFill(Color.BLACK);

        // Create HBox and display of simulator options
        HBox hb = new HBox();
        Pane expoPane = new Pane();
        // SET IMAGE
        ImageView expoImg = new ImageView(new Image("file:image1name.jpg"));
        expoPane.getChildren().addAll(expoImg);
        Pane logisPane = new Pane();
        // SET IMAGE
        ImageView logisImg = new ImageView(new Image("file:image2name.jpg"));
        logisPane.getChildren().addAll(logisImg);
        hb.getChildren().addAll(expoPane, logisPane);

        // Set actions for user selection
        expoPane.setOnMouseClicked(e -> openExpoSimulator());
        logisPane.setOnMouseClicked(e -> openLogisSimulator());

        // Add nodes to pane
        Pane mainPane = new Pane();
        mainPane.getChildren().addAll(welcomeText, hb);

        // Change color of pane
        mainPane.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));

        // Add pane -> scene -> stage
        Scene scene = new Scene(mainPane, 320, 240);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Population Dynamics Simulator");
        primaryStage.show();
    }
    // Lambda methods
    public void openExpoSimulator(){
        // code to open javafx class for Expo
    }
    public void openLogisSimulator(){
        // code to open java fx class for Logistical
    }
}
