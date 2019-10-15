package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass3 {
	@Test
	public void test() {
		System.out.println("Lauch Chrome Browser");	
		System.setProperty("webdriver.chrome.driver", "C:\\techbodhi\\Drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		
		//To maximize the window of output 
		dr.manage().window().maximize();
		//iFrame execution
		dr.switchTo().frame("iframeResult");
		WebElement ele=dr.findElement(By.name("vehicle1"));
		System.out.println(ele.isSelected());
		ele.click();
		System.out.println(ele.isSelected());
		
	}

}
