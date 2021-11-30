package com.ibm.FST_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		System.out.println(driver.getTitle());
		
		WebElement linkTexById=driver.findElement(By.id("about-link"));
		System.out.println(linkTexById.getText());
		
		WebElement linkTexByClass=driver.findElement(By.className("green"));
		System.out.println(linkTexByClass.getText());
		
		WebElement linkTexByLink=driver.findElement(By.linkText("About Us"));
		System.out.println(linkTexByLink.getText());
		
		WebElement linkTexByCss=driver.findElement(By.cssSelector("a#about-link"));
		System.out.println(linkTexByCss.getText());
		
		driver.close();
		
		

	}

}
