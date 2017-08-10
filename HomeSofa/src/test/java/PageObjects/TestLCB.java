package PageObjects;

import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utility.Base;

public class TestLCB{	
	
	 
	//public FirefoxDriver driver = new FirefoxDriver();
	 //public Webdriver driver;
    //*********************Homepage*****************************************************************
	   
	//homepage blocks
	       public static String topnavblk_e = "//div[@class = 'banner header-top']/div";
	       public static String categoryblk_e = "//div[@class = 'main-navigation']";
	       public static String logoheaderblk_e = "//div[@class = 'nav']/div";
	       public static String topcategoryblk_e = "//div[@class = 'nav-wrap']/div[2]";
	      // public static String teaserblk_e = "2]";
	       public static String teaserblk_e(String str){
		    	String a = "//descendant::div[@class = 'teaser_row_content'][";
		    	int b = Integer.parseInt(str);
		    	String c = "]";
		    	String d=a+b+c;
		    	return d;
		    }
	
	     //logo
	    public static String logo_e = ".//*[@id='header_logo']/a/img";
	    public static String exp_homep_title = "Homesofa.de - Meine Couch - homesofa";
	    
	    //category elements
	    public static String Ecksofas_Wohnlandschaften_e = "//a[@title ='Ecksofas & Wohnlandschaften']";
	    public static String Einzelsofas_e = "//a[@title ='Einzelsofas']";
	    public static String Sessel_Hocker_e = "//a[@title ='Sessel & Hocker']";
	    
	    //category names expected page title and link names
	    public static String exp_Ecksofas_Wohnlandschaften_link = "Ecksofas & Wohnlandschaften";
	    public static String exp_Ecksofas_Wohnlandschaften_ptitle = "Ecksofas & Wohnlandschaften - homesofa";
	    public static String exp_Einzelsofas_link = "Einzelsofas";
	    public static String exp_Einzelsofas_ptitle = "Einzelsofas - homesofa";
	    public static String exp_Sessel_Hocker_link = "Sessel & Hocker";
	    public static String exp_Sessel_Hocker_ptitle = "Sessel & Hocker - homesofa";
	    
	    //mein konto, service, cart elements
	    public static String Mein_konto_e = "//a[@class = 'login']/span";
	    public static String service_e = "//a[@href= 'http://qa1.homesofa.de/content/25-service']/span";
	    public static String Warenkorb_e = "//a[@rel = 'nofollow']/b";
	    public static String wishlistcounter_e = "total_fav"; //id
	    public static String wishlistcounter2_e ="//span[@class='itemNo jq-total_fav']";
	    
	    
	    //Icons
	    public static String wishlist_counter_e = "total_fav"; //id
	    public static String cart_counter_e = "//span[@class = 'itemNo ajax_cart_quantity']";
	    
	    //Expected links and page title Mein Konto menu before login
	    public static String exp_mein_konto_link = "Mein Konto";
	    public static String exp_mein_konto_ptitle = "Authentifizierung - homesofa";
	    public static String exp_service_link = "Service";
	    public static String exp_service_ptitle = "Service - homesofa";
	    public static String exp_warenkorb_link = "Warenkorb";
	    public static String exp_warenkorb_ptitle = "Bestellung - homesofa";
	    public static String exp_meinkonto_ptitle = "Mein Konto - homesofa";
	    
	    //top seller categories elements
	    public static String Ecksofa_ts_e = "//descendant::a[@href='http://qa1.homesofa.de/4-ecksofa'][3]";
	    public static String Schlafsofa_ts_e = "//descendant::a[@href='http://qa1.homesofa.de/16-schlafsofa'][3]" ;
	    public static String Bigsofas_ts_e = "//descendant::a[@href='http://qa1.homesofa.de/8-bigsofas'][3]";
	    public static String Wohnlandschaft_ts_e = "//descendant::a[@href='http://qa1.homesofa.de/14-wohnlandschaft'][3]";
	    public static String Sitzer3_ts_e = "//descendant::a[@href='http://qa1.homesofa.de/12-3-sitzer'][3]";
	    public static String Ohrensessel_ts_e = "//descendant::a[@href='http://qa1.homesofa.de/18-ohrensessel'][3]";
	    
	    //sub categories elements of top navigation
	    public static String ecksofa_sc_e = "//a[@title = 'Ecksofa']";
	    public static String ecksofa_sc_name = "Ecksofa";
	    
