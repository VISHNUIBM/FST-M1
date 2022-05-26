package Appium.Mobile;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity2 {

    WebDriverWait wait;
    AndroidDriver<MobileElement> driver = null;

    @BeforeClass
    public void setup() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 30);
    }

    @Test
    public void testSearchAppium() {
        // Open page in browser
        driver.get("https://www.training-support.net");

        // Wait for page to load
        //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("about-link")));

        try
        {
            Thread.sleep(2000);
        }catch(InterruptedException e) {
            System.out.println(e);
        }
       // MobileElement aboutUs = driver.findElementById("about-link");
      //  String aboutUs = driver.findElementByLinkText(MobileBy.id("about-link")).getText());
       // System.out.println("Text Here:  " + aboutUs.getText());

    // Get heading on page and print it
       //String pageTitle = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();

      // System.out.println("Title on Homepage: " + pageTitle);

        // Find About Us button and click it
        MobileElement aboutButton = driver.findElementByXPath("//android.view.View[@text='About Us']");
      //  aboutButton.click();
        System.out.println("Text here >> : " + aboutButton.getText());

        // Wait for new page to load
     //   wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='About Us']")));

        // Get heading on About Us page and print it
        //String newPageTitle = driver.findElementByXPath("").getText();
       // String newPagetitle1 = driver.findElementByXPath("//android.widget.TextView[@text='About Us']").getText();
      // System.out.println("Title on new page: " + newPagetitle1);

        // Assertions
      //  Assert.assertEquals(pageTitle, "Training Support");
      //  Assert.assertEquals(newPageTitle, "About Us");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
