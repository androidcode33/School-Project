/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addit;
/**
 *
 * @author Miche
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * @author Micheal
 */
public class DatabaseConn{
    String dbURL;
    String username;
    String password;
    Connection dbCon = null;
    
    public DatabaseConn(String dbURL, String username, String password){
        this.dbURL = dbURL;
        this.username = username;
        this.password = password;
    }
    
    public Boolean dBConnect(){
        try{
            dbCon = DriverManager.getConnection(dbURL, username, password);
            return true;
        }catch(SQLException ex){
            System.out.println(ex);
            return false;
        }
    }
    
    public ResultSet queryDatabase(String query){
        ResultSet rs;
        Statement stmt;
        try {
            stmt = dbCon.prepareStatement(query);
            rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
    
    public Boolean insert_or_Update(String state){
        Statement stmt = null;
        try {
            stmt = dbCon.createStatement();
            stmt.executeUpdate(state);
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }
    public String grade(float x){
        if(x>=75 && x<=100)
            return "D1";
        if(x>=70 && x<75)
            return "D2";
        if(x>=65 && x<70)
            return "C3";
        if(x>=60 && x<65)
            return "C4";
        if(x>=55 && x<60)
            return "C5";
        if(x>=50 && x<55)
            return "C6";
        if(x>=45 && x<50)
            return "P7";
        if(x>=40 && x<45)
            return "P8";
        if(x>=0 && x<40)
            return "D2";
        return null;
    }
    
    public int rank(float array[],float total){
        int pos = 1,c,size = array.length;
        for(c = size-1; c > 0; c--){
            if(total == array[c]){
                break;
            }
            pos = pos+1;
        }
        return pos;
    }
}


//results = data.queryDatabase("SELECT * FROM Users where Name like '%"+uName.getText()+"%' order by Name");
//data.insert_or_Update("SELECT * FROM Users where Name like '%"+uName.getText()+"%' order by Name");
//float a;
//String inV = "INSERT INTO Users value('"+uName.getText()+"','"+passWord.getText()+"'"+");";
//data.insert_or_Update(inV);