	    public static String wohnlandschaft_sc_e = "//a[@title = 'Wohnlandschaft']";
	    public static String wohnlandschaft_sc_name = "Wohnlandschaft";
	    
	    
	    public static String relaxliegen_sc_e = "//a[@title = 'Relaxliegen']";
	    public static String schlafsofa_sc_e = "//a[@title = 'Schlafsofa']";
	    public static String sitzer2_sc_e = "//a[@title = '2-Sitzer']";
	    public static String sitzer2_sc_name = "2-Sitzer";
	    
	    public static String sitzer3_sc_e = "//a[@title = '3-Sitzer']";
	    public static String bigsofas_sc_e = "//a[@title = 'Bigsofas']";
	    public static String bigsofas_sc_name = "Bigsofas";
	    
	    public static String loungesessel_sc_e = "//a[@title = 'Loungesessel']";
	    public static String xxl_sessel_sc_e = "//a[@title = 'XXL-Sessel']";
	    public static String chesterfieldsessel_sc_e = "//a[@title = 'Chesterfieldsessel']";
	    public static String ohrensessel_sc_e = "//a[@title = 'Ohrensessel']";
	    public static String hocker_sc_e = "//a[@title = 'Hocker']";
	    
	    //Top navigation elements
	    public static String zahlungsmethoden_tn_e = "//a[@href='http://qa1.homesofa.de/content/28-zahlungsmoeglichkeiten']";
	    public static String tolle_sofas_tn_e = "//a[@href='http://qa1.homesofa.de/content/27-tolle-sofas-faire-preise']";
	    public static String lieferung_tn_e = "//a[@href='http://qa1.homesofa.de/content/24-lieferung']";
	  	     
	    //Mein Konto menu links before login/after elements
	    public static String login_e = "//a[@title='Ihren Kundenbereich anzeigen']";
	    public static String signup_e = "descendant::a[@title = 'Ihren Kundenbereich anzeigen'][2]";
	    public static String wishlist_e = "//a[@title = 'My wishlists']";
	    public static String order_e = "//a[@title = 'Orders']";
	    public static String user_info_e = "//a[@title = 'Information']";
	    public static String signout_e = "//a[@title = 'Abmelden']";
	    public static String username_e = "//a[@class='account']/span";
	 
	    
	    //*********************Registration/Login Page*****************************************************************	    
	    
	    //Sign up fields elements on login page
	    public static String firstname_e = "customer_firstname";  //id
	    public static String lasttname_e = "customer_lastname";  //id
	    public static String email_signup_e = "//descendant::input[@id='email'][1]";
	    public static String pwd_signup_e = "//descendant::input[@type='password'][1]";
	    public static String submit_signup_e = "submitAccount";  //id
	    public static String forgotpassword_link_e = "//descendant::a[@rel='nofollow'][4]";
	    
	   
	  //*********************Personal Info Page*****************************************************************	
	    
	    //sign up personal information fields elements
	    public static String company_e = "company"; //id
	    public static String addresslist_e = "//div[@class = 'pac-container pac-logo']/div[1]";
	    public static String address_pi_e = "address1"; //id
	    public static String post_code_pi_e = "postcode"; //id
	    public static String city_pi_e = "city"; //id
	    public static String phone_pi_e = "phone"; //id
	    public static String old_pwd_pi_e = "old_passwd"; //id
	    public static String new_pwd_pi_e = "passwd"; //id
	    public static String cnfrm_new_pwd_pi_e = "confirmation"; //id
	    public static String continue_pi_e = "//button[@name='submitIdentity']";
	    public static String newpasswordnotmatch_e = "//div[@class='alert alert-danger']/li";
	    public static String PersonalInfoUpdateMsg_e =  "//p[@class='alert alert-success']";
	    public static String phone_signup_e = "//input[@id='phone']";
	    public static String DOB_day_e = "//select[@id='days']";
	    public static String DOB_month_e = "//select[@id='months']";
	    public static String DOB_year_e = "//select[@id='years']";
	    public static String salutation_Mr_e = "//div[@class = 'form-group clearfix']/div[2]";
	    public static String salutation_Mrs_e = "//div[@class = 'form-group clearfix']/div[3]";
	  
	    //Validation messages on persoanl info page
	    public static String newpasswordnotmatch =  "stimmen nicht";
	    public static String PersonalInfoUpdateMsg =  "Daten wurden aktualisiert";
	    
	  //*********************Forgot Password Page*****************************************************************	
	   
	    
	    
