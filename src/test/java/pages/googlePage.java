package pages;

import common.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.SeleniumDriver.getDriver;

public class googlePage {

    Utilities utilities=new Utilities(getDriver());


    WebDriver driver;
    public googlePage(WebDriver driver)
    {
        this.driver=getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//input[@title='Search']")
    private WebElement type_googleSearch;
    @FindBy(xpath="//input[@value='Google Search']")
    private WebElement type_googleSearch_Btn;

    public void googleSearch_Box(String search){
        utilities.typeStrValue(type_googleSearch, search);
    }
    public void type_googleSearch_Btn() throws InterruptedException {
//        type_googleSearch_Btn.click();
        utilities.clickElement(type_googleSearch_Btn);
    }

}
