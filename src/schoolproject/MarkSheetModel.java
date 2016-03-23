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
public  class MarkSheetModel {
   private final SimpleStringProperty index;
   private final SimpleStringProperty name;
   
   private final SimpleStringProperty botSB01,endSB01,grdSB01, finalMrkSB01;
   private final SimpleStringProperty botSB02,endSB02,grdSB02, finalMrkSB02;
   private final SimpleStringProperty botSB03,endSB03,grdSB03, finalMrkSB03;
   private final SimpleStringProperty botSB04,endSB04,grdSB04, finalMrkSB04;
   private final SimpleStringProperty botSB05,endSB05,grdSB05, finalMrkSB05;
   private final SimpleStringProperty botSB06,endSB06,grdSB06, finalMrkSB06;
   private final SimpleStringProperty botSB07,endSB07,grdSB07, finalMrkSB07;
   private final SimpleStringProperty botSB08,endSB08,grdSB08, finalMrkSB08;
   private final SimpleStringProperty botSB09,endSB09,grdSB09, finalMrkSB09;
   private final SimpleStringProperty botSB10,endSB10,grdSB10, finalMrkSB10;
   private final SimpleStringProperty botSB11,endSB11,grdSB11, finalMrkSB11;
   
   private String botSB12 , endSB12 , grdSB12 ,finaMrkSB12;
   private String botSB13 , endSB13 , grdSB13 ,finaMrkSB13;
   private String botSB14 , endSB14 , grdSB14 ,finaMrkSB14;
   private String botSB15 , endSB15 , grdSB15 ,finaMrkSB15;  
   private String botSB16 , endSB16 , grdSB16 ,finaMrkSB16;
   private String botSB17 , endSB17 , grdSB17 ,finaMrkSB17;
   private String botSB18 , endSB18 , grdSB18 ,finaMrkSB18;
   private String botSB19 , endSB19 , grdSB19 ,finaMrkSB19;
   private String botSB20 , endSB20 , grdSB20 ,finaMrkSB20;
   

   

public MarkSheetModel(){
   this.index= null;
   this.name= null;
   this.botSB01= null;this.endSB01= null; this.grdSB01= null;this.finalMrkSB01= null;
   this.botSB02= null;this.endSB02= null; this.grdSB02= null;this.finalMrkSB02= null;
   this.botSB03= null;this.endSB03= null; this.grdSB03= null;this.finalMrkSB03= null;
   this.botSB04= null;this.endSB04= null; this.grdSB04= null;this.finalMrkSB04= null;
   this.botSB05= null;this.endSB05= null; this.grdSB05= null;this.finalMrkSB05= null;
   this.botSB06= null;this.endSB06= null; this.grdSB06= null;this.finalMrkSB06= null;
   this.botSB07= null;this.endSB07= null; this.grdSB07= null;this.finalMrkSB07= null;
   this.botSB08= null;this.endSB08= null; this.grdSB08= null;this.finalMrkSB08= null;
   this.botSB09= null;this.endSB09= null; this.grdSB09= null;this.finalMrkSB09= null;
   this.botSB10= null;this.endSB10= null; this.grdSB10= null;this.finalMrkSB10= null;
   this.botSB11= null;this.endSB11= null; this.grdSB11= null;this.finalMrkSB11= null;
}
   
   


public MarkSheetModel(String index  , String name , String botSB01 ,String endSB01 ,String grdSB01 ,String finalMrkSB01, 

                             String botSB02 ,String endSB02 ,String grdSB02 ,String finalMrkSB02,
                             String botSB03 ,String endSB03 ,String grdSB03 ,String finalMrkSB03,
                             String botSB04 ,String endSB04 ,String grdSB04 ,String finalMrkSB04,
                             String botSB05 ,String endSB05 ,String grdSB05 ,String finalMrkSB05,
                             String botSB06 ,String endSB06 ,String grdSB06 ,String finalMrkSB06,
                             String botSB07 ,String endSB07 ,String grdSB07 ,String finalMrkSB07,
                             String botSB08 ,String endSB08 ,String grdSB08 ,String finalMrkSB08,
                             String botSB09 ,String endSB09 ,String grdSB09 ,String finalMrkSB09,
                             String botSB10 ,String endSB10 ,String grdSB10 ,String finalMrkSB10,
                             String botSB11 ,String endSB11 ,String grdSB11 ,String finalMrkSB11
                   
        
){
this.index = new SimpleStringProperty(index);
this.name = new SimpleStringProperty(name);
this.botSB01 = new SimpleStringProperty(botSB01);
this.endSB01 = new SimpleStringProperty(endSB01);
this.grdSB01 = new SimpleStringProperty(grdSB01);
this.finalMrkSB01 = new SimpleStringProperty(finalMrkSB01);

this.botSB02 = new SimpleStringProperty(botSB02);
this.endSB02 = new SimpleStringProperty(endSB02);
this.grdSB02 = new SimpleStringProperty(grdSB02);
this.finalMrkSB02 = new SimpleStringProperty(finalMrkSB02);

this.botSB03 = new SimpleStringProperty(botSB03);
this.endSB03 = new SimpleStringProperty(endSB03);
this.grdSB03 = new SimpleStringProperty(grdSB03);
this.finalMrkSB03 = new SimpleStringProperty(finalMrkSB03);

this.botSB04 = new SimpleStringProperty(botSB04);
this.endSB04 = new SimpleStringProperty(endSB04);
this.grdSB04 = new SimpleStringProperty(grdSB04);
this.finalMrkSB04 = new SimpleStringProperty(finalMrkSB04);

this.botSB05 = new SimpleStringProperty(botSB05);
this.endSB05 = new SimpleStringProperty(endSB05);
this.grdSB05 = new SimpleStringProperty(grdSB05);
this.finalMrkSB05= new SimpleStringProperty(finalMrkSB05);

this.botSB06 = new SimpleStringProperty(botSB06);
this.endSB06 = new SimpleStringProperty(endSB06);
this.grdSB06 = new SimpleStringProperty(grdSB06);
this.finalMrkSB06 = new SimpleStringProperty(finalMrkSB06);

this.botSB07 = new SimpleStringProperty(botSB07);
this.endSB07 = new SimpleStringProperty(endSB07);
this.grdSB07 = new SimpleStringProperty(grdSB07);
this.finalMrkSB07 = new SimpleStringProperty(finalMrkSB07);

this.botSB08 = new SimpleStringProperty(botSB08);
this.endSB08 = new SimpleStringProperty(endSB08);
this.grdSB08 = new SimpleStringProperty(grdSB08);
this.finalMrkSB08 = new SimpleStringProperty(finalMrkSB08);

this.botSB09 = new SimpleStringProperty(botSB09);
this.endSB09 = new SimpleStringProperty(endSB09);
this.grdSB09 = new SimpleStringProperty(grdSB09);
this.finalMrkSB09 = new SimpleStringProperty(finalMrkSB09);

this.botSB10 = new SimpleStringProperty(botSB10);
this.endSB10 = new SimpleStringProperty(endSB10);
this.grdSB10 = new SimpleStringProperty(grdSB10);
this.finalMrkSB10 = new SimpleStringProperty(finalMrkSB01);

this.botSB11 = new SimpleStringProperty(botSB11);
this.endSB11 = new SimpleStringProperty(endSB11);
this.grdSB11 = new SimpleStringProperty(grdSB11);
this.finalMrkSB11 = new SimpleStringProperty(finalMrkSB11);

}



