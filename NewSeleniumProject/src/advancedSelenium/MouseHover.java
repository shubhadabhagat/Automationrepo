package advancedSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHover {
	private static final String shirt = null;

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\techbodhi\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.flipkart.com/");

		// To maximize the window of output
		dr.manage().window().maximize();
		// Implicit wait
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// To click on cross button for login page
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		// Hover mouse over men tab
		WebElement men = dr.findElement(By.xpath("//span[text()='Men']"));
		Actions act = new Actions(dr);
		act.moveToElement(men).build().perform();
		// To click on Shirts Tab
		WebElement shirt = dr.findElement(By.xpath("//a[text()='Shirts']"));
//Explicit Wait
		WebDriverWait wait = new WebDriverWait(dr, 5);
		wait.until(ExpectedConditions.visibilityOf(shirt)).click();
	}

}
