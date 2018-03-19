package promytheuspages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Category {

    WebDriver dr;

    By categorydd = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[1]/div[1]/div/div[1]/div[1]/span");
    By nextbtn = By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[2]/button[2]");

    public Category (WebDriver dr){
        this.dr = dr;
    }

    public void setCategorydd(String cat) throws Exception{
        Actions actions=new Actions(dr);
        actions.moveToElement(dr.findElement(categorydd));
        actions.click();
        Thread.sleep(3000);
        actions.sendKeys(cat);
        actions.sendKeys(Keys.TAB);
        actions.build().perform();
        Thread.sleep(3000);
    }

    public void clickNext(){
        dr.findElement(nextbtn);

    }
}