     public String getIndex() {
        return index.get();
    }
public void setIndex(String index){
this.index.set(index);
}
    public String getName() {
        return name.get();
    }
public void setName(String name){
this.name.set(name);
}
    public String getBot() {
        return botSB01.get();
    }
public void setBot(String bot){
this.botSB01.set(bot);
}
    public String getEnd() {
        return endSB01.get();
    }
public void setEnd(String end){
this.endSB01.set(end);
}
    public String getGrd() {
        return grdSB01.get();
    }
public void setGrd(String grd){
this.grdSB01.set(grd);
}
    public String getFinalMrk() {
        return finalMrkSB01.get();
    }
public void setFinalMrk(String finalMrk){
this.finalMrkSB01.set(finalMrk);
}

    public String getBotSB02() {
        return botSB02.get();
    }
public void setBotSB02(String bot){
this.botSB02.set(bot);
}
    public String getEndSB02() {
        return endSB02.get();
    }
public void setEndSB02(String end){
this.endSB02.set(end);
}
    public String getGrdSB02() {
        return grdSB02.get();
    }
public void setGrdSB02(String grd){
this.grdSB02.set(grd);
}
    public String getFinalMrkSB02() {
        return finalMrkSB02.get();
    }
public void setFinalMrkSB02(String finalMrk){
this.finalMrkSB02.set(finalMrk);
}

