package pages;

import constantValues.LocatorVariable;
import utility.ActionKeyWords;

public class HomePage {
	ActionKeyWords AK = new ActionKeyWords();
	LocatorVariable LV = new LocatorVariable();
	
	public void clickUserProfile() {
		AK.explicitWait(LV.UserProfielLocValue_HomePage);
		AK.mouseHoveringWithClick(LV.UserProfielLocValue_HomePage);
	}
	
	public void clickMyProfile() {
		AK.explicitWait(LV.MyProfileLocValue_HomePage);
		AK.mouseHoveringWithClick(LV.MyProfileLocValue_HomePage);
	}
}
