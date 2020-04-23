package com.roster.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	  int test_count=0;
	  int limit =1;
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stu
		
		  if (test_count<=limit)
		  {
			  test_count++;
			  return true;
		  }
		return false;
	}

	
}
