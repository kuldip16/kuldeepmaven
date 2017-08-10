package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import PageObjects.MobileCart;
import Utility.AppUtil;
import Utility.Base;
import Utility.ExtentTestManager;
import Utility.UtilMobile;


public class MobileTestScriptCart_16709 extends Base{
	
	@Test (enabled=false,groups = {"Sanity","Regression"})
	  public void verifyEmptyCartWithOutLogin_16709_Mobile(){
		  String expectedText = "Cart is Empty";
		  String actualText = null;
		  
		  UtilMobile.clickByXpath(MobileCart.cart);
		  actualText = UtilMobile.getText(MobileCart.emptyCartSection);
		  
		  if(actualText.equals(expectedText)){
			  ExtentTestManager.getTest().log(LogStatus.PASS, "Empty Cart section is present when no user is logged in and when no product is added to cart.");
		  }else{
			  Assert.fail("Empty cart section is missing when no product is added and when no user is logged in.");
		  }
	  }
	
	@Test (enabled=true,groups = {"Sanity","Regression"}) //Adding product to Cart step will be added later.
	  public void verifyItemRemovedFromCart_16709_Mobile() {
		  boolean status=false;
		  
		  UtilMobile.clickByXpath(MobileCart.cart);
		  
		  status = AppUtil.removeItemFromList(MobileCart.productsInCart, MobileCart.removeLinkOfProductInCart);
		  
		  if(status){
			  ExtentTestManager.getTest().log(LogStatus.PASS, "Product is getting removed from wishlist successfully.");
		  }else{
			  Assert.fail("There is an issue in removing product from wishlist.");
		  }
		  
	  }


   @Test (enabled=true,groups = {"Sanity","Regression"})  //Adding product to cart step will be added later.
     public void verifyAllItemsRemovalFromCart_16709_Mobile(){
	  
	    String actualEmptyListText = null;
	    String expectedEmptyListText = "Cart is Empty";
	  
	    UtilMobile.clickByXpath(MobileCart.cart);
	  
	    AppUtil.removeAllItemFromList(MobileCart.productsInCart, MobileCart.removeLinkOfProductInCart); 
	  
	    actualEmptyListText = UtilMobile.getText(MobileCart.emptyCartSection);
	  
	    if(expectedEmptyListText.equals(actualEmptyListText)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "All Products are getting removed from wishlist successfully.");
	    }else{
		  Assert.fail("There is an issue in removing all products from wishlist.");
	    }
    }

   
   @Test (enabled=true,groups = {"Regression"})
     public void verifyActionsText_16709_Mobile() throws InterruptedException{
 	  boolean matchExists = false;
 	  boolean matchExistOne = false;
 	  String expectedAppointmentText = "Termin";
 	  String appointmentText = null;
 	  
 	  UtilMobile.clickByXpath(MobileCart.cart);
 	  
 	  UtilMobile.pagescroll(1880);
 	  Thread.sleep(5000);
 	  appointmentText = UtilMobile.getText(MobileCart.appointmentAction);
 	  System.out.println("Appointment text is: "+appointmentText);
 	  
 	  if(appointmentText.equals(expectedAppointmentText)){
 		  ExtentTestManager.getTest().log(LogStatus.PASS, "Appointment text is correct.");
 		 matchExistOne = true;
 	  }else{
 		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Appointment text is incorrect.");
 	  }  
 	  
 	  
 	  matchExists = UtilMobile.matchListOfText(MobileCart.actionsText, UtilMobile.getConfigValue("TestDataFile"), UtilMobile.getConfigValue("CartSheet"),1); 
 	  
 	  if(matchExists && matchExistOne){
 		  ExtentTestManager.getTest().log(LogStatus.PASS, "Action icons texts are correct.");
 	  }else{
 		  Assert.fail("Action icons texts are incorrect.");
 	  }  
 	  
   }
   
   
   @Test (enabled=true,groups = {"Regression"})
   public void verifyBlankCoupanSubmit_16709_Mobile(){
 	  String expectedCoupanError = "Enter Coupon Code";
 	  String actualCoupanError = null;
 	  
 	  WebElement coupanSubmit;
 	  WebDriverWait wait=new WebDriverWait(getDriver(), 3);
 	  
 	  UtilMobile.clickByXpath(MobileCart.cart);
 	  
 	  UtilMobile.pagescroll(1800);
 	  coupanSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( MobileCart.coupanSubmit)));
 	  coupanSubmit.click();
 	  
 	  actualCoupanError = UtilMobile.getText(MobileCart.blankCoupanError);
 	  System.out.println("Actual error :"+actualCoupanError);
 	  
 	  if(actualCoupanError.equals(expectedCoupanError)){
 		  ExtentTestManager.getTest().log(LogStatus.PASS, "Coupan code error on blank submit is shown correctly.");
 	  }else{
 		  Assert.fail("Coupan code error on blank submit is incorrect.");
 	  }
   }
   
}
