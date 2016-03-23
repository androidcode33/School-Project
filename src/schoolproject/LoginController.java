/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

/**
 *
 * @author PAUL
 */
public class LoginController extends AnchorPane implements Initializable  {
    
    @FXML
    Button loginBtn;
    @FXML TextField UserNAme;
    @FXML PasswordField Password;
    @FXML Text warningAtLogin;
    @FXML Hyperlink schWeb;
    
    private SchoolProject application;

    public void setApp(SchoolProject application){
        this.application = application;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }
    
    public void handleLogin(ActionEvent event){
    
       application.gotoWelcomeScreen();
        
    }
    
    
    
    
}
