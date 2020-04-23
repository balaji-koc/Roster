package com.roster.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.roster.testbase.Base;

public class HomePage extends Base {

	
	@FindBy(xpath="//span[contains(text(),'Resource Mgmt.')]") 
	WebElement resmgt;
	
	@FindBy(xpath="//a[@id='dlmenu_datalistsubmenu_9_childlink_6']")
	WebElement shftmap;
	
	@FindBy(id="dlmenu_datalistsubmenu_9_childlink_0")
	WebElement attend_pg;
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public void menuClick()
	{
		WebElement resmgt = driver.findElement(By.xpath("span[contains(text(),'Resource Mgmt.')]"));
		System.out.println("element:"+resmgt);
		//resmgt.click();
	}
	
	public ShiftMapPage shftMapClick() throws InterruptedException
	{
		resmgt.click();
		Thread.sleep(2000);
		System.out.println("Before Shifmap Click...");
		shftmap.click();
		System.out.println("After Shifmap Click...");
		return new ShiftMapPage();
		
				
	}
	
	public AttendancePage attendReportClick() throws InterruptedException
	{
		resmgt.click();
		Thread.sleep(2000);
		System.out.println("Before Shifmap Click...");
		attend_pg.click();
		System.out.println("After Shifmap Click...");
		return new AttendancePage();
	
	}
	
	public String loginPageTitle()
	{
		System.out.println("In LoginPAgeTile Method");
		return driver.getTitle();
	}
	
	
	
}
