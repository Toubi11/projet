/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Toubi
 */
public class Projet extends Application {
    
    protected Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) {
        /** Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        }); */
        Parent root;
        try {
            root = FXMLLoader.load(LoginScreenController.class.getResource("LoginScreen.fxml"));
            Scene scene = new Scene(root, 650, 300);
            primaryStage.setTitle("Pharmacie");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(Projet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Stage getStage(){
        return primaryStage;
    }
    
    public Stage setStage(){
        return primaryStage;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
