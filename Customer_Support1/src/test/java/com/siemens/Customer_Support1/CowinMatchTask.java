package com.siemens.Customer_Support1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CowinMatchTask {
	
	public WebDriver driver;
	@BeforeTest
	private void browserLaunch() {
		ChromeOptions opt = new ChromeOptions();
		List l = new ArrayList<>();
		l.add("maximized");
		l.add("incognito");
		opt.addArguments(l);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(opt);
	}
	@BeforeClass
	private void urlLaunch() {
		driver.get("https://www.cowin.gov.in/");

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
