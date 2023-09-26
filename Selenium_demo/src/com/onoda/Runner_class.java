package com.onoda;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Runner_class {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	driver.manage().
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("HalamathiBeast");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("habibo");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(location);
		boolean text = s.isMultiple();
		System.out.println("is Multiple dropdown :- "+text);
		s.selectByIndex(5);
		
		WebElement hotels = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Hervey");
		
		WebElement room_type = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(room_type);
		s2.selectByVisibleText("Super Deluxe");
		
		WebElement room_count = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(room_count);
		s3.selectByIndex(2);
		
		WebElement checkindate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		checkindate.clear();
		checkindate.sendKeys("30/02/2022");
		
		WebElement checkoutdate = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		checkoutdate.clear();
		checkoutdate.sendKeys("31/02/2022");
		
		WebElement adultsperroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4 = new Select(adultsperroom);
		s4.selectByVisibleText("3 - Three");
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
		submit.click();
		
		WebElement confirm = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		confirm.click();
		
		WebElement cont = driver.findElement(By.xpath("//input[@name='continue']"));
		cont.click();
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Arabic Kuthu");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Kuthu");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("65, Nelson Anirudh Road, Jonita Paakam, SK koil");
		
		WebElement cardno = driver.findElement(By.xpath("//input[@name='cc_num']"));
		cardno.sendKeys("5497591269000196");
		
		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s5 = new Select(cardtype);
		s5.selectByIndex(2);
		
		WebElement expmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s6 = new Select(expmonth);
		s6.selectByVisibleText("April");
		
		WebElement expyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s7 = new Select(expyear);
		s7.selectByValue("2022");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("012");
		
		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		
		
	//	WebDriverWait wait = new WebDriverWait(driver,30);
	//	wait.until(ExpectedConditions.visibilityOf(book));
		
		book.click();
		
		Thread.sleep(7000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Screenshot\\booking.png");
		FileUtils.copyFile(source, destination);
		
		WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
		logout.click();
	}

}
