/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;

import addit.DatabaseConn;
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
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author PAUL
 */
public class MainParentController extends AnchorPane implements Initializable{
  
    
        
    public SchoolProject application;
    public  Stage Chooseclass;


    @FXML MenuItem GenerateTemplates;
    @FXML MenuItem StaffDetail;
    @FXML MenuItem EnterMrks;
    @FXML MenuItem ReportAnalysis;
    @FXML MenuItem CheckProgress;
    @FXML MenuItem StaffAccounts;
    @FXML MenuItem SearchByName;
    @FXML MenuItem SearchByIndex;
    @FXML MenuItem GenerateReports;
    @FXML MenuItem MarkSheetView;
     

    @FXML Button logOutBtn;
    @FXML Button Home;
    
    @FXML TextField loggedInAs;
    @FXML TextField TimeLoggedIn;
    @FXML TextField WorkingClass;
    private Stage reportStage;
    
    DatabaseConn store = new DatabaseConn("jdbc:mysql://localhost:3306/schoolSystem", "root", "");
    ///needs check
    public void setApp(SchoolProject application){
        this.application = application;
    }
   
     //sometimes written as so === @FXML private void initialize()
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.print("i have reached 2");

    }
    //////////Genenral Toolbar Buttons and menus!!@@@
    ////////May need one genral Class to be parent
    
    public void handleEnterMrks(ActionEvent event){
            ChooseClass();
            application.gotonextScene();
     
    }
    public void handleMarkSheetsView(ActionEvent event){
            ChooseClass();
            application.gotomarkSheet();
     
    }
     
    public void handleGenerateTemplates(ActionEvent event){    
        ChooseClass();
     
    }
    public void handleStaffDetails(ActionEvent event){    
       application.gotoStaff();
     
    }
        
    public void handleStaffAccounts(ActionEvent event){    
 
     
    }
       
    public void handleSearchByName(ActionEvent event){    
         application.gotoSearch_tool();
     
    }
         
    public void handleSearchByIndex(ActionEvent event){    
          application.gotoSearch_tool();
     
    }
    public void handleGenerateReports(ActionEvent event){   
           ChooseClass();
           reportsWindow();
     
    }
    public void handleReportAnalysis(ActionEvent event){    
           application.gotoreports(); 
//     
    }
    public void handleCheckProgress(ActionEvent event){    
           application.gotoreports(); 
     
    }
   
    public void handleLoggingOut(ActionEvent event){    
        application.gotoLogin();
     
    }
    
    public void handleHomeBtn(ActionEvent event){
        application.gotoWelcomeScreen();
    }
    
    public void handleHome(ActionEvent event){
      application.gotoWelcomeScreen();
    }
    
     public void ChooseClass() {
       try {
            Stage chsCls = new Stage();
            Chooseclass =chsCls;
            chsCls.setTitle("Choose to Proceed");
            chsCls.initOwner(application.stage);
            chsCls.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("chooseClass.fxml"));
            Scene cene = new Scene(root);
            chsCls.setScene(cene); 
            
            chsCls.showAndWait();
        } catch (Exception ex) {
            Logger.getLogger(SchoolProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
 
        public void reportsWindow(){
          
       try {
            Stage report = new Stage();
            reportStage =report;
            report.setTitle("Generating  Class Reports");
            report.initOwner(application.stage);
            report.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("1reportView.fxml"));
            Scene cene = new Scene(root);
            report.setScene(cene); 
            
            report.showAndWait();
        } catch (Exception ex) {
            Logger.getLogger(SchoolProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void exit(){
    Chooseclass.close();
    }

 public void setTableFocusMoves(){
 
 }
        

      
}
