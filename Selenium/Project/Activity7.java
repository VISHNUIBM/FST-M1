package LMS.PROJECT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        //Open browser
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }
    @Test
    public void Activity7() {
        //WebElement bodyText = driver.findElement(By.className("uagb-ifb-title"));
        WebElement Allcourses = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/all-courses/']"));
        // Assert.assertTrue(blackButton.isDisplayed());
        Allcourses.click();
        int Count = driver.findElements(By.xpath("//p[@class='ld_course_grid_button']")).size();

        Assert.assertEquals(Count,3);
        String countofCourses = String.valueOf(Count);
        System.out.println("Count of Course  :" + countofCourses);
    }


    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
