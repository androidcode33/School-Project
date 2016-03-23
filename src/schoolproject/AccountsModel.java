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
public class AccountsModel {
 private String sId;
 private String name;
 private String Subjects;
 private String Saddress;
 private String responsbility;
 private String Department;
 private String clases;
 private String passcode;
 private String contact1;
 private String contact2;
 private String SphotoNo;
 private String fullTime;

    public AccountsModel(String sId, String name, String Subjects, String address, String responsbility, String Department, String clas, String passcode, String contact1, String contact2, String photoNo, String fullTime) {
        this.sId = sId;
        this.name = name;
        this.Subjects = Subjects;
        this.Saddress = address;
        this.responsbility = responsbility;
        this.Department = Department;
        this.clases = clas;
        this.passcode = passcode;
        this.contact1 = contact1;
        this.contact2 = contact2;
        this.SphotoNo = photoNo;
        this.fullTime = fullTime;
    }

    public AccountsModel() {
    }

    public String getsId() {
        return sId;
    }

    public String getName() {
        return name;
    }

    public String getSubjects() {
        return Subjects;
    }

    public String getClases() {
        return clases;
    }

    public String getSphotoNo() {
        return SphotoNo;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

    public void setSphotoNo(String SphotoNo) {
        this.SphotoNo = SphotoNo;
    }

    public String getResponsbility() {
        return responsbility;
    }

    public String getDepartment() {
        return Department;
    }

    public String getPasscode() {
        return passcode;
    }

    public String getContact1() {
        return contact1;
    }

    public String getContact2() {
        return contact2;
    }

    public String getFullTime() {
        return fullTime;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubjects(String Subjects) {
        this.Subjects = Subjects;
    }

    public String getSaddress() {
        return Saddress;
    }

    public void setSaddress(String Saddress) {
        this.Saddress = Saddress;
    }

    public void setResponsbility(String responsbility) {
        this.responsbility = responsbility;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public void setFullTime(String fullTime) {
        this.fullTime = fullTime;
    }
    
    
    
}
