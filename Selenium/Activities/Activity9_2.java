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

public class Activity9_2 {

	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement multiSelect = driver.findElement(By.id("multi-select"));
		
		Select sel = new Select(multiSelect);
		
		if(sel.isMultiple()) {
			
			sel.selectByVisibleText("Javascript");
			sel.selectByValue("node");
			for(int i =4;i<=6;i++) {
				sel.selectByIndex(i);
			}
			sel.deselectByValue("node");
			sel.deselectByIndex(7);
			System.out.println("First selected option :"+sel.getFirstSelectedOption().getText());
			
			List<WebElement> options = sel.getAllSelectedOptions();
			
			for(WebElement opt : options) {
			
			  System.out.println(opt.getText());
			}
			
			sel.deselectAll();
		}
		
		
        
		driver.close();

	}

}
