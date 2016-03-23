/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;


/**
 *
 * @author PAUL
 */
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 *
 * @author PAUL
 */
public class markSheetController extends MainParentController  {
    
 
    
    @Override
    public void setApp(SchoolProject application){
        this.application = application;
    }
   
     //sometimes written as so === @FXML private void initialize()
        public static String tabl = "";
        public static String tab2= "marksheet";
    
    @FXML TableView   MarksTable;
    @FXML TableView /*<EnterMarksModel>*/ MarksTable2;
//    @FXML TableView <EnterMarksModel> enterMarksTable3;
  
    //Best written
  //@FXML TableColumn <EnterMarksModel , String >INDEXColumn;
    @FXML TableColumn INDEXColumn;
    @FXML TableColumn NAMEColumn;
    @FXML TableColumn INDEXColumn2;
    @FXML TableColumn NAMEColumn2;
 /**********All  subject*************/
    
    @FXML TableColumn botSB01;
    @FXML TableColumn endSB01;
    @FXML TableColumn grdSB01;
    @FXML TableColumn finalMrkSB01;
    
    @FXML TableColumn botSB02;
    @FXML TableColumn endSB02;
    @FXML TableColumn grdSB02;
    @FXML TableColumn finalMrkSB02;
    
    @FXML TableColumn botSB03;
    @FXML TableColumn endSB03;
    @FXML TableColumn grdSB03;
    @FXML TableColumn finalMrkSB03;
    
    @FXML TableColumn botSB04;
    @FXML TableColumn endSB04;
    @FXML TableColumn grdSB04;
    @FXML TableColumn finalMrkSB04;
    
    @FXML TableColumn botSB05;
    @FXML TableColumn endSB05;
    @FXML TableColumn grdSB05;
    @FXML TableColumn finalMrkSB05;
    
    @FXML TableColumn botSB06;
    @FXML TableColumn endSB06;
    @FXML TableColumn grdSB06;
    @FXML TableColumn finalMrkSB06;
    
    @FXML TableColumn botSB07;
    @FXML TableColumn endSB07;
    @FXML TableColumn grdSB07;
    @FXML TableColumn finalMrkSB07;
    
    @FXML TableColumn botSB08;
    @FXML TableColumn endSB08;
    @FXML TableColumn grdSB08;
    @FXML TableColumn finalMrkSB08;
    
    @FXML TableColumn botSB09;
    @FXML TableColumn endSB09;
    @FXML TableColumn grdSB09;
    @FXML TableColumn finalMrkSB09;
    
    @FXML TableColumn botSB10;
    @FXML TableColumn endSB10;
    @FXML TableColumn grdSB10;
    @FXML TableColumn finalMrkSB10;
    
    @FXML TableColumn botSB11;
    @FXML TableColumn endSB11;
    @FXML TableColumn grdSB11;
    @FXML TableColumn finalMrkSB11;
    
    
 /**********************************/
    
    @FXML TableColumn position;
    @FXML TableColumn average;
    @FXML TableColumn total;
    @FXML TableColumn AGG;
    /**************first tab**********************/
    @FXML TableColumn mrkSB01;
    @FXML TableColumn GrdSB01;
    @FXML TableColumn mrkSB02;
    @FXML TableColumn GrdSB02;
    @FXML TableColumn mrkSB03;
    @FXML TableColumn GrdSB03;
    @FXML TableColumn mrkSB04;
    @FXML TableColumn GrdSB04;
    @FXML TableColumn mrkSB05;
    @FXML TableColumn GrdSB05;
    @FXML TableColumn mrkSB06;
    @FXML TableColumn GrdSB06;
    @FXML TableColumn mrkSB07;
    @FXML TableColumn GrdSB07;
    @FXML TableColumn mrkSB08;
    @FXML TableColumn GrdSB08;
    @FXML TableColumn mrkSB09;
    @FXML TableColumn GrdSB09;
    @FXML TableColumn mrkSB10;
    @FXML TableColumn GrdSB10;
    @FXML TableColumn mrkSB11;
    @FXML TableColumn GrdSB11;
    @FXML TableColumn mrkSB12;
    @FXML TableColumn GrdSB12;
    @FXML TableColumn mrkSB13;
    @FXML TableColumn GrdSB13;
    @FXML TableColumn mrkSB14;
    @FXML TableColumn GrdSB14;
    @FXML TableColumn mrkSB15;
    @FXML TableColumn GrdSB15;
    @FXML TableColumn mrkSB16;
    @FXML TableColumn GrdSB16;
    @FXML TableColumn mrkSB17;
    @FXML TableColumn GrdSB17;
    @FXML TableColumn mrkSB18;
    @FXML TableColumn GrdSB18;
    @FXML TableColumn mrkSB19;
    @FXML TableColumn GrdSB19;
    @FXML TableColumn mrkSB20;
    @FXML TableColumn GrdSB20;
    

