package com.onoda;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement clickMe = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));
		
		Actions ac = new Actions(driver);
		ac.click(clickMe).build().perform();
		
		WebElement rightclick = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
		ac.contextClick(rightclick).build().perform();
		
		WebElement doubleclick = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
		ac.doubleClick(doubleclick).build().perform();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Screenshot\\actionclick.png");
		FileUtils.copyFile(source, destination);
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://cuttingtools.com/");
		
		WebElement move = driver.findElement(By.xpath("(//p[@style='text-align: center; white-space: pre-wrap;'])[3]"));
		ac.moveToElement(move).build().perform();
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src = ts1.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Screenshot\\movetoelement.png");
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(3000);
		
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		ac.dragAndDrop(drag, drop).build().perform();
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source1 = ts2.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Screenshot\\dragged.png");
		FileUtils.copyFile(source1, destination1);
	}

}