	    //forgot password page elements
	    public static String ForgotPwd_email_e = "//input[@id='email']";
	    public static String ForgotPwd_submit_e = "//descendant::button[@type='submit'][2]";
	    public static String ForgotPwd_backbtn_e = "//a[@class='btn btn-default button button-medium back-to-auth']";
	    public static String wrongemailvalidationmsg_e = "//div[@class='alert alert-danger']/li";
	    public static String successemailvalidationmsg_e = "//p[@class='alert alert-success']";
	    
	    //forgot password page title text
	    
	    public static String ForgotPwd_ptitle = "Kennwort vergessen";
	    public static String wrongemailvalidationmsg = "Unter dieser E-Mail-Adresse ist kein Account gespeichert";
	    public static String successemailvalidationmsg = "Eine Bestätigungsmail ist an Ihre E-Mail-Adresse gesendet worden:";
	    
	    
	  //*********************My Account Page*****************************************************************	
	    
	    //my account page elements
	    public static String account_orderhistory_e = "//a[@title = 'Bestellungen']/span";
	    public static String account_information_e = "//a[@title = 'Informationen']/span";
	    public static String account_voucher_e = "//a[@title = 'Gutscheine']/span";
	    public static String account_mywishlist_e = "//a[@title = 'Mein Wunschzettel']/span";
	    	
	
	    //*********************Login Page*****************************************************************	
	    
	    //login page, login fields elements
	    public static String email_l_e = "//input[@class='is_required validate account_input form-control']";
	    public static String pwd_l_e = "//descendant::input[@type='password'][2]";
	    public static String login_submit_e = "//button[@class='button btn btn-default button-medium']";
	   	      
	   
	  //*********************Mein Konto links after user is login*****************************************************************	
	    //Mein Konto menu links after login
	    public static String exp_wishlist_link = "Mein Wunschzettel";
	    public static String exp_wishlist_ptitle = "homesofa";
	    public static String exp_order_link = "Meine Bestellungen";
	    public static String exp_order_ptitle = "Bestellungsverlauf";
	    public static String exp_personalinfo_link = "Mein Kundenprofil";
	    public static String exp_personalinfo_ptitle = "Kennung";
	    public static String exp_signout_link = "Abmelden";
	    
	    
	  //*********************Footer Elements*****************************************************************	
	    //footer links elements
	    public static String footer_order_e = "//a[@href= '/bestellungsverlauf']";
	    public static String footer_refund_e = "//a[@href= '/bestellschein']";
	    public static String footer_personalinfo_e = "//a[@href= '/kennung']";
	    public static String footer_voucher_e = "//a[@href= '/discount']";
	    public static String footer_delivery_e = "//a[@href= '/content/24-lieferung']";
	    public static String footer_warranty_e = "//a[@href= '/content/29-garantie-reparatur']";
	    public static String footer_entrainment_e = "//a[@href= '/content/30-mitnahme-entsorgung']";
	    public static String footer_faq_e = "//a[@href= '/content/9-haeufig-gestellte-fragen']";
	    public static String footer_tips_e = "//a[@href= '/content/14-generelle-informationen-']";
	    public static String footer_contact_e = "//a[@href= '/kontaktieren-sie-uns']";
	    public static String footer_AGB_e = "//a[@href= '/content/6-impressum-und-agb']";
	    public static String footer_data_protection_e = "//a[@href= '/content/7-datenschutz']";
	    public static String footer_payments_e = "//a[@href= '/content/28-zahlungsmoeglichkeiten']";
	    
	    //footer links expected text
	    public static String exp_footer_order_link = "Ihre Bestellungen";
	    public static String exp_footer_refund_link = "Ihre R�ckverg�tung";
	    public static String exp_footer_personalinfo_link = "Ihre persönlichen Daten";
	    public static String exp_footer_voucher_link = "Ihre Gutscheine";
	    public static String exp_footer_delivery_link = "Lieferung";
	    public static String exp_footer_warranty_link = "Garantie & Reparatur";
	    public static String exp_footer_entrainment_link = "Mitnahme und Entsorgung";
	    public static String exp_footer_faq_link = "Häufig gestellte Fragen";
	    public static String exp_footer_tips_link = "Pflegetipps";
	    public static String exp_footer_contact_link = "Kontakt";
	    public static String exp_footer_AGB_link = "AGB & Impressum";
	    public static String exp_footer_data_protection_link = "Datenschutz";
	    public static String exp_footer_payments_link = "Zahlungsarten";	    

