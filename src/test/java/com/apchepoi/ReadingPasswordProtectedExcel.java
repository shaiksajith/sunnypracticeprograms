package com.apchepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingPasswordProtectedExcel {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		
FileInputStream fis=new FileInputStream(".\\datafiles\\custemors.xlsx");

String  password="test123";

//XSSFWorkbook workbook=new XSSFWorkbook(fis);//the passwrod proetcd teh excel so we cant open workbook

XSSFWorkbook workbook=(XSSFWorkbook)WorkbookFactory.create(fis, password);

XSSFSheet sheet=workbook.getSheetAt(0);
int rows=sheet.getLastRowNum();
int cols=sheet.getRow(0).getLastCellNum();


for(int r=0;r<=rows;r++) {
	
	XSSFRow row=sheet.getRow(r);
	
	for(int c=0;c<cols;c++) {
		XSSFCell cell=row.getCell(c);
		switch(cell.getCellTypeEnum())
		{
		case  STRING:        
			System.out.println(cell.getStringCellValue());break;
		
		case  NUMERIC:System.out.println(cell.getNumericCellValue());break;
		case  BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
		
		}
		
		
		
		
		
	}
	
	Iterator<Row> iterator = sheet.iterator();//whenever u use while loop use iteraor because we dont know how many cols and rows are tehre in sheet
	while(iterator.hasNext()) {//hsanext() will check the valuse present in the itertaor or not gives boolean valiue
		
		
		Row nextrow = iterator.next();
		Iterator<Cell> celliterator = nextrow.cellIterator();
		Cell cell = celliterator.next();
		
		switch(cell.getCellTypeEnum())
		{
		case  STRING:        
			System.out.println(cell.getStringCellValue());break;
		
		case  NUMERIC:System.out.println(cell.getNumericCellValue());break;
		case  BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
















	}

}
