package com.roster.TestCases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.roster.pages.HomePage;
import com.roster.pages.Login;
import com.roster.pages.ShiftMapPage;
import com.roster.testbase.Base;
import com.roster.utilities.TestUtil;

@Listeners(com.roster.utilities.TestListeners.class)
public class ShiftMapTest extends Base {
	
	HomePage hp;
	Login lp;
	ShiftMapPage smp;
	public ShiftMapTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		intalize();
		lp= new Login();
		hp=lp.log();
		smp=hp.shftMapClick();
						
	}
	
	//@Test(priority=0)
	public void drvShtMap()
	{
		String title = null;
		try {
			title=smp.selectDrv("09/12/2019 06:00", "14/12/2019 17:59", "Shift-A", "Non Allocated");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("Pop-up Title is: "+title);
		Assert.assertEquals("Shift allotment has been done successfully.!!", title);
	}

 @Test(priority=2)
  public void gridColTest()
  {
	 int colcnt = smp.ColCnt();
	 Assert.assertEquals(colcnt, 17);
	 
  }
 
 @Test(priority=3)
 public void gridRowTest()
 {
	 int rowcnt = smp.rowCnt();
	 Assert.assertEquals(rowcnt-1, 587);
	 
 }

 @Test(priority=4)
 
 public void srchSlct() throws InterruptedException
 {
	 smp.autoSrch("Babu");
	 
 }
	
 
 @AfterMethod
 public void tearDown(ITestResult tstrslt) throws InterruptedException, AWTException
 {
	 if(tstrslt.getStatus()==ITestResult.FAILURE )
	 {
		 System.out.println("Assert is failed..."+tstrslt.getName());
		 TestUtil.captureScreenShot();
	 }
	 Thread.sleep(5000);
	 System.out.println("Closing the browser...");
	 driver.close();
 }
}
