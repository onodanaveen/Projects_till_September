package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_task {
	public static WebDriver driver;
	public static Integer max;
	
	public static void browser_launch() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		
	//	driver.manage().window().maximize();
	}
	
	public static void minPrice_of_Product() {
		List<Integer> priceList = new ArrayList<>();
		List<WebElement> Discountlist = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
		
		for (WebElement price : Discountlist) {
			
			String text = price.getText();
			String numbers = text.replace("Rs. ", "");
			
			//string to Integer
		//	int parseInt = Integer.parseInt(text);
			Integer Number = Integer.valueOf(numbers);
			
			//INteger to string
		//	String valueOf = String.valueOf(Number);
			
			
			
			priceList.add(Number);		
	//		System.out.println(Number);
		}
		Integer min = Collections.min(priceList);
		System.out.println("The minimum discounted price is "+ min);
		
		max = Collections.max(priceList);
		System.out.println("The maximum price is"+ max);
		
		nameOfMinimumPriceProduct(min);
	}
	
	public static void nameOfMinimumPriceProduct(Integer minimum) {
		WebElement product = driver.findElement(By.xpath("//span[@class=\"product-discountedPrice\" and text()='"+minimum+"']//ancestor::div[@class=\"product-productMetaInfo\"]//preceding-sibling::h3"));
		String text = product.getText();
		System.out.println("The product with minimum price is "+text);
	}
	
	public static void nameOfMaximumPriceProduct(Integer minimum) {
		WebElement product = driver.findElement(By.xpath("//span[@class=\"product-discountedPrice\" and text()='"+minimum+"']//ancestor::div[@class=\"product-productMetaInfo\"]//preceding-sibling::h3"));
		String text = product.getText();
		System.out.println("The product with maximum price is "+text);
	}
	
	public static void main(String[] args) {
		browser_launch();
		minPrice_of_Product();
//		nameOfMinimumPriceProduct(139);
		nameOfMaximumPriceProduct(max);
//		nameOfMinimumPriceProduct(299);
//		naveenLongRoute();
		numberOfOfferProducts();
	}
	public static void naveenLongRoute() {
		String maximum = String.valueOf(max);
		
		List<WebElement> productsBase = driver.findElements(By.xpath("//li[@class='product-base']"));
		for (WebElement product : productsBase) {
			String text = product.getText();	
			if (text.contains(maximum)) {
				System.out.println(text);
			}
			
		}

	}
	public static void numberOfOfferProducts() {
		List<WebElement> fewItems = driver.findElements(By.xpath("//div[text()='Only Few Left!']"));
		int count=0;
		for (WebElement webElement : fewItems) {
			count++;
		}
		System.out.println("The number of few products left are "+ count); 
	}

}
	


