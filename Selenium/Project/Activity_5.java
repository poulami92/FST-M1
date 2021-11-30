package com.ibm.FST_Alchemy_Jobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity_5 {

	@Test
	public void navagateToJobs() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		String jobUrl=driver.findElement(By.xpath("//a[text()='Jobs']")).getAttribute("href");
		driver.findElement(By.xpath("//a[text()='Jobs']")).click();
		String newUrl=driver.getCurrentUrl();
		Assert.assertEquals(newUrl, jobUrl);
		driver.close();
	}

}
