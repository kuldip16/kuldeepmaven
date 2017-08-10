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

public class Base{
	
    public static ExtentReports extent;
    public static ExtentTest test;
    public static WebDriver driver;
    
    
    private static void setDriver(String browser,String appURL){
      
      
      switch(browser){
   	  case "chrome":
   		 ExtentTestManager.getTest().log(LogStatus.INFO, "Launching Chrome browser"); 
   	     System.setProperty("webdriver.chrome.driver","chromedriver.exe");
   	     driver = new ChromeDriver();
   	     break;
   	  
   	  case "firefox":
   		ExtentTestManager.getTest().log(LogStatus.INFO, "Launching Firefox browser"); 
    	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		driver = new FirefoxDriver();
		
       	  
        }
   
    		    driver.manage().window().maximize();
    			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    			driver.get(appURL);
    }		
    	
   
  
   
    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }
    
    
    @BeforeMethod
    @Parameters({"browser"})
	public void initializeTestBaseSetup(String browser, Method method) {
    	
		try {
			 ExtentTestManager.startTest(method.getName());			
			 setDriver(browser,util.getConfigValue("appUrl"));

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

    @AfterMethod
    @Parameters({"browser"})
    public void afterEachTestMethod(ITestResult result,String browser) throws InterruptedException {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));  // new
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));  // new

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);  // new
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");  // new
        } else if (result.getStatus() == 2) {
            String path = util.getscreenshot(driver, result.getName());
           
            if(browser.equalsIgnoreCase("firefox")){
            String editPath = "file://";
            String FinalPath = editPath.concat(path);
            
            System.out.println("Path in gecko refreshed");
           
            String image = ExtentTestManager.getTest().addScreenCapture(FinalPath);
        	ExtentTestManager.getTest().log(LogStatus.FAIL,getStackTrace(result.getThrowable()));
        	Thread.sleep(3000);
        	ExtentTestManager.getTest().log(LogStatus.FAIL,image);
        	driver.get(FinalPath);
        	
            }else{
            	
                String image = ExtentTestManager.getTest().addScreenCapture(path);
             	ExtentTestManager.getTest().log(LogStatus.FAIL,getStackTrace(result.getThrowable()));
             	ExtentTestManager.getTest().log(LogStatus.FAIL,image);
             	driver.get(path);
            }
        	
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");  // new
        }

        ExtentTestManager.endTest();  // new
   
        extent.flush();
       
        driver.quit();   	
        
    }
    

    @AfterSuite
    public void generateReport() {
        extent.close();
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
}
