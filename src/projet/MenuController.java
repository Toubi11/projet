/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.io.IOException;
import java.net.URL;
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
import javafx.stage.Stage;

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
        medDossier.setOnAction((ActionEvent dossier) -> {
               sceneMedDossier();
        });
        
        profil.setOnAction((ActionEvent profil) -> {
               sceneProfil();
        });
        
        medList.setOnAction((ActionEvent list) -> {
            Parent rootList;
            try {
                rootList = FXMLLoader.load(MenuController.class.getResource("MedList.fxml"));
                Scene sceneMedList = new Scene(rootList);
                Stage stageMedList = new Stage();
                stageMedList.setScene(sceneMedList);
                stageMedList.show();
            } catch (IOException ex) {
                Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
            }   
        });
        
        commande.setOnAction((ActionEvent commande) -> {
            Parent rootCommande;
            try {
                rootCommande = FXMLLoader.load(MenuController.class.getResource("Commande.fxml"));
                Scene sceneCommande = new Scene(rootCommande);
                Stage stageCommande = new Stage();
                stageCommande.setScene(sceneCommande);
                stageCommande.show();
            } catch (IOException ex) {
                Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
            } 
        });
    }
    
    @FXML
    public void sceneMedDossier() {
        Parent rootDossier;
            try {
                rootDossier = FXMLLoader.load(MenuController.class.getResource("MedDossier.fxml"));
                Scene sceneMedDossier = new Scene(rootDossier);
                Stage stageMedDossier = new Stage();
                stageMedDossier.setScene(sceneMedDossier);
                stageMedDossier.show();
            } catch (IOException ex) {
                Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    @FXML
    public void sceneProfil() {
        Parent rootProfil;
            try {
                rootProfil = FXMLLoader.load(MenuController.class.getResource("Profil.fxml"));
                Scene sceneMedList = new Scene(rootProfil);
                Stage stageProfil = new Stage();
                stageProfil.setScene(sceneMedList);
                stageProfil.show();
            } catch (IOException ex) {
                Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

}