    public String getBotSB03() {
        return botSB03.get();
    }
public void setBotSB03(String bot){
this.botSB03.set(bot);
}
    public String getEndSB03() {
        return endSB03.get();
    }
public void setEndSB03(String end){
this.endSB03.set(end);
}
    public String getGrdSB03() {
        return grdSB03.get();
    }
public void setGrdSB03(String grd){
this.grdSB03.set(grd);
}
    public String getFinalMrkSB03() {
        return finalMrkSB03.get();
    }
public void setFinalMrkSB03(String finalMrk){
this.finalMrkSB03.set(finalMrk);
}

    public String getBotSB04() {
        return botSB04.get();
    }
public void setBotSB04(String bot){
this.botSB04.set(bot);
}
    public String getEndSB04() {
        return endSB04.get();
    }
public void setEndSB04(String end){
this.endSB04.set(end);
}
    public String getGrdSB04() {
        return grdSB04.get();
    }
public void setGrdSB04(String grd){
this.grdSB04.set(grd);
}
    public String getFinalMrkSB04() {
        return finalMrkSB04.get();
    }
public void setFinalMrkSB04(String finalMrk){
this.finalMrkSB04.set(finalMrk);
}

    public String getBotSB05() {
        return botSB05.get();
    }
public void setBotSB05(String bot){
this.botSB05.set(bot);
}
    public String getEndSB05() {
        return endSB05.get();
    }
public void setEndSB05(String end){
this.endSB05.set(end);
}
    public String getGrdSB05() {
        return grdSB05.get();
    }
public void setGrdSB05(String grd){
this.grdSB05.set(grd);
}
    public String getFinalMrkSB05() {
        return finalMrkSB05.get();
    }
public void setFinalMrkSB05(String finalMrk){
this.finalMrkSB05.set(finalMrk);
}

    public String getBotSB06() {
        return botSB06.get();
    }
public void setBotSB06(String bot){
this.botSB06.set(bot);
}
    public String getEndSB06() {
        return endSB06.get();
    }
public void setEndSB06(String end){
this.endSB06.set(end);
}
    public String getGrdSB06() {
        return grdSB06.get();
    }
public void setGrdSB06(String grd){
this.grdSB06.set(grd);
}
    public String getFinalMrkSB06() {
        return finalMrkSB06.get();
    }
public void setFinalMrkSB06(String finalMrk){
this.finalMrkSB06.set(finalMrk);
}

    public String getBotSB07() {
        return botSB07.get();
    }
public void setBotSB07(String bot){
this.botSB07.set(bot);
}
    public String getEndSB07() {
        return endSB07.get();
    }
public void setEndSB07(String end){
this.endSB07.set(end);
}
    public String getGrdSB07() {
        return grdSB07.get();
    }
public void setGrdSB07(String grd){
this.grdSB07.set(grd);
}
    public String getFinalMrkSB07() {
        return finalMrkSB07.get();
    }
public void setFinalMrkSB07(String finalMrk){
this.finalMrkSB07.set(finalMrk);
}

    public String getBotSB08() {
        return botSB08.get();
    }
public void setBotSB08(String bot){
this.botSB08.set(bot);
}
    public String getEndSB08() {
        return endSB08.get();
    }
public void setEndSB08(String end){
this.endSB08.set(end);
}
    public String getGrdSB08() {
        return grdSB08.get();
    }
public void setGrdSB08(String grd){
this.grdSB08.set(grd);
}
    public String getFinalMrSB08() {
        return finalMrkSB08.get();
    }
public void setFinalMrkSB08(String finalMrk){
this.finalMrkSB08.set(finalMrk);
}

