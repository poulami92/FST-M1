package com.ibm.FST_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver();
		
		driver.get(" https://www.training-support.net/selenium/simple-form");
		
        String title = driver.getTitle();
		
		System.out.println("Title of the Page :"+title);
		
        WebElement fName = driver.findElement(By.xpath("//input[@id='firstName']"));
		
		WebElement lName = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement contact = driver.findElement(By.xpath("//input[@id='number']"));
		
		WebElement message = driver.findElement(By.xpath("//textarea"));
		
        fName.sendKeys("Poulami");
		
		lName.sendKeys("Datta");
		
		email.sendKeys("abc@gmail.com");
		
		contact.sendKeys("9933095723");
		
		message.sendKeys("This is text");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.close();
		
		

	}

}
