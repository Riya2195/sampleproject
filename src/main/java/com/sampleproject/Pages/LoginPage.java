package com.sampleproject.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sampleproject.Utilities.ScreenshotUtilities;

public class LoginPage {

	public WebDriver driver;
	@FindBy(xpath = "//input[@name='userName']")
WebElement user;

	@FindBy(xpath = "//input[@name='password']")

	WebElement password;

	@FindBy(xpath = "//input[@name='submit']")

	WebElement login;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);// for passing the driver value otherwise throw null pointer exception
	}

	public void SetUserName(String userName) {
		user.sendKeys(userName);
	}

	public void SetPassword(String password1) {
		password.sendKeys(password1);
	}

	public void clickSignIn() {
		login.click();
	}
	
	public void screenshot() throws IOException
	{
		ScreenshotUtilities.screenshotOfLogin(driver);

	}
}