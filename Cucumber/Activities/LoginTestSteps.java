package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {
	
    private WebDriver driver;
	private WebDriverWait wait;
	
	@Given("User is on Login page")
	public void userIsOnPage() {

	    driver=new FirefoxDriver();
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.training-support.net/selenium/login-form");
   }
   
   @When("^User enters username and password$")
   public void userEntersCredentials() {
	   
	   driver.findElement(By.id("username")).sendKeys("admin");
	   driver.findElement(By.id("password")).sendKeys("password");
	   driver.findElement(By.xpath("//button[text()='Log in']")).click();
	   
   }
   
   @When("^User enters \"(.*)\" and \"(.*)\"$")
   public void userEntersCredentials(String username,String password) {
	   
	   driver.findElement(By.id("username")).sendKeys(username);
	   driver.findElement(By.id("password")).sendKeys(password);
	   driver.findElement(By.xpath("//button[text()='Log in']")).click();
	   
   }
	 
   
   
   @Then("^Read the page title and confirmation message$")
   public void readPageTitle() {
	   
	   System.out.println("Title of the page :"+driver.getTitle());
	   String msg = driver.findElement(By.id("action-confirmation")).getText();
	   System.out.println("Confirmation message :"+msg);
   }
   @And("^Close the Browser$")
   public void closeBrowser() {
	   
	   driver.close();
   }

}
