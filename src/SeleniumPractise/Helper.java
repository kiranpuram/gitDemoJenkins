package SeleniumPractise;

//import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;*/
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Helper {
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("http://localhost/testapp/index.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
  @Test
  public void data() throws Exception{
	  driver.findElement(By.xpath(".//*[@id='information']/a")).click();
	  driver.findElement(By.id("forenames")).sendKeys("kiran");
	  driver.findElement(By.name("surname")).sendKeys("puram");
	  List<WebElement> radio = driver.findElements(By.name("sex"));
	  for(int i=0;i<radio.size();i++)
	  {
		  if(radio.get(i).getAttribute("value").equalsIgnoreCase("female"))
			  radio.get(i).click();
	  }
	  driver.findElement(By.id("address1")).sendKeys("kingsCourtApt");
	  driver.findElement(By.id("address2")).sendKeys("parnellStreet");
	  driver.findElement(By.xpath(".//*[@id='city']")).sendKeys("dublin");
	  driver.findElement(By.xpath(".//*[@id='postalcode']")).sendKeys("dublin1");
	  driver.findElement(By.xpath(".//*[@id='telephone']")).sendKeys("123456");
	  new Select(driver.findElement(By.xpath(".//*[@id='form']/form/select"))).selectByVisibleText("Ireland");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("html/body/div[3]/a/input")).click();
	  
  }
 
  @AfterTest
  public void afterTest() {
  }

}
