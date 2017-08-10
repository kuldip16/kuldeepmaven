package PageObjects;



import com.relevantcodes.extentreports.LogStatus;

import TestCases.Login;

import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.appUtilMobile;
import UtilityMobile.utilMobile;


public class OrderProcess extends BaseMobile {

	public static boolean status;
	public static String AgreeCheckboxXpath = "//div[@class = 'agree newcheckbox']/label";
	public static String finalcheckoutXpath = ".//*[@id='final_checkout']";
	public static String kalrnaIframe = "klarna-checkout-iframe";
	public static String klarnacheckbox = ".//*[@id='widget3']/div/span[1]";
	public static String submitKlarnaXpath = ".//*[@id='buy-button']";
    public static String klarnaFrameButton = "klarna-checkout-iframe";
  //button[@class='cui__buy-button buy-button is-enabled']
    public static String klarnaBestellung = "//button[@class='confirmation-action__order-details']";
    public static String klarnaFrameOrder = "klarna-fullscreen-iframe";
    public static String klarnaOrderId = "//*[@class='order-details-dialog__order-id']/p";
    public static String klarnaOrderAmount = "//span[@class='order-details-dialog__total-amount']";
    public static String orderidXpath = "//div[@class = 'orderid']";
    public static String paymentName = "//div[@id='payment-selector']/div";
    public static String RechnungXpath = ".//*[@id='payment-selector-invoice_-1__header']";
    public static String RatenkaufXpath = ".//*[@id='payment-selector-account_part_payment__header']";
    public static String NachnahmeXpath = ".//*[@id='payment-selector-external_nachnahme__header']";
    public static String VorkosseXpath = ".//*[@id='payment-selector-external_vorkasse__header']";
    public static String PaypalXpath = ".//*[@id='payment-selector-external_paypal__header']";
    public static String LastschriftXpath = ".//*[@id='payment-selector-elv_-1__header']";
    public static String CrditCardXpath = ".//*[@id='payment-selector-credit_card_-1__header']";
    
	
	public static boolean ordercreation(String orderelement) throws InterruptedException{
		
		
		
		   Login.loginTest();
		   appUtilMobile.navigateToProductDetailPage();
		   
	   	   utilMobile.clickevent(ProductDetail.addToCartXpath);
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on addToCart"); 
	       
	       utilMobile.clickevent(HomePage.menu);
	       utilMobile.clickevent(LeftNavigationMenu.cartXpath);
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Moved to cart page."); 
	       
	       utilMobile.clickevent(Cart.cartsubmitXpath);
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Navigating to shipping page."); 
	       
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Checkbox checking"); 
	       utilMobile.clickevent(AgreeCheckboxXpath);
	       Thread.sleep(2000);
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Naviagting to checkout page"); 
	       utilMobile.clickevent(finalcheckoutXpath);
	       Thread.sleep(12000);
	       utilMobile.switchToIframe(kalrnaIframe);
	       
	       utilMobile.clickevent(orderelement);
	       System.out.println(utilMobile.getText(orderelement));
	       //utilMobile.getelement(ordermethod, paymentName);
	      try{
	       if(utilMobile.getText(orderelement).contains("Nachnahme")){
	    	   System.out.println("Checkbox disappered");
	    	   Thread.sleep(5000);
			   driver.switchTo().defaultContent();
		       utilMobile.pagescroll(1000);
		       utilMobile.switchToIframe(kalrnaIframe);
			   ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on the buy button"); 
		       utilMobile.clickevent(submitKlarnaXpath);
		       driver.switchTo().defaultContent();
	    	   
	       }
	       else
	       {
		       ExtentTestManager.getTest().log(LogStatus.INFO, "Checkbox checking"); 
		       utilMobile.clickevent(klarnacheckbox);  
		       Thread.sleep(5000);
			   driver.switchTo().defaultContent();
		       utilMobile.pagescroll(700);
		       utilMobile.switchToIframe(kalrnaIframe);
			   ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on the buy button"); 
		       utilMobile.clickevent(submitKlarnaXpath);
		       driver.switchTo().defaultContent();
	         
	       }
	      }
	      catch(Exception e){
	    	  
	    	  System.out.println("Fail");
	    	  status = false;
	    	  
	      }
	       
		   
	       Thread.sleep(7000);
		   if(utilMobile.getText(orderelement).contains("Nachnahme")){
	    	   System.out.println("Payone order placed");
	       }
	       
		   else
	       {
	    	   utilMobile.switchToIframe(klarnaFrameOrder);
    		   
		       ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on the order confirmation page"); 
			   utilMobile.clickByXpath(klarnaBestellung);
			   ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the order id from confirmation recipt"); 
			   String orderId = utilMobile.getText(klarnaOrderId);
			   driver.switchTo().defaultContent();
			   Thread.sleep(4000);
			   
	       }
		   
		
		   ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on burgermenu"); 
		   utilMobile.clickevent(HomePage.menu);
		   
		   ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on mein konto link"); 
		   utilMobile.clickevent(LeftNavigationMenu.meinKontoXpath);
		   
		   ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on view history link"); 
		   utilMobile.clickevent(MeinKonto.OrderHistorylinkXpath);
		   Thread.sleep(5000);
		   
		   ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that order id created is exist on order history page"); 
		   //utilMobile.MatchElement(orderId , orderidXpath);
		
		   return status;
	}
	
}
