package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	static XSSFWorkbook wb;
	static XSSFSheet ws;
	static XSSFCell c;
	static FileInputStream fis;
	static FileOutputStream fos;
	
	
	public String readValues(String filePath, String fileName, int rowNum, int colNum) {
		File f = new File(filePath);
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		ws = wb.getSheet(fileName);
		c = ws.getRow(rowNum).getCell(colNum);
		
		DataFormatter df = new DataFormatter();
		String cellValue = df.formatCellValue(c);
		return cellValue;
		
	}
	
	public void writeValues(String filePath, String fileName, int rowNum, int colNum, String testResult) throws Exception {
		File f = new File(filePath);
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ws = wb.getSheet(fileName);
		c = ws.getRow(rowNum).getCell(colNum, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
		c.setCellValue(testResult);
		
		fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		
		fis = new FileInputStream(f);
	}
}
