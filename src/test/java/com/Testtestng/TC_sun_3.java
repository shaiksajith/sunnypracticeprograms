package com.Testtestng;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_sun_3 {
	
@BeforeSuite
	
	public void beforeSuite() {
		
		System.out.println("hai  from before suite");

		
}

	@Test
	public void chechUp3() {
		
		
		String sam="i am sammer";
		String sun="i am sunny";
		
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(sam, sun,"my test case got skipped");//soft assert//it will excute and shoe the failure at the end
		//Assert.assertEquals(sam, sun,"i guesss both are not equal");//hard assert/it will stop the excution  show the failure
		
		
		
		
		
		
		
		
		
		System.out.println("iam  test number4");
	}

}
