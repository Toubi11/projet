/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author addev
 */
public class ProfilFXController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField TxtMatri;
    
    @FXML
    private TextField TxtNom;
    
    @FXML
    private TextField TxtPrenom;
    
    @FXML
    private TextField TxtRole;
    
    @FXML
    private TextField TxtMDP;
    
    @FXML
    private TextField TxtNewMDP;
    
    @FXML
    private Button BtnReinitialiser;

    @FXML
    private Button BtnValider;
    
    @FXML
    private Button BtnMenu;
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
