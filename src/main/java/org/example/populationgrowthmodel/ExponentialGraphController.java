package org.example.populationgrowthmodel;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ExponentialGraphController{
    public Button calculateButton;
    @FXML
    private AreaChart<Number, Number> areaChart;

    @FXML
    private TextField tfInitialPopulationSize;
    @FXML
    private TextField tfBirthRate;
    @FXML
    private TextField tfDeathRate;
    @FXML
    private Label resultsLabel;
    @FXML
    private RadioButton discreteButton;

    public void handleCalculateButton() {
        String initialPopulationSize = tfInitialPopulationSize.getText();
        String birthRate = tfBirthRate.getText();
        String deathRate = tfDeathRate.getText();

        // Check if both fields have input (optional)
        if (initialPopulationSize.isEmpty() || birthRate.isEmpty() || deathRate.isEmpty()) {
            resultsLabel.setText("Please enter values in all fields!");
            return;
        }

        // Convert strings to doubles
        double doubleInitialPopulationSize = Double.parseDouble(initialPopulationSize);
        double doubleBirthRate = Double.parseDouble(birthRate);
        double doubleDeathRate = Double.parseDouble(deathRate);

        ExponentialGraphCalculations exponentialGraphCalculations = new ExponentialGraphCalculations();
        double growthRate = exponentialGraphCalculations.getGrowthRate(doubleInitialPopulationSize, doubleBirthRate, doubleDeathRate);

        resultsLabel.setText("Result growth rate " + growthRate);

        XYChart.Series<Number, Number> series = new XYChart.Series<>(); // Create a new series

        int populationSize = 0;
        if (discreteButton.isSelected()) {
            for (int i = 0; i <= 20; i++) {
                //this discrete time exponential graph is still wrong.
                populationSize = (int) (doubleInitialPopulationSize * Math.pow(1 + growthRate, i));
                series.getData().add(new XYChart.Data<>(i, populationSize));
            }
        }
        else {
            for (int i = 0; i <= 20; i++) {
                populationSize = (int) (doubleInitialPopulationSize * Math.exp(growthRate * i));
                series.getData().add(new XYChart.Data<>(i, populationSize));
            }
        }

        resultsLabel.setText("Final Population " + populationSize);
        areaChart.getData().add(series); // Add the series to the LineChart

    }
    public void displayResultsInfoBox() {
        if (discreteButton.isSelected()){
            VBox layout = new VBox(10);
            layout.getChildren().addAll(new Label("Discrete"));
            // Imageview here

            Scene popupScene = new Scene(layout, 250, 150);
            Stage popupStage = new Stage();
            popupStage.setScene(popupScene);
            popupStage.setTitle("Results Info Box");
            popupStage.show();
        }
        else {
            VBox layout = new VBox(10);
            layout.getChildren().addAll(new Label("Not Discrete"));
            // Image view here

            Scene popupScene = new Scene(layout, 250, 150);
            Stage popupStage = new Stage();
            popupStage.setScene(popupScene);
            popupStage.setTitle("Results Info Box");
            popupStage.show();
        }
    }
}