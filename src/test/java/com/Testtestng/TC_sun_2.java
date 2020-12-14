package com.Testtestng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_sun_2 {

	@BeforeTest
	public void beforeTest() {
		
		
		
		System.out.println("iam from before test1");
		
		
	}
	
	@Test
	public void chechUp2() {
		System.out.println("iam test number 3");
	}
	
	
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("iam from aftertest2");
	}

}
