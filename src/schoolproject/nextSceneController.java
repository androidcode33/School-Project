/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;
import javafx.util.Callback;


/**
 *
 * @author PAUL
 */
public class nextSceneController extends MainParentController  { 
    
    public static String table = "s1_sb01";
    
    @FXML TableView   enterMarksTable;
    @FXML TableView /*<EnterMarksModel>*/ enterMarksTable2;
    @FXML Button browseBtn1;
    @FXML TextField importfield;
//    @FXML TableView <EnterMarksModel> enterMarksTable3;
  
    //Best written
  //@FXML TableColumn <EnterMarksModel , String >INDEXColumn;
    @FXML TableColumn INDEXColumn;
    @FXML TableColumn NAMEColumn;
    @FXML TableColumn INDEXColumn2;
    @FXML TableColumn NAMEColumn2;
    
    @FXML TableColumn P1Column;
//    @FXML TableColumn P1Grd;
    
    @FXML TableColumn P2Column2;
//    @FXML TableColumn P2Grd;
    
//    @FXML TableColumn P3Column;
//    @FXML TableColumn P3Grd;
    

    @FXML TableColumn Rank;
   
    ResultSet myresult;
    private ObservableList<EnterMarksModel> data;
//    private final Stage;

    public nextSceneController() {
    }
       @Override
    public void setApp(SchoolProject application){
        this.application = application;
        
    }  
     //sometimes written as so === @FXML private void initialize()
    @FXML
    @Override
    public void initialize(URL location, ResourceBundle resources) {
//         stage = null;
//        stage.setTitle("Choose Excel file");
        myTable(enterMarksTable , "s1_sb01");
        myTable(enterMarksTable2 , "s1_sb01");
        
    }
    
 public void myTable(TableView enterMarksTable ,String table){
        try {
            enterMarksTable.setEditable(true);
            enterMarksTable.getSelectionModel (). setCellSelectionEnabled(true);
            
            enterMarksTable.addEventFilter(KeyEvent.KEY_PRESSED, (KeyEvent event) -> {
                if (event.getCode() == KeyCode.ENTER) { return;}
                
                if (enterMarksTable.getEditingCell() == null)
                {
                    if (event.getCode().isLetterKey() || event.getCode().isDigitKey()) {
                        TablePosition focusedCellPosition = enterMarksTable.getFocusModel().getFocusedCell();
                        enterMarksTable.edit(focusedCellPosition.getRow(),focusedCellPosition.getTableColumn());
                        
                    }
                }
            });
            
            
            enterMarksTable.addEventFilter(KeyEvent.KEY_RELEASED, (KeyEvent event) -> {
                if (event.getCode() == KeyCode.ENTER) {
                    // enterMarksTable.getSelectionModel().selectBelowCell();
                }
            });
             
            buildTable(table);
        } catch (SQLException ex) {
            Logger.getLogger(nextSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


        public void buildTable(String table) throws SQLException{

            Callback<TableColumn, TableCell> cellFactory
                    = new Callback<TableColumn, TableCell>() {
                        public TableCell call(TableColumn p) {
                            return new EditingCell();
                        }
                    };
            
            
            INDEXColumn.setCellValueFactory(
                    new PropertyValueFactory<EnterMarksModel, String>("index")); 
             
            NAMEColumn.setCellValueFactory(
                    new PropertyValueFactory<EnterMarksModel, String>("name"));

            INDEXColumn2.setCellValueFactory(
                    new PropertyValueFactory<EnterMarksModel, String>("index"));

            NAMEColumn2.setCellValueFactory(
                    new PropertyValueFactory<EnterMarksModel, String>("name"));

            P1Column.setCellValueFactory(
                    new PropertyValueFactory<EnterMarksModel, String>("p1"));
            P1Column.setCellFactory(cellFactory);
            
//          P1Column.setOnEditCommit(
//                    new EventHandler<CellEditEvent<EnterMarksModel, String>>() {
//                        @Override
//                        public void handle(CellEditEvent<EnterMarksModel, String> t) {
//                            ((EnterMarksModel) t.getTableView().getItems().get(
//                                    t.getTablePosition().getRow())).setP1(t.getNewValue());
//                        }
//                    }
//            );
//            P1Grd.setCellValueFactory(
//                    new PropertyValueFactory<EnterMarksModel, String>("p1grd"));
//            
            
//            
            P2Column2.setCellValueFactory(
                    new PropertyValueFactory<EnterMarksModel, String>("p2"));
            P2Column2.setCellFactory(cellFactory);
            
//            P2Grd.setCellValueFactory(
//                    new PropertyValueFactory<EnterMarksModel, String>("p2grd"));
            
            
            data = FXCollections.observableArrayList();
            store.dBConnect();
            String SQL = "SELECT * from "+table+";";
            ResultSet rs = store.queryDatabase(SQL);
            while (rs.next()) {
                //modification needed right from the DB to much this Constructor
                data.add(new EnterMarksModel(rs.getString("adNo"),rs.getString("Name"),rs.getString("BOT"),rs.getString("EOT")));
            }

        enterMarksTable.setItems(data);
        enterMarksTable2.setItems(data);
    }
     
        @FXML 
        public void handleBrowseBtn1() throws IOException{
            
            final FileChooser fileChooser = new FileChooser();
            configureFileChooser(fileChooser);
            File file = fileChooser.showOpenDialog(null);
            if (file != null) {
                String mypath = file.getCanonicalPath();
//                openFile(file);
                importfield.setText(mypath);
                System.out.println(mypath);
            }
        
        }
         @FXML 
        public void handleImportBtn1(){
        
        }

//    private void openFile(File file) {
//        EventQueue.invokeLater(() -> {
//            try {
//                desktop.open(file);
//            } catch (IOException ex) {
//                Logger.getLogger(FileChooserSample.class.getName()).
//                        log(Level.SEVERE, null, ex);
//            }
//        });
//    }

    private static void configureFileChooser(FileChooser fileChooser) {
   
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Files", "*.*"),
                new FileChooser.ExtensionFilter("Excel", "*.xls*")
        );
    
    }
}




