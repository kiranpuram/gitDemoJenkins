package jenkinsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class demo {
  @Test
  public void f() {
	  System.out.println("helloworld");
	  WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.ie");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
  }
}
