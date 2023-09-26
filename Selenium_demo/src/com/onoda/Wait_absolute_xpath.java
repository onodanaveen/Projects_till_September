package com.onoda;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_absolute_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement textbox = driver.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div/div/div[2]/input"));
		textbox.sendKeys("amazon prime video");
		
		WebElement button = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		button.click();
		
		WebElement button1 = driver.findElement(By.xpath("(//span[contains(text(),'Amazon Prime')])[1]"));
		button1.click();
	}

}
