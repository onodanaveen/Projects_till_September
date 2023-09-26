package com.siemens.Customer_Support1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra_TestNg {
	
	public WebDriver driver;
	@Test
	private void browser_launch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		driver = new ChromeDriver(opt);
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
	}
	@Test
	private void kids_Tshirts() {
		WebElement kids = driver.findElement(By.xpath("(//a[text()='Kids'])[1]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(kids).build().perform();
		
		WebElement Tshirts = driver.findElement(By.xpath("(//a[text()='T-Shirts'])[2]"));
		Tshirts.click();
	}
	@Test(priority = 1)
	private void product_Count() {
		List<WebElement> price = driver.findElements(By.xpath("//li[@class='product-base']/child::a/div[2]/div/span/span[1]"));
		int size = price.size();
		System.out.println("The number of products are "+ size);
	}
	@Test(priority = 2)
	private void minimum_Price() {
		List<Integer> list = new ArrayList<>();
		List<WebElement> all_Prices = driver.findElements(By.xpath("//li[@class='product-base']/child::a/div[2]/div/span/span"));
	
		for (WebElement price : all_Prices) {
			String text = price.getText();
	//		System.out.println(text);
			
			String replace = text.replace("Rs. ", "");
		//	System.out.println(replace);
			
			list.add(Integer.valueOf(replace));
		}
		
		Integer min = Collections.min(list);
		System.out.println("The minimum price is "+ min);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
