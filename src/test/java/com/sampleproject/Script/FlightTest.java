package com.sampleproject.Script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sampleproject.Base.TestBase;
import com.sampleproject.Constants.Constants;
import com.sampleproject.Pages.FlightPage;

public class FlightTest extends TestBase {

	FlightPage objFlight;

	@Test(priority = 5, description = "click on flight",groups= {"smoke"},retryAnalyzer=com.sampleproject.Listeners.RetryAnalyzer.class)
	public void clickFlightOption() {

		objFlight = new FlightPage(driver);
		objFlight.flightClick();
		//Assert.assertEquals(driver.getTitle(), Constants.FLIGHTTITLE);
		
	}

	@Test(priority = 6, description = "select one way option")
	public void oneWayType() {
	
		objFlight = new FlightPage(driver);

		objFlight.setType();
		Assert.assertTrue(objFlight.setType(), "Selected one way");
	}
	@Test(priority = 7, description = "select Departing From")
	public void departLocation() {
	
		objFlight = new FlightPage(driver);

		objFlight.selectDepartingFrom();
		Assert.assertTrue(objFlight.selectDepartingFrom(), "Selected Departing Location");
	}


	@Test(priority = 8, description = "click continue")
	public void clickContinueBtn() {
		objFlight = new FlightPage(driver);

		objFlight.clickContinue();
	}
}

