
package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assign {

	@Test
	public void test() throws InterruptedException
	{
		System.out.println("launch chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("http://www.newtours.demoaut.com");

		dr.manage().window().maximize();
		
		WebElement username = dr.findElement(By.name("userName"));
		username.sendKeys("mercury");
		Thread.sleep(2000);

		username.clear();
		
		dr.findElement(By.name("userName")).sendKeys("tiger");
		Thread.sleep(2000);
		dr.findElement(By.name("password")).sendKeys("tiger");
		dr.findElement(By.name("login")).click();

		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		
		WebElement box= dr.findElement(By.name("passCount"));
		Select sel= new Select(box);
		sel.selectByValue("2");
		Thread.sleep(200);
		
		WebElement box2= dr.findElement(By.name("fromPort"));
		Select sel2= new Select(box2);
		sel2.selectByIndex(2);
	
		WebElement box3= dr.findElement(By.name("fromMonth")); 
		Select sel3= new Select(box3); 
		sel3.selectByIndex(10);
		
		WebElement box4= dr.findElement(By.name("fromDay")); 
		Select sel4= new Select(box4); 
		sel4.selectByIndex(20);
		
		WebElement box5= dr.findElement(By.name("toPort")); 
		Select sel5= new Select(box5); 
		sel5.selectByIndex(4);
		
		WebElement box6= dr.findElement(By.name("toMonth")); 
		Select sel6= new Select(box6); 
		sel6.selectByIndex(10);
		
		WebElement box7= dr.findElement(By.name("toDay")); 
		Select sel7= new Select(box7); 
		sel7.selectByIndex(21);
		
		dr.findElement(By.xpath("//input[@value='Business']")).click();
		
		WebElement box8= dr.findElement(By.name("airline")); 
		Select sel8= new Select(box8); 
		sel8.selectByIndex(1);
		
		dr.findElement(By.name("findFlights")).click();
		
		dr.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
		Thread.sleep(200);
		dr.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44\']")).click();

		JavascriptExecutor js = (JavascriptExecutor)dr;
		WebElement ele= dr.findElement(By.tagName("input"));
		js.executeScript("arguments[0]. scrollIntoView();",ele);

		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();

		dr.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Babasaheb");
		dr.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Gaikwad");
		WebElement box9= dr.findElement(By.name("pass.0.meal")); 
		Select sel9= new Select(box9); 
		sel9.selectByIndex(3);
	
		WebElement box10= dr.findElement(By.name("creditCard")); 
		Select sel10= new Select(box10); 
		sel10.selectByIndex(2);
		dr.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("74856485");
		WebElement box11= dr.findElement(By.name("cc_exp_dt_mn")); 
		Select sel11= new Select(box11); 
		sel11.selectByIndex(11);
		WebElement box12= dr.findElement(By.name("cc_exp_dt_yr")); 
		Select sel12= new Select(box12); 
		sel12.selectByIndex(9);
		
		dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
		dr.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();

	}
}
