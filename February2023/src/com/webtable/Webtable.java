package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91952\\eclipse-workspace\\February2023\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//table[@border='l']/tbody/tr[2]/td[2]"));
		String text = element.getText();
		System.out.println(text);
		
		List<WebElement> elements = driver.findElements(By.xpath("//table[@border='l']/tbody/tr/td"));
		int rowSize = elements.size();
		
		for (int i = 1; i <= rowSize; i++) {
			
			List<WebElement> rowelements = driver.findElements(By.xpath("//table[@border='l']/tbody/tr["+i+"]/td"));
			int columnsize = rowelements.size();
			
		//	WebElement rowelements = driver.findElement(By.xpath("//table[@border='l']/tbody/tr[\"+i+\"]/td"));
			
			
			for (int j = 1; j <= columnsize; j++) {
				
			//	List<WebElement> columnelements = driver.findElements(By.xpath("//table[@border='l']/tbody/tr["+i+"]/td["+j+"]"));
				WebElement columnelement = driver.findElement(By.xpath("//table[@border='l']/tbody/tr["+i+"]/td["+j+"]"));
				String text2 = columnelement.getText();
				System.out.print(text2+ "| |");
			}
			
			System.out.println();
		}
		
		
	}

}
