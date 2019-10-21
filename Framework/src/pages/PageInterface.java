package pages;

import org.openqa.selenium.WebDriver;

public class PageInterface {
	public HomePage homePage;
	public FlightFinders flightFinder;
	public BookAFlight bookaflight;
	public FlightConfirmation flightConfirmation;
	public SelectFlight selectFlight;

	public PageInterface(WebDriver dr) {
		homePage = new HomePage(dr);
		flightFinder = new FlightFinders(dr);
		  bookaflight = new BookAFlight(dr); 
		  flightConfirmation = new FlightConfirmation(dr);
		  selectFlight = new SelectFlight(dr);
		 
	}

}
