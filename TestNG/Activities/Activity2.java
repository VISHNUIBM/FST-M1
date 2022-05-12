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

public class Activity2 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        //Open browser
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }
    @Test
    public void Activity2() {
        WebElement bodyText = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
               // Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(bodyText.getText(), "Learn from Industry Experts");
        Reporter.log(bodyText.getText());
        System.out.println(bodyText.getText());

    }


    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
