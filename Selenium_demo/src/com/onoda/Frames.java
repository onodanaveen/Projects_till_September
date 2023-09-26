package com.onoda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("SingleFrame");
		
		WebElement singleframe = driver.findElement(By.xpath("//input[@type='text']"));
		singleframe.sendKeys("Pushpa");
		
		driver.switchTo().defaultContent();
		
		WebElement Multiframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		Multiframe.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Yaradde nee mozhini");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		
	}

}
