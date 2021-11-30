package com.ibm.FST_Alchemy_Jobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity_4 {

	@Test
	public void getSecondHeading() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		String heading = driver.findElement(By.xpath("//div[contains(@class,'entry-content clear')]//h2")).getText();
		Assert.assertEquals(heading, "Quia quis non");
		driver.close();
	}

}
