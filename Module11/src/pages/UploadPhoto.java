package pages;



import constantValues.LocatorVariable;
import constantValues.TestData;
import utility.ActionKeyWords;

public class UploadPhoto {
	ActionKeyWords AK = new ActionKeyWords();
	LocatorVariable LV = new LocatorVariable();
	TestData TD = new TestData();
	
	public void clickChooseFile() throws Exception {
		AK.explicitWait(LV.ChooseFile_UploadFile);
		AK.handlingClick(LV.ChooseFile_UploadFile);
		Thread.sleep(2000);
		AK.uploadFile(TD.FileLocation);
		
	}
	
	public void clickUploadButton() {
		AK.explicitWait(LV.UploadButton_UploadFile);
		AK.handlingClick(LV.UploadButton_UploadFile);
	}
}
