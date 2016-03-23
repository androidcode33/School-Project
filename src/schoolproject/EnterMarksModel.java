/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author PAUL
 */
public class EnterMarksModel {
    
    private final SimpleStringProperty index;
    private final SimpleStringProperty name;
    private final SimpleStringProperty p1; 
    private final SimpleStringProperty p2;
//    private final SimpleStringProperty p1grd;
//    private final SimpleStringProperty p2grd;
//    private final SimpleStringProperty p3;
//    private final SimpleStringProperty p3grd;

//    private final SimpleStringProperty rank;
    
    public EnterMarksModel() {
        this.index = null;
        this.name = null;
        this.p1 = null;
        this.p2 = null;
//        this.p1grd  = null;
//        this.p2grd  = null;
//        this.rank = null;
        
    }

    public EnterMarksModel(String index, String name ,String p1,
            String p2
           // String p2grd ,String p1grd,String rank
    )
    {
        this.index = new SimpleStringProperty(index);
        this.name = new SimpleStringProperty(name);
        this.p1 = new SimpleStringProperty(p1);
        this.p2 = new SimpleStringProperty(p2);
       // this.p2grd = new SimpleStringProperty(p2grd);
       // this.p1grd = new SimpleStringProperty(p1grd);
       // this.rank = new SimpleStringProperty(rank);
                
    }

    public SimpleStringProperty IndexProperty() {
        return index;
    }
    public SimpleStringProperty NameProperty(){
        return name;
    }
    public SimpleStringProperty P1Property(){
        return p1;
    }
    public SimpleStringProperty P2Property(){
        return p2;
    }
    
 /***********************************************************/   
       
//    public SimpleStringProperty getP2() {
//        return p2;
//    }

//    public SimpleStringProperty getP2grd() {
//        return p2grd;
//    }
//
//    public SimpleStringProperty getP1grd() {
//        return p1grd;
//    }

//    public SimpleStringProperty getRank() {
//        return rank;
//    }
//    
    
    
    
    public String getIndex(){
    return index.get();
    }   
    public void setIndex(String index){
     this.index.set(index);
    }
    
    public String getName(){
    return name.get();
    }    
    public void setName(String name){
     this.name.set(name);  
    }
    
    public String getP1(){
    return p1.get();
    }
    public void setP1(String p1){
    this.p1.set(p1);
    }

    public String getP2(){
    return p2.get();
    }
//may set the getters normally
    public void setP2(String p2){
    this.p2.set(p2);
    }
 //may set the getters normally   

////may set the getters normally    
//     public void setp1grd(String p1grd){
//    this.p1grd.set(p1grd);
//    }
////may set the getters normally     
//      public void setp2grd(String p2grd){
//    this.p2grd.set(p2grd);
//    }
 //may set the getters normally     

 //may set the getters normally 
//    public void setrank(String rank) {
//        this.rank.set(rank);
//    }
      
}
