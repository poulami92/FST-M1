package com.ibm.FST_Selenium;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Activity13_1 {

	    public static void main(String[] args) throws IOException, CsvException {
	    	
	    	//Load CSV file
	    	CSVReader reader = new CSVReader(new FileReader("src/resources/sample.csv"));
	    	
	    	List<String[]> list = reader.readAll();
	    	int rows= list.size();
	    	
	    	//Create Iterator reference
	    	Iterator<String[]> itr = list.iterator();

	    	//Iterate all values
	    	while(itr.hasNext()) {
	    	    String[] str = itr.next();

	    	    System.out.print("Values are: ");
	    	    for(int i=0;i<str.length;i++) {
	    	        System.out.print(" " + str[i]);
	    	    }
	    	        System.out.println(" ");
	    	}
	    	
	    	 System.out.println("No of rows :"+rows);
    }
}
