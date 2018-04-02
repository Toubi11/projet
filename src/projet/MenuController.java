/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.io.IOException;
import java.net.URL;
import javafx.stage.Stage;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author addev
 */
public class MenuController extends Projet implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private Button medList;
    @FXML private Button profil;
    @FXML private Button medDossier;
    @FXML private Button commande;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        medList.setOnAction((ActionEvent oui) -> {
            Parent root;
            try {
                root = FXMLLoader.load(Projet.class.getResource("medList.fxml"));
                Scene sceneMedList = new Scene(root);
                primaryStage.setScene(sceneMedList);
            } catch (IOException ex) {
                Logger.getLogger(Projet.class.getName()).log(Level.SEVERE, null, ex);
            }  
        });
    }  
}


