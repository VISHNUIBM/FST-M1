package LMS.PROJECT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8{
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        //Open browser
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }
    @Test
    public void Activity8() {
        //WebElement bodyText = driver.findElement(By.className("uagb-ifb-title"));
        WebElement Contact = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/contact/']"));
        // Assert.assertTrue(blackButton.isDisplayed());
        Contact.click();
       WebElement FullName = driver.findElement(By.xpath("//*[@id='wpforms-8-field_0']"));
       FullName.sendKeys("Test");
        WebElement EMail = driver.findElement(By.xpath("//*[@id='wpforms-8-field_1']"));
        EMail.sendKeys("test@gmail.com");

        WebElement Subject = driver.findElement(By.xpath("//*[@id='wpforms-8-field_3']"));
        Subject.sendKeys("test@gmail.com");
        WebElement Comment = driver.findElement(By.xpath("//*[@id='wpforms-8-field_2']"));
        Comment.sendKeys("test@gmail.com");
        WebElement Submit = driver.findElement(By.xpath("//*[@id='wpforms-submit-8']"));
        Subject.click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
        WebElement SendUSMessage= driver.findElement(By.xpath("//h2[@class='uagb-heading-text']"));
        Assert.assertEquals(SendUSMessage.getText(),"Send us a message");
    }


    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
