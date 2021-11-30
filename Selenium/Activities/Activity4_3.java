package com.ibm.FST_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/target-practice");
		
        String title = driver.getTitle();
		
		System.out.println("Title of the Page :"+title);
		
		WebElement thirdHeader = driver.findElement(By.xpath("//h3[text()='Third header']"));
		System.out.println("3rd Header of the Page :"+thirdHeader.getText());
		
		WebElement fifthHeader = driver.findElement(By.xpath("//h5[text()='Fifth header']"));
		System.out.println("5th Header of the Page :"+fifthHeader.getText());
		
		String color = fifthHeader.getCssValue("color");
		System.out.println("Color of 5th Header :"+color);
		
		WebElement violet = driver.findElement(By.xpath("//button[text()='Violet']"));
		System.out.println(violet.getText());
		System.out.println(violet.getAttribute("class"));
		
		WebElement grey = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
		System.out.println(grey.getText());
		
		driver.close();
		
		
	

	}

}
