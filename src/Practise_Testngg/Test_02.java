package Practise_Testngg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Test_02 {
	WebDriver driver;
	
  @Test
  @Parameters({"foreName" , "surName"})
  public void f(String foreName, String surName ) throws Exception {
	  driver.findElement(By.xpath(".//*[@id='information']/a")).click();
	  driver.findElement(By.xpath(".//*[@id='forenames']")).sendKeys(foreName);
	  driver.findElement(By.xpath(".//*[@id='surename']")).sendKeys(surName);
	  System.out.println("gender is: "+ driver.findElement(By.id("radiom")).getAttribute("value"));
	  driver.findElement(By.id("radiom")).click();
	  driver.findElement(By.id("address1")).sendKeys("apt 72,kings court");
	  driver.findElement(By.id("address2")).sendKeys("parnell street");
	  driver.findElement(By.xpath(".//*[@id='city']")).sendKeys("dublin");
	  driver.findElement(By.xpath(".//*[@id='postalcode']")).sendKeys("d1");
	  driver.findElement(By.name("telephone")).sendKeys("123456");
	  new Select(driver.findElement(By.xpath(".//*[@id='form']/form/select"))).selectByVisibleText("Ireland");
	  driver.findElement(By.xpath("html/body/div[3]/a/input")).click();
	  Thread.sleep(3000);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("http://localhost/testapp/index.html");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
