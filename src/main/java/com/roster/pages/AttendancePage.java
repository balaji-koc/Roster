package com.roster.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.roster.testbase.Base;

public class AttendancePage extends Base {
	
	@FindBy(className="page-header")
	WebElement hdr;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtfromdate")
	WebElement frmDate;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txttodate")
	WebElement toDate;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$Button1")
	WebElement srchBtn;
	
	@FindBy(id="ContentPlaceHolder1_lblcnt")
	WebElement text;
	
	String r_xpath="//table[@id='ContentPlaceHolder1_grd_popup_details']/tbody/tr[*]";
//	@FindBys(
//	@FindBy(xpath=r_xpath))  //tr[@id='ContentPlaceHolder1_grd_popup_details']
//	public List<WebElement> rows;
//	
	String c_xpath="//table[@id='ContentPlaceHolder1_grd_popup_details']/tbody/tr[*]/th";
//	@FindBys(
//	@FindBy(xpath="//table[@id='ContentPlaceHolder1_grd_popup_details']/tbody/tr[*]/th"))
//	public List<WebElement> cols;
	
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ContentPlaceHolder1_grd_popup_details']/tbody/tr[1]"));
	List<WebElement> cols = driver.findElements(By.xpath("//table[@id='ContentPlaceHolder1_grd_popup_details']/tbody/tr[1]/th"));
	WebElement elem= driver.findElement(By.xpath("//body//div//div//div//tr[2]"));
	int r_count=rows.size();
	int c_count=cols.size();
	
	public AttendancePage() {
		PageFactory.initElements(driver,this);
	 }
	
	
	public void searchRpt()
	{
		System.out.println("@@@@@@@@@@@@In the method  SearchReport @@@@@@@@@@@@@");
		logger.info("Attend page SearchReport method invoked...");
		frmDate.sendKeys("25/03/2020");
		toDate.sendKeys("28/03/2020");
		srchBtn.click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(text));
		System.out.println("Text is:"+text.getText());
	}
	 
	public void dataVerify()
	{
    	logger.info("Attend page DataVerify method invoked...");
//		System.out.println("Rows : "+r_count+" Cols : "+c_count);
//				
//		for(WebElement ele:rows)
//		{
//			System.out.println("Row element:"+ele.getText()); 
//		}
		
		System.out.println("Row element:"+elem.getText());
		
	}
}
