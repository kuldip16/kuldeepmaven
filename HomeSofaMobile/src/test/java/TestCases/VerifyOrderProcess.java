package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.CategoriesPage;
import PageObjects.OrderProcess;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;

public class VerifyOrderProcess extends BaseMobile {
boolean getstatus;
	
@Test (enabled = false)
	
public void OrderByNachnahme() throws InterruptedException{
	
    Thread.sleep(3000);
    getstatus =   OrderProcess.ordercreation(OrderProcess.NachnahmeXpath);
	Assert.assertTrue(getstatus);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");
	}

@Test (enabled = true)

public void OrderByRechnung() throws InterruptedException{

Thread.sleep(3000);
 
getstatus =  OrderProcess.ordercreation(OrderProcess.RechnungXpath);
Assert.assertTrue(getstatus);
ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");
}

@Test (enabled = false)

public void OrderByRatenkauf() throws InterruptedException{

Thread.sleep(3000);
getstatus =   OrderProcess.ordercreation(OrderProcess.RatenkaufXpath);
Assert.assertTrue(getstatus);
ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");
}
@Test (enabled = false)

public void OrderByVorkosse() throws InterruptedException{

Thread.sleep(3000);
getstatus =   OrderProcess.ordercreation(OrderProcess.RatenkaufXpath);
Assert.assertTrue(getstatus);
ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");
}

}
