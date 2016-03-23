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
public class StudentsModel {
 
    private String adNo;
    private String S_ID;
    private String surName;
    private String address;


    private String adYear;
    private String gender;
    private String nationality;
    private String addComments;
    private String contact;
    private String photoNo;
    private String feesStatus;
    private String Guardian;
    private String dob;
    private String clas;
    private String stream;
    private String house;
    private String religion;

    public StudentsModel(String adNo, String S_ID, String surName, String address, String adYear, String gender, String nationality, String addComments, String contact, String photoNo, String feesStatus, String Guardian, String dob, String clas, String stream, String house, String religion) {
        this.adNo = adNo;
        this.S_ID = S_ID;
        this.surName = surName;
        this.address = address;
        this.adYear = adYear;
        this.gender = gender;
        this.nationality = nationality;
        this.addComments = addComments;
        this.contact = contact;
        this.photoNo = photoNo;
        this.feesStatus = feesStatus;
        this.Guardian = Guardian;
        this.dob = dob;
        this.clas = clas;
        this.stream = stream;
        this.house = house;
        this.religion = religion;
    }
            

    public StudentsModel() {
    }

    public String getAdNo() {
        return adNo;
    }

    public String getS_ID() {
        return S_ID;
    }

    public String getSurName() {
        return surName;
    }

    public String getAdYear() {
        return adYear;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public String getAddComments() {
        return addComments;
    }

    public String getContact() {
        return contact;
    }

    public String getPhotoNo() {
        return photoNo;
    }

    public String getFeesStatus() {
        return feesStatus;
    }

    public String getGuardian() {
        return Guardian;
    }

    public String getDob() {
        return dob;
    }

    public String getClas() {
        return clas;
    }

    public String getStream() {
        return stream;
    }

    public String getHouse() {
        return house;
    }

    public String getReligion() {
        return religion;
    }

    public void setAdNo(String adNo) {
        this.adNo = adNo;
    }

    public void setS_ID(String S_ID) {
        this.S_ID = S_ID;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAdYear(String adYear) {
        this.adYear = adYear;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAddComments(String addComments) {
        this.addComments = addComments;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPhotoNo(String photoNo) {
        this.photoNo = photoNo;
    }

    public void setFeesStatus(String feesStatus) {
        this.feesStatus = feesStatus;
    }

    public void setGuardian(String Guardian) {
        this.Guardian = Guardian;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
}
