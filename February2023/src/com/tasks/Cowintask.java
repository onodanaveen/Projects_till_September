package com.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cowintask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91952\\eclipse-workspace\\February2023\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cowin.gov.in/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ByDistrict = driver.findElement(By.xpath("//label[text()='By District']"));
		js.executeScript("arguments[0].scrollIntoView();", ByDistrict);
		Thread.sleep(2000);
		
		WebElement state = driver.findElement(By.xpath("//span[text()='Select Your State']"));
	//	state.click();
		
	//	Actions ac = new Actions(driver);
	//	ac.click(state).build().perform();
		
		js.executeScript("arguments[0].click();", state);
		
		WebElement Tamilnadu = driver.findElement(By.xpath("//span[text()=' Tamil Nadu ']"));
		Tamilnadu.click();
	//	ac.click(Tamilnadu).build().perform();
		js.executeScript("arguments[0].click();", Tamilnadu);
		
		WebElement District = driver.findElement(By.xpath("//span[text()='Select District']"));
		js.executeScript("arguments[0].click();", District);
	//	District.click();
		Thread.sleep(2000);
		
	//	WebElement chennaida = driver.findElement(By.xpath("//span[text()=' Chennai ']"));
	//	js.executeScript("arguments[0].click();", chennaida);
	//	chennaida.click();
		Thread.sleep(4000);
		WebElement chennai = driver.findElement(By.xpath("//span[text()=' Chennai ']"));
		js.executeScript("arguments[0].click();", chennai);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
