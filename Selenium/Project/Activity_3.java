package com.ibm.FST_Alchemy_Jobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity_3 {

	@Test
	public void getImageUrl() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		String imgUrl =driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println("The image url :"+imgUrl);
		driver.close();
	}

}
