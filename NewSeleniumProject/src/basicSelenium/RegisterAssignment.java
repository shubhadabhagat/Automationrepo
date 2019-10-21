package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterAssignment {
	@Test
public void register() throws InterruptedException {
	System.out.println("Launch Chrome browser");
	System.setProperty("webdriver.chrome.driver","C:\\techbodhi\\Drivers\\chromedriver.exe");
    ChromeDriver dr=new ChromeDriver();
    dr.get("http://newtours.demoaut.com/");
    dr.manage().window().maximize();
    System.out.println(dr.findElement(By.xpath("//a[text()='REGISTER']")));
	//To find the linkaddress of any name or label
	System.out.println(dr.findElement(By.linkText("REGISTER")).getAttribute("href"));
	dr.findElement(By.linkText("REGISTER")).click();
	//To fill text fields
	System.out.println(By.xpath("//input[@name='firstName']"));
	dr.findElement(By.name("firstName")).sendKeys("Shubhada");
	//Last name
	System.out.println(By.xpath("//input[@name='lastName']"));
	dr.findElement(By.name("lastName")).sendKeys("Bhagat");
	//phone
	System.out.println(By.xpath("//input[@name='phone']"));
	dr.findElementByName("phone").sendKeys("7988203779");
	//Email
	System.out.println(By.xpath("//input[@id='userName']"));
	dr.findElementByName("userName").sendKeys("shuajhsd@hcdihhc");
	//Address
	System.out.println(By.xpath("//input[@name='address1']"));
	dr.findElement(By.name("address1")).sendKeys("ahggxdidwd,sidj,shdu");
	System.out.println(By.xpath("//input[@name='address2']"));
	dr.findElement(By.name("address2")).sendKeys("dbhvgf4ew bxvhdcg.");
	//City
    System.out.println(By.xpath("//input[@name='city']"));
    dr.findElement(By.name("city")).sendKeys("Nagpur");
    //State
    System.out.println(By.xpath("//input[@name='state']"));
    dr.findElement(By.name("state")).sendKeys("maharashtra");
	//postal code
    System.out.println(By.xpath("//input[@name='postalCode']"));
    dr.findElement(By.name("postalCode")).sendKeys("440031");
    //country
    WebElement coun = dr.findElement(By.name("country"));
	Select sel = new Select(coun);
	sel.selectByVisibleText("INDIA");
   //Username
    System.out.println(By.xpath("//input[@name='email']"));
    dr.findElement(By.name("email")).sendKeys("mercury");
    //password
    System.out.println(By.xpath("//input[@name='password']"));
    dr.findElement(By.name("password")).sendKeys("mercury");
    //confirm password
    System.out.println(By.xpath("//input[@name='confirmPassword']"));
    dr.findElement(By.name("confirmPassword")).sendKeys("mercury");
    //submit
    System.out.println(By.xpath("//input[@name='register']"));
    dr.findElement(By.name("register")).click();
    
	
	
	
	}
}
