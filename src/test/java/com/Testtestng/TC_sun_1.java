package com.Testtestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_sun_1 {
	
	
	

	@AfterSuite
	public void afterSuite() {
		System.out.println("hai from aftersuite");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("iam from before class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("iam from before test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("i am from before method");
	}
			
	
	@Test(priority = 1)
	public void flowContorl() {
		System.out.println("iam test number 1");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("iam from after method");
		
	}

	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("i am from before method1");
	}
		
	
	@Test(priority = 2)
	public void chechup1() {
		System.out.println("iam test number 2");
			
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("iam form after class");
	}
	
	@AfterMethod
	public void afterMethod1() {
		System.out.println("iam from after method1");
		
	}
	
	
	
@AfterTest
public void afterTest() {
	System.out.println("iam from aftertest");
}



	
	
	
}
