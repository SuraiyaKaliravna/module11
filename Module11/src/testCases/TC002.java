package testCases;

import org.testng.Reporter;


import mainScript.DriverScript;

import pages.SignIn;

public class TC002 {
	SignIn SI = new SignIn();
	
	public void tc02() {
		try {
			SI.clickSignInLink();
			SI.enterUsername();
			SI.enterPassword();
			SI.clickSignInButton();
		}
		catch(Exception e) {
			DriverScript.bValue = false;
			Reporter.log("Test Case tc01 has failed");
			e.printStackTrace();
		}
	}
}