    public String getBotSB09() {
        return botSB09.get();
    }
public void setBotSB09(String bot){
this.botSB09.set(bot);
}
    public String getEndSB09() {
        return endSB09.get();
    }
public void setEndSB09(String end){
this.endSB09.set(end);
}
    public String getGrdSB09() {
        return grdSB09.get();
    }
public void setGrdSB09(String grd){
this.grdSB09.set(grd);
}
    public String getFinalMrkSB09() {
        return finalMrkSB09.get();
    }
public void setFinalMrkSB09(String finalMrk){
this.finalMrkSB09.set(finalMrk);
}

    public String getBotSB10() {
        return botSB10.get();
    }
public void setBotSB10(String bot){
this.botSB10.set(bot);
}
    public String getEndSB10() {
        return endSB10.get();
    }
public void setEndSB10(String end){
this.endSB10.set(end);
}
    public String getGrdSB10() {
        return grdSB10.get();
    }
public void setGrdSB10(String grd){
this.grdSB10.set(grd);
}
    public String getFinalMrkSB10() {
        return finalMrkSB10.get();
    }
public void setFinalMrkSB10(String finalMrk){
this.finalMrkSB10.set(finalMrk);
}

    public String getBotSB11() {
        return botSB11.get();
    }
public void setBotSB11(String bot){
this.botSB11.set(bot);
}
    public String getEndSB11() {
        return endSB11.get();
    }
public void setEndSB11(String end){
this.endSB11.set(end);
}
    public String getGrdSB11() {
        return grdSB11.get();
    }
public void setGrdSB11(String grd){
this.grdSB11.set(grd);
}
    public String getFinalMrkSB11() {
        return finalMrkSB11.get();
    }
public void setFinalMrkSB11(String finalMrk){
this.finalMrkSB11.set(finalMrk);
}
/***********************************************************/
    public String getBotSB12() {
        return botSB12;
    }

    public String getEndSB12() {
        return endSB12;
    }

    public String getGrdSB12() {
        return grdSB12;
    }

    public String getFinaMrkSB12() {
        return finaMrkSB12;
    }

    public String getBotSB13() {
        return botSB13;
    }

    public String getEndSB13() {
        return endSB13;
    }

    public String getGrdSB13() {
        return grdSB13;
    }

    public String getFinaMrkSB13() {
        return finaMrkSB13;
    }

    public String getBotSB14() {
        return botSB14;
    }

    public String getEndSB14() {
        return endSB14;
    }

    public String getGrdSB14() {
        return grdSB14;
    }

    public String getFinaMrkSB14() {
        return finaMrkSB14;
    }

    public String getBotSB15() {
        return botSB15;
    }

    public String getEndSB15() {
        return endSB15;
    }

    public String getGrdSB15() {
        return grdSB15;
    }

    public String getFinaMrkSB15() {
        return finaMrkSB15;
    }

    public String getBotSB16() {
        return botSB16;
    }

    public String getEndSB16() {
        return endSB16;
    }

    public String getGrdSB16() {
        return grdSB16;
    }

    public String getFinaMrkSB16() {
        return finaMrkSB16;
    }

    public String getBotSB17() {
        return botSB17;
    }

    public String getEndSB17() {
        return endSB17;
    }

    public String getGrdSB17() {
        return grdSB17;
    }

    public String getFinaMrkSB17() {
        return finaMrkSB17;
    }

    public String getBotSB18() {
        return botSB18;
    }

    public String getEndSB18() {
        return endSB18;
    }

    public String getGrdSB18() {
        return grdSB18;
    }

    public String getFinaMrkSB18() {
        return finaMrkSB18;
    }

    public String getBotSB19() {
        return botSB19;
    }

    public String getEndSB19() {
        return endSB19;
    }

    public String getGrdSB19() {
        return grdSB19;
    }

