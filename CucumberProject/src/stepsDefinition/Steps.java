package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Steps {
      WebDriver dr;
	
	@Given("^Application is up and running$")
	public void application_is_up_and_running() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\techbodhi\\Drivers\\chromedriver.exe");
	    dr=new ChromeDriver();
		dr.get("http://newtours.demoaut.com/");
		dr.manage().window().maximize();   
	    
	}
	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials() throws Throwable {
		WebElement username=dr.findElement(By.name("userName"));
		
		//To Identify Element(Textbox)
		username.sendKeys("mercury");
		username.clear();
		username.sendKeys("mercury");
		
		//Textbox
		dr.findElement(By.name("password")).sendKeys("mercury");
		//Button
		dr.findElement(By.name("login")).click(); 
	}
	
	@Then("^I should be logged in successfully$")
	public void i_should_be_logged_in_successfully() throws Throwable {
		String temp = dr.getTitle();
		Assert.assertTrue(temp.contains("Find a Flight"));
	   
	}
	
	@When("^I enter (.*?) and (.*?) on login page$")
	public void i_enter_multiple_valid_credentials(String username1, String password) throws Throwable {
		WebElement username=dr.findElement(By.name("userName"));
		
		//To Identify Element(Textbox)
		username.sendKeys(username1);
		
		//Textbox
		dr.findElement(By.name("password")).sendKeys(password);
		//Button
		dr.findElement(By.name("login")).click(); 
	   
	}
   

	
	
	
}
