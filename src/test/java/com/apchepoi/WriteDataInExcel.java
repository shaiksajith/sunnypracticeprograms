package com.apchepoi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {
//workbook-->sheet-->rows-->cells
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Emp info");//created empty sheet as empinfo
		
		
		
		Object empdata[][]= {  {"empid","name","job"},
				
				{101,"david","engneer"},//1 row
				{102,"sunny","manger"},//2 row
				{103,"sameer","doctor"},//3 row
				{104,"scot","painter"}//4 row
				
		}  ;
		int rows=empdata.length;
		
int cols=empdata[0].length;//0 means in 1 row values

System.out.println(rows);
System.out.println(cols);


for(int r=0;r<rows;r++) {
	XSSFRow row=sheet.createRow(r);//it will create the row in sheet
	for(int c=0;c<cols;c++) {
		XSSFCell cell=row.createCell(c);//0 cell
		Object value=empdata[r][c];
		
		if(value instanceof String)
			cell.setCellValue((String)value);

		if(value instanceof Integer)
			cell.setCellValue((Integer)value);//typecasting the value into string

		
		if(value instanceof Boolean)
			cell.setCellValue((Boolean)value);
		
			
	}
	
	
}


String filepath="C:\\Users\\Sunny\\Documents\\filepath\\employe.xlxs";

FileOutputStream fos=new FileOutputStream(filepath);
workbook.write(fos);
fos.close();
System.out.println("employe.xlxs file written succesfully....");









	}

}
