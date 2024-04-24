package org.example.populationgrowthmodel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LogisticalGraphController {
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
    private Button discreteButton;
    @FXML
    private TextField tfCarryingCapacity;
    @FXML
    private Button buttonMenu;

    public void handleCalculateButton() {
        String initialPopulationSize = tfInitialPopulationSize.getText();
        String birthRate = tfBirthRate.getText();
        String deathRate = tfDeathRate.getText();
        String carryingCapacity = tfCarryingCapacity.getText();

        // Check if both fields have input (optional)
        if (initialPopulationSize.isEmpty() || birthRate.isEmpty() || deathRate.isEmpty()) {
            resultsLabel.setText("Please enter values in all fields!");
            return;
        }

        // Convert strings to doubles
        double doubleInitialPopulationSize = Double.parseDouble(initialPopulationSize);
        double doubleBirthRate = Double.parseDouble(birthRate);
        double doubleDeathRate = Double.parseDouble(deathRate);
        double doubleCarryingCapacity = Double.parseDouble(carryingCapacity);

        ExponentialGraphCalculations logisticalGraphCalculations = new ExponentialGraphCalculations();
        double growthRate = logisticalGraphCalculations.getGrowthRate(doubleInitialPopulationSize, doubleBirthRate, doubleDeathRate);

        resultsLabel.setText("Result growth rate " + growthRate);

        XYChart.Series<Number, Number> series = new XYChart.Series<>(); // Create a new series

        int populationSize = 0;
        for (int i = 0; i < 20; i++) {
            populationSize = (int) ((int) ((doubleCarryingCapacity * doubleInitialPopulationSize) / (doubleInitialPopulationSize + ((doubleCarryingCapacity - doubleInitialPopulationSize) * Math.exp(-growthRate * i)))));
            series.getData().add(new XYChart.Data<>(i, populationSize)); // Add data point to the series
        }
        resultsLabel.setText("Final Population " + populationSize);
        areaChart.getData().add(series); // Add the series to the LineChart
    }
    @FXML
    public void btMenu(ActionEvent e) throws Exception{
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuClass.fxml"));
            Parent root = loader.load();
            Stage primaryStage = (Stage) buttonMenu.getScene().getWindow();
            Scene menuScene = new Scene(root);
            primaryStage.setScene(menuScene);
            FXMLMenuController fxmlMenuController = loader.getController();

        }catch (Exception f){
            f.printStackTrace();
        }

    }

}


