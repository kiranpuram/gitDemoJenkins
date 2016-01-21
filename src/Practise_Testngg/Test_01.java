package Practise_Testngg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Test_01 {
	public WebDriver driver; 
 
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("http://localhost/testapp/index.html");
	  driver.manage().window().maximize();
  }
  @Test
  public void f() {
	  Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='body']/p")).getText(), "This is demo website to learn concept of automation testing. Please note that information being submitted is not directing anywhere!");
	 driver.findElement(By.xpath(".//*[@id='checkbox']")).click();
	 driver.findElement(By.id("next")).click();
	  
  }
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
