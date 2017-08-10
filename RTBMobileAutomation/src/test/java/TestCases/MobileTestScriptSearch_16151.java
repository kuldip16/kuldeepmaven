package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.MobileSearchPage;
import PageObjects.MobileSearchPage;
import Utility.Base;
import Utility.ExtentTestManager;
import Utility.UtilMobile;

public class MobileTestScriptSearch_16151 extends Base {
	
	public String url = UtilMobile.getConfigValue("appUrl");

	 @Test (enabled=true, groups = {"Sanity","Regression"})
	  public void ProductDropdown_16151_Mobile() throws InterruptedException {
		
		    getDriver().get(url+"suche");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Product is expanding or not");
			boolean getstatus = UtilMobile.ProductDropdownListClick(MobileSearchPage.ProductDropdownArrow, MobileSearchPage.SeriesButton, "Dropdown" , MobileSearchPage.ProductUpArrow, MobileSearchPage.SeriesButtonText,"null", "null");
			Assert.assertTrue(getstatus);
	 }
	 
		
	 @Test (enabled=true, groups = {"Sanity","Regression"})
	  public void ProductSeriesButtonVerify_16151_Mobile() throws InterruptedException {
         
		 
		 getDriver().get(url+"suche");
		 ExtentTestManager.getTest().log(LogStatus.INFO, "In product series button text is displaying or not");
		 boolean getstatus =  UtilMobile.ProductDropdownListClick(MobileSearchPage.ProductDropdownArrow, MobileSearchPage.SeriesButton, "Button" , MobileSearchPage.ProductUpArrow, MobileSearchPage.SeriesButtonText, "null", "null");
		 Assert.assertTrue(getstatus);	   
			  
	 }
	 
	 
	 
	 @Test (enabled=true, groups = {"Sanity","Regression"})
	  public void ProductDetailButtonVerify_16151_Mobile() throws InterruptedException {
        
		
		 getDriver().get(url+"suche");
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "In product button text is displaying or not");
		 boolean getstatus = UtilMobile.ProductDropdownListClick(MobileSearchPage.ProductDropdownArrow, MobileSearchPage.ProductButton, "Button" , MobileSearchPage.ProductUpArrow, MobileSearchPage.ProductButtonText, "null", "null");
		  Assert.assertTrue(getstatus);	   
			 
	 }

	 
	 
	 
	 @Test (enabled=true, groups = {"Sanity","Regression"})
	  public void ProductFilterDropdownVerify_16151_Mobile() throws InterruptedException {
       
		 
		 getDriver().get(url+"suche");
		 ExtentTestManager.getTest().log(LogStatus.INFO, "In product filter dropdown is working or not");
		 boolean getstatus =  UtilMobile.ProductDropdownListClick(MobileSearchPage.ProductDropdownArrow, MobileSearchPage.ProductButton, "FilterArrow" , MobileSearchPage.ProductUpArrow, MobileSearchPage.ProductButtonText, MobileSearchPage.ProductFabricDownArrow, MobileSearchPage.ProductFabricUpArrow);
		  Assert.assertTrue(getstatus);		   
			  
	 }

	
}
