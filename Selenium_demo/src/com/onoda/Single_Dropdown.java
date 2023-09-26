package com.onoda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91952\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("Peter");
		
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("Parker");
		
		WebElement Mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Mobile.sendKeys("1234567890");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("Spiderman");									
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s =new Select(day);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByValue("31");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(month);
		s1.selectByValue("5");
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2009");
	}

}
