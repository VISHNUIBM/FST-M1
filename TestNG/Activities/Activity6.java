package LMS.PROJECT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity6 {
    WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        //Open browser
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }

    @Test
    public void Activity6() {
        //WebElement bodyText = driver.findElement(By.className("uagb-ifb-title"));
        WebElement myAccount = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']"));
        // Assert.assertTrue(blackButton.isDisplayed());
        myAccount.click();
        WebElement myAccountText = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
        Assert.assertTrue(myAccountText.isDisplayed());
        WebElement login = driver.findElement(By.xpath("//a[@href='#login']"));
        login.click();
        WebElement userLogin = driver.findElement(By.xpath("//input[@id='user_login']"));
        userLogin.sendKeys("root");
        WebElement Password = driver.findElement(By.xpath("//input[@id='user_pass']"));
        Password.sendKeys("pa$$w0rd");
        WebElement submitButton = driver.findElement(By.xpath("//input[@id='wp-submit']"));
        submitButton.click();
        //wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//a[@href='https://alchemy.hguy.co/lms/']"), "Home"));
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
        WebElement MyAccount = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/']"));
        Assert.assertTrue(MyAccount.isDisplayed());
        Reporter.log(MyAccount.getText());
    }


    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
