package org.example.populationgrowthmodel;

import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

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
    private RadioButton discreteButton;
    @FXML
    private TextField tfCarryingCapacity;

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
            populationSize = (int) ((int) ((doubleCarryingCapacity * doubleInitialPopulationSize)/(doubleInitialPopulationSize + ((doubleCarryingCapacity - doubleInitialPopulationSize) * Math.exp(-growthRate * i)))));
            series.getData().add(new XYChart.Data<>(i, populationSize)); // Add data point to the series
        }
        resultsLabel.setText("Final Population " + populationSize);
        areaChart.getData().add(series); // Add the series to the LineChart

    }

}
