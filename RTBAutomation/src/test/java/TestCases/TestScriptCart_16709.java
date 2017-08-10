package TestCases;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.Cart;
import PageObjects.homePage;
import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;


public class TestScriptCart_16709 extends Base {
	
  @Test (enabled=false,groups = {"Sanity","Regression"})
  public void verifyEmptyCartWithOutLogin_16709() {
	  String expectedText = "Cart is Empty";
	  String actualText = null;
	  
	  util.clickByXpath(Cart.cart);
	  actualText = util.getText(Cart.emptyCartSection);
	  
	  if(actualText.equals(expectedText)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Empty Cart section is present when no user is logged in and when no product is added to cart.");
	  }else{
		  Assert.fail("Empty cart section is missing when no product is added and when no user is logged in.");
	  }
  }
  
  
  @Test (enabled=false,groups = {"Sanity","Regression"})
  public void verifyRoundIconsText_16709(){
	  boolean matchExists = false;
	  util.clickByXpath(Cart.cart);
	  
	  matchExists = util.matchListOfText(Cart.blackIconsText, util.getConfigValue("TestDataFile"), util.getConfigValue("CartSheet"),0);
	  
	  if(matchExists){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Black icons texts are correct.");
	  }else{
		  Assert.fail("Black icons texts are incorrect.");
	  }
	  
  }
  
  
  @Test (enabled=false,groups = {"Sanity","Regression"})
  public void verifyActionsText_16709(){
	  boolean matchExists = false;
	  String expectedAppointmentText = "Termin vereinbaren";
	  String appointmentText = null;
	  
	  util.clickByXpath(Cart.cart);
	  
	 
	  
	  appointmentText = util.getText(Cart.appointmentAction);
	  
	  if(appointmentText.equals(expectedAppointmentText)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Appointment text is correct.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.ERROR, "Appointment text is in;correct.");
	  }  
	  
	  
	  matchExists = util.matchListOfText(Cart.actionsText, util.getConfigValue("TestDataFile"), util.getConfigValue("CartSheet"),1); 
	  
	  if(matchExists){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Action icons texts are correct.");
	  }else{
		  Assert.fail("Action icons texts are correct.");
	  }
	  
	  
  }
  
  
  @Test (enabled=true,groups = {"Sanity","Regression"})
  public void verifyBlankCoupanSubmit(){
	  String expectedCoupanError = "Enter Coupon Code";
	  String actualCoupanError = null;
	  
	  WebElement coupanSubmit;
	  WebDriverWait wait=new WebDriverWait(driver, 3);
	  
	  util.clickByXpath(Cart.cart);
	  coupanSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( Cart.coupanSubmit)));
	  coupanSubmit.click();
	  
	  actualCoupanError = util.getText(Cart.blankCoupanError);
	  System.out.println("Actual error :"+actualCoupanError);
	  if(actualCoupanError.equals(expectedCoupanError)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Coupan code error on blank submit is shown correctly.");
	  }else{
		  Assert.fail("Coupan code error on blank submit is incorrect.");
	  }
  }
  
  
  
  
}
