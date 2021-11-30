package com.ibm.FST_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9_1 {

	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement dropDown = driver.findElement(By.id("single-select"));
		
		Select sel = new Select(dropDown);
		
		sel.selectByVisibleText("Option 2");
		sel.selectByIndex(3);
		sel.selectByValue("4");
		
		List<WebElement> options = sel.getOptions();
		
		for(WebElement opt : options) {
		
		  System.out.println(opt.getText());
		}
        
		driver.close();

	}

}
