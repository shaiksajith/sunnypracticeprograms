package com.apchepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	
	public static void main(String[] args) throws IOException {
		String excelpath=".\\datafiles\\data driven table for selenium.xlsx";
		
		FileInputStream fis=new FileInputStream(excelpath);//we conncetd the stream to that path
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//XSSFSheet sheet=wb.getSheet("sheet1");//
		XSSFSheet sheet=wb.getSheetAt(0);//now sheet contains rows and cols
		
		
		int rows=sheet.getLastRowNum();
		 int cols=sheet.getRow(1).getLastCellNum();
		 
		 
		/* for(int r=0;r<=rows;r++) {//reprsenting the rows
		 	XSSFRow row=sheet.getRow(r);
			for(int c=0;c<=cols;c++) {//cols//inner loop is representing the cells in shet
				XSSFCell cell=row.getCell(c);
				
				switch(cell.getCellType())
				{
				case  STIRNG:System.out.println(cell.getStringCellValue());break;
				
				case  NUMERIC:System.out.println(cell.getNumericCellValue());break;
				case  BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
				
				}
				
			} 
			System.out.println();
		 }*/
		
		  Iterator itr = sheet.iterator();//itr contains all rows and coloums
		  
		  while (itr.hasNext()) {
			XSSFRow row=(XSSFRow) itr.next();//itr next() retruns the row object we need to type cast//inthis row we have multipul cells
		Iterator celliterator=row.cellIterator();
		
		while(celliterator.hasNext()) {
		XSSFCell cell	=(XSSFCell)celliterator.next();
		switch(cell.getCellTypeEnum())
		{
		case  STRING:        
			System.out.println(cell.getStringCellValue());break;
		
		case  NUMERIC:System.out.println(cell.getNumericCellValue());break;
		case  BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
		
		}
		
		System.out.print(" ");
		
		}
		System.out.println();	
		}
		 
		
		
		
		
		
		
	}

}
