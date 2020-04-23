package com.roster.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

	 
	public void onFinish(ITestContext arg0) {
		
		System.out.println("Test Case Finished: "+ arg0.getName());
		
	}

	 
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test on Started: "+ arg0.getName());
	}

	 
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Case Paritaly Finished: "+ arg0.getName());
	}

	 
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Case Failed: "+ arg0.getName());
		
	}

	 
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Case Skipped: "+ arg0.getName());
	}

	 
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Case started: "+ arg0.getName());
		
	}

	 
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Case Sucessfull: "+ arg0.getName());
		
	}

}
