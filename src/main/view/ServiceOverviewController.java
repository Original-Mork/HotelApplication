/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import main.Main;

/**
 *
 * @author Kevin
 */
public class ServiceOverviewController {
    // Reference to the main application
    private Main main;
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param main
     */
    public void setMain(Main main) {
        this.main = main;
    }
}
