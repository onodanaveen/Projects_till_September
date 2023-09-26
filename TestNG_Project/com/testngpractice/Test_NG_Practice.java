package com.testngpractice;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_NG_Practice {
	
//	public static WebDriver driver ;
	
	@Test
	public void browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	

	}
	@Test
	private void website_Launch() {
		
//		WebDriver driver = null;
		
		WebDriver driver = null;
		driver.navigate().to("https://www.amazon.in/");
		
		System.out.println("Website Launched");

	}
	@Test(priority = 2)
	private void amazon() {
		System.out.println("Amazon launched");

	}

}
