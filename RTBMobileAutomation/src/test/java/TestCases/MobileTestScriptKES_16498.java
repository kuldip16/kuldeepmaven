package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.Assert;
import PageObjects.MobileKES;
import Utility.Base;
import Utility.ExtentTestManager;
import Utility.UtilMobile;


public class MobileTestScriptKES_16498 extends Base{
public String url = UtilMobile.getConfigValue("appUrl");
	
	 @Test (enabled=false, groups = {"Sanity","Regression"})
	  public void CategorySlider_16498_Mobile() throws InterruptedException {
		  //Test case to verify that slider is working or not.
		 
		 getDriver().get(url+"kategorie/sofas");
		  Thread.sleep(3000);
		  UtilMobile.pagescroll(350);
		  int numberOfImagesInDefaultView = 1;

		  Thread.sleep(5000);
		  UtilMobile.sliderArrowsDefaultCase(MobileKES.CategorySliderPrevDisabled,MobileKES.CategorySliderNextActive);
		  UtilMobile.sliderArrows(MobileKES.CategorySliderImages, MobileKES.CategorySliderNextActive, MobileKES.CategorySliderPrevActive, MobileKES.CategorySliderNextDisabled,numberOfImagesInDefaultView);
		  
		 
	  }
	
	 @Test (enabled=false, groups = {"Sanity","Regression"})
	  public void ProductDropdown_16498_Mobile() throws InterruptedException {
		
		    getDriver().get(url+"kategorie/sofas");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Product is expanding or not");
			boolean getstatus = UtilMobile.ProductDropdownListClick(MobileKES.ProductDropdownArrow, MobileKES.SeriesButton, "Dropdown" , MobileKES.ProductUpArrow, MobileKES.SeriesButtonText,"null", "null");
			Assert.assertTrue(getstatus);
	 }
	 
	
	 @Test (enabled=false, groups = {"Sanity","Regression"})
	  public void ProductSeriesButtonVerify_16498_Mobile() throws InterruptedException {
         
		 
		 getDriver().get(url+"kategorie/sofas");
		 ExtentTestManager.getTest().log(LogStatus.INFO, "In product series button text is displaying or not");
		 boolean getstatus =  UtilMobile.ProductDropdownListClick(MobileKES.ProductDropdownArrow, MobileKES.SeriesButton, "Button" , MobileKES.ProductUpArrow, MobileKES.SeriesButtonText, "null", "null");
		 Assert.assertTrue(getstatus);	   
			  
	 }
	 
	 
	 
	 @Test (enabled=false, groups = {"Sanity","Regression"})
	  public void ProductDetailButtonVerify_16498_Mobile() throws InterruptedException {
        
		
		 getDriver().get(url+"kategorie/sofas");
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "In product button text is displaying or not");
		 boolean getstatus = UtilMobile.ProductDropdownListClick(MobileKES.ProductDropdownArrow, MobileKES.ProductButton, "Button" , MobileKES.ProductUpArrow, MobileKES.ProductButtonText, "null", "null");
		  Assert.assertTrue(getstatus);	   
			 
	 }

	 
	 
	 
	 @Test (enabled=true, groups = {"Sanity","Regression"})
	  public void ProductFilterDropdownVerify_16498_Mobile() throws InterruptedException {
       
		 
		 getDriver().get(url+"kategorie/sofas");
		 ExtentTestManager.getTest().log(LogStatus.INFO, "In product filter dropdown is working or not");
		 boolean getstatus =  UtilMobile.ProductDropdownListClick(MobileKES.ProductDropdownArrow, MobileKES.ProductButton, "FilterArrow" , MobileKES.ProductUpArrow, MobileKES.ProductButtonText, MobileKES.ProductFabricDownArrow, MobileKES.ProductFabricUpArrow);
		  Assert.assertTrue(getstatus);		   
			  
	 }

}
