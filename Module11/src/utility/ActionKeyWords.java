package utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionKeyWords {

	static WebDriver driver;
	static boolean bValue;
	
	public WebDriver openBrowser(String bName) {
		if(bName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();			
		}else if(bName.equalsIgnoreCase("FIREFOX")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public void openURL(String TestData) {
		driver.get(TestData);
	}
	
	public void handlingClick(String LocVariable) {
		WebElement element = driver.findElement(LocatorSplitFunction.LocatorSplit(LocVariable));
		element.click();
	}
	
	public void handlingTextBox(String LocVariable, String TestData) {
		WebElement element = driver.findElement(LocatorSplitFunction.LocatorSplit(LocVariable));
		element.sendKeys(TestData);
	}
	
	public void keyBoardKeys(String LocVariable, Keys Enter) {
		WebElement element = driver.findElement(LocatorSplitFunction.LocatorSplit(LocVariable));
		element.sendKeys(Keys.ENTER);
	}
	
	public void handlingDropdowns(String LocVariable, String TestData) {
		WebElement element = driver.findElement(LocatorSplitFunction.LocatorSplit(LocVariable));
		Select sel = new Select(element);
		sel.selectByVisibleText(TestData);
	}
	
	public void mouseHoveringWithoutClick(String LocVariable) {
		WebElement element = driver.findElement(LocatorSplitFunction.LocatorSplit(LocVariable));
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public void mouseHoveringWithClick(String LocVariable) {
		WebElement element = driver.findElement(LocatorSplitFunction.LocatorSplit(LocVariable));
		Actions a = new Actions(driver);
		a.moveToElement(element).click().perform();
	}
	
	public void switchMultipleWindows(int windowID) {
		List<String> AllWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(AllWindows.get(windowID));
	}
	
	public void switchFrame(String TestData) {
		driver.switchTo().frame(TestData);
	}
	
	public void switchDefault() {
		driver.switchTo().defaultContent();
	}
	
	public void handlingTables(String LocVariable, String TestData) {
		List<WebElement> totalrows = driver.findElements(LocatorSplitFunction.LocatorSplit(LocVariable));
		int Rowcount = totalrows.size();
		for(int i=0; i<Rowcount; i++) {
			if(bValue==true) {
				break;
			}else {
			List<WebElement> totaldata = driver.findElements(By.tagName("td"));
			int tdCount = totaldata.size();
			
			for(int j=0; j<tdCount; j++) {
				String tdText = totaldata.get(j).getText();
				
				if(tdText.equalsIgnoreCase(TestData)) {
					totaldata.get(j).click();
					bValue = true;
					break;
				}
			}
		}
	}
}
	
	public void fetchMultipleValues(String LocVariable) {
		List<WebElement> elements = driver.findElements(LocatorSplitFunction.LocatorSplit(LocVariable));
		int count = elements.size();
		for(int i=0; i<count; i++) {
			String text = elements.get(i).getText();
			System.out.println(text);
		}
	}
	
	public void fetchValue(String LocVariable) {
		WebElement element = driver.findElement(LocatorSplitFunction.LocatorSplit(LocVariable));
		String text = element.getText();
		System.out.println(text);
	}
	
	public void scrolling() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scroll(0, 500)");
	}
	
	public String explicitWait(String LocVariable) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(LocatorSplitFunction.LocatorSplit(LocVariable)));
		return LocVariable;
	}
	
	public void uploadFile(String teatData) throws Exception {
		Runtime.getRuntime().exec(teatData);
	}
	
	public void closeWindow() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}