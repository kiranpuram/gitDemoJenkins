package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utility.Log;

public class SignUp_Page {
	private static WebElement element;
	
	public static WebElement foreName_Field(WebDriver driver)
	{
		try {
			Log.infoLog("On SignUp Page");
			element =null;
			element = driver.findElement(By.id("forenames"));
			Log.infoLog("Returning **Forename** WebElement");
			return element;
		} catch (Exception e) {
			Log.errorLog(e.getMessage());
		    throw(e);
		}
	}
	
	public static WebElement surName_Field(WebDriver driver)
	{
		try {
			element = null;
			element = driver.findElement(By.id("surename"));
			Log.infoLog("Returning **Surname** WebElement");
			return element;
		} catch (Exception e) {
			Log.errorLog(e.getMessage());
		    throw(e);
		}
	}
	
	public static WebElement gender_Field(WebDriver driver , String str)
	{
		try {
			element = null;
			List<WebElement> btn = driver.findElements(By.name("sex"));

			for(int i=0;i<btn.size();i++)
			{
			   if(btn.get(i).getAttribute("value").equalsIgnoreCase(str))
			     element = btn.get(i);
			     //return element;
			}
			Log.infoLog("Returning **Male or Female** WebElement");
			return element;
		} catch (Exception e) {
			Log.errorLog(e.getMessage());
		    throw(e);
		}
	 }
	
	public static WebElement addressLine1_Field(WebDriver driver)
	{
		try {
			element =null;
			element = driver.findElement(By.xpath(".//*[@id='address1']"));
			Log.infoLog("Returning **Address Line 1** WebElement");
			return element;
		} catch (Exception e) {
			Log.errorLog(e.getMessage());
		    throw(e);
		}
	}
	
	public static WebElement addressLine2_Field(WebDriver driver)
	{
		try {
			element = null;
			element = driver.findElement(By.xpath(".//*[@id='address2']"));
			Log.infoLog("Returning **Address Line 2** WebElement");
			return element;
		} catch (Exception e) {
			Log.errorLog(e.getMessage());
		    throw(e);
		}
	}

	public static WebElement city_Field(WebDriver driver)
	{
		try {
			element = null;
			element = driver.findElement(By.xpath(".//*[@id='city']"));
			Log.infoLog("Returning **City** WebElement");
			return element;
		} catch (Exception e) {
			Log.errorLog(e.getMessage());
		    throw(e);
		}
	}
	
	public static WebElement postalCode_Field(WebDriver driver)
	{
		try {
			element = null;
			element = driver.findElement(By.xpath(".//*[@id='postalcode']"));
			Log.infoLog("Returning **PostalCode** WebElement");
			return element;
		} catch (Exception e) {
			Log.errorLog(e.getMessage());
		    throw(e);
		}
	}
	
	public static WebElement telephone_Field(WebDriver driver)
	{
		try {
			element = null;
			element = driver.findElement(By.name("telephone"));
			Log.infoLog("Returning **Telephone** WebElement");
			return element;
		} catch (Exception e) {
			Log.errorLog(e.getMessage());
		    throw(e);
		}
		
	}
	
	public static WebElement country_Field(WebDriver driver)
	{
		try {
			element = null;
			element = driver.findElement(By.xpath(".//*[@id='form']/form/select"));
			Log.infoLog("Returning **Country** WebElement");
			return element;
		} catch (Exception e) {
			Log.errorLog(e.getMessage());
		    throw(e);
		}
	}
	
	public static WebElement submit_Field(WebDriver driver)
	{
		try {
			element = null;
			element = driver.findElement(By.xpath("html/body/div[3]/a/input"));
			Log.infoLog("Returning **Submit** WebElement");
			return element;
		} catch (Exception e) {
			Log.errorLog(e.getMessage());
		    throw(e);
		}
	}
}
