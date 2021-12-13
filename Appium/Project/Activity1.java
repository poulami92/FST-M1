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

public class Activity1 {
AndroidDriver<MobileElement> driver= null;
WebDriverWait wait;
	
	@BeforeClass
	 public void setUp() throws MalformedURLException {
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4Emulator");
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		caps.setCapability("noReset", true);
				
		URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer,caps);
		wait = new WebDriverWait(driver, 40);
		
	}
	
	
  @Test
  public void addTask() {
	  
	  
	  String taskName="Complete Activity with Google Tasks";
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab"))).click(); 
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title"))).sendKeys(taskName);;
	  driver.findElementById("add_task_done").click();
//	  String addedTask =wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.FrameLayout[@content-desc='"+taskName+"']//android.widget.TextView"))).getText();
	  String addedTask =wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='"+taskName+"']"))).getText();
	  Assert.assertEquals(addedTask, taskName);
	  
	  taskName="Complete Activity with Google Keep";
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab"))).click(); 
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title"))).sendKeys(taskName);;
	  driver.findElementById("add_task_done").click();
	  addedTask =wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='"+taskName+"']"))).getText();
	  Assert.assertEquals(addedTask, taskName);
	  
	  taskName="Complete the second Activity Google Keep";
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab"))).click(); 
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title"))).sendKeys(taskName);;
	  driver.findElementById("add_task_done").click();
	  addedTask =wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='"+taskName+"']"))).getText();
	  Assert.assertEquals(addedTask, taskName);
  }
  

  @AfterClass
  public void tearDown() {
	  
	 driver.quit();
  }

}
