package com.siemens.Customer_Support1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload{
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement choose = driver.findElement(By.id("file-upload"));
		choose.sendKeys("C:\\Users\\91952\\eclipse-workspace\\Customer_Support1\\Screenshot\\image.png");
		
		driver.findElement(By.id("file-submit")).submit();
		
	//	String pageSource = driver.getPageSource();
	//	System.out.println(pageSource);
		
		if (driver.getPageSource().contains("File Uploaded!")) {
			System.out.println("file uploaded");		
		} else {
			System.out.println("file not uploaded");
		}
		
	}

}
