package org.example.populationgrowthmodel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
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
    @FXML
    TextField tfPopInfoBox;
    @FXML
    TextField tfBirthRateInfoBox;
    @FXML
    TextField tfDeathRateInfoBox;
    @FXML
    TextField tfCarryingCapInfoBox;

    public void handleCalculateButton() {
        String initialPopulationSize = tfInitialPopulationSize.getText();
        String birthRate = tfBirthRate.getText();
        String deathRate = tfDeathRate.getText();
        String carryingCapacity = tfCarryingCapacity.getText();

        // Check if both fields have input (optional)
        if (initialPopulationSize.isEmpty() || birthRate.isEmpty() || deathRate.isEmpty()|| carryingCapacity.isEmpty()) {
            resultsLabel.setText("Please enter values in all fields!");
            return;
        }

        // Convert strings to doubles
        double doubleInitialPopulationSize = Double.parseDouble(initialPopulationSize);
        double doubleBirthRate = Double.parseDouble(birthRate);
        double doubleDeathRate = Double.parseDouble(deathRate);
        double doubleCarryingCapacity = Double.parseDouble(carryingCapacity);

        ExponentialGraphCalculations logisticalGraphCalculations = new ExponentialGraphCalculations(doubleInitialPopulationSize, doubleBirthRate, doubleDeathRate, doubleCarryingCapacity);
        double growthRate = logisticalGraphCalculations.getGrowthRate(doubleInitialPopulationSize, doubleBirthRate, doubleDeathRate);


        resultsLabel.setText("Result growth rate " + growthRate);

        XYChart.Series<Number, Number> series = new XYChart.Series<>(); // Create a new series

        int populationSize = 0;
        for (int i = 0; i < 200; i++) {
            populationSize = (int) ((int) ((doubleCarryingCapacity * doubleInitialPopulationSize) / (doubleInitialPopulationSize + ((doubleCarryingCapacity - doubleInitialPopulationSize) * Math.exp(-growthRate * i)))));
            series.getData().add(new XYChart.Data<>(i, populationSize)); // Add data point to the series
        }
        resultsLabel.setText("Final Population " + populationSize);
        areaChart.getData().add(series); // Add the series to the LineChart
    }

    public void displayResultsInfoBox() {
        Pane p = new Pane();
        ImageView img = new ImageView(new Image(getClass().getResourceAsStream("/org/example/populationgrowthmodel/assets/resultsinfoboxlogistical.png")));
        p.getChildren().addAll(img);

        Scene popupScene = new Scene(p);
        Stage popupStage = new Stage();
        popupStage.setScene(popupScene);
        popupStage.setTitle("Population Info Box");
        popupStage.show();
    }
    public void populationInfoBox(){
        Pane p = new Pane();
        ImageView img = new ImageView(new Image(getClass().getResourceAsStream("/org/example/populationgrowthmodel/assets/initialpopinfobox.png")));
        p.getChildren().addAll(img);

        Scene popupScene = new Scene(p);
        Stage popupStage = new Stage();
        popupStage.setScene(popupScene);
        popupStage.setTitle("Initial Population Info Box");
        popupStage.show();
    }
    public void birthRateInfoBox(){
        Pane p = new Pane();
        ImageView img = new ImageView(new Image(getClass().getResourceAsStream("/org/example/populationgrowthmodel/assets/birthrateinfobox.png")));
        p.getChildren().addAll(img);

        Scene popupScene = new Scene(p);
        Stage popupStage = new Stage();
        popupStage.setScene(popupScene);
        popupStage.setTitle("Birth Rate Info Box");
        popupStage.show();
    }
    public void deathRateInfoBox(){
        Pane p = new Pane();
        ImageView img = new ImageView(new Image(getClass().getResourceAsStream("/org/example/populationgrowthmodel/assets/deathrateinfobox.png")));
        p.getChildren().addAll(img);

        Scene popupScene = new Scene(p);
        Stage popupStage = new Stage();
        popupStage.setScene(popupScene);
        popupStage.setTitle("Death Rate Info Box");
        popupStage.show();
    }
    public void carryingCapInfoBox(){
        Pane p = new Pane();
        ImageView img = new ImageView(new Image(getClass().getResourceAsStream("/org/example/populationgrowthmodel/assets/carryingcapinfobox.png")));
        p.getChildren().addAll(img);

        Scene popupScene = new Scene(p);
        Stage popupStage = new Stage();
        popupStage.setScene(popupScene);
        popupStage.setTitle("Carrying Capacity Info Box");
        popupStage.show();
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
    public void handleDiscreteButton(ActionEvent e) {
        try {
            String initialPopulationSize = tfInitialPopulationSize.getText();
            String birthRate = tfBirthRate.getText();
            String deathRate = tfDeathRate.getText();
            String carryingCapacity = tfCarryingCapacity.getText();

            // Check if all required fields have input
            if (initialPopulationSize.isEmpty() || deathRate.isEmpty() || carryingCapacity.isEmpty() || birthRate.isEmpty()) {
                resultsLabel.setText("Please enter values in all fields!");
                return;
            }

            // Convert strings to doubles
            double doubleInitialPopulationSize = Double.parseDouble(initialPopulationSize);
            double doubleBirthRate = Double.parseDouble(birthRate);
            double doubleDeathRate = Double.parseDouble(deathRate);
            double doubleCarryingCapacity = Double.parseDouble(carryingCapacity);

            // Calculate growth rate
            ExponentialGraphCalculations logisticalGraphCalculations = new ExponentialGraphCalculations(doubleInitialPopulationSize, doubleBirthRate, doubleDeathRate, doubleCarryingCapacity);
            double growthRate = logisticalGraphCalculations.getGrowthRate(doubleInitialPopulationSize, doubleBirthRate, doubleDeathRate);

            // Create a new stage for the pop-up window
            Stage popupStage = new Stage();
            popupStage.initModality(Modality.APPLICATION_MODAL);
            popupStage.setTitle("Discrete Scatter Chart");

            // Create X and Y axes
            NumberAxis xAxis = new NumberAxis();
            NumberAxis yAxis = new NumberAxis();

            // Create a scatter chart
            ScatterChart<Number, Number> scatterChart = new ScatterChart<>(xAxis, yAxis);
            scatterChart.setTitle("Discrete Scatter Chart");

            // Generate scatter chart data using the provided values
            XYChart.Series<Number, Number> series = new XYChart.Series<>();
            series.setName("Discrete Scatter Data");

            for (int i = 0; i < 20; i++) {
                double t = i;
                double populationSize = (int) ((int) ((doubleCarryingCapacity * doubleInitialPopulationSize) / (doubleInitialPopulationSize + ((doubleCarryingCapacity - doubleInitialPopulationSize) * Math.exp(-growthRate * i)))));
                series.getData().add(new XYChart.Data<>(t, populationSize));
            }

            // Add the series to the scatter chart
            scatterChart.getData().add(series);

            // Create a layout and add the scatter chart to it
            StackPane layout = new StackPane();
            layout.getChildren().add(scatterChart);

            // Create a scene and set it in the stage
            Scene scene = new Scene(layout, 400, 300);
            popupStage.setScene(scene);

            // Show the pop-up window
            popupStage.showAndWait();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}





