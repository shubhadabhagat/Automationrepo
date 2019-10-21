package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginLogoffAssignment {
@Test
public void LoginLogoff() {
	System.out.println("Launch Chrome Browser");
	System.setProperty("webdriver.chrome.driver", "C:\\techbodhi\\Drivers\\chromedriver.exe");
	ChromeDriver dr=new ChromeDriver();
	dr.get("http://newtours.demoaut.com/");
	dr.manage().window().maximize();
	//Signin
	dr.findElement(By.name("userName")).sendKeys("mercury");
	dr.findElement(By.name("password")).sendKeys("mercury");
	dr.findElement(By.name("login")).click();
	//SignOff
	System.out.println(By.xpath("//a[text()='SIGN-OFF']"));
	dr.findElement(By.name("SIGN-OFF")).click();
}
}
