/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author PAUL
 */
public class StaffController extends MainParentController  {
    @Override
    public void setApp(SchoolProject application){
        this.application = application;
    }
   
     //sometimes written as so === @FXML private void initialize()
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }   
    
}