    public String getFinaMrkSB19() {
        return finaMrkSB19;
    }

    public String getBotSB20() {
        return botSB20;
    }

    public String getEndSB20() {
        return endSB20;
    }

    public String getGrdSB20() {
        return grdSB20;
    }

    public String getFinaMrkSB20() {
        return finaMrkSB20;
    }

    public void setBotSB12(String botSB12) {
        this.botSB12 = botSB12;
    }

    public void setEndSB12(String endSB12) {
        this.endSB12 = endSB12;
    }

    public void setGrdSB12(String grdSB12) {
        this.grdSB12 = grdSB12;
    }

    public void setFinaMrkSB12(String finaMrkSB12) {
        this.finaMrkSB12 = finaMrkSB12;
    }

    public void setBotSB13(String botSB13) {
        this.botSB13 = botSB13;
    }

    public void setEndSB13(String endSB13) {
        this.endSB13 = endSB13;
    }

    public void setGrdSB13(String grdSB13) {
        this.grdSB13 = grdSB13;
    }

    public void setFinaMrkSB13(String finaMrkSB13) {
        this.finaMrkSB13 = finaMrkSB13;
    }

    public void setBotSB14(String botSB14) {
        this.botSB14 = botSB14;
    }

    public void setEndSB14(String endSB14) {
        this.endSB14 = endSB14;
    }

    public void setGrdSB14(String grdSB14) {
        this.grdSB14 = grdSB14;
    }

    public void setFinaMrkSB14(String finaMrkSB14) {
        this.finaMrkSB14 = finaMrkSB14;
    }

    public void setBotSB15(String botSB15) {
        this.botSB15 = botSB15;
    }

    public void setEndSB15(String endSB15) {
        this.endSB15 = endSB15;
    }

    public void setGrdSB15(String grdSB15) {
        this.grdSB15 = grdSB15;
    }

    public void setFinaMrkSB15(String finaMrkSB15) {
        this.finaMrkSB15 = finaMrkSB15;
    }

    public void setBotSB16(String botSB16) {
        this.botSB16 = botSB16;
    }

    public void setEndSB16(String endSB16) {
        this.endSB16 = endSB16;
    }

    public void setGrdSB16(String grdSB16) {
        this.grdSB16 = grdSB16;
    }

    public void setFinaMrkSB16(String finaMrkSB16) {
        this.finaMrkSB16 = finaMrkSB16;
    }

    public void setBotSB17(String botSB17) {
        this.botSB17 = botSB17;
    }

    public void setEndSB17(String endSB17) {
        this.endSB17 = endSB17;
    }

    public void setGrdSB17(String grdSB17) {
        this.grdSB17 = grdSB17;
    }

    public void setFinaMrkSB17(String finaMrkSB17) {
        this.finaMrkSB17 = finaMrkSB17;
    }

    public void setBotSB18(String botSB18) {
        this.botSB18 = botSB18;
    }

    public void setEndSB18(String endSB18) {
        this.endSB18 = endSB18;
    }

    public void setGrdSB18(String grdSB18) {
        this.grdSB18 = grdSB18;
    }

    public void setFinaMrkSB18(String finaMrkSB18) {
        this.finaMrkSB18 = finaMrkSB18;
    }

    public void setBotSB19(String botSB19) {
        this.botSB19 = botSB19;
    }

    public void setEndSB19(String endSB19) {
        this.endSB19 = endSB19;
    }

    public void setGrdSB19(String grdSB19) {
        this.grdSB19 = grdSB19;
    }

    public void setFinaMrkSB19(String finaMrkSB19) {
        this.finaMrkSB19 = finaMrkSB19;
    }

    public void setBotSB20(String botSB20) {
        this.botSB20 = botSB20;
    }

    public void setEndSB20(String endSB20) {
        this.endSB20 = endSB20;
    }

    public void setGrdSB20(String grdSB20) {
        this.grdSB20 = grdSB20;
    }

    public void setFinaMrkSB20(String finaMrkSB20) {
        this.finaMrkSB20 = finaMrkSB20;
    }
    
    
    
/**************NEW********************/


}
