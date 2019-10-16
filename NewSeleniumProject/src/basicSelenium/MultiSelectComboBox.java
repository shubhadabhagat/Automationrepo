package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiSelectComboBox {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\techbodhi\\Drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("file:///C:/techbodhi/Practice.html");
		
		//To maximize the window of output 
		dr.manage().window().maximize();
		WebElement box=dr.findElement(By.id("anand"));
		//To select and deselect all the options
		Select sel=new Select(box);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		sel.deselectAll();
	}

}
