package com.onoda;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal_screenshot {
	public static void main (String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		WebElement textbox = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		textbox.sendKeys("Samsung Galaxy");
		
		WebElement button = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		button.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Screenshot\\snap.png");
		
		FileUtils.copyFile(source, destination);
	}
}
