/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.DatePicker;
/**
 * FXML Controller class
 *
 * @author addev
 */
public class MedDossierController implements Initializable {
    
    @FXML
    private TableView tableMed;
    
    @FXML
    private Button Menu;
    
    @FXML
    private Button Rechercher;

    @FXML
    private TextField TextFieldRechercher;

    @FXML
    private TableView TableMed;

    @FXML
    private TableColumn colNom;

    @FXML
    private TableColumn colPrenom;

    @FXML
    private TableColumn colMedPrescrits;

    @FXML
    private TableColumn colDate;

    @FXML
    private TextField addNom;
  
    @FXML
    private TextField addPrenom;

    @FXML
    private TextField addMed;

    @FXML
    private DatePicker Date;

    @FXML
    private Button Ajouter;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          
    Button btnRechercher = new Button("Rechercher");  
 }
    public class Client {
    private final SimpleStringProperty nom;
    private final SimpleStringProperty prenom;
    private final SimpleStringProperty prescription;
        private Date Date;
    
    private Client(String Nom, String Prenom, String Prescription) {
        this.nom = new SimpleStringProperty(Nom);
        this.prenom = new SimpleStringProperty(Prenom);
        this.prescription = new SimpleStringProperty(Prescription);
    }
    
    public String getNom(){
        return nom.get();
    }
    
    public void setNom(String Nom){   
        nom.set(Nom);
    }
    
    public String getPrenom(){
        return prenom.get();  
    }
    
    public void setPrenom(String Prenom){
        prenom.set(Prenom);
    }
    
    public String getPrescription(){
        return prescription.get();
    }
    
    public void setPrescription(String Prescription){
        prescription.set(Prescription);
    }
    public Date getDate(){
        return this.Date;
    }
    
    public void setDate(Date colDate){   
        this.Date = colDate;
    }
    
    final ObservableList<Client> data = FXCollections.observableArrayList(
    new Client("A", "B", "C")
    ); 
    }   
}