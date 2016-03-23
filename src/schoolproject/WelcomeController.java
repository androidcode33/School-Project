/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author PAUL
 */
public class WelcomeController extends MainParentController {
    Stage hel;
    @FXML Button help;
    @FXML Button updateNotesBtn;
    @FXML Button AdminBtn;
    
     
    @Override
    public void setApp(SchoolProject application){
        this.application = application;
    }
   
     //sometimes written as so === @FXML private void initialize()
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

        
          public void handleAdminPanelBtn(ActionEvent event){
               try {
            Stage adminStage = new Stage();
            adminStage.setTitle("My  Administrator's Panel");
            adminStage.initOwner(application.stage);
            adminStage.centerOnScreen();
            adminStage.initModality(Modality.APPLICATION_MODAL);
            
            Parent root = FXMLLoader.load(getClass().getResource("adminsPanel1.fxml"));
            Scene adminScene = new Scene(root);
            adminStage.setScene(adminScene);

     
            adminStage.show();
        } catch (Exception ex) {
            Logger.getLogger(SchoolProject.class.getName()).log(Level.SEVERE, null, ex);
        }
 
     
    }
          public void AddUpdateNotesBtn(ActionEvent event){    
 
     
    }
    public void handleUserHelp(ActionEvent event) {

        try {
            Stage hlp = new Stage();
            hel = hlp;
            hlp.setTitle("HELP");
            hlp.initOwner(application.stage);
            hlp.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("help.fxml"));
            Scene cene = new Scene(root);
            hlp.setScene(cene);

            hlp.showAndWait();
        } catch (Exception ex) {
            Logger.getLogger(SchoolProject.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
     
    
    
}
