package com.roster.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.roster.testbase.Base;

public class ShiftMapPage<WebElements> extends Base {
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtShiftFrom")
	WebElement from;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtShiftTo")
	WebElement to;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlshifttype")
	WebElement Shftype;
	
	@FindBy(id="ContentPlaceHolder1_ddlfilter")
	 WebElement fltr;
	
	@FindBy(id="ContentPlaceHolder1_gvDrvrdtls_chkallotment_0")
	WebElement chkbx;
	
	@FindBy(xpath="//input[@value='Allocate']")
	WebElement okbtn; 
	
	@FindBy(xpath="//input[@value='Reset']")
	WebElement reset;
	
	//@FindBy(id="ctl00$ContentPlaceHolder1$txtSearchDriver") 
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtSearchDriver") 
	WebElement atosrch;
	
	@FindBy(id="ContentPlaceHolder1_imgbtnSearch")
	WebElement srchbtn;
	
	List<WebElement> lst;
	
	JavascriptExecutor js;
	
	public ShiftMapPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String selectDrv(String frmdt, String todt, String shft, String stus ) throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		System.out.println("from Date :"+frmdt);
		Thread.sleep(3000);
		//from.sendKeys(frmdt);
		 js.executeScript("document.getElementById('ContentPlaceHolder1_txtShiftFrom').value='"+frmdt+"'");
		Thread.sleep(1000);
		//to.sendKeys(todt);
	    js.executeScript("document.getElementById('ContentPlaceHolder1_txtShiftTo').value='"+todt+"'");
		Thread.sleep(1000);
		Select s= new Select(Shftype);
		s.selectByVisibleText("Shift-A");
		Thread.sleep(1000);
		Select f= new Select(fltr);
		f.selectByVisibleText("Non allocated");
		Thread.sleep(4000);
		chkbx.click();
		Thread.sleep(2000);
		//okbtn.click();
		Thread.sleep(2000);
		String poptitle = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		//Assert.assertEquals("Shift allotment has been done successfully.!!", poptitle);
		return poptitle;
					
	}
	
	public int ColCnt()
	{
		lst = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_gvDrvrdtlsHeaderCopy']/th") ); 
		System.out.println("Rows Count:"+lst.size());
		return lst.size();
	}
	
	public int rowCnt()
	{
		lst = driver.findElements(By.xpath("//table[@id='ContentPlaceHolder1_gvDrvrdtls']/tbody/tr") ); 
		System.out.println("Rows Count:"+lst.size());
		return lst.size();
	}
	
	public String autoSrch(String drv) throws InterruptedException
	{
		atosrch.sendKeys(drv);
		Thread.sleep(2000);
		
		List<WebElement> we = driver.findElements(By.className("ui-menu-item"));
		System.out.println("size options list: "+we.size());
		for(WebElement opt: we)
		{
			//System.out.println("option :"+ opt.toString());
			
			if(opt.getText().equalsIgnoreCase("A Suri Babu ~15002"))
			{
				opt.click();
				Thread.sleep(500);
				srchbtn.click();
			}
		}
		
			
		return null;
	}
	
	
	
	
	
	
	
	

}
