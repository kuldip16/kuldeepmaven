package PageObjects;

public class Cart {
	
	public static String cart = "//div[@class='profile']/ul/li/a[contains(@href,'warenkorb')]";
	public static String emptyCartSection = "//div[@class='empty-cart']";
	public static String blackIconsText = "//div[@class='blk row desktop']/../..//div[@class='detail']";
    public static String actionsText = "//div[contains(@class,'cart-proceed-innr')]/a[@class='blk']/div[@class='text']";
    public static String appointmentAction = "//div[contains(@class,'cart-proceed-innr')]/a[@class='blk desktop']/div[@class='text']";
    public static String coupanSubmit = ".//*[@id='coupon-button1']";
    public static String blankCoupanError = ".//*[@id='couponcode-error']";
    
    
}
