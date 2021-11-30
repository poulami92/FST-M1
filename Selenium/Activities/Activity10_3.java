package com.ibm.FST_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Activity10_3 {

	    public static void main(String[] args) {
	    	
        WebDriver driver = new FirefoxDriver();
        
        driver.get(" https://training-support.net/selenium/drag-drop");
		
		String title = driver.getTitle();
		
		System.out.println("Title of the Page :"+title);
		
		WebElement ball = driver.findElement(By.id("draggable"));
		WebElement dropZone1 =driver.findElement(By.id("droppable"));
		WebElement dropZone2 =driver.findElement(By.id("dropzone2"));
		
		Actions action =new Actions(driver);
		
		action.dragAndDrop(ball, dropZone1).build().perform();
		
		String dropMsg=driver.findElement(By.xpath("//div[@id='droppable']//p")).getText();
		
		Assert.assertEquals(dropMsg, "Dropped!");
        System.out.println("ENTERED DROPZONE 1");
        
        action.dragAndDrop(ball, dropZone2).build().perform();
		
		dropMsg=driver.findElement(By.xpath("//div[@id='dropzone2']//p")).getText();
		
		Assert.assertEquals(dropMsg, "Dropped!");
        System.out.println("ENTERED DROPZONE 2");
		
        driver.close();
    }
}
