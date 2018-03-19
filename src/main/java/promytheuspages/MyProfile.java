package promytheuspages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyProfile {

    WebDriver dr;

    By navMyProfIcn = By.xpath("/html/body/app/ui-view/public-area/div/header/nav/div[2]/ul[2]/li[2]/a");
    By navMyProf = By.xpath("/html/body/app/ui-view/public-area/div/header/nav/div[2]/ul[2]/li[2]/ul/li/div/a[1]/div/div[2]/p");

    By fname = By.xpath("//*[@id=\"firstName\"]");

    By midName = By.xpath("//*[@id=\"middleName\"]");

    By lastName = By.xpath("//*[@id=\"lastName\"]");

    By address = By.xpath("//*[@id=\"address\"]");

    By phone = By.xpath("//*[@id=\"phone\"]");

    By email = By.xpath("//*[@id=\"email\"]");

    By updtBtn = By.xpath("//*[@id=\"updateProfile\"]");

    By navPassChng = By.xpath("/html/body/app/ui-view/public-area/div/ui-view/my-profile-section/div/section/div/div/div/div[1]/div/div[2]/a[2]");


    public MyProfile (WebDriver dr){
        this.dr = dr;
    }

    public void clickNavMyProfIcn(){
        dr.findElement(navMyProfIcn).click();
    }

    public void clickNavMyProf(){
        dr.findElement(navMyProf).click();
    }

    public void setFname(String first){
        dr.findElement(fname).sendKeys(first);
    }

    public void clearFname(){
        dr.findElement(fname).clear();
    }

    public void setMidName(String MI){
        dr.findElement(midName).sendKeys(MI);
    }

    public void clearMidName(){
        dr.findElement(midName).clear();
    }

    public void setLastName(String last){
        dr.findElement(lastName).sendKeys(last);
    }

    public void clearLastName(){
        dr.findElement(lastName).clear();
    }

    public void setAddress(String addr){
        dr.findElement(address).sendKeys(addr);
    }

    public void clearAddress(){
        dr.findElement(address).clear();
    }

    public void setPhone(String phn){
        dr.findElement(phone).sendKeys(phn);
    }

    public void clearPhone(){
        dr.findElement(phone).clear();
    }

    public void setEmail(String emailid){
        dr.findElement(email).sendKeys(emailid);
    }

    public void clearEmail(){
        dr.findElement(email).clear();
    }

    public void clickUpdate(){
        dr.findElement(updtBtn).click();
    }

    public void clickNavPassChng(){
        dr.findElement(navPassChng).click();
    }


}
