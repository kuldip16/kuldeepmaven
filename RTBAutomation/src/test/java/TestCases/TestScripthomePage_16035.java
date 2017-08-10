package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.homePage;
import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class TestScripthomePage_16035 extends Base {
	

	 @Test (enabled=false,groups = {"Sanity","Regression"})
	  public void salesBannerSlider_16035_Updated() throws InterruptedException{

		  int numberOfImagesInDefaultView = 1;
		  
		  util.pagescroll(2153); 
		  
		  util.sliderArrowsDefaultCase(homePage.previousDisabledArrowXpath, homePage.nextEnabledArrowXapth);
		  
		  util.sliderArrows(homePage.sliderImagesXpath, homePage.sliderNextArrowXpath, homePage.previousEnabledArrowXpath, homePage.nextdisabledArrowXpath,numberOfImagesInDefaultView);

	  }
	 
	 @Test (enabled = false ,groups = {"Sanity","Regression"})
	 public void matchHeaderCategoryLinkTexts(){
		 boolean matchExists = false;
		 String categorySofa = "Sofas";
		 String actualCategorySofa = null;
		 
		 
		 actualCategorySofa = util.getText(homePage.categorySofa) ;
		 matchExists = util.matchListOfText(homePage.categoryLinks, util.getConfigValue("TestDataFile"), util.getConfigValue("HeaderSheet"),0);
		 
		 if(categorySofa.equals(actualCategorySofa)){
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Sofa category link texts is correct.");
		 }else{
			 ExtentTestManager.getTest().log(LogStatus.FAIL, "Sofa category link texts is in correct.");
		 }
		 
		 if(matchExists){
			 ExtentTestManager.getTest().log(LogStatus.PASS, "All the Category link texts are correct.");
		 }else{
			 Assert.fail("One or more Category link texts are incorrect.");
		 }
	 }
	 
	 
	 @Test (enabled=true,groups = {"Sanity","Regression"})
	 public void blankSearchErrorMessage(){
		 String errorMessage = null;
		 String expectedErrorMessage = "Enter Value";
		 
		 util.clickByXpath(homePage.suchen);
		 
		 errorMessage = util.getText(homePage.blankSearchError);
		 
		 if(errorMessage.equals(expectedErrorMessage)){
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Correct Validation message is thrown on blank search.");
		 }else{
			 ExtentTestManager.getTest().log(LogStatus.FAIL, "Incorrect validation message thrown on blank search.");
		 }
		 
	 }
	 
	 
	 @Test (enabled=true,groups = {"Sanity","Regression"})
	 public void blankEmailErrorMessage(){
		 String errorMessage = null;
		 String expectedErrorMessage = "Enter valid email";
		 
		 util.clickByXpath(homePage.footerEmailSubmitButton);
		 
		 errorMessage = util.getText(homePage.footerEmailError);
		 
		 if(errorMessage.equals(expectedErrorMessage)){
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Correct Validation message is thrown on blank email submit.");
		 }else{
			 ExtentTestManager.getTest().log(LogStatus.FAIL, "Incorrect validation message is thrown on blank email submit.");
		 }
		 
	 }
	 
	 
	 @Test (enabled=false,groups = {"Sanity","Regression"})
	 public void matchFooterLinkTexts(){
		 boolean matchExists = false;
		 
         matchExists = util.matchListOfText(homePage.footerLinks, util.getConfigValue("TestDataFile"), util.getConfigValue("FooterSheet"),0);
		 
		 
		 if(matchExists){
			 ExtentTestManager.getTest().log(LogStatus.PASS, "All the footer link texts are correct.");
		 }else{
			 Assert.fail("One or more Footer link texts are incorrect.");
		 }
		 
	 }
	 
	 
	 
}
