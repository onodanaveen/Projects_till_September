package com.onoda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Arumugam {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.manage().window().maximize();
		
		WebElement Alert = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[9]"));
		Alert.click();
		
		WebElement SimpleAlert = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		SimpleAlert.click();
		
		org.openqa.selenium.Alert Simple_Alert = driver.switchTo().alert();
		Simple_Alert.accept();
		
		WebElement ConfirmAlert = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		ConfirmAlert.click();
		
		org.openqa.selenium.Alert Confirm_Alert = driver.switchTo().alert();
		Confirm_Alert.dismiss();
		
/*		WebElement ConfirmAlert1 = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		ConfirmAlert.click();
		
		org.openqa.selenium.Alert Confirm_Alert1 = driver.switchTo().alert();
		Confirm_Alert.accept(); 					*/
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		promptAlert.click();
		
		org.openqa.selenium.Alert Prompt_Alert = driver.switchTo().alert();
		Prompt_Alert.sendKeys("Yowamushi Pedal");
		String text = Prompt_Alert.getText();
		System.out.println(text);
		Prompt_Alert.accept();
		
	}

}
