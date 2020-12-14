package com.apchepoi;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashmapToExcel {

	public static void main(String[] args) {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("sheet1");
		
		
		Map<String,String> hello=new HashMap<String,String>();
		
		hello.put("101","sunny" );
		hello.put("102","suny1" );
		hello.put("103","snny" );
		hello.put("104","suny" );
		hello.put("105","sun" );
		
		int rowno=0;
		
		for(Map.Entry entry:hello.entrySet()) {
			
			XSSFRow row = sheet.createRow(rowno++);
			row.createCell(0).setCellValue((String)entry.getKey());
			
			row.createCell(1).setCellValue((String)entry.getValue());
			
			
			FileOutputStream fos=new FileOutputStream(   );
			workbook.write(fos);
			
			
			
		}
		
		
		
		
		
	}

}
