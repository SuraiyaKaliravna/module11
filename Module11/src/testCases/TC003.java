package testCases;

import pages.HomePage;
import pages.UpdateProfile;
import mainScript.DriverScript;

public class TC003 {

	UpdateProfile UP = new UpdateProfile();
	HomePage HP = new HomePage();
	
	public void tc03() {
		try {
			HP.clickUserProfile();
			HP.clickMyProfile();
			UP.clickEditProfileIcon();
			UP.clickCameraIcon();
		}
		catch(Exception e) {
			DriverScript.bValue = false;
			//Reporter.log("Test Case tc03 has failed");
			e.printStackTrace();
		}
	}
}
