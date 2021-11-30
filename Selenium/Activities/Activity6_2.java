package com.ibm.FST_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver();
        
  //      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://training-support.net/selenium/ajax");
		
        String title = driver.getTitle();
		
		System.out.println("Title of the Page :"+title);
		
		WebElement changeButton = driver.findElement(By.xpath("//button[text()='Change Content']"));
		
		changeButton.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'HELLO')]")));
		
		String msg = driver.findElement(By.id("ajax-content")).getText();
		
		System.out.println("Message on Page Initially :"+msg);
		
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'late')]")));
		
		driver.findElement(By.xpath("//h3[contains(text(),'m late')]"));
		
	    msg = driver.findElement(By.id("ajax-content")).getText();
		
		System.out.println("Message on Page Later :"+msg);
		
		driver.close();
		

	}

}
