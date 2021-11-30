package com.ibm.FST_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_2 {

	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get(" https://training-support.net/selenium/tables");
		
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='sortableTable']//tbody//tr"));
        
        System.out.println("Row nos in table :"+rows.size());
        
        List<WebElement> cols=driver.findElements(By.xpath("//table[@id='sortableTable']//tbody//tr[1]//td"));
        
        System.out.println("Cols nos in table :"+cols.size());
        
        String cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']//tbody//tr[2]//td[2]")).getText();
        
        System.out.println("Cell value in 2nd row 2nd col :"+cellValue);
        
        driver.findElement(By.xpath("//table[@id='sortableTable']//th[text()='Name']")).click();
        
        cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']//tbody//tr[2]//td[2]")).getText();
        
        System.out.println("Cell value in 2nd row 2nd col After Sorting :"+cellValue);
        
        List<WebElement> footerCells=driver.findElements(By.xpath("//table[@id='sortableTable']//tfoot//th"));
        
        System.out.println("cell values in footer");
        
        for(WebElement cell:footerCells) {
        
            System.out.println(cell.getText());
        }
		
		
		driver.close();

	}

}
