package com.adactin.runner1;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basecucumber.BaseClasson;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prem\\eclipse-workspace\\Cucumber_Apm\\src\\test\\java\\com\\adactin\\feature1\\adactin.feature",
glue="com.adactin.stepdefinition1")
public class Runner_Class extends BaseClasson {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\Cucumber_Apm\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
//		driver=BaseClasson.browser("chrome");
		
	}
	
	@AfterClass
	public static void end() {
		
		close();
	}
		
}
