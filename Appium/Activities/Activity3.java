package com.ibm.FST_Appium;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
	
  AndroidDriver<MobileElement> driver= null;
  
  
  @BeforeClass
  public void setUp() throws MalformedURLException {
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4Emulator");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		caps.setCapability("noReset", true);
				
		URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer,caps);
		
	}
  
      @Test
      public void add() {
	  
	  driver.findElementById("digit_5").click();
	  driver.findElementByAccessibilityId("plus").click();
	  driver.findElementById("digit_9").click();
	  
	  driver.findElementById("eq").click();
	  
	  String result = driver.findElement(MobileBy.id("result")).getText();
	  System.out.println(result);
	  
	  Assert.assertEquals(result, "14");
	  
  }
      
      @Test
      public void subtract() {
	  
	  driver.findElementById("digit_1").click();
	  driver.findElementById("digit_0").click();
	  driver.findElementByAccessibilityId("minus").click();
	  driver.findElementById("digit_5").click();
	  
	  driver.findElementById("eq").click();
	  
	  String result = driver.findElement(MobileBy.id("result")).getText();
	  System.out.println(result);
	  
	  Assert.assertEquals(result, "5");
	  
  }
      
      @Test
      public void multiply() {
	  
	  driver.findElementById("digit_5").click();
	  driver.findElementByAccessibilityId("multiply").click();
	  driver.findElementById("digit_1").click();
	  driver.findElementById("digit_0").click();
	  driver.findElementById("digit_0").click();
	  
	  driver.findElementById("eq").click();
	  
	  String result = driver.findElement(MobileBy.id("result")).getText();
	  System.out.println(result);
	  
	  Assert.assertEquals(result, "500");
	  
  }
      
      @Test
      public void divide() {
	  
	  driver.findElementById("digit_5").click();
	  driver.findElementById("digit_0").click();
	  driver.findElementByAccessibilityId("divide").click();
	  driver.findElementById("digit_2").click();
	  
	  driver.findElementById("eq").click();
	  
	  String result = driver.findElement(MobileBy.id("result")).getText();
	  System.out.println(result);
	  
	  Assert.assertEquals(result, "25");
	  
  }

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }
}
