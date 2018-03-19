package promytheuspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class Personal {


    WebDriver dr;

    By logocompany = By.xpath("/html/body/app/ui-view/public-area/div/header/nav/div[1]/a/div[1]/img");
    By newbtn = By.xpath("/html/body/app/ui-view/public-area/div/ui-view/talents-section/div/section/div/div/spinner-container/div[1]/div/div[1]/div/div/div/a");
    By category = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[1]/div[1]/div/div[1]/div[1]/span");

    By fname = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[1]/div[1]/input");
    By lname = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[1]/div[3]/input");
    By mname = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[1]/div[2]/input");
    By imgchoose = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[2]/div[1]/div[1]/div/span/button/span[2]");

    By sexM = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[3]/div/label[1]/span");
    By sexF = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[3]/div/label[2]/span");
    By sexO = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[3]/div/label[3]/span");

    By dob = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[4]/div[1]/div/input");
    By placeOfBirth = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[4]/div[2]/input");
    By country = By.xpath("//*[@id=\"signUpCountry\"]/span/span[2]");
    By addressLine1 = By.xpath("//*[@id=\"signUpCountry\"]/span/span[2]");
    By addressLine2 = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[6]/div/div/div[2]/input");

    By city = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[7]/div/input");
    By state = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[8]/div/input");
    By postalCode = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[9]/div/input");

    By locationRural = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[10]/div/label[1]/span");
    By locationUrban = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[10]/div/label[2]/span");

    By locationPriv = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[11]/div/label[1]/span");
    By locationUnpriv = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[11]/div/label[2]/span");
    By contactEmail = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[12]/div[1]/input");
    By contactPhone = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[12]/div[2]/input");

    By height = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[14]/div/input");
    By weignt = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[15]/div/input");

    By nextBtn = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[2]/button[2]");

    public Personal (WebDriver dr){
        this.dr = dr;
    }

    public void setFname(String firstname){
        dr.findElement(fname).sendKeys(firstname);
    }

    public void setMname(String midname){
        dr.findElement(mname).sendKeys(midname);
    }

    public void setLname(String lastname){
        dr.findElement(lname).sendKeys(lastname);
    }

    public void setImgchoose() throws Exception{

        Robot robo = new Robot();

        dr.findElement(imgchoose).click();

        File file = new File("/Users/suchismitasethi/Desktop/IMG_1833-EFFECTS.jpg");
        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        // Cmd + Tab is needed since it launches a Java app and the browser looses focus

        robo.keyPress(KeyEvent.VK_META);
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_META);
        robo.keyRelease(KeyEvent.VK_TAB);
        robo.delay(500);
//Open Goto window
        robo.keyPress(KeyEvent.VK_META);
        robo.keyPress(KeyEvent.VK_SHIFT);
        robo.keyPress(KeyEvent.VK_G);
        robo.keyRelease(KeyEvent.VK_META);
        robo.keyRelease(KeyEvent.VK_SHIFT);
        robo.keyRelease(KeyEvent.VK_G);
//Paste the clipboard value
        robo.keyPress(KeyEvent.VK_META);
        robo.keyPress(KeyEvent.VK_V);
        robo.keyRelease(KeyEvent.VK_META);
        robo.keyRelease(KeyEvent.VK_V);
//Press Enter key to close the Goto window and Upload window
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);
        robo.delay(500);
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);
    }

    public void setSex(String sex){
       if (sex=="M"){
           dr.findElement(sexM).click();
       }
       if (sex=="F"){
           dr.findElement(sexF).click();
       }
       else {
           dr.findElement(sexO).click();
       }

    }

    public void setDob(String dateofbirth){
        dr.findElement(dob).sendKeys(dateofbirth);
    }

    public void setPlaceOfBirth(String pob){
        dr.findElement(placeOfBirth).sendKeys(pob);
    }

    public void setCountry(String countrynm){
        dr.findElement(country).sendKeys(countrynm);
    }

    public void setAddressLine1(String al1){
        dr.findElement(addressLine1).sendKeys(al1);
    }

    public void setAddressLine2(String al2){
        dr.findElement(addressLine2).sendKeys(al2);
    }

    public void setCity(String citynm){
        dr.findElement(city).sendKeys(citynm);
    }

    public void setState(String statenm){
        dr.findElement(state).sendKeys(statenm);
    }

    public void setPostalCode(String zipcode){
        dr.findElement(postalCode).sendKeys(zipcode);
    }

    public void setLocation(String loctype){
        if (loctype=="U"){
            dr.findElement(locationUrban).click();
        }
        if (loctype=="R"){
            dr.findElement(locationRural).click();
        }
    }

    public void setLocationStatus (String locStat){
        if (locStat=="P"){
            dr.findElement(locationPriv).click();
        }
        if (locStat!="P"){
            dr.findElement(locationUnpriv).click();
        }
    }

    public void setContact (String email, String phone){
        dr.findElement(contactEmail).sendKeys(email);
        dr.findElement(contactPhone).sendKeys(phone);

    }

    public void setHeight(String height1){
        dr.findElement(height).sendKeys(height1);
    }

    public void setWeignt(String weignt1){
        dr.findElement(weignt).sendKeys(weignt1);
    }

    public void clickNext(){
        dr.findElement(nextBtn).click();
    }

}
