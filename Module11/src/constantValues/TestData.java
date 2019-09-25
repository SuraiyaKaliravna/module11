package constantValues;

import utility.ExcelReadWrite;

public class TestData {
	
ExcelReadWrite ER = new ExcelReadWrite();
	
	public final String filePath = "C:\\Users\\surai\\eclipse-workspace\\Module11\\Module11.xlsx";
	public final String fileName = "TestData";
	public final String testScenarioSheet = "TestScenario";
	
	public final int runMode = 3;
	public final int status = 2;
	public final String pass = "PASS";
	public final String fail = "FAIL";
	public final String skip = "SKIP";
	
	public final String browserName = ER.readValues(filePath, fileName, 1, 4);
	public final String openURL = ER.readValues(filePath, fileName, 2, 4);
	public final String userName = ER.readValues(filePath, fileName, 4, 4);
	public final String password = ER.readValues(filePath, fileName, 5, 4);
	
	public final String FileLocation = ER.readValues(filePath, fileName, 12, 4);
	
	

}
