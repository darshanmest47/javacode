package org.test.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.test.base.Testbase;
import org.testng.annotations.Test;

public class Utils extends Testbase{
	Logger logger;
	public Utils() {
		 logger = LogManager.getLogger(Utils.class.getName());
	}
	

	
	public void switchFrame() {
		
		driver.switchTo().frame("mainpanel");
		
	}
	
	@Test
	public void getExcelData() throws IOException {
		
		FileInputStream fs = new FileInputStream("E:\\eclipse\\POMprac\\Testdata\\testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rownum = sh.getLastRowNum();
	  String[] arr= new String[100];
		
		logger.info("max row num is "+rownum);
		short cellcount;
		for(int i=1;i<=rownum;i++) {
			cellcount  = sh.getRow(i).getLastCellNum();
			logger.info("cell count in "+i+" th row is "+cellcount);
			for(int j=0;j<cellcount;j++) {
				
				logger.info(sh.getRow(i).getCell(j).getStringCellValue());
				
//				arr[i]=sh.getRow(i).getCell(j).getStringCellValue();
			
			}

			
		}
//		for(int k=0;k<arr.length;k++) {
//			logger.info(arr[k]);
//		}
	
		
	   
	  
		
		
	}

}
