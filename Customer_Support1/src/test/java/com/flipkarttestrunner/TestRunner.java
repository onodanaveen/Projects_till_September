package com.flipkarttestrunner;

import java.util.ArrayList;
import java.util.List;

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
		features = "src\\test\\java\\com\\flipkartfeature\\flipkart.feature",
		glue="com.flipkartsd",
		monochrome= true
		)
public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void browser_Launch() {
		
		ChromeOptions opt = new ChromeOptions();
		List<String> l = new ArrayList<>();
		l.add("incognito");
		l.add("start-maximized");
		l.add("--remote-allow-origins=*");
		opt.addArguments(l);
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(opt);
	//	driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public static void browser_Close() {
		driver.close();
	}

	
	

}
