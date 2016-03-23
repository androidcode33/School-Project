/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;


import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 *
 * @author PAUL
 */
public class SchoolProject extends Application {
    
    public Stage stage;
    private final double MINIMUM_WINDOW_WIDTH = 1300.0;
    private final double MINIMUM_WINDOW_HEIGHT = 700.0;
    
    
       public SchoolProject() {
        
    }
   
    
    
    @Override
    public void start(Stage primaryStage) {
        try {
            stage = primaryStage;
            primaryStage.centerOnScreen();
            stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
           
            stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);
            stage.setTitle("Musaka Secondary School Results System");
//            gotoLogin();
            gotoWelcomeScreen();
           
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(SchoolProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
        void gotoLogin() {
        try {
            stage.setFullScreen(true);
            LoginController login;
            login = (LoginController) replaceSceneContent("login.fxml");
            login.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(SchoolProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        void gotoWelcomeScreen(){
          try {
           
            WelcomeController welcome;
            welcome = (WelcomeController) replaceSceneContent("WelcomeScreen.fxml");
            welcome.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(SchoolProject.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        }
        
           void gotoreports(){
          try {
            reportsController welcome;
            welcome = (reportsController) replaceSceneContent("reports.fxml");
            welcome.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(SchoolProject.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        }
        
        void gotonextScene(){
          try {
            nextSceneController scen;
            scen = (nextSceneController) replaceSceneContent("nextScene1.fxml");
            scen.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(SchoolProject.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        }
    
        void gotomarkSheet(){
          try {
            markSheetController scen;
            scen = (markSheetController) replaceSceneContent("markSheet.fxml");
            scen.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(SchoolProject.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        }
        
         void gotoStaff(){
          try {
            StaffController scen;
            scen = (StaffController) replaceSceneContent("staff.fxml");
            scen.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(SchoolProject.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        }
         
         void gotoSearch_tool(){
          try {
            SearchController scen;
            scen = (SearchController) replaceSceneContent("search_tool.fxml");
            scen.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(SchoolProject.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        }
        
        
        
        
        
        
        
        private Initializable replaceSceneContent(String fxml) throws Exception {
             
        FXMLLoader loader = new FXMLLoader();
        InputStream in = SchoolProject.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(SchoolProject.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        } 
        Scene scene = new Scene(page);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
        
        
    public boolean showPersonEditDialog(StudentsModel person) {
        try {
            // Load the fxml file and create a new stage for the popup
            FXMLLoader loader = new FXMLLoader(SchoolProject.class.getResource("regFormStd.fxml"));
            GridPane page = (GridPane) loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Person");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(stage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // Set the person into the controller
            regStdController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setPerson(person);

            // Show the dialog and wait until the user closes it
            dialogStage.showAndWait();

            return controller.isOkClicked();

        } catch (IOException e) {
            // Exception gets thrown if the fxml file could not be loaded
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Application.launch(SchoolProject.class, (java.lang.String[])null);
    }
    
}
