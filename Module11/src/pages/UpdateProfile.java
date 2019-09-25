package pages;

import constantValues.LocatorVariable;
import utility.ActionKeyWords;

public class UpdateProfile {
	ActionKeyWords AK = new ActionKeyWords();
	LocatorVariable LV = new LocatorVariable();
	
	public void clickEditProfileIcon() {
		AK.explicitWait(LV.EditProfileIcon_UpdateProfile);
		AK.handlingClick(LV.EditProfileIcon_UpdateProfile);
	}
	
	public void clickCameraIcon() {
		AK.explicitWait(LV.CameraIcon_UpdateProfile);
		AK.handlingClick(LV.CameraIcon_UpdateProfile);
	}
}
