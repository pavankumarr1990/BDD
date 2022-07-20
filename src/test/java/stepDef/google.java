package stepDef;

import common.SeleniumDriver;
import common.Utilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.googlePage;

import static common.SeleniumDriver.getDriver;

public class google {
    //    WebDriver driver;
//    public google(WebDriver driver)
//    {
//        this.driver=getDriver();
//    }
    Utilities utilities = new Utilities(getDriver());

    @Given("^Open browser and navigate to \"([^\"]*)\"$")
    public void open_browser_and_navigate_to_something(String strArg1) {
//        SeleniumDriver.openPage(strArg1);
        getDriver().get(strArg1);
        System.out.println("1st Ended");
    }

    googlePage gp = new googlePage(getDriver());

    @Then("^Enter the \"([^\"]*)\" in Google search$")
    public void enter_the_something_in_google_search(String strArg1) throws Throwable {
        try {
            getDriver().findElement(By.xpath("//input[@title='Search']")).sendKeys(strArg1);
//            gp.googleSearch_Box(strArg1);
            gp.type_googleSearch_Btn();
            Thread.sleep(5000);
            gp.type_googleSearch_Btn();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Assert.assertTrue(false, "Failed to click on Seach");
        }
    }

    @When("^User enter valid ID \"([^\"]*)\"$")
    public void user_enter_valid_id_something(String strArg1) throws Throwable {
        try {
            Thread.sleep(10000);
            getDriver().findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(strArg1);
            Thread.sleep(10000);
        } catch (Exception e) {
            Assert.assertTrue(false, "Pavan test");
        }
    }



}