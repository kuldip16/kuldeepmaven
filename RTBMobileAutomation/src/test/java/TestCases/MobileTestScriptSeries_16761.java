package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import PageObjects.MobileSeries;
import Utility.Base;
import Utility.ExtentTestManager;
import Utility.UtilMobile;

public class MobileTestScriptSeries_16761 extends Base {
	
	 @Test (enabled=true,groups = {"Sanity","Regression"})
	  public void seriesCategorySlider_16761_Mobile() throws InterruptedException {
		  String url = UtilMobile.getConfigValue("appUrl");
		  
		  getDriver().get(url+"series");
		  
		  Thread.sleep(3000);
		  
		  UtilMobile.pagescroll(480);

		  int numberOfImagesInDefaultView = 1;
		  UtilMobile.clickByXpath("//div[@class='swiper-container series-slider swiper-container-horizontal']/div[@class='swiper-button-next swiper-button-white fa fa-chevron-left']");
		  
		  //UtilMobile.sliderArrowsDefaultCase(MobileSeries.seriesCategorySliderPrevDisabled,MobileSeries.seriesCategorySliderNextActive);
		  
		  //UtilMobile.sliderArrows(MobileSeries.seriesCategorySliderImages, MobileSeries.seriesCategorySliderNextActive, MobileSeries.seriesCategorySliderPrevActive, MobileSeries.seriesCategorySliderNextDisabled,numberOfImagesInDefaultView);
		  
		 
	  }
	  
	  
	  @Test (enabled=false,groups = {"Sanity","Regression"})
	  public void verifyServiceText_16761_Mobile(){
		  
		  boolean matchExists = false;
		  getDriver().get("http://192.168.3.8/rtb/core/shop-frontoffice/series");
		  
		  matchExists = UtilMobile.matchListOfText(MobileSeries.ourServices,UtilMobile.getConfigValue("TestDataFile"), UtilMobile.getConfigValue("SeriesSheet"),1);
		  
		  if(matchExists){
			  ExtentTestManager.getTest().log(LogStatus.PASS, "Services texts are correct.");
		  }else{
			  Assert.fail("One or more services texts are incorrect");
		  }
		  
	  }
	  
	  
	  @Test (enabled=false,groups = {"Regression"})
	  public void verifyServiceNdOffersText_16761_Mobile(){
		  
		  boolean matchExists = false;
		  getDriver().get("http://192.168.3.8/rtb/core/shop-frontoffice/series");
		  
		  matchExists = UtilMobile.matchListOfText(MobileSeries.ourServiceAndOffers,UtilMobile.getConfigValue("TestDataFile"), UtilMobile.getConfigValue("SeriesSheet"),0);
		  
		  if(matchExists){
			  ExtentTestManager.getTest().log(LogStatus.PASS, "Services and offers text are correct.");
		  }else{
			  Assert.fail("Services and offers text are incorrect.");
		  }
		  
	  }
	  
	  
	  @Test (enabled=false,groups = {"Regression"})
	  public void verifyServiceNdOffersHeading_16761_Mobile(){
		  
		  boolean matchExists = false;
		  getDriver().get("http://192.168.3.8/rtb/core/shop-frontoffice/series");
		  
		  matchExists = UtilMobile.matchListOfText(MobileSeries.offersHeading,UtilMobile.getConfigValue("TestDataFile"), UtilMobile.getConfigValue("SeriesSheet"),2);
		  
		  if(matchExists){
			  ExtentTestManager.getTest().log(LogStatus.PASS, "Services and offers heading are correct.");
		  }else{
			  Assert.fail("Services and offers heading are incorrect.");
		  }
		  
	  }
}
