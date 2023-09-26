package com.onoda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Launch {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\ChromeDriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
			driver.manage().window().maximize();
			
			WebElement mail_id = driver.findElement(By.id("email"));
			mail_id.sendKeys("naveen@gmail.com");
			
			WebElement pwd = driver.findElement(By.xpath("//input[@name='pass']"));
			pwd.sendKeys("onoda");
			
			WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
			
	//		WebElement show = driver.findElement(By.xpath("//div[@class='_9lsb _9ls9']"));
	//		show.click();
			
			WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
			login.click();
	}

}
