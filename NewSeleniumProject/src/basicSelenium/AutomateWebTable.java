package basicSelenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomateWebTable {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\techbodhi\\Drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("file:///C:/techbodhi/Practice.html");
		
		//To maximize the window of output 
		dr.manage().window().maximize();
		//Web Table
		WebElement table=dr.findElement(By.tagName("tbody"));
		//To make rows
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		//To make columns
		for(WebElement r:rows) {
			List<WebElement> cols=r.findElements(By.tagName("td"));
			for(WebElement c:cols) {
				System.out.println(c.getText());
			}
		}
	}

}
