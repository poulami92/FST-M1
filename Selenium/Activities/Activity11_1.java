package com.ibm.FST_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
        String title = driver.getTitle();
		
		System.out.println("Title of the Page :"+title);
		
		driver.findElement(By.id("simple")).click();
		
		Alert simpleAlert =driver.switchTo().alert();
		
		String alertMsg=simpleAlert.getText();
		System.out.println("Test on simple alert box :"+alertMsg);
		
		simpleAlert .accept();
		driver.close();
	

	}

}
