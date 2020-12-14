package com.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.LoginPage;

public class Tc_LoginPage_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseURL);
		log.info("url is opened");
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		log.info("entered username");
		Thread.sleep(3000);
		lp.setUserName(password);
		
		lp.ClickSubmit();
		
		
		
		if(driver.getTitle().equals("Guru99 bank manager homepage")){
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
	}
	
	
	
}