	    //footer links page title
	    public static String exp_refund_ptitle = "Bestellungsverlauf";
	    public static String exp_footer_voucher_ptitle ="Ihre Gutscheine";
	    public static String exp_footer_delivery_ptitle ="Lieferung";
	    public static String exp_footer_warranty_ptitle = "Garantie";
	    public static String exp_footer_entrainment_ptitle = "Mitnahme & Entsorgung";
	    public static String exp_footer_faq_ptitle = "gestellte Fragen";
	    public static String exp_footer_tips_ptitle = "Generelle Informationen";
	    public static String exp_footer_contact_ptitle = "Kontaktieren Sie uns";
	    public static String exp_footer_AGB_ptitle = "Impressum und AGB";
	    public static String exp_footer_data_protection_ptitle = "Datenschutz";
	    public static String exp_footer_payments_ptitle = "Zahlungs";	
	    
	  
	  //*********************Product Page*****************************************************************	
	    //Product page
	    public static String addtocart_e = "addtocart_btn"; //id
	    public static String addtowishlist = "//div[@onclick='addFav();']";
	    public static String removewishlist_e = "//div[@class = 'wishlist favoriteproducts_block_extra_remove active']";
	    public static String productname_e = "//h1[@itemprop = 'name']";
	    public static String productcategoryname_e = "adp_category_name"; //id
	    public static String price_adp_e = ".//*[@id='our_price_display']";
	    public static String fabricsample_e = "//a[@class = 'fabric-hd']";
	    public static String fabricsample_text = "Kostenlose Stoffmuster bestellen";
	    public static String Schlaffunktion_Bettkasten_funk_e = "//div[@class = 'funk-tt']//label[@for ='func_cong_chkbx_17']";
	    public static String selectedFabric_e = "//a[@class='color_pick selected']/img";
	    public static String selecteddirection_e = "//div[@class = 'direction-entt selected']";
	    public static String Schlaffunktion_Bettkasten_price_e = "//div[@class = 'funk-tt']//label[@for ='func_cong_chkbx_17']/span[2]";
	    
	  //*********************Modal Fabric Window*****************************************************************	
	    
	    public static String fabricmodalwindowheader_e = "//div[@class = 'modal-header']/div";
	    public static String fabricwindow_e = "//div[@class = 'fancybox-skin']";
	    public static String weiter_e = "//a[@id='modelstep1']/span";
	    public static String weiter_2_e = "//a[@id='modelstep2']/span";
	    public static String nofabricvalidationmsg_e = "//div[@class='error-fabric']/span";
	    public static String nofabricvalidationmsg_text = "Sie einen Deckel"; 
	    public static String modalwindow_fabric_e = "//div[@class = 'centerckeckbox jq-fabric-click fabric-image']/img"; 
	    public static String thankyoumsg_e= "//p[@class='textmodal']";
	    public static String thankyoumsg_text= "Vielen Dank";
	    public static String modalwindow_fabric_p2_e = "//div[@id = 'imagearea']/img";
	   
	  //*********************Call Back Window*****************************************************************	
	     
	    public static String callbackfooterbtn_e = "//descendant::div[@id =  'jq-callback_popup_cart'][2]";
	    public static String callbackwindow_e = "//div[@class = 'fancybox-skin']";
	    public static String callbackdropdown_e = "//select[@name='call_time']";
	    public static String callbackdropdown2_e = "//select[@id='call_time']";
	    public static String submitbutton_e = "//div[@id='htmlvar_divBtn']/div[1]";
	    public static String validationmsg_e = "//div[@id='htmlvar_divError']";
	    public static String validationmsg_text = "Bitte geben Sie ihre Telefonnummer an";
	    public static String callback_phnofield_e = "//input[@id='htmlvar_phone_number']";
	    public static String callbackTQmsg_e = "//div[@class= 'callb-main-tt']";
	    public static String callbackTQmsg2_e = "//div[@id='htmlvar_divResponse']/div";
	    public static String callbackTQmsg_text = "Vielen Dank";
	    public static String callbackquesfield_e = "//textarea[@id ='htmlvar_question']";
	    public static String callbackquesfield2_e = "//textarea[@id='question']";
	    public static String closecallbackbtn_e = "//div[@class = 'close-btn']";
	    public static String ADP_callbackbtn_e = "//div[@id='jq-callback_popup']/div";
	    public static String Short_callbackoverlay_e = ".//*[@id='page']/div[3]";
	    
	 
	  //*********************Modal Cart Window*****************************************************************	
	    //product page cart popup
	    public static String submitcart_e = "//a[@name='submitAddress']";
	    public static String functiondata_e = "//div[@class = 'prd-funktionen'][1]";
	    public static String subtottal_e = "//div[@class='right-dtl']";
	    public static String backbutton_e = "//a[@class='back-btn back-arrow']";
	    public static String popup_product_name_e = "//div[@class='cart-product-name']";
	    public static String popup_product_name_spefc(String str){
	    	String a = "//div[@class='cart-product-name'][";
	    	int b = Integer.parseInt(str);
	    	String c = "]";
	    	String d=a+b+c;
	    	return d;
	    }
	    public static String popup_product_price_e = ".//*[@class='cart-product-container']//span[@class='price']";
	    public static String popup_product_price_spefc(String str){
	    	String a = ".//*[@class='cart-product-container']//span[@class='price'][1][";
	    	int b = Integer.parseInt(str);
	    	String c = "]";
	    	String d=a+b+c;
	    	return d;
	    }
	    
	    
	    
