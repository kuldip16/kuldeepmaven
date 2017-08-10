package Utility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.server.FirefoxDriverProvider;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentTestManager;

public class Base{
	
    private static ExtentReports extent;
    private static ExtentTest test;
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
    
    
   
    
    private static void setDriver(String appURL, String deviceID, String node, String platformVersion ){
      WebDriver driver = null; 
      
      try{ 
    	  DesiredCapabilities capabilities = new DesiredCapabilities();
    	  capabilities.setCapability("deviceName", deviceID);
    	  capabilities.setCapability("browserName", "chrome");
    	  capabilities.setCapability("VERSION", platformVersion );
    	  capabilities.setCapability("platformName", "Android");
    	  capabilities.setCapability("app", "chrome");
    	  
    	  
      	  ExtentTestManager.getTest().log(LogStatus.INFO, "Launching Chrome browser"); 
      	      	
      	  driver = new RemoteWebDriver(new URL(node), capabilities);
    	  
      	 
          setWebDriver(driver);
      	 
      	 // getDriver().manage().window().maximize();		   
      	//  getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      	  getDriver().get(appURL);
    	   
    	 }catch(Exception e){
    		    System.out.println("Mobile device not connected, hence running on emulator.");
    		    String Osname = null;
    		    Osname = OsName();
    	      	System.out.println("Os name is: "+Osname);
    	      	
    	      	Map<String, String> mobileEmulation = new HashMap<String, String>();
	    	    mobileEmulation.put("deviceName", "Google Nexus 5");

	    	    Map<String, Object> chromeOptions = new HashMap<String, Object>();
	    	    chromeOptions.put("mobileEmulation", mobileEmulation);
	    			
	    		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	    		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	    		 
    	          if(Osname.startsWith("Windows")){
    	           	    			
    	    		System.setProperty("webdriver.chrome.driver","chromedriverlatest.exe");
    	    			
    	    		driver = new ChromeDriver(capabilities);
    	      	  }else{
    	      		
    	      	   try{
    	      	    
    	       	    driver = new RemoteWebDriver(new URL("http://localhost:9515"),capabilities);
    	       	    
    	      	      }catch(Exception ex){
    	      		     ex.printStackTrace();
    	      	     }
    	      	
    	      	  }  
    			
    	          
    	         setWebDriver(driver);
    	      	 
    	      	 getDriver().manage().window().maximize();		   
    	      	 //getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	      	 getDriver().get(appURL);
    	 }
    	
     
    }	
    
    
    protected static WebDriver getDriver() {
        return webDriver.get();
    }
 
    protected static void setWebDriver(WebDriver driver) {
    	webDriver.set(driver);
    }
    
    private static String OsName(){
    	String Osname = null;
    	Osname = System.getProperty("os.name");
    	return Osname;
    }
   
  
   
    @BeforeSuite (groups = {"Sanity","Regression"})
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }
    @Parameters({"deviceID", "node" , "platformVersion"})
    
    @BeforeMethod (groups = {"Sanity","Regression"})
	public void initializeTestBaseSetup(Method method, String deviceID, String node, String platformVersion ) {
    	
		try {
			 ExtentTestManager.startTest(method.getName());	
			
			 setDriver(UtilMobile.getConfigValue("appUrl"), deviceID, node, platformVersion );
			 
		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}
   

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod (groups = {"Sanity","Regression"})
    public void afterEachTestMethod(ITestResult result) throws InterruptedException {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));  // new
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));  // new

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);  // new
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");  // new
        } else if (result.getStatus() == 2) {
            String path = UtilMobile.getscreenshot(getDriver(), result.getName());
            	
            String image = ExtentTestManager.getTest().addScreenCapture(path);
            ExtentTestManager.getTest().log(LogStatus.FAIL,getStackTrace(result.getThrowable()));
            ExtentTestManager.getTest().log(LogStatus.FAIL,image);
            getDriver().get(path);
            
        	
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");  // new
        }

        ExtentTestManager.endTest();  // new
   
        extent.flush();
       
        if(getDriver()!=null){
       	 
        	getDriver().close();
        	 
         }
        
        webDriver.set(null);  	
        
    }
    

    @AfterSuite (groups = {"Sanity","Regression"})
    public void generateReport() {
        extent.close();
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
}
