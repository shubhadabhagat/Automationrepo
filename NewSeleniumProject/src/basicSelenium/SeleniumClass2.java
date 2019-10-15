package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass2 {
	@Test
	public void test() {
	System.setProperty("webdriver.chrome.driver", "C:\\techbodhi\\Drivers\\chromedriver.exe");
	ChromeDriver dr=new ChromeDriver();
	dr.get("http://www.newtours.demoaut.com");
	
	//To maximize the window of output 
	dr.manage().window().maximize();
	
	//Link(Register)
	//1st line gets text name for label verification)
	System.out.println(dr.findElement(By.linkText("REGISTER")).getText());
	//To find the linkaddress of any name or label
	System.out.println(dr.findElement(By.linkText("REGISTER")).getAttribute("href"));
	dr.findElement(By.linkText("REGISTER")).click();
	
	
	}
}
