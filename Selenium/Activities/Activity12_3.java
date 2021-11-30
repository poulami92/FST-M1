package com.ibm.FST_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12_3 {

	    public static void main(String[] args) {
	    	
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("The title of The Page :"+driver.getTitle());
        
        Actions action = new Actions(driver);
        
        WebElement btnSign = driver.findElement(By.xpath("//button[text()='Sign In']"));
        action.moveToElement(btnSign);
        
        String toolTipMsg = btnSign.getAttribute("data-tooltip");
        System.out.println("Tooltip message :"+toolTipMsg);
        
        btnSign.click();
        
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        String confirmMsg = driver.findElement(By.id("action-confirmation")).getText();
        
        System.out.println("The confirmation message :"+confirmMsg);
        
        driver.close();
    }
}
