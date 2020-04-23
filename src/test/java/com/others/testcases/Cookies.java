package com.others.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies {
	
	
	
	public WebDriver driver;
	@Test
	public void cookiesTest() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","F:\\Roster\\Roster\\Chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", "F:\\Roster\\Roster\\Chromedriver.exe");
		
		  driver = new ChromeDriver();
		driver.get("http://www.redbus.in");
		
		driver.findElement(By.id("sign-in-icon-down")).click();
		driver.findElement(By.id("signInLink")).click();
		Thread.sleep(3000);
		
		//driver.switchTo().frame(1);
		driver.findElement(By.className("google-text")).click();
		Thread.sleep(5000);
		
	}

}
