package LMS.PROJECT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        //Open browser
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }
    @Test
    public void Activity4() {

        WebElement bodyText = driver.findElement(By.cssSelector("#post-71 > div:nth-child(3) > h3:nth-child(1)"));
        Assert.assertEquals(bodyText.getText(), "Email Marketing Strategies");
        System.out.println(bodyText.getText());
        Reporter.log(bodyText.getText());

    }


    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
