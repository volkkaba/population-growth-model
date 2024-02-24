module org.example.populationgrowthmodel {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.populationgrowthmodel to javafx.fxml;
    exports org.example.populationgrowthmodel;
}