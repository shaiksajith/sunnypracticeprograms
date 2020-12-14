package com.apchepoi;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormattingCellColour {

	public static void main(String[] args) {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("sheet1");
		
		XSSFRow row = sheet.createRow(1);
		
		
		XSSFCellStyle style = workbook.createCellStyle();//setting background colour
		style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		
		style.setFillPattern(FillPatternType.BIG_SPOTS);
		
		
		
		XSSFCell cell = row.createCell(1);
		cell.setCellValue("wlecome");
		cell.setCellStyle(style);
		
		
		
		style = workbook.createCellStyle();
		
		style.setFillBackgroundColor(IndexedColors.YELLOW.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		
		
		FileOutputStream fos=new FileOutputStream(   );
		workbook.write(fos);
		
		
		
		

	}

}
