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
import javafx.scene.control.ComboBox;

/**
 *
 * @author PAUL
 */
public class ChooseClassSubjectController extends MainParentController implements Initializable {
    
    @FXML Button confirm;
    @FXML Button cancel;
    //@FXML ComboBox ;
   

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
     public void handleConfirmBtn(ActionEvent event){
    //Not the actual  code,.this is temporary
    exit();
        
    }
      public void handleCancelBtn(ActionEvent event){
    //Not the actual  code,.this is temporary
    exit();
        
    }
    
}
