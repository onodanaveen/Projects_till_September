package com.onoda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_search {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("facebook");
		
		WebElement gogs = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		gogs.click();
		
		
	}

}
