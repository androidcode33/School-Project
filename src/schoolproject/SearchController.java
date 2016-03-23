/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;

import addit.DatabaseConn;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author PAUL
 */
public class SearchController extends AnchorPane implements Initializable  {
    
  private SchoolProject application;
  @FXML ListView display;
  @FXML TextField field; 
  @FXML ImageView cm;
  
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
     
    @FXML Button search;
   
    @FXML Button updateNotesBtn;
    @FXML Button logOutBtn;
   
    @FXML Text text1;
    @FXML Text text2;
    @FXML Text text3;
    @FXML Text text4;
    @FXML Text text5;
    @FXML Text text6;
    
    @FXML TextField loggedInAs;
    @FXML TextField TimeLoggedIn;
    @FXML TextField WorkingClass;
    
    DatabaseConn c = new DatabaseConn("jdbc:mysql://localhost:3306/schoolsystem", "root", "");
    ObservableList<String> names = FXCollections.observableArrayList();
    public void setApp(SchoolProject application){
        this.application = application;
    }
    @FXML
   protected void handleButtonAction(ActionEvent event) {
     
   
    }
        
     //sometimes written as so === @FXML private void initialize()
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        fetchNames();
        field.textProperty().addListener(new ChangeListener() {
            public void changed(ObservableValue observable, Object oldVal,
                    Object newVal) {
                search((String) oldVal, (String) newVal);
            }
        });
       

    }

    public void search(String oldVal, String newVal) {
        if (oldVal != null && (newVal.length() < oldVal.length())) {
            display.setItems(names);
        }
        String value = newVal;
        ObservableList<String> subentries = FXCollections.observableArrayList();
        for (Object entry : display.getItems()) {
            String entryText = (String) entry;
            if (entryText.contains(value)) {

                subentries.add(entryText);
            }
        }
        display.setItems(subentries);
    }
    //////////Genenral Toolbar Buttons and menus!!@@@
    ////////May need one genral Class to be parent
    
     public void handleEnterMrks(ActionEvent event){
            application.gotonextScene();
     
    }
      public void handleMarkSheetsView(ActionEvent event){
            application.gotomarkSheet();
     
    }
     
     public void handleGenerateTemplates(ActionEvent event){    
 
     
    }
       public void handleStaffDetails(ActionEvent event){    
       application.gotoStaff( );
       
     
    }
        
       public void handleStaffAccounts(ActionEvent event){    
 
     
    }
       
         public void handleSearchByName(ActionEvent event){    
         application.gotoSearch_tool();
            
         //fetchNames();  
     
    }
         
           public void handleSearchByIndex(ActionEvent event){    
         // application.gotoSearch_tool();
     
    }
  
       public  void fetchNames(){
          try{
            c.dBConnect();
            String SQL = ("SELECT surName,otherName FROM student where surName like '%"+field.getText()+"%' order by surName");
            ResultSet rs = c.queryDatabase(SQL);
 
       
             while (rs.next()) {
	names.add(rs.getString("surName"));
             }
         display.setItems(names);
          }catch(Exception e){
             System.out.println(e);            
          }
    } 
   
      
    public void getselctedItem() {
        String k = display.getSelectionModel().getSelectedItem().toString();
        try {
            c.dBConnect();
            String SQL = ("SELECT * FROM student where surName like '%" + k + "%' order by surName");
            ResultSet rs = c.queryDatabase(SQL);
            while (rs.next()) {
                text1.setText(rs.getString("surName"));
                text2.setText(rs.getString("S_ID"));
                text3.setText(rs.getString("address"));
                text4.setText(rs.getString("otherName"));
                //cm.setImage(rs.getObject("surName"));
                //text5.setText(rs.getString("address"));
                //  text6.setText(rs.getString("DOB"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

       public void handleGenerateReports(ActionEvent event){    
           application.gotoreports();
     
    }
           public void handleReportAnalysis(ActionEvent event){    
           application.gotoreports(); 
     
    }
           public void handleCheckProgress(ActionEvent event){    
           application.gotoreports(); 
     
    }

        public void handleLoggingOut(ActionEvent event){    
        application.gotoLogin();
     
    }   
        
        public void handleHome(ActionEvent event){
      application.gotoWelcomeScreen();
    }
    
    
    
}



