package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
	
	
	WebDriver ldriver;
	
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
		
	}
	
	@FindBy(name="uid")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	
	@FindBy(name="btnLogin")
	WebElement btnlogin;
	
	
	public void setUserName(String uname) {
		
		txtusername.sendKeys(uname);
		
	}

	
	public void setPassWord(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	
	public void ClickSubmit() {
		btnlogin.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	}

