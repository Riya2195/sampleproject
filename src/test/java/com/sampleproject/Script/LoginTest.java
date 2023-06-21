package com.sampleproject.Script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sampleproject.Base.TestBase;
import com.sampleproject.Constants.Constants;
import com.sampleproject.Pages.LoginPage;
import com.sampleproject.Utilities.ExcelRead;

public class LoginTest extends TestBase {
	LoginPage objLogin;
	@Test(dataProvider = "invalidUserInvalidPassword",priority=1,retryAnalyzer=com.sampleproject.Listeners.RetryAnalyzer.class)
	public void verifySigninInvalidUserInvalidpass(String userName, String password) {

		objLogin = new LoginPage(driver);
		objLogin.SetUserName(userName);
		objLogin.SetPassword(password);
		objLogin.clickSignIn();
		Assert.assertEquals(driver.getTitle(), Constants.LOGINTITLE);
	}

	@Test(dataProvider = "invalidUservalidPassword",priority=2)
	public void verifySigninInvalidUserValidpass(String userName, String password) {

		objLogin = new LoginPage(driver);
		objLogin.SetUserName(userName);
		objLogin.SetPassword(password);
		objLogin.clickSignIn();
		Assert.assertEquals(driver.getTitle(), Constants.LOGINTITLE);

	}
	

	@Test(dataProvider = "validUserInvalidPassword",priority=3)
	public void verifySigninValidUserInvalidpass(String userName, String password) {

		objLogin = new LoginPage(driver);
		objLogin.SetUserName(userName);
		objLogin.SetPassword(password);
		objLogin.clickSignIn();
		Assert.assertEquals(driver.getTitle(), Constants.LOGINTITLE);
	}


	

	@Test(dataProvider = "validUservalidPassword",groups= {"smoke"},priority=4)
	public void verifySigninValidUserValidpass(String userName, String password) {

		objLogin = new LoginPage(driver);
		objLogin.SetUserName(userName);
		objLogin.SetPassword(password);
		objLogin.clickSignIn();
		Assert.assertEquals(driver.getTitle(), Constants.HOMETITLE);

	}
	@DataProvider
	public Object[][] invalidUserInvalidPassword() {
		Object[][] data = new Object[1][2];
		data[0][0] = ExcelRead.getCellStringData(0, 0, Constants.Sheet1);
		data[0][1] = ExcelRead.getCellStringData(0, 1, Constants.Sheet1);
		return data;
	}
	@DataProvider
	public Object[][] invalidUservalidPassword() {
		Object[][] data = new Object[1][2];
		data[0][0] = ExcelRead.getCellStringData(1, 0, Constants.Sheet1);
		data[0][1] = ExcelRead.getCellStringData(1, 1, Constants.Sheet1);
		return data;
	}

	@DataProvider
	public Object[][] validUserInvalidPassword() {
		Object[][] data = new Object[1][2];
		data[0][0] = ExcelRead.getCellStringData(2, 0, Constants.Sheet1);
		data[0][1] = ExcelRead.getCellStringData(2, 1, Constants.Sheet1);
		return data;
	}

	

	@DataProvider
	public Object[][] validUservalidPassword() {
		Object[][] data = new Object[1][2];
		data[0][0] = ExcelRead.getCellStringData(3, 0, Constants.Sheet1);
		data[0][1] = ExcelRead.getCellStringData(3, 1, Constants.Sheet1);
		return data;
	}

}

