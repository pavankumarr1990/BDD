package stepDef;

import common.SeleniumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class orangeLogin extends SeleniumDriver {
    @When("^User Enters valid user User ID \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_enters_valid_user_user_id_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        try {
            System.out.println("2nd step");
            getDriver().findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(strArg1);
            getDriver().findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(strArg2);
            getDriver().findElement(By.xpath("//input[@id='btnLogin']")).click();
            Thread.sleep(5000);
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to click on Login");
        }
    }
}
