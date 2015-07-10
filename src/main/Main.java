/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import main.view.LoginController;
import main.view.RootLayoutController;

/**
 * Main Class used to run the Hotel Application
 * @author Morgan
 */
public class Main extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;
    private AnchorPane roomOverview;
    
    /**
     * Method which is run to start the application
     * @param primaryStage 
     */
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Hotel Management System");
        this.primaryStage.getIcons().add(new Image("file:resources/images/logo_128.png"));
        
        //Initialise the Login of the application 
        //initRootLogin();
        initRootLayout();
        initComponents();
    }
    
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            
            // Give the controller access to the main app.
            //RootLayoutController controller = loader.getController();
            //controller.setMain(this);

            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void initComponents(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/RoomOverview.fxml"));
            roomOverview = (AnchorPane) loader.load();
            
            TabPane tabPane = new TabPane();
            
            Tab rooms = new Tab();
            rooms.setText("Rooms");
            rooms.setContent(roomOverview);
            tabPane.getTabs().add(rooms);
            
            rootLayout.setCenter(tabPane);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void initRootLogin() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/Login.fxml"));
            AnchorPane login = (AnchorPane) loader.load();
            
            // Give the controller access to the main app.
            LoginController controller = loader.getController();
            controller.setMainApp(this);

            // Show the scene containing the root layout.
            Scene scene = new Scene(login);
            primaryStage.setScene(scene);
            primaryStage.show();
            System.out.println("this stage is reached");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
