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
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
AndroidDriver<MobileElement> driver= null;
WebDriverWait wait;
	
	@BeforeClass
	 public void setUp() throws MalformedURLException {
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4Emulator");
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);
				
		URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer,caps);
		wait = new WebDriverWait(driver, 40);
		
	}
	
	
  @Test
  public void addNote() {
	  
	  driver.get("https://www.training-support.net/selenium");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@text='Get Started!']")));
	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(new UiSelector().scrollable(true)).scrollForward(8).scrollIntoView(textContains(\"To-Do\"))"));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[contains(@text,'Elements get added')]"))).click();
	  
		/*
		 * MobileElement inputTask = (MobileElement)
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(
		 * "//android.widget.EditText")));
		 * 
		 * MobileElement saveTask = (MobileElement)
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.
		 * xpath("//android.widget.Button[@text='Add Task']")));
		 */
		/*
		 * List<String> tasks = new ArrayList<String>();
		 * 
		 * tasks.add("Add tasks to list"); tasks.add("Get number of tasks");
		 * tasks.add("Clear the list");
		 * 
		 * for (String task : tasks) {
		 * 
		 * inputTask.sendKeys(task); saveTask.click(); }
		 */
	  
	  
	  
	 
	  
	  
	  
	  
  }
  

  @AfterClass
  public void tearDown() {
	  
	 //driver.quit();
  }

}
