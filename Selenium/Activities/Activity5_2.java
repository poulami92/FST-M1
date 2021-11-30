package com.ibm.FST_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
        String title = driver.getTitle();
		
		System.out.println("Title of the Page :"+title);
		
		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("CheckBox is selected :"+check.isSelected());
		
		check.click();
		
		System.out.println("CheckBox is visble :"+check.isSelected());
		
		driver.close();
		

	}

}
