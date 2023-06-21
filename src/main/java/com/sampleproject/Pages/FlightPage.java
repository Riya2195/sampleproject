package com.sampleproject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sampleproject.Utilities.PageUtilities;

public class FlightPage {
	

	
		public WebDriver driver;
		
		@FindBy(xpath="//a[text()='Flights']")
		WebElement flight;
		
		@FindBy(xpath="//input[@value='oneway']")
		WebElement oneWay;
		
		@FindBy(xpath="//input[@name='findFlights']")
		WebElement continueBtn;
		
		@FindBy(name="fromPort")
		WebElement depart;
		
		
		public FlightPage (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		public void flightClick()
		{
			flight.click();
		}

		public boolean setType()
		{
			oneWay.click();
			boolean type=oneWay.isSelected();
			return type;
		}
		
		public boolean selectDepartingFrom()
		{
			PageUtilities.selectClassDropdown(driver, depart).selectByValue("New York");
			boolean departs=depart.isSelected();
			return departs;
		}
		
		public void clickContinue()
		{
			continueBtn.click();
		}
}
