package Practise_Testngg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Test_04 {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.xpath(".//*[@id='booking']/a")).click();
	  driver.findElement(By.xpath(".//*[@id='confirm']")).click();
	  driver.findElement(By.xpath(".//*[@id='ccnum']")).sendKeys("1234567");
	  driver.findElement(By.xpath(".//*[@id='ccname']")).sendKeys("kiranpuram");
	  new Select(driver.findElement(By.xpath(".//*[@id='ccmonth']"))).selectByIndex(1);
	  new Select(driver.findElement(By.xpath(".//*[@id='ccyear']"))).selectByIndex(1);
	  driver.findElement(By.xpath(".//*[@id='ccvc']")).sendKeys("322");
	  driver.findElement(By.xpath(".//*[@id='paynow']")).click();
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
