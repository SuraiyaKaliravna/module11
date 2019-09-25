package mainScript;



import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constantValues.TestData;
import testCases.TC001;
import testCases.TC002;
import testCases.TC003;
import testCases.TC004;
//import testCase.TC005;
import utility.ExcelReadWrite;

public class DriverScript {

	public static boolean bValue;
	
		TC001 tc01 = new TC001();
		TC002 tc02 = new TC002();
		TC003 tc03 = new TC003();
		TC004 tc04 = new TC004();
		//TC005 tc05 = new TC005();
		ExcelReadWrite ER = new ExcelReadWrite();
		TestData TD = new TestData();
		
//===================================tc01===============================================
@Test(priority=1)
	public void tc01() throws Exception {
	if(ER.readValues(TD.filePath, TD.testScenarioSheet, 1, TD.runMode).equalsIgnoreCase("Y")) {
		bValue = true;
		tc01.tc01();
		if(bValue==true) {
			ER.writeValues(TD.filePath, TD.testScenarioSheet, 1, TD.status, TD.pass);
		}else if(bValue==false) {
			ER.writeValues(TD.filePath, TD.testScenarioSheet, 1, TD.status, TD.fail);
			assertTrue(false);
		}
	}else {
		ER.writeValues(TD.filePath, TD.testScenarioSheet, 1, TD.status, TD.skip);
	}
}		
//===================================tc02===============================================
@Test(priority=2)
	public void tc02() throws Exception {
	if(ER.readValues(TD.filePath, TD.testScenarioSheet, 2, TD.runMode).equalsIgnoreCase("Y")) {
		bValue = true;
		tc02.tc02();
		if(bValue==true) {
			ER.writeValues(TD.filePath, TD.testScenarioSheet, 2, TD.status, TD.pass);
		}else if(bValue==false) {
			ER.writeValues(TD.filePath, TD.testScenarioSheet, 2, TD.status, TD.fail);
			assertTrue(false);
		}
	}else {
		ER.writeValues(TD.filePath, TD.testScenarioSheet, 2, TD.status, TD.skip);
	}
}		
//===================================tc03====================================
@Test(priority=3)
	public void tc03() throws Exception {
	if(ER.readValues(TD.filePath, TD.testScenarioSheet, 3, TD.runMode).equalsIgnoreCase("Y")) {
		bValue = true;
		tc03.tc03();
		if(bValue==true) {
			ER.writeValues(TD.filePath, TD.testScenarioSheet, 3, TD.status, TD.pass);
		}else if(bValue==false) {
			ER.writeValues(TD.filePath, TD.testScenarioSheet, 3, TD.status, TD.fail);
			assertTrue(false);
		}
	}else {
		ER.writeValues(TD.filePath, TD.testScenarioSheet, 3, TD.status, TD.skip);
	}
		
}		
	
//===================================tc04====================================	
@Test(priority=4)
	public void tc04() throws Exception {
	if(ER.readValues(TD.filePath, TD.testScenarioSheet, 4, TD.runMode).equalsIgnoreCase("Y")) {
		bValue = true;
		tc04.tc04();
		if(bValue==true) {
			ER.writeValues(TD.filePath, TD.testScenarioSheet, 4, TD.status, TD.pass);
		}else if(bValue==false) {
			ER.writeValues(TD.filePath, TD.testScenarioSheet, 4, TD.status, TD.fail);
			assertTrue(false);
		}
	}else {
		ER.writeValues(TD.filePath, TD.testScenarioSheet, 4, TD.status, TD.skip);
	}
}	
//		


}		
