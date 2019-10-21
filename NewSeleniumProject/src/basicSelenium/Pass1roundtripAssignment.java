package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Pass1roundtripAssignment {
	@Test
	public void roundtripAssignment() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\techbodhi\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://newtours.demoaut.com/");
		dr.manage().window().maximize();
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		// roundway button
		System.out.println(dr.findElement(By.xpath("//input[@value='roundtrip']")).isSelected());
		dr.findElement(By.xpath("//input[@value='roundtrip']")).click();
		// passenger
		WebElement pass = dr.findElement(By.name("passCount"));
		Select sel = new Select(pass);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("1");

		WebElement box = dr.findElement(By.name("fromPort"));
		Select sel2 = new Select(box);
		sel2.selectByVisibleText("Frankfurt");
		Thread.sleep(1000);
		// Month
		WebElement mon = dr.findElement(By.name("fromMonth"));
		Select sel3 = new Select(mon);
		sel3.selectByVisibleText("January");
		Thread.sleep(1000);
		// day
		WebElement day = dr.findElement(By.name("fromDay"));
		Select sel4 = new Select(day);
		sel4.selectByValue("3");
		Thread.sleep(1000);

		WebElement top = dr.findElement(By.name("toPort"));
		Select sel13 = new Select(top);
		sel13.selectByValue("Seattle");
		Thread.sleep(1000);

		// return
		WebElement retmon = dr.findElement(By.name("toMonth"));
		Select sel5 = new Select(retmon);
		sel5.selectByVisibleText("April");
		Thread.sleep(1000);
		// retday
		WebElement retday = dr.findElement(By.name("toDay"));
		Select sel6 = new Select(retday);
		sel6.selectByVisibleText("13");
		Thread.sleep(1000);

		System.out.println(dr.findElement(By.xpath("//input[@value='First']")).isSelected());
		dr.findElement(By.xpath("//input[@value='First']")).click();
		// airlines
		WebElement air = dr.findElement(By.name("airline"));
		Select sel7 = new Select(air);
		sel7.selectByVisibleText("Unified Airlines");
		// Continue
		System.out.println(By.xpath("//input[@name='findFlights']"));

		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		// Depart
		System.out.println(dr.findElement(By.xpath("//input[@value='Pangea Airlines$362$274$9:17']")).isSelected());
		dr.findElement(By.xpath("//input[@value='Pangea Airlines$362$274$9:17']")).click();
		// Return
		System.out
				.println(dr.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).isSelected());
		dr.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).click();
		// continue
		System.out.println(By.xpath("//input[@name='reserveFlights']"));
		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		// Passenger details
		dr.findElement(By.name("passFirst0")).sendKeys("Shubhada");
		dr.findElement(By.name("passLast0")).sendKeys("Bhagat");
		// meal
		WebElement meal = dr.findElement(By.name("pass.0.meal"));
		Select sel8 = new Select(meal);
		sel8.selectByVisibleText("Bland");
		// credit card
		WebElement cre = dr.findElement(By.name("creditCard"));
		Select sel9 = new Select(cre);
		sel9.selectByVisibleText("MasterCard");
		// creditnumber
		dr.findElement(By.name("creditnumber")).sendKeys("93284937mschjd");
		WebElement exp = dr.findElement(By.name("cc_exp_dt_mn"));
		Select sel10 = new Select(exp);
		sel10.selectByVisibleText("03");
		WebElement yr = dr.findElement(By.name("cc_exp_dt_yr"));
		Select sel11 = new Select(yr);
		sel11.selectByVisibleText("2009");

		dr.findElement(By.name("cc_frst_name")).sendKeys("Shubhada");
		dr.findElement(By.name("cc_mid_name")).sendKeys("Ritesh");
		dr.findElement(By.name("cc_last_name")).sendKeys("Bhagat");
		// clicking on ticketlesss travel
		WebElement ele = dr.findElement(By.name("ticketLess"));
		System.out.println(ele.isSelected());
		ele.click();
		System.out.println(ele.isSelected());

		System.out.println(By.xpath("//input[@name='billAddress1']"));
		dr.findElement(By.name("billAddress1")).sendKeys("ahggxdidwd,sidj,shdu");
		System.out.println(By.xpath("//input[@name='billAddress2']"));
		dr.findElement(By.name("billAddress2")).sendKeys("dbhvgf4ew bxvhdcg.");

		dr.findElement(By.name("billCity")).sendKeys("Nagpur");
		dr.findElement(By.name("billState")).sendKeys("Maharashtra");
		dr.findElement(By.name("billZip")).sendKeys("238749");

		WebElement coun = dr.findElement(By.name("billCountry"));
		Select sel12 = new Select(coun);
		sel12.selectByVisibleText("INDIA");

		WebElement ele1 = dr.findElement(By.name("ticketLess"));
		System.out.println(ele1.isSelected());
		ele1.click();
		System.out.println(ele1.isSelected());
		// secure purchase
		System.out.println(By.xpath("//input[@name='buyFlights']"));
		dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
		System.out.println(By.xpath("//img[@src='/images/forms/Logout.gif']"));
		dr.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
	}
}