package com.ibm.FST_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver();
        
  //      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
        String title = driver.getTitle();
		
		System.out.println("Title of the Page :"+title);
		
		driver.findElement(By.xpath("//input[starts-with(@class,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@class,'password')]")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String msg=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();
		
		System.out.println("Welcome Message on Page :"+msg);
		
		driver.close();
		

	}

}
