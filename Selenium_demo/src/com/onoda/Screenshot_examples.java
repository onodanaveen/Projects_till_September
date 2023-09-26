package com.onoda;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_examples {
		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.netflix.com/in/");
			
			driver.manage().window().maximize();
			
		//	TakesScreenshot ts = (TakesScreenshot) driver;
			
		//	File source = ts.getScreenshotAs(OutputType.FILE);
			
		//	File destination = new File("C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Screenshot\\amazon.png");
			
		//	FileUtils.copyFile(source, destination);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement image = driver.findElement(By.xpath("(//img[@class='our-story-card-img'])[4]"));
			
			js.executeScript("arguments[0].scrollIntoView();", image);
			
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,-1000);");
			
			
			
		}
}
