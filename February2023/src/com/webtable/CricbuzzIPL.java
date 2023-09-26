package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzzIPL {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
		
		driver.manage().window().maximize();
		
		List<WebElement> AllHeadings = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/thead/tr/td"));
		
		System.out.println("The Headings in the table are:-");
		
		for (WebElement Heading : AllHeadings) {
			System.out.println(Heading.getText());
			
		} 	
		
		System.out.println("The Team at first place is :");
		
		String team = driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr[1]/td[1]")).getText();
		System.out.println(team);
		
		
		System.out.println("The Teams participating in IPL 2022 are:-");
		
		List<WebElement> teams = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr/td[1]"));
		
		for (WebElement team1 : teams) {
			System.out.println(team1.getText());
			
		}
			
		System.out.println("All the data are :-");
		
		List<WebElement> allbodydatas = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr/td"));
		
		for (WebElement data : allbodydatas) {
			System.out.println(data.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
