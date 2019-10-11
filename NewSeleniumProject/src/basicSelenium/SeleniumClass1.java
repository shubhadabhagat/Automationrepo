package basicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass1 {
	@Test
	public void login() {
	System.out.println("Lauch Chrome Browser");	
	System.setProperty("webdriver.chrome.driver", "C:\\techbodhi\\Drivers\\chromedriver.exe");
	ChromeDriver dr=new ChromeDriver();
	dr.get("http://google.com");
	
	}

}
