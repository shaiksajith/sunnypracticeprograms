package com.apchepoi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunny\\eclipse-workspace\\sunnypractieprogramms\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="LoginData")
	public void testData(String user,String pwd,String exp) {
		
      driver.get("https://admin-demo.nopcommerce.com/login");
      
      
        WebElement textemail = driver.findElement(By.xpath("//input[@id='Email']"));
       textemail.clear();
       textemail.sendKeys(user);
       
       
       
       
        WebElement txtpwd=driver.findElement(By.xpath("//input[@id='Password']"));
      txtpwd.clear();
      txtpwd.sendKeys(pwd);

       driver.findElement(By.xpath("//input[@value='Log in']")).click();
       
       String expected="Dashboard/ nopcommerce administration";
       
       String actualtitle=driver.getTitle();
       
       
       if(exp.equals("valid")) {
    	   if(expected.equals(actualtitle)) {
    		   driver.findElement(By.xpath("//a[text()='Logout']")).click();
    		   Assert.assertTrue(true);
    		   
    	   }else
    		  Assert.assertTrue(false);
       }
    	   else if(exp.equals("invalid")){
    		   if(expected.equals(actualtitle)) {
    			   
    			   Assert.assertTrue(false);
    		   }
    		   else {
    			   Assert.assertTrue(true);
    			   
    		   }
    		   
    	   }
    	   
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
		
		
		
		
		
		
		
	
	
	
	
	
	
	

	@DataProvider(name="LoginData")
	public String[][] getData(){
		
		
		String[][] logindata= {{"admin@yourstore.com","Admin","Valid"},
				         { "admin@your.com","Admin","inValid"},
				         {"admin@yoursto.com","Admi","inValid"},
				         {"admin@youstore.com","Amin","inValid"}
				         
		
		};
		
		
		
		return logindata;
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	@AfterClass	
	public void tearDown() {
		driver.close();
	}
	
	
	
}
