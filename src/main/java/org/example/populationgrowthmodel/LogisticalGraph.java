package org.example.populationgrowthmodel;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class LogisticalGraph extends Pane {
    int xAxis;
    int yAxis;
    TextField nameTextField = new TextField("Project Title");
    TextField popSizeTextField = new TextField("Initial Pop. Size");
    TextField growthRateTextField = new TextField("Growth Rate");
    TextField birthRateTextField = new TextField("Birth Rate");
    TextField deathRateTextField = new TextField("Death Rate");
    TextField carryingCapacityTextField = new TextField("Carrying Capacity");
    Button btSave = new Button("Save");


}
