package com.siemens.Customer_Support1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	private static void browserLaunch() throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		WebDriver driver = new ChromeDriver(opt);
	//	opt.addArguments("start-maximized");
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		File f = new File("C:\\Users\\91952\\eclipse-workspace\\Customer_Support1\\Data\\Write_Excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(0);
		String username = row.getCell(0).getStringCellValue();
		String password = row.getCell(1).getStringCellValue();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username);
		
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
		
	public static void main(String[] args) throws Throwable {
		browserLaunch();
	}

}
//CellType cellType = cell.getCellType();
//if (cellType.equals(cellType.STRING)) {
//	String ssd = cell.getStringCellValue();
////		System.out.println(value1);
//}else if (cellType.equals(cellType.NUMERIC)) {
//	double numericCellValue = cell.getNumericCellValue();
//	int abc = (int) numericCellValue;
//
//}
