/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;

import addit.DatabaseConn;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

/**
 *
 * @author PAUL
 */
public class reportsController extends MainParentController  {
     @FXML TableView   analysisTableview;
     
     @FXML TableColumn INDEXColumn;
    @FXML TableColumn NAMEColumn;
    @FXML TableColumn INDEXColumn2;
    @FXML TableColumn NAMEColumn2;
     @FXML TableColumn AVERAGEColumn;
    @FXML ListView aClass;
    @FXML ListView aClass2;
     @FXML ListView aClass3;
    
    @FXML TableColumn Rank;
    
    //ResultSet myresult;
    private ObservableList<reportsControllerModel> data;
    ObservableList classes = FXCollections.observableArrayList();
    
    DatabaseConn store = new DatabaseConn("jdbc:mysql://localhost:3306/schoolSystem", "root", "");
 
    public void setApp(SchoolProject application){
        this.application = application;
    }
    public reportsController(){
    
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(store.dBConnect()){
            try {
                ResultSet rs = store.queryDatabase("SELECT DISTINCT className from classRoom order by className");
                while(rs.next()){
                    classes.add(rs.getString("className"));
                }
                aClass.setItems(classes);
                aClass2.setItems(classes);
                aClass3.setItems(classes);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        aClass.setOnMouseClicked((MouseEvent event) -> {
                 aClassClickHandle();
        });
        aClass2.setOnMouseClicked((MouseEvent event) -> {
                 aClass2ClickHandle();
        });
        aClass3.setOnMouseClicked((MouseEvent event) -> {
                 aClass3ClickHandle();
        });
        
        
         INDEXColumn.setCellValueFactory(
                    new PropertyValueFactory<reportsControllerModel, String>("index")); 
             
        NAMEColumn.setCellValueFactory(
                    new PropertyValueFactory<reportsControllerModel, String>("name"));
        AVERAGEColumn.setCellValueFactory(
                    new PropertyValueFactory<reportsControllerModel, String>("average"));
         
    }

    private void aClassClickHandle() {
       try {
        String a = aClass.getSelectionModel().getSelectedItem().toString();
        System.out.println(a);
                       setanalysisa(a);
        } catch (Exception ex) {
                        System.out.println(ex);
                    }
    }

    private void aClass2ClickHandle() {
         try {
        String b = aClass2.getSelectionModel().getSelectedItem().toString();
        System.out.println(b);
                        setanalysisb(b);
        } catch (Exception ex) {
                        System.out.println(ex);
                    }
        }

    private void aClass3ClickHandle() {
         try {
        String c = aClass3.getSelectionModel().getSelectedItem().toString();
        System.out.println(c);
                        setanalysisC(c);
        } catch (Exception ex) {
                        System.out.println(ex);
                    }
        
       }

    private void setanalysisC(String c) throws SQLException {
        data = FXCollections.observableArrayList();
            store.dBConnect();
            //ResultSet rs = store.queryDatabase("Select adNo,Name,average from " +a.replace(".", "") +"," +a.replace(".","")+"_marksheet WHERE" +a.replace(".", "") +".adNo" + "=" +a.replace(".","")+"_marksheet.adNo");
           
            ResultSet rs = store.queryDatabase("Select adNo,Name from " +c.replace(".", ""));
           System.out.println("connected");
            
            while (rs.next()) {
                //modification needed right from the DB to much this Constructor
                data.add(new reportsControllerModel("",rs.getString("adNo"),rs.getString("Name"),"",""));
            }

        analysisTableview.setItems(data);
        
        }

    private void setanalysisb(String b) throws SQLException{
         data = FXCollections.observableArrayList();
            store.dBConnect();
            //ResultSet rs = store.queryDatabase("Select adNo,Name,average from " +a.replace(".", "") +"," +a.replace(".","")+"_marksheet WHERE" +a.replace(".", "") +".adNo" + "=" +a.replace(".","")+"_marksheet.adNo");
           
            ResultSet rs = store.queryDatabase("Select adNo,Name from " +b.replace(".", ""));
           System.out.println("connected");
            
            while (rs.next()) {
                //modification needed right from the DB to much this Constructor
                data.add(new reportsControllerModel("",rs.getString("adNo"),rs.getString("Name"),"",""));
            }

        analysisTableview.setItems(data);
       
    }
    
    

    private void setanalysisa(String a)throws SQLException {
       /*if(store.dBConnect()){
            ResultSet t = store.queryDatabase("Select adNo,Name,average from  a,"+a.replace(".","")+"_marksheet WHERE a.adNo= "+a.replace(".","")+"_marksheet.adNo");
       }*/
            data = FXCollections.observableArrayList();
            store.dBConnect();
            //ResultSet rs = store.queryDatabase("Select adNo,Name,average from " +a.replace(".", "") +"," +a.replace(".","")+"_marksheet WHERE" +a.replace(".", "") +".adNo" + "=" +a.replace(".","")+"_marksheet.adNo");
           
            ResultSet rs = store.queryDatabase("Select adNo,Name from " +a.replace(".", ""));
           System.out.println("connected");
            
            while (rs.next()) {
                //modification needed right from the DB to much this Constructor
                data.add(new reportsControllerModel("",rs.getString("adNo"),rs.getString("Name"),"",""));
            }

        analysisTableview.setItems(data);
           
    
    }
}

    
   
