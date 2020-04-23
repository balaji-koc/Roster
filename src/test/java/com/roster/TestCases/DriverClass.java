package com.roster.TestCases;

import com.roster.pages.HomePage;
import com.roster.testbase.Base;

public class DriverClass extends Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	  HomePage hp = new HomePage();
	  
	  hp.menuClick();
	  hp.shftMapClick();
	  Thread.sleep(5000);
	  
	  
	  
	 
	  

	}

}
