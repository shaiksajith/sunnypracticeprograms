package com.apchepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToHashmap {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(".\\datafiles\\data driven table for selenium.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
XSSFSheet sheet = workbook.createSheet("sunny");
int row = sheet.getLastRowNum();
HashMap <String,String> data=new HashMap<String,String>();


//reading the dat from exel to Hashmap
for(int r=0;r<=row;r++) {
	
	String key = sheet.getRow(r).createCell(0).getStringCellValue();
			String value = sheet.getRow(r).createCell(1).getStringCellValue();
			
	data.put(key, value);
	
	
	//reading dat from hashmap
	
	for(Map.Entry entry:data.entrySet()) {
		
		System.out.println(entry.getKey()+" "+entry.getValue());
		
		
		
		
		
		
		
	}
	
	
	
	
	
}











	}

}
