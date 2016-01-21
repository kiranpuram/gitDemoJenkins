package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utility.Log;

public class Home_Page {
	private static WebElement element;
	
	public static WebElement chk_Box(WebDriver driver) throws Exception
	{
		try {
			Log.infoLog("On Home Page");
			element = null;
			element = driver.findElement(By.id("checkbox"));
			Log.infoLog("Returning **Check Box** WebElement");
			return(element);
		} catch (Exception e) {
			Log.errorLog(e.getMessage());
		    throw(e);
		}
	}
	
	public static WebElement next_Button(WebDriver driver)
	{
		try {
			element = null;
			element = driver.findElement(By.xpath("html/body/div[3]/a/input"));
			Log.infoLog("Returning **Next** WebElement");
			return element;
		} catch (Exception e) {
			Log.errorLog(e.getMessage());
		    throw(e);
		}
		
	}

}
