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
public class GradesModel {
    
    private String from;
    private String to;
    private String agg;
    private String remark;
    
    private String cls;
    private String botContri;
    private String midContri;
    private String endContri;

    public GradesModel(String from, String to, String agg, String remark, String cls, String botContri, String midContri, String endContri) {
        this.from = from;
        this.to = to;
        this.agg = agg;
        this.remark = remark;
        this.cls = cls;
        this.botContri = botContri;
        this.midContri = midContri;
        this.endContri = endContri;
    }
    public GradesModel() {}

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getAgg() {
        return agg;
    }

    public String getRemark() {
        return remark;
    }

    public String getCls() {
        return cls;
    }

    public String getBotContri() {
        return botContri;
    }

    public String getMidContri() {
        return midContri;
    }

    public String getEndContri() {
        return endContri;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setAgg(String agg) {
        this.agg = agg;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public void setBotContri(String botContri) {
        this.botContri = botContri;
    }

    public void setMidContri(String midContri) {
        this.midContri = midContri;
    }

    public void setEndContri(String endContri) {
        this.endContri = endContri;
    }
    
    /******************************/
    
    
    
}