    public markSheetController() {
    }
   
    ResultSet myresult;
    private ObservableList<MarkSheetModel> data;
    private ObservableList<Marksheet1Modal> data2;

 
     //sometimes written as so === @FXML private void initialize()
    @FXML
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            //buildTable ("s1_marksheet") ;
            buildTable2 ("s1_marksheet") ;
        } catch (SQLException ex) {
            Logger.getLogger(markSheetController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    

        public void buildTable(String table) throws SQLException{

            INDEXColumn.setCellValueFactory(new PropertyValueFactory<>("index") );
            NAMEColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
            average.setCellValueFactory( new PropertyValueFactory<>("average"));
            position.setCellValueFactory(new PropertyValueFactory<>("position"));
            total.setCellValueFactory(new PropertyValueFactory<>("total"));
            AGG.setCellValueFactory(new PropertyValueFactory<>("AGG"));
            
            /*************ALL SUBJECTS COLUMNS********************/
            botSB01.setCellValueFactory( new PropertyValueFactory<>("botSB01"));
            endSB01.setCellValueFactory(new PropertyValueFactory<>("endSB01"));
            grdSB01.setCellValueFactory(new PropertyValueFactory<>("grdSB01"));
            finalMrkSB01.setCellValueFactory(new PropertyValueFactory<>("finalMrkSB01"));
            
            botSB02.setCellValueFactory( new PropertyValueFactory<>("botSB02"));
            endSB02.setCellValueFactory(new PropertyValueFactory<>("endSB02"));
            grdSB02.setCellValueFactory(new PropertyValueFactory<>("grdSB02"));
            finalMrkSB02.setCellValueFactory(new PropertyValueFactory<>("finalMrkSB02"));
            
            botSB03.setCellValueFactory( new PropertyValueFactory<>("botSB03"));
            endSB03.setCellValueFactory(new PropertyValueFactory<>("endSB03"));
            grdSB03.setCellValueFactory(new PropertyValueFactory<>("grdSB03"));
            finalMrkSB03.setCellValueFactory(new PropertyValueFactory<>("finalMrkSB03"));
            
            botSB04.setCellValueFactory( new PropertyValueFactory<>("botSB04"));
            endSB04.setCellValueFactory(new PropertyValueFactory<>("endSB04"));
            grdSB04.setCellValueFactory(new PropertyValueFactory<>("grdSB04"));
            finalMrkSB04.setCellValueFactory(new PropertyValueFactory<>("finalMrkSB04"));
            
            botSB05.setCellValueFactory( new PropertyValueFactory<>("botSB05"));
            endSB05.setCellValueFactory(new PropertyValueFactory<>("endSB05"));
            grdSB05.setCellValueFactory(new PropertyValueFactory<>("grdSB05"));
            finalMrkSB05.setCellValueFactory(new PropertyValueFactory<>("finalMrkSB05"));
            
            botSB06.setCellValueFactory( new PropertyValueFactory<>("bot"));
            endSB06.setCellValueFactory(new PropertyValueFactory<>("end"));
            grdSB06.setCellValueFactory(new PropertyValueFactory<>("grd"));
            finalMrkSB06.setCellValueFactory(new PropertyValueFactory<>("finalMrk"));
           
            botSB06.setCellValueFactory( new PropertyValueFactory<>("botSB06"));
            endSB06.setCellValueFactory(new PropertyValueFactory<>("endSB06"));
            grdSB06.setCellValueFactory(new PropertyValueFactory<>("grdSB06"));
            finalMrkSB06.setCellValueFactory(new PropertyValueFactory<>("finalMrkSB06"));
            
            botSB07.setCellValueFactory( new PropertyValueFactory<>("botSB07"));
            endSB07.setCellValueFactory(new PropertyValueFactory<>("endSB07"));
            grdSB07.setCellValueFactory(new PropertyValueFactory<>("grdSB07"));
            finalMrkSB07.setCellValueFactory(new PropertyValueFactory<>("finalMrkSB07"));
            
            botSB08.setCellValueFactory( new PropertyValueFactory<>("botSB07"));
            endSB08.setCellValueFactory(new PropertyValueFactory<>("endSB07"));
            grdSB08.setCellValueFactory(new PropertyValueFactory<>("grdSB07"));
            finalMrkSB08.setCellValueFactory(new PropertyValueFactory<>("finalMrkSB07"));
            
            botSB09.setCellValueFactory( new PropertyValueFactory<>("botSB09"));
            endSB09.setCellValueFactory(new PropertyValueFactory<>("endSB09"));
            grdSB09.setCellValueFactory(new PropertyValueFactory<>("grdSB09"));
            finalMrkSB09.setCellValueFactory(new PropertyValueFactory<>("finalMrkSB09"));
              
            botSB10.setCellValueFactory( new PropertyValueFactory<>("botSB10"));
            endSB10.setCellValueFactory(new PropertyValueFactory<>("endSB10"));
            grdSB10.setCellValueFactory(new PropertyValueFactory<>("grdSB10"));
            finalMrkSB10.setCellValueFactory(new PropertyValueFactory<>("finalMrkSB10"));
            
            botSB11.setCellValueFactory( new PropertyValueFactory<>("botSB11"));
            endSB11.setCellValueFactory(new PropertyValueFactory<>("endSB11"));
            grdSB11.setCellValueFactory(new PropertyValueFactory<>("grdSB11"));
            finalMrkSB11.setCellValueFactory(new PropertyValueFactory<>("finalMrkSB11"));
              
            data = FXCollections.observableArrayList();
            store.dBConnect();
            String SQL = "SELECT * from "+table+";";
            ResultSet rs = store.queryDatabase(SQL);
            while (rs.next()) {
                //modification needed right from the DB to much this Constructor
                data.add(new MarkSheetModel(rs.getString("adNo"), rs.getString("Name"), createFeild("sb01_B", rs), createFeild("sb01_E", rs),createFeild("sb01_G", rs), createFeild("sb01_F", rs),
                        createFeild("sb02_B", rs), createFeild("sb02_E", rs),createFeild("sb02_G", rs), createFeild("sb02_F", rs),
                        createFeild("sb03_B", rs), createFeild("sb03_E", rs),createFeild("sb03_G", rs), createFeild("sb03_F", rs),
                        createFeild("sb04_B", rs), createFeild("sb04_E", rs),createFeild("sb04_G", rs), createFeild("sb04_F", rs),
                        createFeild("sb05_B", rs), createFeild("sb05_E", rs),createFeild("sb05_G", rs), createFeild("sb05_F", rs),
                        createFeild("sb06_B", rs), createFeild("sb06_E", rs),createFeild("sb06_G", rs), createFeild("sb06_F", rs),
                        createFeild("sb07_B", rs), createFeild("sb07_E", rs),createFeild("sb07_G", rs), createFeild("sb07_F", rs),
                        createFeild("sb08_B", rs), createFeild("sb08_E", rs),createFeild("sb08_G", rs), createFeild("sb08_F", rs),
                        createFeild("sb09_B", rs), createFeild("sb09_E", rs),createFeild("sb09_G", rs), createFeild("sb09_F", rs),
                        createFeild("sb10_B", rs), createFeild("sb10_E", rs),createFeild("sb10_G", rs), createFeild("sb10_F", rs),
                        createFeild("sb11_B", rs), createFeild("sb11_E", rs),createFeild("sb11_G", rs), createFeild("sb11_F", rs)
                ));
            }

        MarksTable.setItems(data);
    
    }
        
        /*******************************************/
  public void buildTable2(String table) throws SQLException{

            INDEXColumn2.setCellValueFactory(new PropertyValueFactory<>("index") );
            NAMEColumn2.setCellValueFactory(new PropertyValueFactory<>("name"));
            
            average.setCellValueFactory( new PropertyValueFactory<>("average"));
            position.setCellValueFactory(new PropertyValueFactory<>("position"));
            total.setCellValueFactory(new PropertyValueFactory<>("total"));
            AGG.setCellValueFactory(new PropertyValueFactory<>("AGG"));
            
            /*************ALL SUBJECTS COLUMNS********************/
            mrkSB01.setCellValueFactory( new PropertyValueFactory<>("mrkSB01"));
            GrdSB01.setCellValueFactory( new PropertyValueFactory<>("grdSB01"));
            //mrkSB02.setCellValueFactory( new PropertyValueFactory<>("mrkSB02"));
            //GrdSB02.setCellValueFactory( new PropertyValueFactory<>("grdSB02"));
            mrkSB03.setCellValueFactory( new PropertyValueFactory<>("mrkSB03"));
            GrdSB03.setCellValueFactory( new PropertyValueFactory<>("grdSB03"));
            mrkSB04.setCellValueFactory( new PropertyValueFactory<>("mrkSB04"));
            GrdSB04.setCellValueFactory( new PropertyValueFactory<>("grdSB04"));
            mrkSB05.setCellValueFactory( new PropertyValueFactory<>("mrkSB05"));
            GrdSB05.setCellValueFactory( new PropertyValueFactory<>("grdSB05"));
            mrkSB06.setCellValueFactory( new PropertyValueFactory<>("mrkSB06"));
            GrdSB06.setCellValueFactory( new PropertyValueFactory<>("grdSB06"));
            mrkSB07.setCellValueFactory( new PropertyValueFactory<>("mrkSB07"));
            GrdSB07.setCellValueFactory( new PropertyValueFactory<>("grdSB07"));
            mrkSB08.setCellValueFactory( new PropertyValueFactory<>("mrkSB08"));
            GrdSB08.setCellValueFactory( new PropertyValueFactory<>("grdSB08"));
            mrkSB09.setCellValueFactory( new PropertyValueFactory<>("mrkSB09"));
            GrdSB09.setCellValueFactory( new PropertyValueFactory<>("grdSB09"));
            mrkSB10.setCellValueFactory( new PropertyValueFactory<>("mrkSB10"));
            GrdSB10.setCellValueFactory( new PropertyValueFactory<>("grdSB10"));
            mrkSB11.setCellValueFactory( new PropertyValueFactory<>("mrkSB11"));
            GrdSB11.setCellValueFactory( new PropertyValueFactory<>("grdSB11"));
            mrkSB12.setCellValueFactory( new PropertyValueFactory<>("mrkSB12"));
            GrdSB12.setCellValueFactory( new PropertyValueFactory<>("grdSB12"));
            mrkSB13.setCellValueFactory( new PropertyValueFactory<>("mrkSB13"));
            GrdSB13.setCellValueFactory( new PropertyValueFactory<>("grdSB13"));
            mrkSB14.setCellValueFactory( new PropertyValueFactory<>("mrkSB14"));
            GrdSB14.setCellValueFactory( new PropertyValueFactory<>("grdSB14"));
            mrkSB15.setCellValueFactory( new PropertyValueFactory<>("mrkSB15"));
            GrdSB15.setCellValueFactory( new PropertyValueFactory<>("grdSB15"));
            mrkSB16.setCellValueFactory( new PropertyValueFactory<>("mrkSB16"));
            GrdSB16.setCellValueFactory( new PropertyValueFactory<>("grdSB16"));
            mrkSB17.setCellValueFactory( new PropertyValueFactory<>("mrkSB17"));
            GrdSB17.setCellValueFactory( new PropertyValueFactory<>("grdSB17"));
            mrkSB18.setCellValueFactory( new PropertyValueFactory<>("mrkSB18"));
            GrdSB18.setCellValueFactory( new PropertyValueFactory<>("grdSB18"));
            mrkSB19.setCellValueFactory( new PropertyValueFactory<>("mrkSB19"));
            GrdSB19.setCellValueFactory( new PropertyValueFactory<>("grdSB19"));
            mrkSB20.setCellValueFactory( new PropertyValueFactory<>("mrkSB20"));
            GrdSB20.setCellValueFactory( new PropertyValueFactory<>("grdSB20"));
            
            
            
           
            DatabaseConn store1 = new DatabaseConn("jdbc:mysql://localhost:3306/schoolSystem", "root", "");
            data2 = FXCollections.observableArrayList();
            store1.dBConnect();
            String SQL = "SELECT * from s1_marksheet;";
            ResultSet rs = store1.queryDatabase(SQL);
            while (rs.next()) {
                //modification needed right from the DB to much this Constructor
                data2.add(new Marksheet1Modal(createFeild("adNo", rs), createFeild("Name", rs), createBotFeild("sb01_B", rs), initGrade("sb01_B", rs),
                        createBotFeild("SB02_B", rs), initGrade("sb02_B", rs),createBotFeild("sb03_B", rs), initGrade("sb03_B", rs),
                        createBotFeild("SB04_B", rs), initGrade("sb04_B", rs),createBotFeild("sb05_B", rs), initGrade("sb05_B", rs),
                        createBotFeild("sb06_B", rs), initGrade("sb06_B", rs),createBotFeild("sb07_B", rs), initGrade("sb07_B", rs),
                        createBotFeild("sb08_B", rs), initGrade("sb08_B", rs),createBotFeild("sb09_B", rs), initGrade("sb09_B", rs),
                        createBotFeild("sb10_B", rs), initGrade("sb10_B", rs),createBotFeild("sb11_B", rs), initGrade("sb11_B", rs),
                        createBotFeild("sb12_B", rs), initGrade("sb12_B", rs),createBotFeild("sb13_B", rs), initGrade("sb13_B", rs),
                        createBotFeild("sb14_B", rs), initGrade("sb14_B", rs),createBotFeild("sb15_B", rs), initGrade("sb15_B", rs),
                        createBotFeild("sb16_B", rs), initGrade("sb16_B", rs),createBotFeild("sb17_B", rs), initGrade("sb17_B", rs),
                        createBotFeild("sb18_B", rs), initGrade("sb18_B", rs),createBotFeild("sb19_B", rs), initGrade("sb19_B", rs),
                        createBotFeild("sb20_B", rs), initGrade("sb20_B", rs)
                ));
            }

        MarksTable2.setItems(data);
       
    }

    public String createFeild(String column,ResultSet r){
        try{
            return r.getString(column);
        }catch(Exception ex){
            System.out.println(ex);
            return "";
        }
    }
    
    public String createBotFeild(String column,ResultSet r){
        try{
            float x = r.getFloat(column);
            return String.valueOf(x*100/30);
        }catch(Exception ex){
            System.out.println(ex);
            return "";
        }
    }
    public String initGrade(String column,ResultSet r){
        try{
            float x = r.getFloat(column);
            return store.grade(x*100/30);
        }catch(Exception ex){
            System.out.println(ex);
            return "";
        }
    }
}


