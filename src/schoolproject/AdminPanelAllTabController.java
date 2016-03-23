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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author PAUL
 */
public class AdminPanelAllTabController implements Initializable {
    private SchoolProject application;
      public void setApp(SchoolProject application){
        this.application = application;
    }
/****************************grading Tab************************************/
        @FXML TableView<GradesModel> gradesTab;
        @FXML TableView<GradesModel> ExamContriTab;
        @FXML TableColumn<GradesModel, String> from;
	@FXML TableColumn<GradesModel, String> to;
	@FXML TableColumn<GradesModel, String> agg;
        @FXML TableColumn<GradesModel, String> remark;
                    /********************/
        @FXML TableColumn<GradesModel, String> cls;
        @FXML TableColumn<GradesModel, String> botContri;
        @FXML TableColumn<GradesModel, String> midContri;
        @FXML TableColumn<GradesModel, String> endContri;
 /**********************grading********************************/
        
         @FXML TableView<StudentsModel> stdrcdsTab;
         @FXML TableColumn<StudentsModel, String> adNo;
         @FXML TableColumn<StudentsModel, String> S_ID;
         @FXML TableColumn<StudentsModel, String> surName;
         @FXML TableColumn<StudentsModel, String> address;
         @FXML TableColumn<StudentsModel, String> adYear;
         @FXML TableColumn<StudentsModel, String> gender;
         @FXML TableColumn<StudentsModel, String> nationality;
         @FXML TableColumn<StudentsModel, String> addComments;
         @FXML TableColumn<StudentsModel, String> contact;
         @FXML TableColumn<StudentsModel, String> photoNo;
         @FXML TableColumn<StudentsModel, String> feesStatus;
         @FXML TableColumn<StudentsModel, String> Guardian;
         @FXML TableColumn<StudentsModel, String> dob;
         @FXML TableColumn<StudentsModel, String> clas;
         @FXML TableColumn<StudentsModel, String> stream;
         @FXML TableColumn<StudentsModel, String> house;
         @FXML TableColumn<StudentsModel, String> religion;
         
  /************************************staff********************/
         
         @FXML TableView<AccountsModel> staffrcdsTab;
         @FXML TableColumn<AccountsModel, String> sId;
         @FXML TableColumn<AccountsModel, String> name;
         @FXML TableColumn<AccountsModel, String> Subjects;
         @FXML TableColumn<AccountsModel, String> Saddress;
         @FXML TableColumn<AccountsModel, String> responsbility;
         @FXML TableColumn<AccountsModel, String> Department;
         @FXML TableColumn<AccountsModel, String> clases;
         @FXML TableColumn<AccountsModel, String> passcode;
         @FXML TableColumn<AccountsModel, String> contact1;
         @FXML TableColumn<AccountsModel, String> contact2;
         @FXML TableColumn<AccountsModel, String> SphotoNo;
         @FXML TableColumn<AccountsModel, String> fullTime;
         
         @FXML Button addNew;
         /************************************/

        ResultSet myresult;
        private ObservableList<GradesModel> data;
        private ObservableList<StudentsModel> data1;
        private ObservableList<AccountsModel> data2;
        DatabaseConn store = new DatabaseConn("jdbc:mysql://localhost:3306/schoolSystem", "root", "");
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
            try {
                gradesTab.setEditable(true);
                ExamContriTab.setEditable(true);
                gradesTab.getSelectionModel (). setCellSelectionEnabled(true);
                ExamContriTab.getSelectionModel (). setCellSelectionEnabled(true);
                
                cls.setCellValueFactory(new PropertyValueFactory<>("cls"));
                botContri.setCellValueFactory(new PropertyValueFactory<>("botContri"));
                midContri.setCellValueFactory(new PropertyValueFactory<>("midContri"));
                endContri.setCellValueFactory(new PropertyValueFactory<>("endContri"));
                
                buildTable("gradesTable") ;
                buildTableStd("student");
                buildTableStaff("staff");
                
            } catch (SQLException ex) {
                Logger.getLogger(AdminPanelAllTabController.class.getName()).log(Level.SEVERE, null, ex);
            }
       
            /***********std**************/

    }
    
        public void buildTable(String table) throws SQLException{
        
        data = FXCollections.observableArrayList();
        store.dBConnect();
        String SQL = "SELECT * from "+table+";";
        ResultSet rs = store.queryDatabase(SQL);

       to.setCellValueFactory(new PropertyValueFactory<>("to"));
//              to.setCellFactory(TextFieldTableCell.forTableColumn());
//                 P1Column.setOnEditCommit(
//                         new EventHandler<CellEditEvent<String>>() {
//                             @Override
//                             public void handle(CellEditEvent<String> t) {
//                                 ( t.getTableView().getItems().get(
//                                         t.getTablePosition().getRow())).setEmail(t.getNewValue());
//                             }
//                         }
//                 );
       
       from.setCellValueFactory(new PropertyValueFactory<>("from"));
//              from.setCellFactory(TextFieldTableCell.forTableColumn());
//                 P1Column.setOnEditCommit(
//                         new EventHandler<CellEditEvent<String>>() {
//                             @Override
//                             public void handle(CellEditEvent<String> t) {
//                                 ( t.getTableView().getItems().get(
//                                         t.getTablePosition().getRow())).setEmail(t.getNewValue());
//                             }
//                         }
//                 );
       
       agg.setCellValueFactory(new PropertyValueFactory<>("agg"));
//              agg.setCellFactory(TextFieldTableCell.forTableColumn());
//                 P1Column.setOnEditCommit(
//                         new EventHandler<CellEditEvent<String>>() {
//                             @Override
//                             public void handle(CellEditEvent<String> t) {
//                                 ( t.getTableView().getItems().get(
//                                         t.getTablePosition().getRow())).setEmail(t.getNewValue());
//                             }
//                         }
//                 );
       
//       remark.setCellValueFactory(new PropertyValueFactory<>("remark"));
//              remark.setCellFactory(TextFieldTableCell.forTableColumn());
//                 P1Column.setOnEditCommit(
//                         new EventHandler<CellEditEvent<String>>() {
//                             @Override
//                             public void handle(CellEditEvent<String> t) {
//                                 ( t.getTableView().getItems().get(
//                                         t.getTablePosition().getRow())).setEmail(t.getNewValue());
//                             }
//                         }
//                 );

  while (rs.next()) {
                //modification needed right from the DB to much this Constructor
                data.add(new GradesModel(rs.getString("from"),rs.getString("to"),rs.getString("grade"),"",
                                            rs.getString("cls"),rs.getString("botContri"),rs.getString("midContri"),rs.getString("endContri")));
            }

       gradesTab.setItems(data);
       ExamContriTab.setItems(data);
 
}

        @FXML
	public void handleGradeSave() {
		
	}
        
        @FXML
	public void handleExamContriSave() {
		
	}


 /**************************grading stops here*******************/
        
