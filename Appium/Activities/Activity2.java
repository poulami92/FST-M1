package com.ibm.FST_Appium;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity2 {
	
  AndroidDriver<MobileElement> driver= null;
  
  
  @BeforeClass
  public void setUp() throws MalformedURLException {
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4Emulator");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);
				
		URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer,caps);
		
	}
  
  @Test
  public void testSearchAppium() {
	  
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	    
	  
        driver.get("https://www.training-support.net/");
//        driver.findElementByXPath("//android.widget.Button[contains(@text,'NO THANKS')]").click();
        String title = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
        System.out.println("Title of the page :"+title);
        
        MobileElement aboutButton = driver.findElementByXPath("//android.view.View[@text='About Us']");
        aboutButton.click();
        
        String newPageTitle = driver
                .findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]")
                .getText();
 
        System.out.println("Title on new page: " + newPageTitle);
 
        // Assertions
        Assert.assertEquals(title, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
        
  }

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }
}
