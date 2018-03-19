package promytheuspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver dr;

    By emailField = By.xpath("/html/body/app/ui-view/auth-zone/ui-view/sign-in-form/spinner-container/div[1]/div/div/form/div[1]/input");
    By passField = By.xpath("/html/body/app/ui-view/auth-zone/ui-view/sign-in-form/spinner-container/div[1]/div/div/form/div[2]/input");
    By loginBtn = By.xpath("//*[@id=\"login\"]");

    public Login (WebDriver dr){

        this.dr=dr;
    }

    public void enterEmailField(String emailid){

        dr.findElement(emailField).sendKeys(emailid);
    }

    public void enterPass(String passwd){
        dr.findElement(passField).sendKeys(passwd);
    }

    public void clickLogin(){

        dr.findElement(loginBtn).click();
    }

    public void login(String email, String passwd){
        enterEmailField(email);
        enterPass(passwd);
        clickLogin();
    }


}
