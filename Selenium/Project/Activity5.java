package LMS.PROJECT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.TestRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

       //Create a new instance of the Firefox driver
        //Open browser
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }
    @Test
    public void Activity5() {
        //WebElement bodyText = driver.findElement(By.className("uagb-ifb-title"));
        WebElement myAccount = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']"));
        // Assert.assertTrue(blackButton.isDisplayed());
        myAccount.click();
        WebElement myAccountText = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
        Assert.assertTrue(myAccountText.isDisplayed());
        Reporter.log(myAccountText.getText());
        System.out.println(myAccountText.getText());

    }


    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
        Reporter.getCurrentTestResult();

    }
}
