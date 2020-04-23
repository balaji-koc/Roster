package com.roster.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.roster.pages.AttendancePage;
import com.roster.pages.HomePage;
import com.roster.pages.Login;
import com.roster.testbase.Base;

public class AttendanceTest extends Base{
	
    Login lp; HomePage hp; AttendancePage ap;
    
	public AttendanceTest()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		try {
			intalize();
			 lp=new Login();
			  hp=lp.log();
			  ap=hp.attendReportClick();
		}catch (InterruptedException e) {
		System.out.println("Exception occured when creating the Attendance page object..");
		e.printStackTrace();
	}
	  }
	
	//@Test(priority=0)
	public void getReport()
	{
		ap.searchRpt();
		logger.info("@@@@@@@@@@@@@@@In the method  getReport@@@@@@@@@@@@@2");

	}
	
	@Test(priority=1)
	public void rowsCols()
	{
		System.out.println("@@@@@@@@@@@@In the method  rows and Cols@@@@@@@@@@@@@");
		ap.searchRpt();
		ap.dataVerify();
		logger.info("@@@@@@@@@@@@In the method  rows and Cols@@@@@@@@@@@@@");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		logger.info("@@@@@@@ Tear down method invoked..@@@@@@@@@@");
		driver.quit();
	}
}
