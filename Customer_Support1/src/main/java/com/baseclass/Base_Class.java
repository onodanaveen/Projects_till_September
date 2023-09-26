package com.baseclass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static void browser_launch() {
	//	ChromeOptions opt = new ChromeOptions();
	//	List<String> l = new ArrayList<>();
	//	l.add("incognito");
	//	l.add("start-maximized");
		
	//	opt.addArguments(l);
	//	WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	public static void url_Launch(String url) {
		driver.get(url);
	}
	
	public static void passs_Data(WebElement element, String value) {
		element.sendKeys(value);
	}

}
