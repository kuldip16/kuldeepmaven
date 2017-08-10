package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.KES;
import Utility.Base;
import Utility.ExtentTestManager;

import Utility.util;

public class TestScriptKES_16498 extends Base {
		
	  @Test (enabled=false,groups = {"Sanity","Regression"})
	  public void CategoryPageSlider() throws InterruptedException {
		  
		  driver.get("http://localhost/rtb/core/shop-frontoffice/kategorie/sofas");

		  int numberOfImagesInDefaultView = 4;
		  
		  util.sliderArrowsDefaultCase(KES.categorieSliderLeftArrowDisabled,KES.categorieSliderRightArrow);
		  
		  util.sliderArrows(KES.categorieSliderImages, KES.categorieSliderRightArrow, KES.categorieSliderLeftArrow, KES.categorieSliderRightArrowDisabled, numberOfImagesInDefaultView);
		  
			  
	  }
	  
	  
	  @Test (enabled=false,groups = {"Sanity","Regression"})
	  public void CategoryProductHoverSeriesButton() throws InterruptedException {
		  
		  driver.get("http://localhost/rtb/core/shop-frontoffice/kategorie/sofas");
		  Thread.sleep(2000);
		  util.MatchButtonTextOnTheProduct(KES.categorieProduct,  KES.ProductToTheSeriesButton, KES.productButton1);
		  
		  
		
			  
	  }
	  
	  @Test (enabled=false,groups = {"Sanity","Regression"})
	  public void CategoryProductHoverProductButton() throws InterruptedException {
		  
		  driver.get("http://localhost/rtb/core/shop-frontoffice/kategorie/sofas");
		  Thread.sleep(2000);
		  util.MatchButtonTextOnTheProduct(KES.categorieProduct,  KES.ProductToTheProductButton, KES.productButton2);
	  }
	
	  
	 
	  @Test (enabled=true,groups = {"Sanity","Regression"})
	  public void CategoryPageAllProductHoverThumbnailSlider() throws InterruptedException {
		  
		  driver.get("http://localhost/rtb/core/shop-frontoffice/kategorie/sofas");
		 Thread.sleep(2000);
		 util.pagescroll(750);
		 int numberOfImagesInDefaultView = 4;
	     util.AllProductHoverThumbnailSlider(numberOfImagesInDefaultView, KES.productRows, KES.productsliderthumnails, KES.products, KES.ProductThumbnailUpArrow, KES.ProductThumbnailDownArrow, KES.ProductThumbnailUpArrowDisabled, KES.ProductThumbnailDownArrowDisabled);
	  
	  
	  }
			 
}

             	   
