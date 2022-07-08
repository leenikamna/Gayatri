package com.test_runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheet {



	File src;
	FileInputStream FRead;
	FileOutputStream FWrite;
	XSSFWorkbook workBook;
	XSSFSheet sheet;

	public Excelsheet() {

		try 
		{
			this.src = new File("‪C:\\Users\\GAKSHIRS\\Documents\\Book1.xlsx");
			this.FRead = new FileInputStream(src);
			this.workBook = new XSSFWorkbook(FRead);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getData(int sheetName, int row, int column)
	{
		sheet = workBook.getSheetAt(0);
		String data;
		data = sheet.getRow(row).getCell(column).getStringCellValue();
		System.out.println(data);
		return data;
	}
}