package PageObjects;

import Utility.Base;

public class KES extends Base {
	
	public static String categorieSliderLeftArrow = "//div[@class='swiper-container categories-swiper-slider swiper-container-horizontal']/div[@class ='swiper-button-prev swiper-button-white fa fa-chevron-left']";
	public static String categorieSliderRightArrow = "//div[@class='swiper-container categories-swiper-slider swiper-container-horizontal']/div[@class='swiper-button-next swiper-button-white fa fa-chevron-left']";
	
	public static String categorieSliderLeftArrowDisabled = "//section[@class='wrapper']//div[@class='swiper-button-prev swiper-button-white fa fa-chevron-left swiper-button-disabled']";
	public static String categorieSliderRightArrowDisabled = "//div[@class='swiper-container categories-swiper-slider swiper-container-horizontal']//div[@class='swiper-button-next swiper-button-white fa fa-chevron-left swiper-button-disabled']";
	
	public static String categorieSliderImages ="//section[@class ='wrapper']//div[@class = 'swiper-container categories-swiper-slider swiper-container-horizontal']//div[contains(@class,'swiper-slide')]";
	public static String categorieProduct = "//div[@class='prd-blk']/div[@class='image-block']";
	public static String ProductThumbnail = "//div[@class='vertical-swiper swiper-container-vertical']/div[@class= 'swiper-wrapper']/div";
	public static String ProductToTheSeriesButton = "//div[@class='row btn-row desktop']//a[@class='button btn-type-1']";
	public static String ProductToTheProductButton = "//div[@class='row btn-row desktop']//a[@class='button btn-type-2']";
	public static String ProductThumbnailUpArrowDisabled = "//div[@class='product-list']/div[outerVal]/div[innerVal]//div[@class='swiper-button-next swiper-button-white fa fa-chevron-up swiper-button-disabled']";
	public static String ProductThumbnailDownArrowDisabled = "//div[@class='product-list']/div[outerVal]/div[innerVal]//div[@class='swiper-button-prev swiper-button-white fa fa-chevron-down swiper-button-disabled']";

	public static String productButton1 = "Zur Serie";
	public static String productButton2 = "Zum Produkt";
	
	public static String products = "//section[@class = 'wrapper']//div[@class = 'product-list']/div[outerVal]/div";
	
	public static String productsliderthumnails = "//div[@class='product-list']/div[outerVal]/div[innerVal]//div[@class= 'swiper-wrapper']/div";
	 
	 public static String productRows = "//section[@class = 'wrapper']//div[@class = 'product-list']/div";
	
	 
	 
	public static String ProductThumbnailUpArrow = "//div[@class='product-list']/div[outerVal]/div[innerVal]//div[@class= 'swiper-button-next swiper-button-white fa fa-chevron-up']";
		public static String ProductThumbnailDownArrow = "//div[@class='product-list']/div[outerVal]/div[innerVal]//div[@class= 'swiper-button-prev swiper-button-white fa fa-chevron-down']";
		
	
}
