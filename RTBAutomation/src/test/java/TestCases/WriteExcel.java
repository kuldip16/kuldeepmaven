package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.homePage;
import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class WriteExcel extends Base {

	
	@Test
	public void test () throws Exception{

		util.WriteDataInCols(util.getConfigValue("TestDataFileOld"), util.getConfigValue("HeaderSheet"), homePage.categoryLinks, 1);
	}
	
		
	
}
