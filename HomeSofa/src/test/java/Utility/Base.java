package Utility;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import applicationUtility.PageObjects;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base extends PageObjects {
    public static ExtentReports extent;
    public static ExtentTest test;
    public static WebDriver driver;
    String browser = util.getConfigValue("browser");
   
    private void setDriver(String browserType, String appURL) {
    	
		if(browserType.equalsIgnoreCase("chrome")) {
		
			driver = launchChromeDriver(appURL);
		}else{	
		
			driver = launchFirefoxDriver(appURL);
		
		}
		
	}
    private static WebDriver launchFirefoxDriver(String appURL) {
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Launching Firefox browser"); 
		
    	System.setProperty("webdriver.gecko.driver", "D:\\Automation Test\\HomeSofa\\geckodriver.exe");
    	driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(appURL);
		return driver;
	}

    private static WebDriver launchChromeDriver(String appURL) {
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Launching Chrome browser"); 
    	System.setProperty("webdriver.chrome.driver", "D:\\Automation Test\\HomeSofa\\"
		+ "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(appURL);
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
			setDriver(browser, util.getConfigValue("appUrl"));

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
         String path = util.getscreenshot(driver, result.getName());
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
