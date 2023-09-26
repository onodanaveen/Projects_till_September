package com.onoda;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable {
		static int indexoftotal,indexofDeath,indexofSerious;
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.worldometers.info/coronavirus/");
			driver.manage().window().maximize();
			
			List<WebElement> AllHeadings = driver.findElements(By.tagName("th"));
			
			for ( int i=0; i < AllHeadings.size() ; i++ ) {
				String text = AllHeadings.get(i).getText();
			//	System.out.println(text);
				
				String veramaari = text.replaceAll("\n", " gap vidra  ");
			//	System.out.println(veramaari);
				
				if (veramaari.equalsIgnoreCase("Total gap vidra  Cases")) {
					 indexoftotal = i;
					System.out.println("Index of total cases is "+ indexoftotal);
				}
				else if (veramaari.equalsIgnoreCase("New gap vidra  Deaths")) {
					 indexofDeath=i;
					System.out.println("Index of death cases is "+ indexofDeath);
				}
				else if (veramaari.equalsIgnoreCase("Serious, gap vidra  Critical")) {
					 indexofSerious =i;
					System.out.println("Index of critical cases "+ indexofSerious);
				}
				
			}
			List<WebElement> allRow = driver.findElements(By.xpath("//table/tbody[1]/tr"));
			
			for(int i=0; i<allRow.size(); i++) {
				List<WebElement> allData = driver.findElements(By.tagName("td"));
				
				for(int j=0; j<allData.size(); j++) {
					
					if(allData.get(j).getText().equalsIgnoreCase("India")) {
						
						System.out.println("Total cases"+ allData.get(indexoftotal).getText());
						System.out.println("Total death " + allData.get(indexofDeath).getText());
						System.out.println("Total Serious cases "+ allData.get(indexofSerious).getText());
					}
				}
			}
			
			
			
			
			
			
			
		}
}
