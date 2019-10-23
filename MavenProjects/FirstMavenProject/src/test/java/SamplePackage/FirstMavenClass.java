package SamplePackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstMavenClass {

	@Test
public void test1() {
	System.out.println("Shubhada Testing Maven");
}
	@Test
	public void login() throws InterruptedException {
		System.out.println("Lauch Chrome Browser");	
		System.setProperty("webdriver.chrome.driver", "C:\\techbodhi\\Drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://www.newtours.demoaut.com");
		
		//To maximize the window of output 
		dr.manage().window().maximize();
	}
}
