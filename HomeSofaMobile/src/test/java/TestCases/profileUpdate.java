package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LeftNavigationMenu;
import PageObjects.MeinKonto;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.utilMobile;

import com.relevantcodes.extentreports.LogStatus;

public class profileUpdate {
  @Test
  public void updateProfile() {
	  String actualMessage =null;
	  String actualUpdatedPhoneVal = null;
	  String actualUpdatedCityVal = null;
	  boolean updateMessage=false;
	  
	  utilMobile.clickevent(HomePage.menu);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on left navigation menu.");
	  
	  utilMobile.clickevent(LeftNavigationMenu.loginLink);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on login link.");
	  
	  LeftNavigationMenu.login(utilMobile.getTestData("profileUpdateLogin"), utilMobile.getTestData("profileUpdateCurrentPassword"));
	  
	  utilMobile.clickevent(MeinKonto.personalInfoXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on personal information link.");
	  
	  MeinKonto.enterProfileDetails();
	  
	  actualMessage = utilMobile.getText(MeinKonto.successOnUpdateProfileXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Extracted success message.");
	  
	  if(utilMobile.getTestData("expectedTextOnUpdateProfile").equalsIgnoreCase(actualMessage)){
		  updateMessage=true;
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.ERROR, "Success message either incorrect or not displaying.");
	  }
	  
	  utilMobile.clickevent(MeinKonto.backToProfileOverviewXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Navigated back profile overvie page(Mein konto).");
	  
	  utilMobile.clickevent(MeinKonto.personalInfoXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on personal information link.");
	  
	  utilMobile.getText(MeinKonto.phoneXpath);
  }
}
