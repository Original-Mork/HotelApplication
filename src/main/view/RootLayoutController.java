/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import main.Main;

/**
 *
 * @author Kevin
 */
public class RootLayoutController {
    // Reference to the main application
    private Main main;
    //Reference to the dialog stage
    private Stage dialogStage;
    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    }

    /**
     * Sets the stage of this dialog.
     * 
     * @param dialogStage
     */
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param Main
     */
    public void setMain(Main main) {
        this.main = main;
    }
}
