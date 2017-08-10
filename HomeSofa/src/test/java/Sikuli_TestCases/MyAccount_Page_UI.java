package Sikuli_TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import Utility.ExtentTestManager;
import Utility.util;

import com.relevantcodes.extentreports.LogStatus;

public class MyAccount_Page_UI extends util{
	
	@Test
	public void MyAccountGUI() throws FindFailed, InterruptedException, AWTException{
		
		 WebElement row;
		String url = "https://login.yahoo.com/account/create?src=fpctx&intl=in&lang=en-IN&done=https%3A%2F%2Fin.yahoo.com&specId=yidReg";
		 
		//  Actions acn = new Actions(driver);
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		 String str;
		 
		 util.clickByXpath(".//*[@id='usernamereg-freeformGender']");
		 Thread.sleep(2000);
		 util.clickByXpath("//div[@id= 'gender-container']/ul/li[1]");
	}
		 
		     
}
