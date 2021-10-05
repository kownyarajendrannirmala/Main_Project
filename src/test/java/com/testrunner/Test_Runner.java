package com.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin_Project.Base_Class;
import com.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\java\\com\\features\\adactin.feature",
		glue = "com.stepdef",
		monochrome = true,
		dryRun = false,
		strict = true,
		tags =("@smokeTest,@sanityTest"),
		plugin = {"html:Report/Cucumber_Report",
				
				"pretty",
				
				"json:Report/JsonReport.json",
				
				"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent.html"
		}
		
		)
public class Test_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getbrowser();
		driver = Base_Class.getBrowser(browser);
	}	
	@AfterClass
	public static void tear_Down() {
	driver.close();
}
}
