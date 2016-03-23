/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author gerald
 */
public class reportsControllerModel {

private final StringProperty Class;
private final SimpleStringProperty index;
private final SimpleStringProperty name;
private final SimpleStringProperty average; 
private final SimpleStringProperty p2;

public reportsControllerModel () {
        this.index = null;
        this.name = null;
        this.average = null;
        this.p2 = null;
        this.Class=null;
}

public reportsControllerModel(String Class,String index,String name ,String average,
            String p2) {
this.Class = new SimpleStringProperty(Class);
this.index = new SimpleStringProperty(index);
this.name = new SimpleStringProperty(name);
this.average = new SimpleStringProperty(average);
this.p2 = new SimpleStringProperty(p2);

		}
public String getclass() {
return Class.get();
	}

public void setclass(String Class) {
	this.Class.set(Class);
	}
	
	public StringProperty classProperty() {
	return Class;
	}
	
	@Override
	public String toString() {
		return getclass();
	}
    public SimpleStringProperty IndexProperty() {
        return index;
    }
    public SimpleStringProperty NameProperty(){
        return name;
    }
    public SimpleStringProperty AverageProperty(){
        return average;
    }
    public SimpleStringProperty P2Property(){
        return p2;
    }
    

    
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
    
    public String getAverage(){
    return average.get();
    }
    public void setAverage(String average){
    this.average.set(average);
    }

    public String getP2(){
    return p2.get();
    }
//may set the getters normally
    public void setP2(String p2){
    this.p2.set(p2);
    }
    
}
