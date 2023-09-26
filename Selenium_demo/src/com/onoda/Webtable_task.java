package com.onoda;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_task {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		
		WebElement static_table = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[8]"));
		static_table.click();
		
		List<WebElement> row_data = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		System.out.println("the 1st row data:- ");
		
		for ( WebElement row : row_data) {
			String text = row.getText();
			System.out.println(text);
		}
		
		List<WebElement> column_data = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		System.out.println();
		System.out.println("The 2nd column data :- ");
		
		for ( WebElement column : column_data) {
			String text = column.getText();
			System.out.println(text);
		}
		
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println();
		System.out.println("All Data :- ");
		for (WebElement all : all_data) {
			String text = all.getText();
			System.out.println(text);
		}
		
		WebElement single_data = driver.findElement(By.xpath("//table/tbody/tr[5]/td[5]"));
		System.out.println();
		System.out.println("The single data:- ");
		String text = single_data.getText();
		System.out.println(text);
		
		List<WebElement> header_data = driver.findElements(By.tagName("th"));
		System.out.println();
		System.out.println("The header data :- ");
		for ( WebElement header : header_data) {
			String text2 = header.getText();
			System.out.println(text2);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
