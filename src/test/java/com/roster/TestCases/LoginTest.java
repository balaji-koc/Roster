package com.roster.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.roster.pages.HomePage;
import com.roster.pages.Login;
import com.roster.testbase.Base;

public class LoginTest extends Base {
	
	public Login log;
	
	
	public LoginTest()
	{
		super();
		
		System.out.println("in constructur LoginTest");
				
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		intalize();
		log = new Login();
	}
	
	@Test(priority=2)
	public void loginPageTest()
	{
		log.log();
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title= log.loginPageTitle();
		
		Assert.assertEquals(title, "Kyte :: Login");
			
	}
	
	

}
