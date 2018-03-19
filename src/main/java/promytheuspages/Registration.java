package promytheuspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Registration {

    WebDriver dr;

    By registrationButton = By.xpath("/html/body/app/ui-view/auth-zone/ui-view/sign-in-form/spinner-container/div[1]/div/div/a");

    By signUpFirstName = By.xpath("//*[@id=\"signUpFirstName\"]");

    By signUpMiddleName = By.xpath("//*[@id=\"signUpMiddleName\"]");

    By signUpLastName = By.xpath("//*[@id=\"signUpLastName\"]");

    By signUpRegisterEmail = By.xpath("//*[@id=\"signUpRegisterEmail\"]");

    By signUpPhone = By.xpath("//*[@id=\"signUpPhone\"]");

    By signUpRegisterPassword = By.xpath("//*[@id=\"signUpRegisterPassword\"]");

    By signUpRegisterRePassword = By.xpath("//*[@id=\"signUpRegisterRePassword\"]");

    By signUpCountry = By.xpath("//*[@id=\"signUpCountry\"]/span");

    By signUpAddress = By.xpath("//*[@id=\"signUpAddress\"]");

    By signUpCity = By.xpath("//*[@id=\"signUpCity\"]");

    By signUpState = By.xpath("//*[@id=\"signUpState\"]");

    By signUpZip = By.xpath("//*[@id=\"signUpZip\"]");

    By privacyPolicyAgree =  By.xpath("//*[@id=\"privacyPolicyAgree\"]");

    By createAccount = By.xpath("//*[@id=\"createAccount\"]");

    By successOkBtn = By.xpath("/html/body/div[2]/div[7]/div");
    //html/body/div[2]/div[7]/div/button
    //html/body/div[2]/div[7]/div

    public Registration (WebDriver dr){
        this.dr=dr;
    }

    public void clickRegister(){
        dr.findElement(registrationButton).click();
    }

    public void setSignUpFirstName (String firstName) {
        dr.findElement(signUpFirstName).sendKeys(firstName);
    }


    public void setSignUpMiddleName(String middleName){
        dr.findElement(signUpMiddleName).sendKeys(middleName);
    }


    public void setSignUpLastName(String lastName) {
        dr.findElement(signUpLastName).sendKeys(lastName);
    }


    public void setSignUpRegisterEmail (String registerEmail) {
        dr.findElement(signUpRegisterEmail).sendKeys(registerEmail);
    }


    public void setSignUpPhone(String phone) {
        dr.findElement(signUpPhone).sendKeys(phone);
    }


    public void setSignUpRegisterPassword (String registeredpassword) {
        dr.findElement(signUpRegisterPassword).sendKeys(registeredpassword);
    }


    public void setSignUpRegisterRePassword(String registerRePassword) {
        dr.findElement(signUpRegisterRePassword).sendKeys(registerRePassword);

    }


    public void setSignUpCountry(String country) {
        dr.findElement(signUpCountry).sendKeys(country);
    }


    public void setSignUpAddress (String address) {
        dr.findElement(signUpAddress).sendKeys(address);
    }


    public void setSignUpCity (String city) {
        dr.findElement(signUpCity).sendKeys(city);
    }


    public void setSignUpState (String state) {
        dr.findElement(signUpState).sendKeys(state);
    }


    public void setSignUpZip (String zip) {
        dr.findElement(signUpZip).sendKeys(zip);
    }


    public void setPrivacyPolicyAgree () {
        dr.findElement(privacyPolicyAgree).click();
    }


    public void setCreateAccount() {
        dr.findElement(createAccount).click();
    }

    public void clickSuccessOkBtn(){
        dr.findElement(successOkBtn).click();
    }

   public void registrationForm (String[] rfields) {
        setSignUpFirstName(rfields[1]);
        setSignUpMiddleName(rfields[2]);
        setSignUpLastName(rfields[3]);
        setSignUpRegisterEmail(rfields[4]);
        setSignUpPhone(rfields[5]);
        setSignUpRegisterPassword(rfields[6]);
        setSignUpRegisterRePassword(rfields[7]);
        setSignUpCountry(rfields[8]);
        setSignUpAddress(rfields[9]);
        setSignUpCity(rfields[10]);
        setSignUpState(rfields[11]);
        setSignUpZip(rfields[12]);
        setPrivacyPolicyAgree();
        setCreateAccount();
        //clickSuccessOkBtn();
   }
}
