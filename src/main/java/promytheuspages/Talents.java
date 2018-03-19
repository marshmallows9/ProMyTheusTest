package promytheuspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Talents {


    WebDriver dr;

    By prometheusHome = By.xpath("/html/body/app/ui-view/public-area/div/header/nav/div[1]/a/div[1]");
    By newTalents = By.xpath("/html/body/app/ui-view/public-area/div/ui-view/talents-section/div/section/div/div/spinner-container/div[1]/div/div[1]/div/div/div/a");

    public Talents (WebDriver dr){
        this.dr = dr;
    }

    public void clickprometheusHome(){
        dr.findElement(prometheusHome).click();
    }

    public void clickNew(){
        dr.findElement(newTalents).click();
    }

}
