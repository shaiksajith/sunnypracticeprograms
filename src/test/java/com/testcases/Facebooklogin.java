package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebooklogin {

	
	@Test
	public void validateLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunny\\eclipse-workspace\\sunnypractieprogramms\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement sunny = driver.findElement(By.id("email"));
		
		sunny.sendKeys("shaik.sajith99@gmail.com");
		WebElement sameer = driver.findElement(By.id("pass"));
		sameer.sendKeys("sajith99@");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='j83agx80 l9j0dhe7']//div")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
		  driver.switchTo().alert().accept();
		
		
		
		
		
		
	}
	
	
	
}
