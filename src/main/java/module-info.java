module org.example.populationgrowthmodel {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.populationgrowthmodel to javafx.fxml;
    exports org.example.populationgrowthmodel;
}