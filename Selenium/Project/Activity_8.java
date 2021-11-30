package com.ibm.FST_Alchemy_Jobs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity_8 {

	@Test
	public void backendLogin() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		String loggedName= driver.findElement(By.xpath("//a//span[@class='display-name']")).getText();
		Assert.assertEquals(loggedName, "root");
		
		driver.close();
	}

}
