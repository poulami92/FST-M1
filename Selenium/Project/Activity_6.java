package com.ibm.FST_Alchemy_Jobs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity_6 {

	@Test
	public void jobApply() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://alchemy.hguy.co/jobs");
		
		driver.findElement(By.xpath("//a[text()='Jobs']")).click();
		driver.findElement(By.id("search_keywords")).sendKeys("Testing");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Search completed')]")));
		
		driver.findElement(By.xpath("//ul[@class='job_listings']//h3[text()='Testing']")).click();
		
		driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
		
		String email= driver.findElement(By.xpath("//a[@class='job_application_email']")).getText();
		
		System.out.println("The email id for job application is :"+email);
		
		driver.close();
	}

}
