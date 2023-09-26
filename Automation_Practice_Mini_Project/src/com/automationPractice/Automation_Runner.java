package com.automationPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Runner  {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\91952\\eclipse-workspace\\Automation_Practice_Mini_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement login = driver.findElement(By.className("login"));
		login.click();
		
		WebElement mail_id = driver.findElement(By.id("email_create"));
		mail_id.sendKeys("russiaukrainewar@gmail.com");
		
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("want");
		
		driver.findElement(By.id("customer_lastname")).sendKeys("peace");
		
		driver.findElement(By.id("passwd")).sendKeys("stopwar");
		
		WebElement days = driver.findElement(By.id("days"));
		Select s = new Select(days);
		s.selectByValue("11");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='months']"));
		Select s1 = new Select(month);
		s1.selectByIndex(2);
		
		WebElement year = driver.findElement(By.xpath("//select[@name='years']"));
		Select s2 = new Select(year);
		s2.selectByValue("2022");
		
		driver.findElement(By.id("firstname")).sendKeys("Russia");
		
		driver.findElement(By.id("lastname")).sendKeys("UkraineWar");
		
		driver.findElement(By.id("city")).sendKeys("Kyiv");
		
		driver.findElement(By.id("address1")).sendKeys("25/02,war starts");
		
		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select s3 = new Select(state);
		s3.selectByVisibleText("Kentucky");
		
		driver.findElement(By.id("postcode")).sendKeys("63600");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("9524775509");
		
		driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("Fake kingdom, 50002");
		
		driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\91952\\eclipse-workspace\\Automation_Practice_Mini_Project\\Screenshot\\accountCreate.png");
		
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
