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

import com.baseclass.Base_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_MiniProject extends Base_Class {
	public static void main(String[] args) throws InterruptedException, IOException {
	//	WebDriver driver;
	//	List<String> l = new ArrayList<>();
	//	l.add("incognito");
	//	l.add("start-maximized");	
	//	ChromeOptions opt = new ChromeOptions();
//		opt.addArguments(l);
		
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver(opt);
		browser_launch();
		
	//	driver.get("https://www.amazon.in/");
	//	driver.manage().window().maximize();
		url_Launch("https://www.amazon.in/");
		
		String expected = "Music";
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
		
		String search = "cd";
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		passs_Data(searchbox, search);
		
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
		
		WebElement firstProduct = driver.findElement(By.xpath("//span[text()='RESULTS']/ancestor::div[4]/following-sibling::div[1]//h2"));
		
		String text = firstProduct.getText();
		System.out.println(text);
		firstProduct.click();
		
		Thread.sleep(5000);
		
		String homeTab = driver.getWindowHandle();
		
		Set<String> tabs = driver.getWindowHandles();
		
		for (String each : tabs) {
			if (!homeTab.equals(each)) {
				driver.switchTo().window(each);
				break;
			}
			
		}
		
		WebElement selectedProduct = driver.findElement(By.id("productTitle"));
		String text2 = selectedProduct.getText();
		System.out.println(text2);
		
		if (text2.equalsIgnoreCase(text)) {
			driver.findElement(By.id("add-to-cart-button")).click();
			
		}
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\91952\\eclipse-workspace\\Customer_Support1\\Screenshot\\image.png");
		FileUtils.copyFile(source, destination);
		
		driver.findElement(By.id("sw-gtc")).click();
		
		WebElement cartTitle = driver.findElement(By.xpath("//span[text()='Kannada Film Songs (1970-80-90s) - Pack of 100 CDs - 5000 Songs']"));
		String text3 = cartTitle.getText();
		if (text3.equalsIgnoreCase(text)) {
			driver.close();
		}
		
		driver.quit();
		
		
		
		
		
		
	}

}
