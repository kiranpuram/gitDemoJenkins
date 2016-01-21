package SeleniumPractise;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
//import org.apache.log4j.BasicConfigurator;

public class NewTest {
	WebDriver driver;
	
		
 @BeforeMethod
  public void beforeMethod()
 {
	 driver = new FirefoxDriver();
	 driver.get("http://inoerp.org/extensions/user/user_login.php");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
 @Test
 public void f() throws Exception {
		  
	  driver.findElement(By.xpath(".//*[@id='topbar']/div/div[2]/div[1]/div/button")).click();
	  driver.findElement(By.xpath(".//*[@id='user_login']/ul/li[4]/input")).click();
	  driver.findElement(By.xpath(".//*[@id='dashborad_menu']/li[1]/k/a/i")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("html/body/div[3]/div[3]/div[2]/div/div/div/div[2]/ul/li[1]/a")).click();
	  FileInputStream fis = new FileInputStream("C:\\workspace\\TestTriangle\\data.xls");
	  Workbook wb = Workbook.getWorkbook(fis);
	  Sheet s = wb.getSheet("kiran");
	  System.out.println(s.getCell(0,1).getContents());
	  }
 

  @AfterMethod
  public void afterMethod() {
  }

}
