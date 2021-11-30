package com.ibm.FST_Alchemy_Jobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity_1 {
  @Test
  public void getTitle() {
	  
	 
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/jobs");
      String title = driver.getTitle();
      Assert.assertEquals(title, "Alchemy Jobs – Job Board Application");
	 
	  driver.close();
		
    }
}
