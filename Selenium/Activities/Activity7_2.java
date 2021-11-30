package com.ibm.FST_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver();
        
  //      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
        String title = driver.getTitle();
		
		System.out.println("Title of the Page :"+title);
		
		driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("poulami");
		driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("poulami1234");
		driver.findElement(By.xpath("//label[text() = 'Confirm Password']//following-sibling::input")).sendKeys("poulami1234");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		String msg=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();
		
		System.out.println("Welcome Message on Page :"+msg);
		
		driver.close();
		

	}

}
