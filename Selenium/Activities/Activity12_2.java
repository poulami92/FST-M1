package com.ibm.FST_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12_2 {

	    public static void main(String[] args) {
	    	
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        System.out.println("The title of The Page :"+driver.getTitle());
        
        driver.switchTo().frame(0);
        
        driver.switchTo().frame(0);
        
        String F1Heading = driver.findElement(By.xpath("//div[@class='content']")).getText();
        System.out.println("Heading of 1st frame :"+F1Heading);
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(0);
        
        driver.switchTo().frame(1);
        
        String F2Heading = driver.findElement(By.xpath("//div[@class='content']")).getText();
        System.out.println("Heading of 2nd frame :"+F2Heading);
        
        driver.close();
    }
}
