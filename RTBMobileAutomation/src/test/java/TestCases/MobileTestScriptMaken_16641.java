package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.MobileMarken;
import Utility.Base;
import Utility.ExtentTestManager;
import Utility.UtilMobile;

public class MobileTestScriptMaken_16641 extends Base {

	public String url = UtilMobile.getConfigValue("appUrl");
	

	 @Test (enabled=true, groups = {"Sanity","Regression"})
	  public void MarkenSlider_16641_Mobile() throws InterruptedException {
		  //Test case to verify that slider is working or not.
		 
		 getDriver().get(url+"marken");
		  Thread.sleep(3000);
		  UtilMobile.pagescroll(350);
		  int numberOfImagesInDefaultView = 1;

		  Thread.sleep(5000);
		  UtilMobile.sliderArrowsDefaultCase(MobileMarken.MarkenSliderPrevDisabled,MobileMarken.MarkenSliderNextActive);
		  UtilMobile.sliderArrows(MobileMarken.MarkenSliderImages, MobileMarken.MarkenSliderNextActive, MobileMarken.MarkenSliderPrevActive, MobileMarken.MarkenSliderNextDisabled,numberOfImagesInDefaultView);
		  
		 
	  }
	
	 @Test (enabled=true, groups = {"Sanity","Regression"})
	  public void ProductDropdown_16641_Mobile() throws InterruptedException {
		

		 
		    getDriver().get(url+"marken");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Product box is expanding or not");
			UtilMobile.pagescroll(500);
			boolean getstatus = UtilMobile.ProductDropdownListClick(MobileMarken.ProductDropdownArrow, MobileMarken.SeriesButton, "Dropdown" , MobileMarken.ProductUpArrow, MobileMarken.SeriesButtonText,"null", "null");
			if(getstatus){
				ExtentTestManager.getTest().log(LogStatus.PASS, "Product box arrow is working properly");
				Assert.assertTrue(getstatus, "Product box is working properly");
				
			}
			else{
				ExtentTestManager.getTest().log(LogStatus.FAIL, "Product box is not working properly");
				Assert.fail("Product box series button is not working properly");
			}
			
			
			 
	
	 }
	 
	 @Test (enabled=true, groups = {"Sanity","Regression"})
	  public void ProductSeriesButtonVerify_16641_Mobile() throws InterruptedException {
        
		 
		 getDriver().get(url+"marken");
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Verify In product box series button is displaying or not and text is displaying or not");
		 boolean getstatus =  UtilMobile.ProductDropdownListClick(MobileMarken.ProductDropdownArrow, MobileMarken.SeriesButton, "Button" , MobileMarken.ProductUpArrow, MobileMarken.SeriesButtonText, "null", "null");
		 if(getstatus){
				ExtentTestManager.getTest().log(LogStatus.PASS, "In product box series button and text is displaying");
				Assert.assertTrue(getstatus, "In product box series button and text is displaying");
				
			}
			else{
				ExtentTestManager.getTest().log(LogStatus.FAIL, "Product box series button is not working properly");
				Assert.fail("Product box series button is not working properly");
			}
			  
	 }
	 
	 
	 
	 @Test (enabled=true, groups = {"Sanity","Regression"})
	  public void ProductDetailButtonVerify_16641_Mobile() throws InterruptedException {
       
		
		 getDriver().get(url+"marken");
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Product button text is displaying or not");
		 boolean getstatus = UtilMobile.ProductDropdownListClick(MobileMarken.ProductDropdownArrow, MobileMarken.ProductButton, "Button" , MobileMarken.ProductUpArrow, MobileMarken.ProductButtonText, "null", "null");
		 if(getstatus){
				ExtentTestManager.getTest().log(LogStatus.PASS, "In product box series button and text is displaying");
				Assert.assertTrue(getstatus, "In product box product button and text is displaying");
				
			}
			else{
				ExtentTestManager.getTest().log(LogStatus.FAIL, "Product box product button is not working properly");
				Assert.fail("Product box product button is not working properly");
			}
			 
	 }

	 
	 
	 
	 @Test (enabled=true, groups = {"Sanity","Regression"})
	  public void ProductFilterDropdownVerify_16641_Mobile() throws InterruptedException {
      
		 
		 getDriver().get(url+"marken");
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Verify in product box filter dropdown is working or not");
		 boolean getstatus =  UtilMobile.ProductDropdownListClick(MobileMarken.ProductDropdownArrow, MobileMarken.ProductButton, "FilterArrow" , MobileMarken.ProductUpArrow, MobileMarken.ProductButtonText, MobileMarken.ProductFabricDownArrow, MobileMarken.ProductFabricUpArrow);
		 if(getstatus){
				ExtentTestManager.getTest().log(LogStatus.PASS, "In product box filter dropdown is working");
				Assert.assertTrue(getstatus, "In product box filter dropdown is working");
				
			}
			else{
				ExtentTestManager.getTest().log(LogStatus.FAIL, "In product box filter dropdown is not working");
				Assert.fail("In product box filter dropdown is not working");
			}
			  
	 }


}
