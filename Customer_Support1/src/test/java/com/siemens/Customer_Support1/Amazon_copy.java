package com.siemens.Customer_Support1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_copy {
	
	public WebDriver driver;
	public String text4 = "";
	
	@Test(priority = -3)
	public void browser_Launch() {
				
		ChromeOptions opt = new ChromeOptions();

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(opt);
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	@Test(dependsOnMethods = "browser_Launch",priority = 0)
	@Parameters("expected")
	public void dropdown(String expected) {
		
	//	String expected;
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dropdown);
		
		List<WebElement> options = s.getOptions();
		
		ListIterator<WebElement> list = options.listIterator();
		
		while (list.hasNext()) {
			WebElement next = list.next();
			String actual = next.getText();
			if (expected.equalsIgnoreCase(actual)) {
				next.click();
				break;
			}
		}
		
	}
	@Test(priority = 1)
	public void searchbox() throws InterruptedException {
		String search = "cd";
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(search);
		
		
		Thread.sleep(2000);
		
		List<WebElement> searchOptions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
		int size = searchOptions.size();
		
		for (int i = 1; i <= size; i++) {
			WebElement eachSuggestion = driver.findElement(By.xpath("//div[@class='autocomplete-results-container']/div["+i+"]"));
			String text = eachSuggestion.getText();
			if (text.equalsIgnoreCase(search)) {
				eachSuggestion.click();
				break;
			}
			
		}

	}
	@Test(priority = 2, enabled = false)
	public void product_selection() {
		WebElement firstProduct = driver.findElement(By.xpath("//span[text()='RESULTS']/ancestor::div[4]/following-sibling::div[1]//h2"));
		firstProduct.click();

	}
	@Test(priority = 3)
	public void windows_handling() throws InterruptedException {
		WebElement firstProduct = driver.findElement(By.xpath("//span[text()='RESULTS']/ancestor::div[4]/following-sibling::div[1]//h2"));
		
		firstProduct.click();
		String text = firstProduct.getText();
	
		System.out.println(text);
		text4 = text;
		
		
		Thread.sleep(5000);
		
		String homeTab = driver.getWindowHandle();
		
		Set<String> tabs = driver.getWindowHandles();
		
		for (String each : tabs) {
			if (!homeTab.equals(each)) {
				driver.switchTo().window(each);
				break;
			}
			
		}
				
	}
	@Test(priority = 4)
	public void product_Selection() throws InterruptedException {
		WebElement selectedProduct = driver.findElement(By.id("productTitle"));
		String text2 = selectedProduct.getText();
		System.out.println(text2);
		
		if (text2.equalsIgnoreCase(text4)) {
			driver.findElement(By.id("add-to-cart-button")).click();
			
		}
		
		Thread.sleep(3000);

	}
	@Test(priority = 5)
	public void screenshot() throws IOException { 
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\91952\\eclipse-workspace\\Customer_Support1\\Screenshot\\Test.png");
		FileUtils.copyFile(source, destination);

	}
	@Test(priority = 6)
	public void redirecting_To_Cart() throws InterruptedException {
		driver.findElement(By.id("sw-gtc")).click();
		
		Thread.sleep(4000);
	}
	@Test(priority = 7)
	public void tab_Close() {
		WebElement cartTitle = driver.findElement(By.xpath("//span[text()='Kannada Film Songs (1970-80-90s) - Pack of 100 CDs - 5000 Songs']"));
		String text3 = cartTitle.getText();
		if (text3.equalsIgnoreCase(text4)) {
			driver.close();
		}
	}
	@Test(priority = 8, enabled = false)
	public void window_Close() {
		driver.quit();

	}

}
