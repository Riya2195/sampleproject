package com.sampleproject.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ScreenshotUtilities {
	public static void screenshotOfElement(WebElement element) throws IOException {
		File src = element.getScreenshotAs(OutputType.FILE);

		File trg = new File(".\\screenshots\\computer.png");
		FileUtils.copyFile(src, trg);
	}

	public static void screenshotOfParticularSection(WebElement element) throws IOException {

		File src = element.getScreenshotAs(OutputType.FILE);

		File trg = new File(".\\screenshots\\FeatureProducts.png");

		FileUtils.copyFile(src, trg);
	}

	public static void screenshotOfLogin(WebDriver driver) throws IOException {
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);

			File trg = new File(".\\screenshots\\homepage.png");

			FileUtils.copyFile(src, trg);
		}
		
	}

}
