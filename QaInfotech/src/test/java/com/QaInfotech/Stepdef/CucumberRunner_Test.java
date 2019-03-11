package com.QaInfotech.Stepdef;

import com.QaInfotech.PageObjects.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
features="Resources",
monochrome = true,
tags="@AutomationQa",
format=
		{"pretty",
		"html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/re-run.txt"}
)
public class CucumberRunner_Test  {
	
	
	@BeforeClass 
	public static void setup() {
		AppTest.setup();
	}
	
	
	@AfterClass 
	public static void closeBrowser() {
		AppTest.quitBrowser();
	}
}
	

