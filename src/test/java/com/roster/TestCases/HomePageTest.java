package com.roster.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.roster.pages.HomePage;
import com.roster.pages.Login;
import com.roster.testbase.Base;

public class HomePageTest extends Base {
	
	public HomePage hp;
	public Login lp;
	
	public HomePageTest()
	{
		super();
			
		
	}

	 @BeforeMethod
	 public void setup()
	 {
		 try {
			intalize();
			lp= new Login();
			hp=lp.log();
					
			//hp=new HomePage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 		 
	  }
	 
	@Test(priority=1)
	 public void homePageTitleTest()
	   {
		   String title = hp.loginPageTitle();
		   
		  Assert.assertEquals(title, "KPCL"); 
		  
	   }
	 
	@Test(priority=2)
	  public void shiftMapTest() throws InterruptedException
	  {
		hp.shftMapClick();
		
	  }
	 
	 
}
