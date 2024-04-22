package org.example.populationgrowthmodel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class InfoWindowController {

    @FXML
    private Button buttonMenu;

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
