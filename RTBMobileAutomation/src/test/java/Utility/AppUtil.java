package Utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppUtil extends Base{

	
	public static boolean removeItemFromList(String listXpath , String removeXpath){
		boolean status=false;
		int numberOfItemBefore = 0;
		int numberOfItemAfter = 0;
		int diffOfItem = 0;
		
		
		List<WebElement> itemList = new ArrayList<WebElement>();
		
		itemList = getDriver().findElements(By.xpath(listXpath));
		
		numberOfItemBefore = itemList.size();
		System.out.println("list size is: "+numberOfItemBefore);
		
		getDriver().findElement(By.xpath(removeXpath)).click();
		
		itemList = getDriver().findElements(By.xpath(listXpath));
		
		numberOfItemAfter = itemList.size();
		System.out.println("list size is: "+numberOfItemAfter);
		diffOfItem = numberOfItemBefore - numberOfItemAfter;
		if(diffOfItem==1){
			status = true;
		}
		
		return status;
	}
	
	
	public static void removeAllItemFromList(String listXpath,String removeXpath){
		
        List<WebElement> itemList = new ArrayList<WebElement>();
		
		itemList = getDriver().findElements(By.xpath(listXpath));
		
		for(int i =0;i<itemList.size();i++){
			
			getDriver().findElement(By.xpath(removeXpath)).click();
		}
		
	}
	
	
	
	
	
}
