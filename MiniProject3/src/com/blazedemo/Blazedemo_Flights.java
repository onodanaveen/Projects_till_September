package com.blazedemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blazedemo_Flights {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91952\\eclipse-workspace\\MiniProject3\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select s = new Select(from);
		s.selectByIndex(5);
		
		Select s1 = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		s1.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String departs = driver.findElement(By.xpath("//table[@class='table']/thead/tr/th[4]")).getText();
		
		String arrives = driver.findElement(By.xpath("//table[@class='table']/thead/tr/th[5]")).getText();
		
		System.out.println(departs);
		System.out.println(arrives);
		
		
		if (departs.contains("Mexico") && arrives.contains("London")) {
			
			driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[3]")).click();
			
			driver.findElement(By.id("inputName")).sendKeys("Naveen L");
			
			driver.findElement(By.id("address")).sendKeys("94/3, Periyamariyamman koil street, Ponnamapet");
			
			driver.findElement(By.name("city")).sendKeys("Salem");
			
			driver.findElement(By.id("state")).sendKeys("TamilNadu");
			
			driver.findElement(By.id("zipCode")).sendKeys("636003");
			
			Select s2 = new Select(driver.findElement(By.xpath("//select[@name='cardType']")));
			s2.selectByVisibleText("American Express");
			
			driver.findElement(By.id("creditCardNumber")).sendKeys("1234567890");
			
			driver.findElement(By.id("creditCardMonth")).clear();
			
			driver.findElement(By.id("creditCardMonth")).sendKeys("06");
			
			driver.findElement(By.name("creditCardYear")).clear();
			
			driver.findElement(By.name("creditCardYear")).sendKeys("2012");
			
			driver.findElement(By.id("nameOnCard")).sendKeys("Naveen Zoro");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
		}
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\91952\\eclipse-workspace\\MiniProject3\\Screenshot\\1.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
