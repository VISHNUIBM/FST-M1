package LMS.PROJECT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Activity9 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        //Open browser
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }
    @Test
    public void Activity9() {

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
        //WebElement bodyText = driver.findElement(By.className("uagb-ifb-title"));
        WebElement Allcourses = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/all-courses/']"));
        // Assert.assertTrue(blackButton.isDisplayed());
        Allcourses.click();
       WebElement SocialMediaButton = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/courses/social-media-marketing/']"));
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        WebElement SeeMore = driver.findElement(By.cssSelector("#post-69 > div:nth-child(3) > p:nth-child(3) > a:nth-child(1)"));
        SeeMore.click();
        WebElement DevelopingStrategy = driver.findElement(By.cssSelector("div.ld-item-list-item:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
        DevelopingStrategy.click();

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
        WebElement DevelopingStrategyStatus = driver.findElement(By.cssSelector(".ld-table-list-lesson-details"));

        Assert.assertTrue(DevelopingStrategyStatus.getText().contains("100% COMPLETE"));
        //Assert.assertTrue(DevelopingStrategyStatus.getText().contains("COMPLETE"));
        System.out.println(DevelopingStrategyStatus.getText());

    }


    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
