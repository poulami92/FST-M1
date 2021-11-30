package com.ibm.FST_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
        String title = driver.getTitle();
		
		System.out.println("Title of the Page :"+title);
		
		driver.findElement(By.id("confirm")).click();
		
		Alert confirmAlert =driver.switchTo().alert();
		
		String alertMsg=confirmAlert.getText();
		System.out.println("Test on confirm alert box :"+alertMsg);
		
//		confirmAlert .accept();
		
		confirmAlert.dismiss();
		
		driver.close();
	

	}

}
