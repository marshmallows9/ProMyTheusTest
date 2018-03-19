import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import promytheuspages.*;

import java.awt.*;
import java.util.concurrent.TimeUnit;
import static java.lang.System.setProperty;
import static org.apache.commons.lang3.RandomStringUtils.*;


public class TestRegistration {

    WebDriver dr;
    Registration registration;
    Login login;
    MyProfile myProfile;
    Talents talents;
    Category category;
    Personal personal;

    public String randomFirstname = randomAlphanumeric(6).toLowerCase();
    public String randomLastname = randomAlphanumeric(6).toLowerCase();
    public String randomMidname = randomAlphanumeric(6).toLowerCase();
    public String randomEmail = randomAlphanumeric(6).toLowerCase();
    Faker fr = new Faker();

    @BeforeTest
    public void SetUp() {
        setProperty("webdriver.chrome.driver", "/Users/suchismitasethi/Downloads/chromedriver");
        dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dr.get("http://ec2-52-53-181-39.us-west-1.compute.amazonaws.com");
    }

    @Test(priority = 0, description = "Verify that user able to create an account by filling out the required fields.")
    public void checkRegistration() throws Exception {

        registration = new Registration(dr);
        fr = new Faker();

        String[] regFormDet = {"dfas", fr.firstName(), fr.name(), fr.lastName(), fr.firstName() + fr.lastName() + "@gmail.com", "4089998801",
                "xyz007", "xyz007", "USA", fr.secondaryAddress(), fr.cityPrefix(), fr.stateAbbr(), fr.zipCode()};

        registration.clickRegister();
        registration.registrationForm(regFormDet);
        Thread.sleep(5000);
        registration.clickSuccessOkBtn();

    }

    @Test(priority = 1)
    public void checkLogin() {

        login = new Login(dr);
        login.login("julia.suchi09@gmail.com", "bomikhal09");

    }

    @Test(priority = 1, dependsOnMethods = "checkLogin")
    public void checkUpdtFirstName() throws Exception {

        myProfile = new MyProfile(dr);
        myProfile.clickNavMyProfIcn();
        Thread.sleep(6000);
        myProfile.clickNavMyProf();
        Thread.sleep(6000);
        myProfile.clearFname();
        myProfile.setFname(randomFirstname);
        myProfile.setMidName(randomMidname);
        // myProfile.setPhone(random);
        myProfile.clickUpdate();
        Thread.sleep(3000);

    }


    @Test(priority = 2, dependsOnMethods = "checkLogin")
    public void verifyHome() {

        talents = new Talents(dr);
        talents.clickprometheusHome();
        talents.clickNew();
        talents.clickprometheusHome();
    }

    @Test(priority = 3, dependsOnMethods = "verifyHome",description = "Verify user can click on \"Next\" button under the \"Personal\" will be")
    public void verifyNext() throws Exception{
        talents = new Talents(dr);
        category = new Category(dr);
        personal = new Personal(dr);

        talents.clickprometheusHome();
        Thread.sleep(3000);
        talents.clickNew();
        Thread.sleep(3000);
        category.setCategorydd("Entrepreneur");
        Thread.sleep(3000);
        category.clickNext();
        Thread.sleep(3000);

        personal.setFname(fr.firstName());
        personal.setMname(fr.name());
        personal.setLname(fr.lastName());

        personal.setImgchoose();
        personal.setSex("M");

        personal.setCountry("USA");
        personal.setAddressLine1(fr.streetName());
        personal.setCity(fr.cityPrefix());
        personal.setState(fr.stateAbbr());
        personal.setPostalCode(fr.zipCode());
        personal.clickNext();



    }




}
