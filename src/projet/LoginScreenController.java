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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btnReinitialiser.setOnAction((ActionEvent event) -> {
            reinitialiser();
        });
        btnConnexion.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent co) {
                connexion();
            }
        });
    }
    
    public void reinitialiser() {
        matricule.setText("");
        password.setText("");
    }
    
    public void connexion(){
        String login = "root";
        String pass = "toor";
        String url = "jdbc:mysql://localhost:3306/pharmacie";
        System.out.println(password.getText());
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection cn = (Connection) DriverManager.getConnection(url, login, pass);
            Statement st = (Statement) cn.createStatement();
            String sql = "select password from pharmacie where matricule = '" + matricule.getText() + "';";
            ResultSet rs = st.executeQuery(sql);
            System.out.println(rs);
            Parent menu;
            if ((rs.equals(password.getText()))) {
                menu = FXMLLoader.load(LoginScreenController.class.getResource("Menu.fxml"));
                Scene sceneMenu = new Scene(menu);
                primaryStage.setScene(sceneMenu);
                primaryStage.show();
            } else {
                System.out.println("Mot de passe ou matricule incorrect");
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
