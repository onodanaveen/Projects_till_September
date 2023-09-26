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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra_Task {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement kids = driver.findElement(By.xpath("//a[text()='Kids']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(kids).build().perform();
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-Shirts'])[2]"));
		tshirt.click();
		
		List<WebElement> ProductPrice = driver.findElements(By.xpath("//li[@class='product-base']/child::a/div[2]/div/span/span[1]"));
		int size = ProductPrice.size();
		System.out.println("The total number of products are "+ size);
		
		List<String> priceList = new ArrayList<>();
		for (WebElement price : ProductPrice) {
			String text = price.getText();
			System.out.println(text);
			
			String replace = text.replace("Rs. ", "");
			System.out.println(replace);
			
			priceList.add(replace);
		}

		String min = Collections.min(priceList);
		System.out.println(min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
