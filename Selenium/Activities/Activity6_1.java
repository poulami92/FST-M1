package com.ibm.FST_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver();
        
  //      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
        String title = driver.getTitle();
		
		System.out.println("Title of the Page :"+title);
		
		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		driver.findElement(By.id("toggleCheckbox")).click();
		
		wait.until(ExpectedConditions.invisibilityOf(check));
		
		driver.findElement(By.id("toggleCheckbox")).click();
		
		wait.until(ExpectedConditions.visibilityOf(check)).click();
		
		driver.close();
		

	}

}
