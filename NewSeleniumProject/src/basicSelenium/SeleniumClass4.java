package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass4 {
@Test
public void test() {
	System.out.println("Lauch Chrome Browser");	
	System.setProperty("webdriver.chrome.driver", "C:\\techbodhi\\Drivers\\chromedriver.exe");
	ChromeDriver dr=new ChromeDriver();
	dr.get("http://www.newtours.demoaut.com");
	
	//To maximize the window of output 
	dr.manage().window().maximize();
	System.out.println(dr.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("height"));
}
}