	    //User details
	    public static String username_data = "nitin.sahni@webvirtue.com";
	    public static String password_data ="testing123"; 
	    
	    //*********************Cart Page*****************************************************************	
	    public static String cart1stproductname_e = "//descendant::a[@class = 'product-view-ga ga-cart-product ga-product-list'][1]";
	    public static String cart1stproductfabricname_e = "//descendant::div[@class='cart_cover_info'][1]";
	    public static String cart1stproductpricename_e = "//descendant::span[@class ='price'][1]"; 
	    public static String cartqtyinc1stproduct_e = "//descendant::i[@class = 'fa fa-plus'][1]";
	    public static String cartqtydec1stproduct_e = "//descendant::i[@class = 'fa fa-minus'][1]";
	    public static String prd_totalprice_e = "//descendant::div[@class = 'clm last prc-ttl']/h3";
	    public static String prdqtycounter_e = "//span[@class= 'quantity-text']/span";
	    public static String productaddedtime_e = "//descendant::div[@class='cart-prd-added'][1]";
	    public static String alertmesg = "Möchten Sie das Produkt wirklich entfernen?";
	    public static String shippingprice_e = "//div[@id='total_shipping']";
	    public static String totalpriceincldship_e = "//span[@id='total_price']";
	    public static String addservice_e = "//div[@class = 'qty']/ul/li[3]";
	    public static String serviceprice_e = "//descendant::div[@class='price'][2]";
	    public static String emptycartpage_e = "//div[@id = 'center_column']/p";
	    public static String submitcartpage_e = "//button[@class = 'button btn btn-default standard-checkout button-medium checkout-step1']";
	    
	    
	  //*****************************Shipping Page**********************************************************
	    
	    public static String checkBoxTerms = ".//*[@id='cgv']";
        public static String finalSubmit = ".//*[@id='final_checkout']";
        public static String kalrnaIframe = "klarna-checkout-iframe";
        public static String paymentByNachname = "//descendant::span[@class='cui__checkbox payment-selector-entity__checkbox'][2]"; 
        public static String buyButton = ".//*[@id='buy-button']";
        public static String referenceId = "//div[@class='padding-lr33']/p[1]/i/b";
        public static String thankYou = "//*[@class='page-subheading']";
        public static String OrderSummary = ".//*[@id='cart_summary']/tfoot/tr";
        public static String checkOrderHistory = "//div[@class='padding-lr33']/p[3]/a";
        public static String headingshippingpage = ".//*[@id='center_column']/h1";
        
	    
	    //*********************WishlistPage*****************************************************************	
	    	    
