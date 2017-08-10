package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.Branches;
import PageObjects.homePage;
import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class TestScriptBranches_16525 extends Base{
	
  
  @Test (enabled=false,groups = {"Sanity","Regression"})
  public void verifysalesSlider_16525() throws InterruptedException{
	  
	  driver.get("http://192.168.3.8/rtb/core/shop-frontoffice/filialen2");

	  int numberOfImagesInDefaultView = 1;
	  
	  util.sliderArrowsDefaultCase(Branches.salesSliderDisabledPrevArrow, Branches.salesSliderActiveNextArrow);
	  
	  util.sliderArrows(Branches.salesSlideImages, Branches.salesSliderActiveNextArrow, Branches.salesSliderActivePrevArrow, Branches.salesSliderDisabledNextArrow,numberOfImagesInDefaultView);
	  
	  

  }
  
  
  @Test (enabled=true,groups = {"Sanity","Regression"})
  public void verifyServiceText_16525(){
	  
	  boolean matchExists = false;
	  driver.get("http://192.168.3.8/rtb/core/shop-frontoffice/filialen2");
	  
	  matchExists = util.matchListOfText(Branches.ourServices,util.getConfigValue("TestDataFile"), util.getConfigValue("BranchesSheet"),1);
	  
	  if(matchExists){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Services texts are correct.");
	  }else{
		  Assert.fail("One or more services texts are correct");
	  }
	  
  }
  
  
  @Test (enabled=true,groups = {"Sanity","Regression"})
  public void verifyServiceNdOffersText_16525(){
	  
	  boolean matchExists = false;
	  driver.get("http://192.168.3.8/rtb/core/shop-frontoffice/filialen2");
	  
	  matchExists = util.matchListOfText(Branches.ourServiceAndOffers,util.getConfigValue("TestDataFile"), util.getConfigValue("BranchesSheet"),0);
	  
	  if(matchExists){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Services and offers text are correct.");
	  }else{
		  Assert.fail("Services and offers text are incorrect.");
	  }
	  
  }
  
  
  @Test (enabled=true,groups = {"Sanity","Regression"})
  public void verifyServiceNdOffersHeading_16525(){
	  
	  boolean matchExists = false;
	  driver.get("http://192.168.3.8/rtb/core/shop-frontoffice/filialen2");
	  
	  matchExists = util.matchListOfText(Branches.offersHeading,util.getConfigValue("TestDataFile"), util.getConfigValue("BranchesSheet"),2);
	  
	  if(matchExists){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Services and offers heading are correct.");
	  }else{
		  Assert.fail("Services and offers heading are incorrect.");
	  }
	  
  }
  
}
