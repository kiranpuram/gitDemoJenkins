package SeleniumPractise;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class DataDriven_New extends Helper{
  @Test
  public void Read_Excel() throws Exception {
	 	   
	  FileInputStream fis = new FileInputStream("C:\\workspace\\data1.xls");
	  Workbook wb = Workbook.getWorkbook(fis);
	  Sheet s = wb.getSheet("kiran");
	  	  
	  // driver.findElement(By.xpath(s.getCell(0,2).getContents())).click();
	  // driver.findElement(By.xpath(s.getCell(0,3).getContents())).click();
	  int j=0;  
	  for(int i=1;i<s.getRows();i++)
	  {
		  if(s.getCell(7,i).getContents().equalsIgnoreCase("name"))
			  j=1;
		  else if(s.getCell(7,i).getContents().equalsIgnoreCase("id"))
			  j=2;
		  else if(s.getCell(7,i).getContents().equalsIgnoreCase("xpath"))
			  j=0;
		  try {
			  
			  if(s.getCell(4, i).getContents().equalsIgnoreCase("homepage"))
			  {
				 j=0;
				 String str = driver.findElement(By.xpath(s.getCell(j,i).getContents())).getText();
				 Assert.assertEquals(str, "This is demo website to learn concept of automation testing. Please note that information being submitted is not directing anywhere!");
				 System.out.println("On Home Page");
			 }
			  else if(s.getCell(4, i).getContents().equalsIgnoreCase("checkbox"))
			  {
				  if(j==0)
				      driver.findElement(By.xpath(s.getCell(j,i).getContents())).click();
				  else if(j==1)
					  driver.findElement(By.name(s.getCell(j,i).getContents())).click();
				  else
					  driver.findElement(By.id(s.getCell(j,i).getContents())).click();
			  }
			  else if(s.getCell(4, i).getContents().equalsIgnoreCase("signuppage"))
			  {
				//System.out.println("in check box");
				  j=0;
				  System.out.println("On Sign UP Page : " + driver.findElement(By.xpath(s.getCell(j,i).getContents())).isDisplayed()); 
			  }
			  else if(s.getCell(4, i).getContents().equalsIgnoreCase("textbox"))
			  {
				 if(j==0)
					 driver.findElement(By.xpath(s.getCell(j,i).getContents())).sendKeys(s.getCell(5,i).getContents());
				 else if(j==1)
				     driver.findElement(By.name(s.getCell(j,i).getContents())).sendKeys(s.getCell(5,i).getContents());
				 else
					 driver.findElement(By.id(s.getCell(j,i).getContents())).sendKeys(s.getCell(5,i).getContents());
			  }
			  else if((s.getCell(4, i).getContents().equalsIgnoreCase("radiobtn")))
			  {
				 if(j==0)
					 driver.findElement(By.xpath(s.getCell(j, i).getContents())).click();
				 else if(j==1)
					 driver.findElement(By.name(s.getCell(j, i).getContents())).click();
				 else
				  driver.findElement(By.id(s.getCell(j, i).getContents())).click();
			  }
			  else if(s.getCell(4, i).getContents().equalsIgnoreCase("dropdown"))
			  {
				  if(j==0)
					  new Select(driver.findElement(By.xpath(s.getCell(j, i).getContents()))).selectByVisibleText(s.getCell(5, i).getContents());
				  else if(j==1)
					  new Select(driver.findElement(By.name(s.getCell(j, i).getContents()))).selectByVisibleText(s.getCell(5, i).getContents());
				  else
				  new Select(driver.findElement(By.id(s.getCell(j, i).getContents()))).selectByVisibleText(s.getCell(5, i).getContents());
			  }
			  else if(s.getCell(4, i).getContents().equalsIgnoreCase("button"))
			  {
				  System.out.println("in Button "+ j);
				  System.out.println("xpath is " + s.getCell(j, i).getContents());
				  if(j==0)
					  driver.findElement(By.xpath(s.getCell(j, i).getContents())).click();
				  else if(j==1)
					  driver.findElement(By.name(s.getCell(j, i).getContents())).click();
				  else
				      driver.findElement(By.id(s.getCell(j, i).getContents())).click();
			  }
			  else if(s.getCell(4, i).getContents().equalsIgnoreCase("wait"))
			  {
				  //System.out.println("in wait");
				  Thread.sleep(5000);
			  }
			  else if(s.getCell(4, i).getContents().equalsIgnoreCase("ajax"))
			  {
				  if(j==0)
					  driver.findElement(By.xpath(s.getCell(j, i).getContents())).click();
				  else if(j==1)
					  driver.findElement(By.name(s.getCell(j, i).getContents())).click();
				  else
				      driver.findElement(By.id(s.getCell(j, i).getContents())).click();
			  }
			  else if(s.getCell(4, i).getContents().equalsIgnoreCase("ajaxDate"))
			  {
				  if(j==0)
					  driver.findElement(By.xpath(s.getCell(j, i).getContents())).click();
				  else if(j==1)
					  driver.findElement(By.name(s.getCell(j, i).getContents())).click();
				  else
				      driver.findElement(By.id(s.getCell(j, i).getContents())).click();
			  }
		} catch (Exception e) {
			//System.out.println("Exception is" + e);
						// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
  }
}
