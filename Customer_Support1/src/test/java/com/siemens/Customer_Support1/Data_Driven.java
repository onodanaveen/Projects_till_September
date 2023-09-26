package com.siemens.Customer_Support1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	
	public static void toReadData() throws Throwable {
		File f = new File("C:\\Users\\91952\\eclipse-workspace\\Customer_Support1\\Data\\CR Arena.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Cell cell = wb.getSheetAt(0).getRow(1).getCell(1);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);
		}	
	}
	
	public static void toWriteData() throws Throwable {
		File f = new File("C:\\Users\\91952\\eclipse-workspace\\Customer_Support1\\Data\\CR Arena.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.getSheet("AcToR").createRow(0).createCell(0).setCellValue("Margot Robbie");
		wb.getSheet("AcToR").createRow(1).createCell(0).setCellValue("Idris Elba");
		FileOutputStream out = new FileOutputStream(f);
		wb.write(out);
		wb.close();

	}
	 public static void toReadAllData() throws Throwable {
		File f = new File("C:\\Users\\91952\\eclipse-workspace\\Customer_Support1\\Data\\Write_Excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		for (int i = 0; i < rows; i++) {
			Row row = sheet.getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < cells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					
				}else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int num = (int) numericCellValue;
					System.out.println(num);
				}
			}
		}		
		
		
	}
	public static void main(String[] args) throws Throwable {
	//	toReadData();
		toWriteData();
	//	toReadAllData();
	}
	

}
