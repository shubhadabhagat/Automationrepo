package basicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scroll {
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\techbodhi\\Drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("file:///C:/techbodhi/Practice.html");
		
		//To maximize the window of output 
		dr.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) dr;
		//js.executeScript("window.scrollBy(0,500)");
		WebElement ele=dr.findElement(By.tagName("button"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		//To control Alert message
		Alert alt=dr.switchTo().alert();
		System.out.println(alt.getText());
		//To click on Alert message(Click on Ok and Cancel button)
		alt.accept();
		alt.dismiss();
		
	}

}
