package com.ibm.FST_Appium;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class Activity1 {
	
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
  public void calc() {
	  System.out.println("Calculator is open");
  }

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }
}
