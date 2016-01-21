package Practise_Testngg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class SeleniumGrid {
	WebDriver driver;
	String baseURL, nodeURL;
  @Test
  public void f() {
	  driver.get(baseURL);
  }
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  baseURL = "http://www.google.com";
	  nodeURL = "http://192.168.30.132:5566/wd/hub";
	  DesiredCapabilities capability = DesiredCapabilities.firefox();
	  capability.setBrowserName("firefox");
	  capability.setPlatform(Platform.WINDOWS);
	  driver = new RemoteWebDriver(new URL(nodeURL),capability);
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
