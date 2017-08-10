package Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import com.relevantcodes.extentreports.LogStatus;

import PageObjects.MobileKES;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class UtilMobile extends Base {
	
	protected static FileReader reader;
	protected static Properties properties;
	
	protected static XSSFWorkbook ExcelWBook;
	protected static XSSFSheet ExcelWSheet;
	protected static XSSFRow Row;
	protected static XSSFCell Cell;
	
	
	
	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
	 
	public static void setExcelFile(String Path,String SheetName) throws Exception {

			try {

   			// Open the Excel file

			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);

			} catch (Exception e){

				throw (e);

			}

	}

	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

    public static String getCellData(int RowNum, int ColNum) throws Exception{

			try{

  			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
  			
  			int length = Cell.getStringCellValue().length();
  			
  			String CellData = Cell.getStringCellValue();
  			return CellData; 			

  			}catch (Exception e){

				return"";

  			}

    }

	
	public static String getConfigValue(String key){
		String val=null;
		try {
			reader = new FileReader("config.properties");
			properties = new Properties();
			properties.load(reader);
			val = properties.getProperty(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return val;
	}
	
	
	public static String getTestData(String key){
		String val=null;
		try {
			reader = new FileReader(UtilMobile.getConfigValue("testData"));
			properties = new Properties();
			properties.load(reader);
			val = properties.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentTestManager.getTest().log(LogStatus.FATAL, "Testdata file is missing");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		return val;
	}
	
	public static String getscreenshot(WebDriver driver,String screenshotName)
    {    
		String filePath=null;
		try{
            File scrnFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            filePath  = System.getProperty("user.dir")+"\\Screenshots\\"+screenshotName+".png";
            
            FileUtils.copyFile(scrnFile, new File(filePath));
            
    }catch(Exception e){
    	   e.printStackTrace();
    }
    
	return filePath;
    }
	
	public static void clickByXpath(String xpath){
		getDriver().findElement(By.xpath(xpath)).click();
	}
    
	public static String  replaceChar(String testChar,String initial,String replacedChar){
		String newstr = testChar.replace(initial, replacedChar);
		
		return newstr;
	}
	
	public static void mousehoverVj(String st1){
	    Actions a = new Actions(getDriver());
	    WebElement we =   getDriver().findElement(By.xpath(st1));
	    a.moveToElement(we).build().perform();
	}

	public static String getText(String xpath){
		String text = null;
		text = getDriver().findElement(By.xpath(xpath)).getText();
		return text;
	}
	

	public static String getAttribute(String attribute,String xpath){
		String attributeVal = null;
		attributeVal = getDriver().findElement(By.xpath(xpath)).getAttribute(attribute);
		return attributeVal;
	}
	
	public static void enterText(String data, String xpath){
		getDriver().findElement(By.xpath(xpath)).sendKeys(data);
	}
	
	public static void clearText(String xpath){
		getDriver().findElement(By.xpath(xpath)).clear();
	}

	public static void selectDropDownValue(String text,String xpath){
		WebElement we = getDriver().findElement(By.xpath(xpath));
		Select selectDrop = new Select(we);
		selectDrop.selectByVisibleText(text);
	}
	
	public static List<WebElement> getElements(String xpath){
		List<WebElement> ls = new ArrayList<WebElement>();
		 ls = getDriver().findElements(By.xpath(xpath));
		
		return ls;
	}
	
	public static void scrollTo() {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,550)", "");
    }
	
	public static void switchToIframe(String frameid){
		
		getDriver().switchTo().frame(frameid);
	}
	public static boolean elementPresentOrNot(String xpath){
 	   boolean status=false;
 	   status = getDriver().findElement(By.xpath(xpath)).isDisplayed();
 	   return status;
    }

	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	/*public void addremovewishlist(String ctr, String wishlistbttn) throws InterruptedException{
		getDriver().findElement(By.xpath(wishlistbttn)).click();
		Thread.sleep(5000);
		String str = getDriver().findElementById(wishlist_counter_e).getText();
		System.out.println("Counter value is : "+str);
		if(str.equalsIgnoreCase(ctr))
		{
		System.out.println(" TestCase is passed");
		Reporter.log(str);
	}

	else{
		
		System.out.println("Test is Fail");
	}
	}*/


	   
    public static void mousehover(String st1){
      try{ 
    	  Actions a = new Actions(getDriver());
        
        WebElement we =   getDriver().findElement(By.xpath(st1));
        Point coordinates = we.getLocation();
        Robot robot = new Robot();
        robot.mouseMove(coordinates.getX(),coordinates.getY()+120);
         
        a.moveToElement(we).build().perform();
        Thread.sleep(3000);
      }catch(Exception e){
    	  ExtentTestManager.getTest().log(LogStatus.SKIP, e.getMessage());  
      }
        
    }
    
    public static String lower_casestring(String st1) {
    	st1= st1.toLowerCase();
    	return st1;
    }
    public static String Replace_space_string(String st1) {
    	st1= st1.replaceAll("\\s+$", "");
    	return st1;
    }

   /* public void screenshot(String pagename) throws IOException{
    	File srcfile =((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(srcfile, new File("C:\\Users\\nitin\\Desktop\\Testing Report\\Whole Site Test Cases\\Automated Test Cases\\12950\\"+pagename+".png"));

    }*/

    public static String replacecharachter(String s){
    	String numberOnly= s.replaceAll("[^0-9]", "");
    	double i = (Double.parseDouble(numberOnly))/100;
    	int k = (int) i;
    	String numbero = Integer.toString(k);
    	return numbero;
    }
    
    public static void selectdropdownvalue(String str1, String str2){
    	
    	 Select daydropdown = new Select(getDriver().findElement(By.xpath(str1)));
    	 int i= Integer.parseInt(str2);
    	 daydropdown.selectByIndex(i); 
    }

   

    public static void clickevent(String str){
    
    	getDriver().findElement(By.xpath(str)).click();
    }
    
    public static void clickIDevent(String str){
        
    	getDriver().findElement(By.id(str)).click();
    }
    
    public static void pagescroll(int i){
    	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
    	jse.executeScript("window.scrollBy(0,"+i+")","");
    	    	
    }
   

   
    public static void enterdata(String str, String str1){
    	
    	getDriver().findElement(By.xpath(str)).sendKeys(str1);
    	
    }
    
    
    
   public static void enterdataID(String str, String str1){
    	
    	getDriver().findElement(By.id(str)).sendKeys(str1);
    	
    }


  public static boolean elementdisplayed(String str){
	  getDriver().findElement(By.xpath(str)).isDisplayed();
	  return true;
  }
  
  public static void getelement(String stname, String stelement){
	  String str;
	  
	  List<WebElement> drop = getDriver().findElements(By.xpath(stelement));
		
		 java.util.Iterator<WebElement> i = drop.iterator();
		
		 while(i.hasNext()) {
			    WebElement row = i.next();
			     str = row.getText();
			
			    if(str.equalsIgnoreCase(stname)){
				   ExtentTestManager.getTest().log(LogStatus.INFO, "clicking on product " + str);
				   row.click();
			    		break;
			    		}
			}
	  
  }
  
 
  
  public static String IDgetText(String id){
		String text = null;
		text = getDriver().findElement(By.id(id)).getText();
		return text;
	}
  
  public static String getattribute(String xpath, String att){
	 
	 String st = getDriver().findElement(By.xpath(xpath)).getAttribute(att);
	return st;
  }
  
  public static boolean guiMatchFind(String imagePath){
	    boolean match = false;
	    System.out.println("Image pathh is: "+imagePath);
		Screen screen = new Screen();
		
		try {
		    Pattern image = new Pattern(imagePath);
		    screen.wait(image,3);
			
			screen.find(image);
			
			System.out.println("Image found");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Image match found.");
			match = true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ExtentTestManager.getTest().log(LogStatus.INFO, "Image match not found.");
			e.printStackTrace();
		}
	 
	  return match;
  }
  
  
  public static boolean guiMatchClick(String imagePath){
	    boolean match = false;
	    System.out.println("Image pathh is: "+imagePath);
		Screen screen = new Screen();
		
		try {
		    Pattern image = new Pattern(imagePath);
		    screen.wait(image,3);
			
		    screen.click(image);
			System.out.println("Image found and clicked");
			
			match = true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ExtentTestManager.getTest().log(LogStatus.INFO, "Image match not found.");
			e.printStackTrace();
		}
	 
	  return match;
}
  
  
  public static void sliderArrowsUI(String childNodes , String nextArrowXpath , String previousArrowEnabledpath, String nextArrowdisabledPath, int numberOfImageInDefaultView){
	  boolean previousEnabledArrow = false;
	  boolean nextDisabledArrow = false;
	  
	  List<WebElement> images = new ArrayList<WebElement>();
	  int numberOfImages = 0;
	  int numberOfClicks = 0;
	  
	 
	  
	  images = getElements(childNodes); //getting total number of images.
	  
	  numberOfImages = images.size();
	  System.out.println("Number of images: "+numberOfImages);
	  numberOfClicks = numberOfImages - numberOfImageInDefaultView;
	  
	  for(int i=1;i<=numberOfClicks;i++){
		  clickByXpath(nextArrowXpath);
		 
		  if(i==1){
			  ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying previous arrow is enabled after clicking next arrow or not.");
			  previousEnabledArrow = guiMatchFind(previousArrowEnabledpath); 
			  
			  if(previousEnabledArrow){
				  
				  ExtentTestManager.getTest().log(LogStatus.PASS, "Previous Arrow is enabled after clicking next arrow.");
			  }else{
				  ExtentTestManager.getTest().log(LogStatus.FAIL, "Previous Arrow is not enabled after clicking next arrow.");
				  
			  }
		  }
	  }
	  
	  nextDisabledArrow = UtilMobile.guiMatchFind(nextArrowdisabledPath);
	  
	  if(nextDisabledArrow){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Next Arrow is disabled correctly.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Next Arrow is not getting disabled.");
		  
	  }
	  
	  if(!(previousEnabledArrow || nextDisabledArrow)){
			 Assert.fail("Slider UI is not looking as expected");
		  }  
  }
  
  public static void sliderArrowsDefaultCaseUI(String previousArrowImage, String nextArrowImage){
	  boolean previousDisabledArrow = false;
	  boolean nextEnabledArrow = false;
	  
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying previous arrow is disabled or not.");
	  previousDisabledArrow = UtilMobile.guiMatchFind(previousArrowImage);
	  
	  if(previousDisabledArrow){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Previous Arrow is disabled initially.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Previous Arrow is not disabled initially.");
		  
	  }
	  
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying next arrow is enabled or not.");
	  nextEnabledArrow = UtilMobile.guiMatchFind(nextArrowImage);
	  
	  if(previousDisabledArrow){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Next Arrow is enabled initially.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Next Arrow is not enabled  initially.");
		  
	  }
	  
	  if(!(previousDisabledArrow || nextEnabledArrow)){
			 Assert.fail("Slider UI is not looking as expected");
		  }  
  }
  
  
  public static void sliderArrows(String childNodes , String nextArrowXpath , String previousArrowEnabledpath, String nextArrowdisabledPath, int numberOfImageInDefaultView){
	  boolean previousEnabledArrow = false;
	  boolean nextDisabledArrow = false;
	  
	  List<WebElement> images = new ArrayList<WebElement>();
	  int numberOfImages = 0;
	  int numberOfClicks = 0;
	  
	 
	  
	  images = getElements(childNodes); //getting total number of images.
	  
	  numberOfImages = images.size();
	  System.out.println("Number of images: "+numberOfImages);
	  numberOfClicks = numberOfImages - numberOfImageInDefaultView;
	  
	  for(int i=1;i<=numberOfClicks;i++){
		  clickByXpath(nextArrowXpath);
		 
		  if(i==1){
			  ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying previous arrow is enabled after clicking next arrow or not.");
			  previousEnabledArrow = UtilMobile.elementPresentOrNot(previousArrowEnabledpath); 
			  
			  if(previousEnabledArrow){
				  
				  ExtentTestManager.getTest().log(LogStatus.PASS, "Previous Arrow is enabled after clicking next arrow.");
			  }else{
				  ExtentTestManager.getTest().log(LogStatus.FAIL, "Previous Arrow is not enabled after clicking next arrow.");
				  
			  }
		  }
	  }
	  
	  nextDisabledArrow = UtilMobile.elementPresentOrNot(nextArrowdisabledPath); 
	  
	  if(nextDisabledArrow){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Next Arrow is disabled correctly.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Next Arrow is not getting disabled.");
		  
	  }
	  
	  if(!(previousEnabledArrow || nextDisabledArrow)){
			 Assert.fail("Slider UI is not looking as expected");
		  }  
  }
  
  
  public static void sliderArrowsDefaultCase(String previousArrowXpath, String nextArrowImageXpath){
	  boolean previousDisabledArrow = false;
	  boolean nextEnabledArrow = false;
	  
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying previous arrow is disabled or not.");
	  previousDisabledArrow = UtilMobile.elementPresentOrNot(previousArrowXpath);
	  
	  if(previousDisabledArrow){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Previous Arrow is disabled initially.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Previous Arrow is not disabled initially.");
		  
	  }
	  
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying next arrow is enabled or not.");
	  nextEnabledArrow = UtilMobile.elementPresentOrNot(nextArrowImageXpath);
	  
	  if(previousDisabledArrow){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Next Arrow is enabled initially.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Next Arrow is not enabled  initially.");
		  
	  }
	  
	  if(!(previousDisabledArrow || nextEnabledArrow)){
			 Assert.fail("Slider UI is not looking as expected");
		  }  
  }
  
  
  public static boolean matchListOfText(String XpathOfList,String WorkBookPath, String SheetName,int columnNumber){
	  boolean textMatch =false;
	  int failCount=0;
	  try{
		
		List<WebElement> actualTexts = new ArrayList<WebElement>();
		
		actualTexts = getElements(XpathOfList);
		System.out.println("List size: "+actualTexts.size());
	    setExcelFile(WorkBookPath,SheetName);
	    
	    int totalRows = ExcelWSheet.getLastRowNum();
	    System.out.println("Row size: "+totalRows);
	    
	    for(int i=1;i<=totalRows;i++){
	    	String expectedText = getCellData(i, columnNumber);
	    	int length = expectedText.length();
	    	
	    	if(length==0){
	    		System.out.println("Cell empty"); 
	    		break;
	    	}
	    	for(int j=0;j<actualTexts.size();j++){
	    		textMatch = false;
	    		WebElement actualElement = actualTexts.get(j);
	    		String actualText = actualElement.getText();
	    		
	    		if(expectedText.equalsIgnoreCase(actualText)){
	    			
	    			ExtentTestManager.getTest().log(LogStatus.PASS, "Match exists for :"+expectedText);
	    			textMatch=true;
	    			break;
	    		}
	    	}
	    	
	    	if(textMatch==false){
	    		ExtentTestManager.getTest().log(LogStatus.FAIL, "Match missing for :"+expectedText);
	    		failCount++;
	    		
	    	}
	    }
	    
	    if(failCount>0){
	    	textMatch=false;
			
		}
	  
	  }catch(Exception e){
		  e.printStackTrace();
	 
    }
    return textMatch;
  } 
  
  public static boolean ProductDropdownListClick(String ProductDropdownArrow, String ButtonElement, String Scenario, String ProductUpArrow, String ExpectedButtonText, String ProductFabricDownArrow, String ProductFabricUpArrow ) throws InterruptedException {
	  
	  boolean status = false;
	  boolean DownArrow = false;
	  boolean UpArrow = false;
	  boolean FilterDownArrow = false;
	  boolean FilterUpArrow = false;
	  WebElement ProductDropdown;
	  String ActualButtonText ="";
	  WebElement Button;
	 
	 
      Thread.sleep(3000);
	  
	 UtilMobile.pagescroll(700);

	  
	  List<WebElement> drop  =  UtilMobile.getElements(ProductDropdownArrow);
	  java.util.Iterator<WebElement> i = drop.iterator();
	  List<WebElement> Buttonlist  =  UtilMobile.getElements(ButtonElement);
	  java.util.Iterator<WebElement> j = Buttonlist.iterator();
	  
	  List<WebElement> filter  =  UtilMobile.getElements(ProductFabricDownArrow);
	  java.util.Iterator<WebElement> k = filter.iterator();

	  while(i.hasNext()){
	
		  Thread.sleep(3000);
		  ProductDropdown  = i.next();
		  if(Scenario.equalsIgnoreCase("Dropdown")){
		
		  DownArrow =  ProductDropdown.isDisplayed();
		  if(DownArrow){
			  ExtentTestManager.getTest().log(LogStatus.PASS, "Down Arrow is enabled initially.");
			  ProductDropdown.click();
			  UtilMobile.pagescroll(70);
			  Thread.sleep(2000);
			  UpArrow = UtilMobile.elementdisplayed(ProductUpArrow);
			  status = true;
			  
			  
			  if(UpArrow){
				  ExtentTestManager.getTest().log(LogStatus.PASS, "On clicking down arrow, up arrow is visible");
				  status = true;
				
				UtilMobile.clickByXpath(ProductUpArrow);   
			  }
			  else{
				  ExtentTestManager.getTest().log(LogStatus.FAIL, "Up arrow is not visible");
				  status = false;
			  }
			  				  
		     }
		  else{
	
			  ExtentTestManager.getTest().log(LogStatus.FAIL, "Down arrow is not visible");
			  status = false;
		  }
	  }

		  else if(Scenario.equalsIgnoreCase("Button")){
		  
			  ProductDropdown.click();
			   Thread.sleep(2000);
			   Button  = j.next();
			   ActualButtonText = Button.getText();
			   Thread.sleep(2000);
			   System.out.println(ActualButtonText);
			  if(ActualButtonText.equalsIgnoreCase(ExpectedButtonText)){
				  
				  ExtentTestManager.getTest().log(LogStatus.PASS, "Button text is same as expected");  
				  System.out.println("Button is displaying and text is same");
				   UtilMobile.clickByXpath(ProductUpArrow);  
				   status = true;
			   
			  }
			   else{
				   ExtentTestManager.getTest().log(LogStatus.FAIL, "Button text is not same as expected"); 
				   System.out.println("not displaying");
				   status = false;
			   }
			  
		  }
		  else if(Scenario.equalsIgnoreCase("FilterArrow")){
			
			  ProductDropdown.click();
			  Button = k.next();
			  UtilMobile.pagescroll(150);
			  Thread.sleep(2000);
			  
			  FilterDownArrow = Button.isDisplayed();
			  
			   if(FilterDownArrow){
				   Thread.sleep(2000);
				   Button.click();
				  // UtilMobile.clickByXpath(ProductFabricDownArrow);
				   
				   UtilMobile.pagescroll(80);
				  
				   FilterUpArrow = UtilMobile.elementPresentOrNot(ProductFabricUpArrow); 
				   status = true;
				   
				   ExtentTestManager.getTest().log(LogStatus.PASS, "Filter dropdown is displaying"); 
				   System.out.println("dropdown arrow is displaying ");
				   Thread.sleep(2000);
				   
				   
				   if(FilterUpArrow){
					   UtilMobile.clickByXpath(ProductFabricUpArrow);
					    System.out.println("dropdown up arrow is displaying ");
					    ExtentTestManager.getTest().log(LogStatus.PASS, "Filter up arrow is displaying"); 
					   Thread.sleep(3000);
					   UtilMobile.clickByXpath(ProductUpArrow); 
					   UtilMobile.pagescroll(100);
					   status = true;
				   }
				   else{
					   ExtentTestManager.getTest().log(LogStatus.FAIL, "Filter up arrow is not displaying"); 
					   System.out.println("It is not matched, dropdown up arrow is not displaying ");
					   status = false;
				   }
				   
			   }
			   else{
				   ExtentTestManager.getTest().log(LogStatus.FAIL, "Filter dropdown is not displaying"); 
				   System.out.println("Down arrow is not matched");
				   status = false;
			   }
			  
		  }
			 
	  }
	return status; 
	
	 
  }
  
}
