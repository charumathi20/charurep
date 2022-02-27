package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.AdactinCucumber.com.BaseCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature", glue= "com.adactin.stepdefination", monochrome=true ,
plugin= {"html:Report1/Cucumber_Html","pretty","json:Report1/Cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:Report1/Cucumber_Extent_Report.html"})
public class Test_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void set_up() {
driver=BaseCucumber.browserLaunch("chrome");

	}
	@AfterClass
	public static void Set_close() throws Throwable {
		
		Thread.sleep(1000);
		//BaseCucumber.closeWindow();
		System.out.println("log in succefully");

	}

}
