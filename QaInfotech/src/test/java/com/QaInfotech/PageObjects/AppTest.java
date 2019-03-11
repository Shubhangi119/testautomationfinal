package com.QaInfotech.PageObjects;

import java.io.File;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.helpers.Loader;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.java.After;


public class AppTest{

	public static WebDriver driver;
	public static String driverpath="ChromeDriver/chromedriver";
	
	
	
	static public void setup() {
		System.setProperty("webdriver.chrome.driver",driverpath);
		//ChromeOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		ChromeOptions options = new ChromeOptions();
		 options.addArguments( "--headless","window-size=1024,768", "--no-sandbox");;
		driver=new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
//	private void takeScreenshot(String className, String method, LocalTime timestamp) {
//		
//		if (driver instanceof TakesScreenshot) {
//		     TakesScreenshot screenshotTakingDriver = (TakesScreenshot) this.driver;
//		     try {
//		        File localScreenshots = new File(new File("target"), "screenshots");
//		        if (!localScreenshots.exists() || !localScreenshots.isDirectory()) {
//		           localScreenshots.mkdirs();
//		        }
//		        File screenshot = new File(localScreenshots, className + "_" + method + "_" + timestamp.getHour() + "." + timestamp.getMinute() + ".png");
//		        FileUtils.moveFile(screenshotTakingDriver.getScreenshotAs(OutputType.FILE), screenshot);
//		       logger.info("Screenshot for class={} method={} saved in: {}", className, method, screenshot.getAbsolutePath());
//		     } catch (Exception e1) {
//		        logger.error("Unable to take screenshot", e1);
//		     }
//		  } else {
//		     logger.info("Driver '{}' can't take screenshots so skipping it.", driver.getClass());
//		  }
//		}
//	@After
//	public void tearDown(Scenario scenario) {
////	    if (scenario.isFailed()) {
////	            final byte[] screenshot = ((TakesScreenshot) driver)
////	                        .getScreenshotAs(OutputType.BYTES);
////	            scenario.embed(screenshot, "image/png"); //stick it in the report
////	    }
//		if (scenario.isFailed()) {		
//			try {			
//				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);			
//				scenario.embed(screenshot, "image/png");			}
//			catch (WebDriverException wde) {				
//				System.err.println(wde.getMessage());			} 
//			catch (ClassCastException cce) {
//				cce.printStackTrace();		
//				}		}
//	    
//	}
		  
	static public void quitBrowser() {
		driver.quit();
	}
	

}