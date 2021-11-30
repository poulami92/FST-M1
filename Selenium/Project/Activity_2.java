package com.ibm.FST_Alchemy_Jobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity_2 {

	@Test
	public void getHeading() {
		  
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		String heading = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
		Assert.assertEquals(heading, "Welcome to Alchemy Jobs");
		driver.close();
	}

}
