package com.ibm.FST_Alchemy_Jobs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity_9 {

	@Test
	public void backendJobListing(){
		
		WebDriver driver = new FirefoxDriver();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		driver.findElement(By.xpath("//div[text()='Job Listings']")).click();
		driver.findElement(By.xpath("//div[@class='wrap']//a[text()='Add New']")).click();
		
		driver.findElement(By.id("post-title-0")).sendKeys("Technical Specialist");
		driver.findElement(By.xpath("//label[contains(text(),'Location')]//following-sibling::input")).sendKeys("Delhi");
		driver.findElement(By.xpath("//label[contains(text(),'Expiry Date')]//following-sibling::input")).sendKeys("January 5, 2022");
		driver.findElement(By.xpath("//label[contains(text(),'Company Name')]//following-sibling::input")).sendKeys("IBM");
		
		driver.findElement(By.xpath("//button[text()='Publish…']")).click();
		driver.findElement(By.xpath("//button[text()='Publish']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='View Job']"))).click();

		
		String jobTitle = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
		Assert.assertEquals(jobTitle, "Technical Specialist");
		
		
		driver.close();
	}

}
