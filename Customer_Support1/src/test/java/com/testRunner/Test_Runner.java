package com.testRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\com\\amazon\\ama.feature",
		glue = "com.stepDefinition",
		monochrome = true
		)
public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void browser_Launch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public static void browser_Close() {
	//	driver.close();
	}

}