public void buildTableStd(String table) throws SQLException{
        
        data1 = FXCollections.observableArrayList();
        store.dBConnect();
        String SQL = "SELECT * from "+table+";";
        ResultSet rs = store.queryDatabase(SQL);

       adNo.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("adNo"));
       S_ID.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("S_ID"));
       surName.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("surName"));
       address.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("address"));
       adYear.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("adYear"));
       gender.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("gender"));
       nationality.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("nationality"));
       addComments.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("addComments"));
       contact.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("contact"));
       photoNo.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("photoNo"));
       feesStatus.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("feesStatus"));
       Guardian.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("Guardian"));
       dob.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("dob"));
       clas.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("clas"));
       stream.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("stream"));
       house.setCellValueFactory(new PropertyValueFactory<StudentsModel, String>("house"));
       religion.setCellValueFactory(new PropertyValueFactory<>("religion"));


  while (rs.next()) {
                //modification needed right from the DB to much this Constructor
                data1.add(new StudentsModel(rs.getString("adNo"),rs.getString("S_ID"),rs.getString("surName"),rs.getString("address"),rs.getString("adYear"),
                                            rs.getString("gender"),rs.getString("nationality"),rs.getString("addComments"),rs.getString("pContact"),
                                            rs.getString("photoNo"),"",rs.getString("Guardian"),rs.getString("dob"),
                                            rs.getString("classAdmited"),rs.getString("religion"),rs.getString("stream"),rs.getString("houes")));
            }

       stdrcdsTab.setItems(data1);

}

 
    @FXML
    public void handleStdNew() {//mends needed
        StudentsModel tempPerson = new StudentsModel();
        SchoolProject school = new SchoolProject();
        boolean okClicked;
        okClicked = school.showPersonEditDialog(tempPerson);
        if (okClicked) {
//            mainApp.getPersonData().add(tempPerson);
        }
    }
        
        @FXML
	public void handleStdEdit() {
		
	}
        
        @FXML
	public void handleStdDelete() {
//			int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
//		if (selectedIndex >= 0) {
//			personTable.getItems().remove(selectedIndex);
//		} else {
//			// Nothing selected
//			Dialogs.showWarningDialog(mainApp.getPrimaryStage(),
//					"Please select a person in the table.",
//					"No Person Selected", "No Selection");
//		}	
	}
	
   /**************stdrcds***************************/    
       public void buildTableStaff(String table) throws SQLException{
        
        data2 = FXCollections.observableArrayList();
        store.dBConnect();
        String SQL = "SELECT * from "+table+";";
        ResultSet rs = store.queryDatabase(SQL);

       sId.setCellValueFactory(new PropertyValueFactory<AccountsModel, String>("sId"));
       name.setCellValueFactory(new PropertyValueFactory<AccountsModel, String>("name"));
       Subjects.setCellValueFactory(new PropertyValueFactory<AccountsModel, String>("Subjects"));
       Saddress.setCellValueFactory(new PropertyValueFactory<AccountsModel, String>("Saddress"));
       responsbility.setCellValueFactory(new PropertyValueFactory<AccountsModel, String>("responsbility"));
       Department.setCellValueFactory(new PropertyValueFactory<AccountsModel, String>("Department"));
       clases.setCellValueFactory(new PropertyValueFactory<AccountsModel, String>("clases"));
       passcode.setCellValueFactory(new PropertyValueFactory<AccountsModel, String>("passcode"));
       contact1.setCellValueFactory(new PropertyValueFactory<AccountsModel, String>("contact1"));
       contact2.setCellValueFactory(new PropertyValueFactory<AccountsModel, String>("contact2"));
       SphotoNo.setCellValueFactory(new PropertyValueFactory<AccountsModel, String>("SphotoNo"));
       fullTime.setCellValueFactory(new PropertyValueFactory<AccountsModel, String>("fullTime"));


  while (rs.next()) {
                //modification needed right from the DB to much this Constructor
                data2.add(new AccountsModel(rs.getString("sId"),rs.getString("name"),rs.getString("Sujects"),rs.getString("address"),rs.getString("responsbility"),
                                            rs.getString("Department"),rs.getString("clases"),rs.getString("passcode"),rs.getString("contact1"),
                                            rs.getString("contact2"),rs.getString("photoNo"),rs.getString("fullTime")));
            }

       staffrcdsTab.setItems(data2);

}
        
  
        @FXML
	public void handleStaffNew() {
		
	}
        
        @FXML
	public void handleStaffEdit() {
		
	}
        
        @FXML
	public void handleStaffDelete() {
		
	}
        
        /*******************staff*********************/
       
      


        /***************/
}