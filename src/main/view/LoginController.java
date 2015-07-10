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
import main.Main;

/**
 * FXML Controller class
 *
 * @author Kevin
 */
public class LoginController implements Initializable {

    // Reference to the main application.
    private Main main;
    
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param main
     */
    public void setMainApp(Main main) {
        this.main = main;
    }
    
    /**
     * Called when the user clicks the edit button. Opens a dialog to edit
     * details for the selected person.
     */
    @FXML
    private void handleLogin() {
        main.initRootLayout();
        main.showDashOverview();
    }
        
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
