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
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 *
 * @author Micheal
 */
public class ReportViewController implements Initializable{
    @FXML Text sb01;
    @FXML Text sb02;
    @FXML Text sb03;
    @FXML Text sb04;
    @FXML Text sb05;
    @FXML Text sb06;
    @FXML Text sb07;
    @FXML Text sb08;
    @FXML Text sb09;
    @FXML Text sb10;
    @FXML Text sb11;
    @FXML Text sb12;
    @FXML Text sb13;
    @FXML Text sb14;
    @FXML Text sb15;
    @FXML Text sb16;
    @FXML Text sb17;
    @FXML Text sb18;
    @FXML Text sb19;
    @FXML Text sb20;
    @FXML Text sb21;
    @FXML Text sb22;
    @FXML Text sb23;
    @FXML Text sb24;
    @FXML Text sb25;
    
    @FXML Text sb01e;
    @FXML Text sb02e;
    @FXML Text sb03e;
    @FXML Text sb04e;
    @FXML Text sb05e;
    @FXML Text sb06e;
    @FXML Text sb07e;
    @FXML Text sb08e;
    @FXML Text sb09e;
    @FXML Text sb10e;
    @FXML Text sb11e;
    @FXML Text sb12e;
    @FXML Text sb13e;
    @FXML Text sb14e;
    @FXML Text sb15e;
    @FXML Text sb16e;
    @FXML Text sb17e;
    @FXML Text sb18e;
    @FXML Text sb19e;
    @FXML Text sb20e;
    @FXML Text sb21e;
    @FXML Text sb22e;
    @FXML Text sb23e;
    @FXML Text sb24e;
    @FXML Text sb25e;
    
    @FXML Text sb01b;
    @FXML Text sb02b;
    @FXML Text sb03b;
    @FXML Text sb04b;
    @FXML Text sb05b;
    @FXML Text sb06b;
    @FXML Text sb07b;
    @FXML Text sb08b;
    @FXML Text sb09b;
    @FXML Text sb10b;
    @FXML Text sb11b;
    @FXML Text sb12b;
    @FXML Text sb13b;
    @FXML Text sb14b;
    @FXML Text sb15b;
    @FXML Text sb16b;
    @FXML Text sb17b;
    @FXML Text sb18b;
    @FXML Text sb19b;
    @FXML Text sb20b;
    @FXML Text sb21b;
    @FXML Text sb22b;
    @FXML Text sb23b;
    @FXML Text sb24b;
    @FXML Text sb25b;
    
    @FXML Text sb01g;
    @FXML Text sb02g;
    @FXML Text sb03g;
    @FXML Text sb04g;
    @FXML Text sb05g;
    @FXML Text sb06g;
    @FXML Text sb07g;
    @FXML Text sb08g;
    @FXML Text sb09g;
    @FXML Text sb10g;
    @FXML Text sb11g;
    @FXML Text sb12g;
    @FXML Text sb13g;
    @FXML Text sb14g;
    @FXML Text sb15g;
    @FXML Text sb16g;
    @FXML Text sb17g;
    @FXML Text sb18g;
    @FXML Text sb19g;
    @FXML Text sb20g;
    @FXML Text sb21g;
    @FXML Text sb22g;
    @FXML Text sb23g;
    @FXML Text sb24g;
    @FXML Text sb25g;
    
