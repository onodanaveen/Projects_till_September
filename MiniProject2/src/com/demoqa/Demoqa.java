package com.demoqa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoqa {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91952\\eclipse-workspace\\MiniProject2\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement formsButton = driver.findElement(By.xpath("(//div[@class='card-body'])[2]"));
		js.executeScript("arguments[0].scrollIntoView();",formsButton);
		
		WebElement forms = driver.findElement(By.xpath("(//div[@class='card-body'])[2]"));
		forms.click();
		
		WebElement practiceForm = driver.findElement(By.xpath("//span[text()='Practice Form']"));
		practiceForm.click();
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Naveen");
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("L");
		
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		email.sendKeys("naveen.greens25@gmail.com");
		
		WebElement radio = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		radio.click();
		
		WebElement number = driver.findElement(By.xpath("//input[@minlength='10']"));
		number.sendKeys("1234567890");
		
		WebElement DOB = driver.findElement(By.id("dateOfBirthInput"));
		DOB.click();
		
		WebElement year = driver.findElement(By.xpath("//select[contains(@class,'datepicker__year')]"));
		Select s = new Select(year);
		s.selectByValue("1995");
		
		WebElement month = driver.findElement(By.xpath("//select[contains(@class,'datepicker__month')]"));
		Select s1 = new Select(month);
		s1.selectByIndex(5);
		
		WebElement date = driver.findElement(By.xpath("//div[contains(@aria-label,'12th')]"));
		date.click();
		
		Thread.sleep(5000);
		
	//	WebElement date = driver.findElement(By.xpath("(//div[@role='option'])[18]"));
	//	date.click();
		
		WebElement subject = driver.findElement(By.xpath("(//div[contains(@class,'subjects')])[1]"));
	//	subject.click();
		subject.sendKeys("english");
		
		Robot r = new Robot();
	//	r.keyPress(KeyEvent.VK_E);
	//	r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement hobbies = driver.findElement(By.xpath("//label[text()='Reading']"));
		hobbies.click();
		
		WebElement hobbies1 = driver.findElement(By.xpath("//label[text()='Music']"));
		hobbies1.click();
		
		WebElement cur = driver.findElement(By.id("currentAddress"));
		js.executeScript("arguments[0].scrollIntoView();", cur);
		
		cur.sendKeys("Near Sree Akshayam Hotel");
		
		WebElement state1 = driver.findElement(By.xpath("//div[text()='Select State']"));
		state1.click();
		
		WebElement state = driver.findElement(By.xpath("//div[text()='Uttar Pradesh']"));
		state.click();
		
		WebElement city = driver.findElement(By.xpath("//div[text()='Select City']"));
		city.click();
		
		WebElement city1 = driver.findElement(By.xpath("//div[text()='Agra']"));
		city1.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
