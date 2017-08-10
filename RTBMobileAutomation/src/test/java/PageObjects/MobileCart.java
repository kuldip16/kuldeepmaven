package PageObjects;

public class MobileCart {
	
	
	public static String cart = "//div[@class='profile']/ul/li/a[contains(@href,'warenkorb')]";
	public static String productsInCart = "//div[@class='cart-item row']";
	public static String removeLinkOfProductInCart = "//div[@class='cart-item row']/i";
	public static String emptyCartSection = "//div[@class='empty-cart']";
	public static String blackIconsText = "//div[@class='blk row desktop']/../..//div[@class='detail']";
    public static String actionsText = "//div[contains(@class,'cart-proceed-innr')]/a[@class='blk']/div[@class='text']";
    public static String appointmentAction = "//div[contains(@class,'cart-proceed-innr')]/a[@class='blk mobile']/div[@class='text']";
    public static String coupanSubmit = ".//*[@id='coupon-button-mob']";
    public static String blankCoupanError = ".//*[@id='couponcode2-error']";

}
