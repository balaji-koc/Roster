package com.roster.utilities;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestResult;

import com.roster.testbase.Base;

public class WebEventListener extends Base implements WebDriverEventListener {

	
	public void afterAlertAccept(WebDriver arg0) {
		System.out.println("Alert is accepted.");
		
	}

	
	public void afterAlertDismiss(WebDriver arg0) {
		System.out.println("Alert is dismissed.");
		
	}

	
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("afterChangeValueOf");
		
	}

	
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("afterClickOn button");
	}

	
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("afterFindBy Webelement");
		
	}

	
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		System.out.println("Screenshot is captured");
	}

	
	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		System.out.println("Webelement text captured");
	}

	
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Browser Back navigation");
		
	}

	
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Browser forward navigation");
		
		
	}

	
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("afterNavigateRefresh");
		
	}

	
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("after Navigate to");
		
	}

	
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("afterScript");
	}

	
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("after SwitchTo Window");
	}

	
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("before Alert Accept");
	}

	
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("before Alert Dismiss");
		
	}

	
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("before Change ValueOf");
		
	}

	
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("before ClickOn");
		
	}

	
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("before FindBy");
		
	}

	
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		System.out.println("before Get Screenshot");
		
	}

	
	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("before before GetText");
	}

	
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("before Navigate Back");
		
	}

	
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("before Navigate Forward");
	}

	
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("before Navigate Refresh");
	}

	
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("before Navigate To");
	}

	
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Before Script");
	}

	
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("before Switch To Window");
	}

	
	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
				
		System.out.println("An Exception is Raised and Screen Shot Captured"+ITestResult.class.getName());
		
		try {
			TestUtil.captureScreenShot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
