package com.apchepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatabaseConnection {

	public static void main(String[] args) throws SQLException, IOException {
		//u need add mysql conncetor dependecy to pom.xml
		//main agenda is reading table from mysaq and printing in excel
		
		//frst we need establish conncetion the datbase
		
		 Connection con=DriverManager.getConnection("");//url as parametr
		 
		 //statment/query
		 
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select*form tablename");
		
		//excel
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("suny");
		
		XSSFRow row=sheet.createRow(0);//reading header part in databse
		row.createCell(0).setCellValue("sunny");
		
		row.createCell(2).setCellValue("sun");
		row.createCell(3).setCellValue("su");
		row.createCell(4).setCellValue("s");
		row.createCell(5).setCellValue("sunnys");
		row.createCell(5).setCellValue("sunnyd");
		int r=1;
		while(rs.next()) {
			
			
			double head = rs.getDouble("headerpartname1in datebase");
			String stad2 = rs.getString("STREET_ADDRESS4");
			String stad4 = rs.getString("STREET_ADDRESS4");
			String stad5 = rs.getString("STREET_ADDRESS3");
			
			String stad1 = rs.getString("STREET_ADDRESS2");
			
			
			String stad = rs.getString("STREET_ADDRESS");
			
		row=sheet.createRow(r);
			row.createCell(0).setCellValue(stad);
			
			row.createCell(1).setCellValue(stad);
			row.createCell(2).setCellValue(stad5);
			row.createCell(3).setCellValue(stad4);
			
			//like taht hoe may row and col uhave accrdingly create cells
			
			
		}
		
		
	FileOutputStream fos=new FileOutputStream("file loction whre u rgoing to save ");	
	workbook.write(fos);
	
		
		workbook.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
