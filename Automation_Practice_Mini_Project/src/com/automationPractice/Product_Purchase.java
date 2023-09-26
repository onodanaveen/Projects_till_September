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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Product_Purchase {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91952\\eclipse-workspace\\Automation_Practice_Mini_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("(//a[@title='Printed Dress'])[2]")).click();
		
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s = new Select(size);
		s.selectByValue("3");
		
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		
	//	driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		
	//	driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		
		driver.findElement(By.id("email")).sendKeys("russiaukrainewar@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("stopwar");
		
		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
		
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		
		driver.findElement(By.xpath("//a[@title='Pay by check.']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		WebElement move = driver.findElement(By.xpath("//strong[text()='Your order will be sent as soon as we receive your payment.']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(move).build().perform();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\91952\\eclipse-workspace\\Automation_Practice_Mini_Project\\Screenshot\\orderdetails_draggeddown.png");
		
		FileUtils.copyFile(source, destination);
		
		driver.findElement(By.xpath("//a[@title='Back to orders']")).click();
		
		TakesScreenshot ts1 =(TakesScreenshot) driver;
		
		File src = ts1.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\91952\\eclipse-workspace\\Automation_Practice_Mini_Project\\Screenshot\\ORDERS.png");
		 
		FileUtils.copyFile(src, dest);
		
		driver.findElement(By.xpath("//a[@title='Log me out']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
