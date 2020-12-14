package com.testNGcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunny\\eclipse-workspace\\sunnypractieprogramms\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();
			
	}
	@Test()
	public void userRegistering()  {
		
	

		driver.findElement(By.xpath("//div[@class='buttons']//input[@type='button']")).click();
		System.out.println("successfully clicked in register button");
	
	
			
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		System.out.println("clicked on gender male");
		
		driver.findElement(By.xpath("//input[@id='FirstName' and @name='FirstName']")).sendKeys("sajith");
		driver.findElement(By.xpath("//input[@id='LastName' and @name='LastName']")).sendKeys("shaik");
		
		Select day=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
		day.selectByValue("21");
		
		Select month=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
		
		month.selectByVisibleText("April");
		
		Select year=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear'']")));
		year.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sunnysajith999@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Newsletter']")).click();
		
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("infosys");

		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("sajith99@");
		
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("sajith99@");
		
		
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		
		
		
		System.out.println("Registration succesfull.......");
	}
	
	
	
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	

}
