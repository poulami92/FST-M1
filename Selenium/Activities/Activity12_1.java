package com.ibm.FST_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12_1 {

	    public static void main(String[] args) {
	    	
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.training-support.net/selenium/iframes");
        System.out.println("The title of The Page :"+driver.getTitle());
        driver.switchTo().frame(0);
        
        String F1Heading = driver.findElement(By.xpath("//div[@class='content']")).getText();
        System.out.println("Heading of 1st frame :"+F1Heading);
        
        String btnText=driver.findElement(By.id("actionButton")).getText();
        System.out.println("Text on 1st Frame Button :"+btnText);
        
        String btnColor =driver.findElement(By.id("actionButton")).getCssValue("background-color");
        System.out.println("Color of 1st Frame Button :"+btnColor);
        
        driver.findElement(By.id("actionButton")).click();
        
        btnText=driver.findElement(By.id("actionButton")).getText();
        System.out.println("Text on 1st Frame New Button :"+btnText);
        
        btnColor =driver.findElement(By.id("actionButton")).getCssValue("background-color");
        System.out.println("Color of 1st Frame New Button :"+btnColor);
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(1);
        
        String F2Heading = driver.findElement(By.xpath("//div[@class='content']")).getText();
        System.out.println("Heading of 2nd frame :"+F2Heading);
        
        btnText=driver.findElement(By.id("actionButton")).getText();
        System.out.println("Text on 2nd Frame Button :"+btnText);
        
        btnColor =driver.findElement(By.id("actionButton")).getCssValue("background-color");
        System.out.println("Color of 2nd FrameButton :"+btnColor);
        
        driver.findElement(By.id("actionButton")).click();
        
        btnText=driver.findElement(By.id("actionButton")).getText();
        System.out.println("Text on 2nd Frame New Button :"+btnText);
        
        btnColor =driver.findElement(By.id("actionButton")).getCssValue("background-color");
        System.out.println("Color of 2nd Frame New Button :"+btnColor);
        
        driver.close();
    }
}
