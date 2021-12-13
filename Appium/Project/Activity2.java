package AppiumProjectActivity;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity2 {
AndroidDriver<MobileElement> driver= null;
WebDriverWait wait;
	
	@BeforeClass
	 public void setUp() throws MalformedURLException {
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4Emulator");
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
		caps.setCapability("noReset", true);
				
		URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer,caps);
		wait = new WebDriverWait(driver, 120);
		
	}
	
	
  @Test
  public void addNote() {
	  
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("new_note_button"))).click(); 
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("editable_title"))).sendKeys("My Note");
	  driver.findElementById("edit_note_text").sendKeys("This is my note");
	  driver.findElementByAccessibilityId("Open navigation drawer").click();
	  String title = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("index_note_title"))).getText();
	  Assert.assertEquals(title, "My Note");
  }
  

  @AfterClass
  public void tearDown() {
	  
	 //driver.quit();
  }

}
