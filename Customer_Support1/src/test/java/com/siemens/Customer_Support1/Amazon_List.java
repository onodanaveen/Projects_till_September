package com.siemens.Customer_Support1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_List {
	
	public static void browserLaunch() throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement title1 = driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 Pro 128GB Space Black'])[1]"));
		String text = title1.getText();
		System.out.println(text);
		
		File f = new File("C:\\Users\\91952\\eclipse-workspace\\Customer_Support1\\Data\\Write_Excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.getSheetAt(0).createRow(3).createCell(0).setCellValue(text);
		FileOutputStream out = new FileOutputStream(f);
		wb.write(out);
		wb.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) throws Throwable {
		browserLaunch();
	}

}
