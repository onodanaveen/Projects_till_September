package com.onoda;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[5]"));
		dropdown.click();
		
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(multiple);
		boolean multiple2 = s.isMultiple();
		System.out.println("Is Multiple :"+ multiple2);
		
		s.selectByValue("4");
		s.selectByIndex(2);
		s.selectByValue("3");
		s.deselectByVisibleText("Loadrunner");
		
		System.out.println("The available options are:");
		List<WebElement> allOptions = s.getOptions();
		
		for ( WebElement all : allOptions) {
			String text = all.getText();
			System.out.println(text);	
		}
		System.out.println();
		System.out.println("The selected options are :-");
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for( WebElement selected : allSelectedOptions) {
			String text = selected.getText();
			System.out.println(text);
		}
		System.out.println();
		System.out.println("The first selected option is :-");
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		
		String text = firstSelectedOption.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
	}

}