	    //wishlist page
	    public static String productnamelist = "//span[@class='nw-prd-tt']";
	    public static String emptywishlisticon_e = "//div[@class='empty-wislist-icon']";
	   // public static String emptywishlisticon_e = "//descendant::img[@class='replace-2x img-responsive'][";
	     public static String Topsellerwishlistproductimg_e(String str){
	    	String a = "//descendant::img[@class='replace-2x img-responsive'][";
	    	int b = Integer.parseInt(str);
	    	String c = "]";
	    	String d=a+b+c;
	    	return d;
	    }
	    public static String Topsellerwishlistproductname_e(String str){
	    	String a = "//descendant::span[@class='nw-prd-tt'][";
	    	int b = Integer.parseInt(str);
	    	String c = "]";
	    	String d=a+b+c;
	    	return d;
	    }
	    public static String product_e(String str){
	    	String a = "//descendant::img[@class='replace-2x img-responsive product-click-view'][";
	    	int b = Integer.parseInt(str);
	    	String c = "]";
	    	String d=a+b+c;
	    	return d;
	    }
	    
	    
	    //*********************Search Page*****************************************************************
	    public static String SearchBox_e = "//input[@id = 'search_query_top']";
	    public static String joliesearchwindow_e = "//body[@class = 'index hide-left-column hide-right-column lang_de']/ul";
        public static String searchternheader_e = "//span[@class = 'jolisearch-title']/span";
        public static String joliesearchproductlist_e = "//div[@class = 'Products']//span[@class = 'jolisearch-name']";
	    public static String productimpression_e = "//body[@class = 'index hide-left-column hide-right-column lang_de']/ul//div[@class = 'product-impression']";
	    public static String moreresult_e = "//a[@class = 'more-results']";
	    public static String searchheadline_e = "//div[@class = 'search-headline']/span";
	    public static String filteroptions_e = "//div[@class='fltr-blk clearfix']";
	    
	    
	  //*********************Category Page*****************************************************************
	    
	    public static String number_element_e = "//descendant::span[@class = 'medium'][2]";
	    public static String element_48_e = "//a[@href='http://qa1.homesofa.de/14-wohnlandschaft?p=1&n=48']";
	    
	    
	    //********************************mailinitor**********************************************************
	    public static String emailField = "//input[@id='inboxfield']";
        public static String inboxEmail = "//descendant::div[contains(@id,'row_public')][1]";
        public static String emails = "//descendant::div[contains(@id,'row_public')]";
        public static String submitMailinator = "//button[@class='btn btn-dark']";
        public static String pricaValueEmail = "//table[@class='MsoNormalTable']/tbody/tr[7]/td/p[4]/b[2]";
        public static String inboxFrame = "publicshowmaildivcontent";
	    
	    

	    /*@BeforeMethod
public void testbefore() throws InterruptedException{
	
//	String pathexe = "C:\\Users\\nitin\\Desktop\\Bugs SS\\chromedriver.exe";
	//System.setProperty("webdriver.chrome.driver", pathexe );
	String url= "https://qa1.homesofa.de/";
    Thread.sleep(5000);
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}*/

/*public void mousehover(String st1){
    Actions a = new Actions(driver);
    WebElement we =   driver.findElementByXPath(st1);
    a.moveToElement(we).build().perform();
}

public void screenshot(String pagename) throws IOException{
	File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile, new File("C:\\Users\\nitin\\Desktop\\Testing Report\\Whole Site Test Cases\\Automated Test Cases\\12950\\"+pagename+".png"));

}

public static String replacecharachter(String s){
	String numberOnly= s.replaceAll("[^0-9]", "");
	double i = (Double.parseDouble(numberOnly))/100;
	int k = (int) i;
	String numbero = Integer.toString(k);
	return numbero;
}

public void addremovewishlist(String ctr, String wishlistbttn) throws InterruptedException{
	driver.findElementByXPath(wishlistbttn).click();
	Thread.sleep(5000);
	String str = driver.findElementById(wishlist_counter_e).getText();
	System.out.println("Counter value is : "+str);
	if(str.equalsIgnoreCase(ctr))
	{
	System.out.println(" TestCase is passed");
	Reporter.log(str);
}

else{
	
	System.out.println("Test is Fail");
}
}

public void clickevent(String str){
	driver.findElementByXPath(str).click();
}

public void login_in(){
	 clickevent(Mein_konto_e);
	 driver.findElementByXPath(email_l_e).sendKeys("username_data");
	 driver.findElementByXPath(pwd_l_e).sendKeys("password_data");
	 driver.findElementByXPath(login_submit_e).click();
}

public void cartadd(){
	driver.findElementById(addtocart_e).click();
	}

public static String product_e(String str){
	String a = "//descendant::img[@class='replace-2x img-responsive product-click-view'][";
	int b = Integer.parseInt(str);
	String c = "]";
	String d=a+b+c;
	return d;
}

public static String wishlistproduct_e(String str){
	String a = "//descendant::a[@class='s_title_block product-view-ga'][";
	int b = Integer.parseInt(str);
	String c = "]";
	String d=a+b+c;
	return d;
}

public static String deleteproductwishlist_e(String str){
	String a = "//descendant::i[@class='fa fa-close close-hover'][";
	int b = Integer.parseInt(str);
	String c = "]";
	String d=a+b+c;
	return d;
	}*/

/*@AfterMethod
public void testafter(){
	driver.quit();
}*/

}
