package com.invicta.qa.testcases.sbu;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.invicta.qa.pages.sbu.AddSbuFunPage;



public class sbutestcases extends sbumethods{
	
	static AddSbuFunPage AddSbuFunpg = new AddSbuFunPage();
	
	@Test
	
	public static void testcases () throws InterruptedException, IOException {
		
     PageFactory.initElements(driver, AddSbuFunpg);
		
		AddSbuFunPage.Master.click();
		Thread.sleep(2000);
		
		AddSbuFunPage.SBU.click();
		Thread.sleep(2000);
		
		
//		STEP 1 - CALLING THE ADD SBU PROPERTIES METHOD
		
		sbumethods.Addsbu();
		
			
//		STEP 2 - CLICK THE ADD SBU BUTTON
		
		Thread.sleep(2000);
		AddSbuFunPage.AddSBU.click();
		
		
//		STEP 3 - CALLING THE MODAL PROPERTIES
		
		
		Thread.sleep(2000);
		sbumethods.sbumodal();
		
		
		
//		STEP 4 - DATA ENTERING FROM EXCEL
		
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\invicta\\qa\\excel\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sbu");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			
			XSSFRow row = sheet.getRow(i);

			String sbu = (String) row.getCell(0).getStringCellValue();
			String description = (String) row.getCell(1).getStringCellValue();
			
			Thread.sleep(2000);
			
//			AddSbuFunPage.AddSBU.click();

			AddSbuFunPage.SBUtext.sendKeys(sbu); 
			AddSbuFunPage.SBUdestext.sendKeys(description);
			
			Thread.sleep(2000);
		
	}
		
//		sbumethods.execldata();
		
//		STEP 5 - CALLING THE SAVE BUTTON PROPERTIES
		
		
		sbumethods.sbusavebutton();
			
		
//		STEP 6 - CLICK THE SAVE BUTTON
			
		AddSbuFunPage.SBUsavebutton.click();
		
//		STEP 7 - REPORT GENERATING
			
		
	}
	

}
