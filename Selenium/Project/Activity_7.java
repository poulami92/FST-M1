package com.ibm.FST_Alchemy_Jobs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity_7 {

	@Test
	public void createJobListing(){
		
		WebDriver driver = new FirefoxDriver();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://alchemy.hguy.co/jobs");
		
		driver.findElement(By.xpath("//a[text()='Post a Job']")).click();
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
//		driver.findElement(By.id("create_account_email")).sendKeys("123datta@gmail.com");
		driver.findElement(By.id("job_title")).sendKeys("Technical Analyst");
		driver.findElement(By.id("job_location")).sendKeys("Pune");
		
		driver.switchTo().frame("job_description_ifr");
		driver.findElement(By.id("tinymce")).sendKeys("Analyst Role");
		driver.switchTo().defaultContent();
		
//		driver.findElement(By.id("application")).sendKeys("abc@hotmail.com");
		
//		driver.findElement(By.id("company_name")).sendKeys("IBM");
//		driver.findElement(By.xpath("//label[contains(text(),'Description')]//following-sibling::div//textarea")).sendKeys("Analyst Role");
		
		driver.findElement(By.xpath("//input[@value='Preview']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Submit Listing']"))).click();
		
		String confirmMsg=driver.findElement(By.xpath("//h1[text()='Post a Job']//parent::header//following-sibling::div")).getText();
		
		Assert.assertTrue(confirmMsg.contains("Job listed successfully"));
		
		driver.findElement(By.xpath("//a[text()='Jobs']")).click();
		
		
        driver.findElement(By.id("search_keywords")).sendKeys("Technical Analyst");
		driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Search completed')]")));
		
		String JobName=driver.findElement(By.xpath("//ul[@class='job_listings']//li//h3")).getText();
		Assert.assertEquals(JobName, "Technical Analyst");
		
		driver.close();
	}

}
