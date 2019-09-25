package testCases;

import pages.UploadPhoto;
import utility.ActionKeyWords;
import mainScript.DriverScript;
public class TC004 {

	UploadPhoto UL = new UploadPhoto();
	ActionKeyWords AK = new ActionKeyWords();
	
	public void tc04() {
		try {
			UL.clickChooseFile();
			UL.clickUploadButton();
			AK.quitBrowser();
		}
		catch(Exception e) {
			DriverScript.bValue = false;
			//Reporter.log("Test Case tc04 has failed");
			e.printStackTrace();
		}
	}
}
