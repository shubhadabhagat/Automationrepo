package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightFinders {
 WebDriver dr;
     
     public FlightFinders(WebDriver dr)
     //Constructor
     {
    	 this.dr=dr;
     }
     By signoff=By.xpath("//a[text()='SIGN-OFF']");
     public String clickSignOff() {
    	 dr.findElement(signoff).click();
    	 return dr.getTitle();
     }
	
}
