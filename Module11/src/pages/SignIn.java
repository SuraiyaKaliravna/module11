package pages;

import constantValues.LocatorVariable;
import constantValues.TestData;
import utility.ActionKeyWords;

public class SignIn {
ActionKeyWords AK = new ActionKeyWords();
LocatorVariable LV = new LocatorVariable();
TestData TD = new TestData();

	public void clickSignInLink() {
		AK.handlingClick(LV.LoginLocatorValue_SignIn);
	}
	
	public void enterUsername() throws Exception {
		Thread.sleep(1000);
		AK.handlingTextBox(LV.UserNameLocatorValue_SignIn, TD.userName);
		Thread.sleep(2000);
	}
	
	public void enterPassword() throws Exception {
		
		AK.handlingTextBox(LV.PasswordLocatorValue_SignIn, TD.password);
	}
	
	public void clickSignInButton() {
		AK.handlingClick(LV.LoginButtonLocatorValue_SignIn);
	}
}
