package AppModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjects.Home_Page;
import PageObjects.SignUp_Page;
import Utility.Constant;
import Utility.Excel_Utility;
import Utility.Log;

public class Signup_Action 
{
	public static void execute(WebDriver driver) throws Exception
	{
		try {
			Log.infoLog("Started Performing the SignUp Action");
			 Home_Page.chk_Box(driver).click();
			 Log.infoLog("Clicked on the Check Box on Home Page");
			 Home_Page.next_Button(driver).click();
			 Log.infoLog("Clicked on the Next button on the Home Page");
			 Thread.sleep(1000);
			 
			 String forename_value = Excel_Utility.getCellData(Constant.Col_foreName, 0);
			 Log.infoLog("Reading the Forename Field from Excel Sheet Successful");
			 SignUp_Page.foreName_Field(driver).sendKeys(forename_value);
			 Log.infoLog("Filled the Forename Field on SignUp Page");
			 
			 String surname_value = Excel_Utility.getCellData(Constant.Col_surName, 0);
			 Log.infoLog("Reading the Surname Field from Excel Sheet Successful");
			 SignUp_Page.surName_Field(driver).sendKeys(surname_value);
			 Log.infoLog("Filled the Surname Field on SignUp Page");
			 
			 String gender_value = Excel_Utility.getCellData(Constant.Col_gender, 0);
			 Log.infoLog("Reading the Gender Field from Excel Sheet Successful");
			 SignUp_Page.gender_Field(driver, gender_value).click();
			 Log.infoLog("Clicked on the Gender Radio Button");
			  
			 String addressLine1_value = Excel_Utility.getCellData(Constant.Col_addressLine1, 0);
			 Log.infoLog("Reading the AddressLine1 Field from Excel Sheet Successful");
			 SignUp_Page.addressLine1_Field(driver).sendKeys(addressLine1_value);
			 Log.infoLog("Filled the AddressLine1 field on the SignUp page");
			 
			 String addressLine2_value = Excel_Utility.getCellData(Constant.Col_addressLine2, 0);
			 Log.infoLog("Reading the AddressLine2 Field from Excel Sheet Successful");
			 SignUp_Page.addressLine2_Field(driver).sendKeys(addressLine2_value);
			 Log.infoLog("Filled the Address Line2 Field on SignUp page");
			 
			 String city_value = Excel_Utility.getCellData(Constant.Col_city, 0);
			 Log.infoLog("Reading the City Field from Excel Sheet Successful");
			 SignUp_Page.city_Field(driver).sendKeys(city_value);
			 Log.infoLog("Filled the City field on the SignUp page");
			 
			 String postalcode_value = Excel_Utility.getCellData(Constant.Col_postalcode, 0);
			 Log.infoLog("Reading the PostalCode Field from Excel Sheet Successful");
			 SignUp_Page.postalCode_Field(driver).sendKeys(postalcode_value);
			 Log.infoLog("Filled the PostalCode field on SignUp Page");
			 
			 String telephone_value = Excel_Utility.getCellData(Constant.Col_telephone, 0);
			 Log.infoLog("Reading the Telephone Field from Excel Sheet Successful");
			 SignUp_Page.telephone_Field(driver).sendKeys(telephone_value);
			 Log.infoLog("Filled the Telephone Field on SignUp Page");
			 
			 String country_value = Excel_Utility.getCellData(Constant.Col_country, 0);
			 Log.infoLog("Reading the Country Field from Excel Sheet Successful");	
			 new Select(SignUp_Page.country_Field(driver)).selectByVisibleText(country_value);
			 Log.infoLog("Selected the Country from the Country Dropdown on SignUp Page");
			 
			 SignUp_Page.submit_Field(driver).click();
			 Log.infoLog("Clicked on the Submit Button on the SignUp Page");
		} catch (Exception e) {
			Log.errorLog(e.getMessage());
		    throw(e);
		}
	}

}
