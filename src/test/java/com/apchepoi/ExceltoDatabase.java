package com.apchepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceltoDatabase {

	public static void main(String[] args) throws SQLException, IOException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");//url as parametr
		
		Statement stmt=con.createStatement();
		
		
		
		
		String sql="create table places(LOATION_ID decimal(4,0),STREET_ADDRESS varchar(40))";//create a new table in the databse		
		stmt.execute(sql);

		FileInputStream fis=new FileInputStream("file loctaion");
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("loctionsdata");
		
		int rows=sheet.getLastRowNum();
		
		for(int r=1;r<=rows;r++) {
			
			XSSFRow row=sheet.getRow(r);
			double locid = row.getCell(0).getNumericCellValue();
			String stad2 = row.getCell(1).getStringCellValue();//as soon asi get tha dat form excel
			String stad3 = row.getCell(2).getStringCellValue();
			String stad4 = row.getCell(3).getStringCellValue();
			String stad5 = row.getCell(4).getStringCellValue();
			sql="insert into places values('"+locid+"','"+stad2+"')";	
			
			
			stmt.execute(sql);
			stmt.execute("commit");
			
			
			
			
			
			
			
			
		}
		
		workbook.close();
		fis.close();
	}

}
