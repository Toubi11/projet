/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Toubi
 */
public class LoginScreenController extends Projet implements Initializable  {

    /**
     * Initializes the controller class.
     */
    
    @FXML private TextField matricule;
    @FXML private TextField password;
    @FXML private Button btnReinitialiser;
    @FXML private Button btnConnexion;
    @FXML private Label labelError;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btnReinitialiser.setOnAction((ActionEvent event) -> {
            reinitialiser();
        });
        btnConnexion.setOnAction((ActionEvent co) -> {
            connexion();
        });
    }
    
    public void reinitialiser() {
        matricule.setText("");
        password.setText("");
    }
    
    

    @FXML
    public void connexion(){
        String login = "root";
        String pass = "toor";
        String url = "jdbc:mysql://localhost:3306/pharmacie";
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection cn = (Connection) DriverManager.getConnection(url, login, pass);
            Statement st = (Statement) cn.createStatement();
            String sql = "select password from pharmacie where matricule = '" + matricule.getText() + "';";
            ResultSet rs = st.executeQuery(sql);
            Parent menu;
            while (rs.next()) {
                if ((rs.getString("password").equals(password.getText()))) {
                    menu = FXMLLoader.load(LoginScreenController.class.getResource("Menu.fxml"));
                    Scene sceneMenu = new Scene(menu);
                    Stage stageLogin = new Stage();
                    stageLogin.setScene(sceneMenu);
                    stageLogin.show();
                    break;
                } else {
                    System.out.println("Mot de passe ou matricule incorrect");
                    labelError.setVisible(true);
                } 
            }                                                                                                              
            cn.close();
            st.close();
            rs.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver non reconnu");
        } catch (SQLException ex) {
            System.out.println("Connexion non établie");
        } catch (IOException ex) {
            System.out.println("Classe non trouvée");
        }
    }
}
