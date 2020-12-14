package com.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

	
	public String baseURL="http://demo.guru99.com/v4/";
	
	public String username="mngr289345";
	public String password="UnybuqY";
	
	public static WebDriver driver;
	
	public static Logger log;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunny\\eclipse-workspace\\sunnypractieprogramms\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		 log=Logger.getLogger("sunnypractieprogramms");
		PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	
	@AfterClass
	
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	}
	
