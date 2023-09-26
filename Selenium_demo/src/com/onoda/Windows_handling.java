package com.onoda;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_handling {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement groceries = driver.findElement(By.xpath("//img[@alt='Grocery']"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(groceries).build().perform();
		
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Mobile = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		
		ac.contextClick(Mobile).build().perform();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement homeappliances = driver.findElement(By.xpath("//img[@alt='Travel']"));
		
		ac.contextClick(homeappliances).build().perform();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String str : windowHandles) {
			String text = driver.switchTo().window(str).getTitle();
			System.out.println(text);
		}
		
		String mytitle ="Mobile Phones Online at Best Prices in India";
		
		for (String str : windowHandles) {
			if(driver.switchTo().window(str).getTitle().equals(mytitle)) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
