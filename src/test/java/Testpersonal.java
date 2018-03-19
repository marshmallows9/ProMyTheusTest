import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import promytheuspages.Personal;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

public class Testpersonal {
  String address;
    WebDriver dr;
    Personal personal;
    public String randomFname = randomAlphanumeric(6).toLowerCase();
    public String randomLname = randomAlphanumeric(6).toLowerCase();
    public String randomMname = randomAlphanumeric(6).toLowerCase();
    //public String image choose = roboclass.upload();

    //public long address = randomAlphanumeric(6).toLowerCase();


  public void setAddress(String state) {
    this.address = state;
  }

  public String getAddress() {

        return address;

    }


}
