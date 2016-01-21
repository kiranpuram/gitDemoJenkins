package Framework;

import org.testng.annotations.Test;



//import PageObjects.Home_Page;
import AppModules.Signup_Action;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.FileAppender;
//import org.apache.log4j.HTMLLayout;
//import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
//import PageObjects.*;
import Utility.*;

public class TC_PageObject{
	
  private WebDriver driver = null;
  
  @Parameters({"browser"})
  @BeforeMethod
  public void beforeMethod( String bsr) throws Exception
  {
	  //PropertyConfigurator.configure("C:\\workspace\\TestTriangle\\log4.properties");
	  DOMConfigurator.configure("log4j.xml");
	  //PropertyConfigurator.
	  Log.startTestCase("TestTriangleApp-PageObject");
	  Log.infoLog("Calling a method to Open Excel File");
	  Excel_Utility.open_ExcelFile("C:\\workspace\\TestTriangle\\page_Data.xls","kiran"/*Constant.ExcelFile_path, Constant.Excel_SheetName*/);
	  Log.infoLog("Excel File opened");
	  if(bsr.equalsIgnoreCase("Firefox"))
	  {
		  driver = new FirefoxDriver();
		  Log.infoLog("Driver initialized to Firefox Driver");
	  }
	  else if(bsr.equalsIgnoreCase("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumLibraries\\chromedriver.exe");
		  driver = new ChromeDriver();
		  Log.infoLog("Driver initialized to Chrome Driver");
	  }
	  else if(bsr.equalsIgnoreCase("IE"))
	  {
		  System.setProperty("webdriver.ie.driver", "C:\\SeleniumLibraries\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();
		  Log.infoLog("Driver initialized to IE Driver");
	  }
	  driver.get(Constant.url);
	  Log.infoLog("Web application Launched");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Log.infoLog("Implicit wait applied on the driver ");
	 
		
  }

  @Test
  public void TestTriangleApp_TC() throws Exception 
  {
	  Log.infoLog("Calling a method to Perform Sign Up Acion");
	  
	  Signup_Action.execute(driver);
	  
	  Reporter.log("SignUp Action Successfully Performed");
	  //Log.infoLog("SignUp Action successfully performed");
	  	      
  }
 
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  Log.endTestCase("TestTriangleApp-PageObject");
	 }

}
