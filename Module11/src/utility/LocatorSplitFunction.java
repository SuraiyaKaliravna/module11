package utility;

import org.openqa.selenium.By;

public class LocatorSplitFunction {
		
	
	public static By LocatorSplit(String locVariable) {
		String LocType = locVariable.split(":")[0];
		String LocValue = locVariable.split(":")[1];
		
		if(LocType.equalsIgnoreCase("NAME")) {
			return By.name(LocValue);
			
		}else if(LocType.equalsIgnoreCase("ID")) {
			return By.id(LocValue);
			
		}else if(LocType.equalsIgnoreCase("CLASSNAME")) {
			return By.className(LocValue);
			
		}else if(LocType.equalsIgnoreCase("TAGNAME")) {
			return By.tagName(LocValue);
			
		}else if(LocType.equalsIgnoreCase("LINKTEXT")) {
			return By.linkText(LocValue);
			
		}else if(LocType.equalsIgnoreCase("PARTIALLINKTEXT")) {
			return By.partialLinkText(LocValue);
			
		}else if(LocType.equalsIgnoreCase("XPATH")) {
			return By.xpath(LocValue);
			
		}else if(LocType.equalsIgnoreCase("CSSSELECTOR")) {
			return By.cssSelector(LocValue);
			
		}
		return null;
		
	}
}
