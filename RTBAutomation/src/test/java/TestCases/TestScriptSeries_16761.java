package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.Branches;
import PageObjects.Series;
import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class TestScriptSeries_16761 extends Base{
	
  @Test (enabled=false,groups = {"Sanity","Regression"})
  public void seriesCategorySlider() throws InterruptedException {
	  
	  driver.get("http://192.168.3.8/rtb/core/shop-frontoffice/series");

	  int numberOfImagesInDefaultView = 4;
	  
	  util.sliderArrowsDefaultCase(Series.seriesCategorySliderPrevDisabled,Series.seriesCategorySliderNextActive);
	  
	  util.sliderArrows(Series.seriesCategorySliderImages, Series.seriesCategorySliderNextActive, Series.seriesCategorySliderPrevActive, Series.seriesCategorySliderNextDisabled,numberOfImagesInDefaultView);
	  
  
  }
  
  
  @Test (enabled=true,groups = {"Sanity","Regression"})
  public void verifyServiceText_16761(){
	  
	  boolean matchExists = false;
	  driver.get("http://192.168.3.8/rtb/core/shop-frontoffice/series");
	  
	  matchExists = util.matchListOfText(Series.ourServices,util.getConfigValue("TestDataFile"), util.getConfigValue("SeriesSheet"),1);
	  
	  if(matchExists){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Services texts are correct.");
	  }else{
		  Assert.fail("One or more services texts are correct");
	  }
	  
  }
  
  
  @Test (enabled=true,groups = {"Sanity","Regression"})
  public void verifyServiceNdOffersText_16761(){
	  
	  boolean matchExists = false;
	  driver.get("http://192.168.3.8/rtb/core/shop-frontoffice/series");
	  
	  matchExists = util.matchListOfText(Series.ourServiceAndOffers,util.getConfigValue("TestDataFile"), util.getConfigValue("SeriesSheet"),0);
	  
	  if(matchExists){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Services and offers text are correct.");
	  }else{
		  Assert.fail("Services and offers text are incorrect.");
	  }
	  
  }
  
  
  @Test (enabled=true,groups = {"Sanity","Regression"})
  public void verifyServiceNdOffersHeading_16761(){
	  
	  boolean matchExists = false;
	  driver.get("http://192.168.3.8/rtb/core/shop-frontoffice/series");
	  
	  matchExists = util.matchListOfText(Series.offersHeading,util.getConfigValue("TestDataFile"), util.getConfigValue("SeriesSheet"),2);
	  
	  if(matchExists){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Services and offers heading are correct.");
	  }else{
		  Assert.fail("Services and offers heading are incorrect.");
	  }
	  
  }
  
  
}
