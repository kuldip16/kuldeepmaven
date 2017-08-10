package UtilityMobile;

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

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseMobile  {
    public static ExtentReports extent;
    public static ExtentTest test;
    public static WebDriver driver;
   
   
    private static WebDriver setDriver(String appURL) throws MalformedURLException {

    	  DesiredCapabilities capabilities = new DesiredCapabilities();
    	
    	  try{
    	  capabilities.setCapability("deviceName", "TA09402LQX");
    	  capabilities.setCapability("browserName", "Android");
    	  capabilities.setCapability("VERSION", "5.1");
    	  capabilities.setCapability("platformName", "Android");
    	  capabilities.setCapability("app", "chrome");
    	  
    	  
    	  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    	  driver.get(appURL);
    	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	  
    	  }
    	  
    	 catch(Exception e){
    	 System.out.println(e.getMessage());
    	 System.out.println("Mobile Device is not connected");
    	 System.out.println("Switching to Mobile Emulator");

    	Map<String, String> mobileEmulation = new HashMap<String, String>();

		mobileEmulation.put("deviceName", "Apple iPhone 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();

		chromeOptions.put("mobileEmulation", mobileEmulation);

		capabilities = DesiredCapabilities.chrome();
		

		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Test\\HomeSofaMobile\\chromedriver.exe");
		driver = new ChromeDriver(capabilities);
		
	//	driver.get("http://qa1.homesofa.de");
    	
    	  driver.get(appURL);
    	  
    	
    	 }
		return driver;
    	  
}

    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }
    
    @BeforeMethod
	public void initializeTestBaseSetup(Method method) {
		try {
			 ExtentTestManager.startTest(method.getName());
			setDriver(utilMobile.getConfigValue("appUrl"));

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
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));  // new
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));  // new

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);  // new
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");  // new
        } else if (result.getStatus() == 2) {
         String path = utilMobile.getscreenshot(driver, result.getName());
           // ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));  // new
            String image = ExtentTestManager.getTest().addScreenCapture(path);
        	ExtentTestManager.getTest().log(LogStatus.FAIL,getStackTrace(result.getThrowable()));
        	ExtentTestManager.getTest().log(LogStatus.FAIL,image);
        	driver.get(path);
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
