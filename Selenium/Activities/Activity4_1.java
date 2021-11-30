package com.ibm.FST_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net");
		
		String title = driver.getTitle();
		
		System.out.println("Title of the Page :"+title);
		
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		
        title = driver.getTitle();
		
		System.out.println("New Title of the Page :"+title);
		
		
		
		
		
		

	}

}