    @FXML TextField name;
    @FXML TextArea clss;
    @FXML TextField tot;
    @FXML TextField avg;
    @FXML TextField sp;
    @FXML TextField cp;
    @FXML TextField st;
    @FXML TextField ct;
    @FXML ListView aClass;
    DatabaseConn con = new DatabaseConn("jdbc:mysql://localhost:3306/schoolSystem", "root", "");
    ObservableList classes = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(con.dBConnect()){
            try {
                ResultSet rs = con.queryDatabase("SELECT DISTINCT className from classRoom order by className");
                while(rs.next()){
                    classes.add(rs.getString("className"));
                }
                aClass.setItems(classes);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        aClass.setOnMouseClicked((MouseEvent event) -> {
                    try {
                        String a = aClass.getSelectionModel().getSelectedItem().toString();
                        System.out.println(a);
                        //initReport(a.replace(".",""));
                        //grade(a.replace(".",""));
                        setReportCard(a);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
        });
    }
    
    public void initReport(String sClass) throws SQLException{
        if(sClass.equalsIgnoreCase("s2") || sClass.equalsIgnoreCase("s1")){
            con.dBConnect();
            ResultSet r = con.queryDatabase("SELECT * FROM "+sClass+"subject;");
            int count = 0;
            while(r.next()){
                count = count+1;
                String code = r.getString("sCode");
                ResultSet s = con.queryDatabase("SELECT adNo,BOT*0.3 AS bt,EOT*0.7 as et from "+sClass+"_"+code+";");
                while(s.next()){
                    String n = s.getString("adNo");
                    String b = String.valueOf(s.getFloat("bt"));
                    String e = String.valueOf(s.getFloat("et"));
                    String f = String.valueOf(s.getFloat("bt") + s.getFloat("et"));
                    String g = con.grade(s.getFloat("bt") + s.getFloat("et"));
                    con.insert_or_Update("UPDATE "+sClass+"_"+"marksheet set "+code+"_B="+b+","+code+"_E="+e+","+code+"_F="+f+","+code+"_G='"+g+"' where adNo='"+n+"';");
                }
            }
            System.out.println("Fetch complete");
            try{
                ResultSet t = con.queryDatabase("Select * from "+sClass+"_marksheet;");
                while(t.next()){
                    float sum = 0;
                    String n = t.getString("adNo");
                    ResultSet tot = con.queryDatabase("SELECT * FROM "+sClass+"subject;");
                    while(tot.next()){
                        sum = sum + t.getFloat(tot.getString("sCode")+"_F");
                    }
                    con.insert_or_Update("UPDATE "+sClass+"_marksheet set total="+String.valueOf(sum)+",average="+String.valueOf(sum/count)+" where adNo='"+n+"';");
                }
            }catch(Exception ex){
                System.out.println(ex);
            }
            
        }
    }
    
    public void grade(String sClass){
        try{//Position in entire class
            ResultSet sz = con.queryDatabase("Select count(total) from "+sClass+"_marksheet;");
            int i=0,size = 0;
            if(sz.next())
                size = sz.getInt(1);
            float totals[] = new float[size];
            ResultSet pos = con.queryDatabase("Select total from "+sClass+"_marksheet order by total;");
            while(pos.next()){
                totals[i] = pos.getFloat("total");
                i = i+1;
            }
            
            ResultSet grade = con.queryDatabase("Select adNo,total from "+sClass+"_marksheet order by total;");
            while(grade.next()){
                String n = grade.getString("adNo");
                String p = String.valueOf(con.rank(totals,grade.getFloat("total")));
                con.insert_or_Update("UPDATE "+sClass+"_marksheet set classPosition="+p+" where adNo='"+n+"';");
            }
            
            //Position in streams
            ResultSet strm = con.queryDatabase("Select DISTINCT streamName from classRoom where className like '%"+sClass.replace("S", "").replace("s","")+"%';");
            while(strm.next()){
                ResultSet rt = con.queryDatabase("Select count(total) from "+sClass+"_marksheet where stream='"+strm.getString("streamName")+"';");
                if(rt.next())
                    size = rt.getInt(1);
                float subTotals[] = new float[size];
                ResultSet subPos = con.queryDatabase("Select total from "+sClass+"_marksheet where stream='"+strm.getString("streamName")+"' order by total;");
                int j = 0;
                while(subPos.next()){
                    subTotals[j] = subPos.getFloat("total");
                    j = j+1;
                }
                ResultSet sGrade = con.queryDatabase("Select adNo,total,classPosition from "+sClass+"_marksheet where stream='"+strm.getString("streamName")+"' order by total;");
                while(sGrade.next()){
                    String n = sGrade.getString("adNo");
                    String p = String.valueOf(con.rank(subTotals,sGrade.getFloat("total")));
                    con.insert_or_Update("UPDATE "+sClass+"_marksheet set streamPosition="+p+" where adNo='"+n+"';");
                }
            }
            System.out.println("Positioning Complete");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public void setReportCard(String sClass) {
        if(con.dBConnect()){
            ResultSet t = con.queryDatabase("Select * from "+sClass.replace(".","")+"_marksheet");
            try {
                if(t.next()){
                    name.setText(t.getString("Name"));
                    clss.setText(sClass);
                    tot.setText(t.getString("total"));
                    avg.setText(t.getString("average"));
                    cp.setText(t.getString("classPosition"));
                    sp.setText(t.getString("streamPosition"));
                    ResultSet s = con.queryDatabase("Select count(adNo) from "+sClass.replace(".","")+"_marksheet");
                    if(s.next())
                        ct.setText(s.getString(1));
                    ResultSet u = con.queryDatabase("Select count(adNo) from "+sClass.replace(".","")+"_marksheet where stream='"+t.getString("stream")+"';");
                    if(u.next())
                        st.setText(u.getString(1));
                    
                    setField(sb01, "sb01_F", t);
                    setField(sb02, "sb02_F", t);
                    setField(sb03, "sb03_F", t);
                    setField(sb04, "sb04_F", t);
                    setField(sb05, "sb05_F", t);
                    setField(sb06, "sb06_F", t);
                    setField(sb07, "sb07_F", t);
                    setField(sb08, "sb08_F", t);
                    setField(sb09, "sb09_F", t);
                    setField(sb10, "sb10_F", t);
                    setField(sb11, "sb11_F", t);
                    setField(sb12, "sb12_F", t);
                    setField(sb13, "sb13_F", t);
                    setField(sb14, "sb14_F", t);
                    setField(sb15, "sb15_F", t);
                    setField(sb16, "sb16_F", t);
                    setField(sb17, "sb17_F", t);
                    setField(sb18, "sb18_F", t);
                    setField(sb19, "sb19_F", t);
                    setField(sb20, "sb20_F", t);
                    setField(sb21, "sb21_F", t);
                    setField(sb22, "sb22_F", t);
                    setField(sb23, "sb23_F", t);
                    setField(sb24, "sb24_F", t);
                    setField(sb25, "sb25_F", t);
                    
                    setField(sb01e, "sb01_E", t);
                    setField(sb02e, "sb02_E", t);
                    setField(sb03e, "sb03_E", t);
                    setField(sb04e, "sb04_E", t);
                    setField(sb05e, "sb05_E", t);
                    setField(sb06e, "sb06_E", t);
                    setField(sb07e, "sb07_E", t);
                    setField(sb08e, "sb08_E", t);
                    setField(sb09e, "sb09_E", t);
                    setField(sb10e, "sb10_E", t);
                    setField(sb11e, "sb11_E", t);
                    setField(sb12e, "sb12_E", t);
                    setField(sb13e, "sb13_E", t);
                    setField(sb14e, "sb14_E", t);
                    setField(sb15e, "sb15_E", t);
                    setField(sb16e, "sb16_E", t);
                    setField(sb17e, "sb17_E", t);
                    setField(sb18e, "sb18_E", t);
                    setField(sb19e, "sb19_E", t);
                    setField(sb20e, "sb20_E", t);
                    setField(sb21e, "sb21_E", t);
                    setField(sb22e, "sb22_E", t);
                    setField(sb23e, "sb23_E", t);
                    setField(sb24e, "sb24_E", t);
                    setField(sb25e, "sb25_E", t);
                    
                    setField(sb01b, "sb01_B", t);
                    setField(sb02b, "sb02_B", t);
                    setField(sb03b, "sb03_B", t);
                    setField(sb04b, "sb04_B", t);
                    setField(sb05b, "sb05_B", t);
                    setField(sb06b, "sb06_B", t);
                    setField(sb07b, "sb07_B", t);
                    setField(sb08b, "sb08_B", t);
                    setField(sb09b, "sb09_B", t);
                    setField(sb10b, "sb10_B", t);
                    setField(sb11b, "sb11_B", t);
                    setField(sb12b, "sb12_B", t);
                    setField(sb13b, "sb13_B", t);
                    setField(sb14b, "sb14_B", t);
                    setField(sb15b, "sb15_B", t);
                    setField(sb16b, "sb16_B", t);
                    setField(sb17b, "sb17_B", t);
                    setField(sb18b, "sb18_B", t);
                    setField(sb19b, "sb19_B", t);
                    setField(sb20b, "sb20_B", t);
                    setField(sb21b, "sb21_B", t);
                    setField(sb22b, "sb22_B", t);
                    setField(sb23b, "sb23_B", t);
                    setField(sb24b, "sb24_B", t);
                    setField(sb25b, "sb25_B", t);
                    
                    setField(sb01g, "sb01_G", t);
                    setField(sb02g, "sb02_G", t);
                    setField(sb03g, "sb03_G", t);
                    setField(sb04g, "sb04_G", t);
                    setField(sb05g, "sb05_G", t);
                    setField(sb06g, "sb06_G", t);
                    setField(sb07g, "sb07_G", t);
                    setField(sb08g, "sb08_G", t);
                    setField(sb09g, "sb09_G", t);
                    setField(sb10g, "sb10_G", t);
                    setField(sb11g, "sb11_G", t);
                    setField(sb12g, "sb12_G", t);
                    setField(sb13g, "sb13_G", t);
                    setField(sb14g, "sb14_G", t);
                    setField(sb15g, "sb15_G", t);
                    setField(sb16g, "sb16_G", t);
                    setField(sb17g, "sb17_G", t);
                    setField(sb18g, "sb18_G", t);
                    setField(sb19g, "sb19_G", t);
                    setField(sb20g, "sb20_G", t);
                    setField(sb21g, "sb21_G", t);
                    setField(sb22g, "sb22_G", t);
                    setField(sb23g, "sb23_G", t);
                    setField(sb24g, "sb24_G", t);
                    setField(sb25g, "sb25_G", t);
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
    
    public void setField(Text txt,String column,ResultSet rs){
        try{
            txt.setText(rs.getString(column));
        }catch(SQLException ex){
            txt.setText("");
        }
    }
}
