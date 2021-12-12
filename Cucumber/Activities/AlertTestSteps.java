package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertTestSteps {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private Alert alert;
	
	@Given("^User is on the page$")
	public void userIsOnPage() {
		
		driver=new FirefoxDriver();
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
	}
	
	@When("^User clicks the Simple Alert button$")
	public void userClicksOnSimpleAlert() {
		
		driver.findElement(By.id("simple")).click();
	}
	
	@When("^User clicks the Confirm Alert button$")
	public void userClicksOnConfirmAlert() {
		
		driver.findElement(By.id("confirm")).click();
	}
	
	@When("^User clicks the Prompt Alert button$")
	public void userClicksOnPromptAlert() {
		
		driver.findElement(By.id("prompt")).click();
	}
	
	@Then("^Alert opens$")
	public void alertOpens() {
		
		 alert=driver.switchTo().alert();
	}
	
	
	@And("^Write a custom message in it$")
	public void writeMsgOnAlert() {
		
		alert.sendKeys("Yes, you are!");
	}
	
	@And("^Close the alert$")
	public void closeAlert() {
		
		alert.accept();
	}
	
	@And("^Close the alert with Cancel$")
	public void cancelAlert() {
		
		alert.dismiss();
	}
	
	@And("^Read the text from it and print it$")
	public void readTextAndPrint() {
		
		System.out.println("Alert says: " + alert.getText());
	}
	
	@And("^Close Browser$")
	   public void closeBrowser() {
		   
		   driver.close();
	   }
	

}
