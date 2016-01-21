package Practise_Testngg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Test_03 {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.xpath(".//*[@id='booking']/a")).click();
	  new Select(driver.findElement(By.xpath(".//*[@id='depart']/select"))).selectByIndex(0);
	  new Select(driver.findElement(By.xpath(".//*[@id='arrive']/select"))).selectByVisibleText("New York");
	  driver.findElement(By.xpath(".//*[@id='passengers']/input")).sendKeys("1");
	  driver.findElement(By.id("window")).click();
	  driver.findElement(By.xpath(".//*[@id='datepicker']")).click();
	  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[5]/a")).click();
	  driver.findElement(By.xpath(".//*[@id='datepicker1']")).click();
	  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[5]/a")).click();
	  driver.findElement(By.xpath(".//*[@id='tripcheckbox']")).click();
	  driver.findElement(By.xpath(".//*[@id='economy']")).click();
	  driver.findElement(By.xpath(".//*[@id='confirm']")).click();
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
