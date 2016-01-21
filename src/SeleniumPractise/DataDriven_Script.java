package SeleniumPractise;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class DataDriven_Script extends Helper{
  @Test
  public void Read_Excel() throws Exception {
	 	   
	  FileInputStream fis = new FileInputStream("C:\\workspace\\TestTriangle\\data.xls");
	  Workbook wb = Workbook.getWorkbook(fis);
	  Sheet s = wb.getSheet("kiran");
	  	  
	 // driver.findElement(By.xpath(s.getCell(0,2).getContents())).click();
	 // driver.findElement(By.xpath(s.getCell(0,3).getContents())).click();
	 	  
	  for(int i=1;i<s.getRows();i++)
	  {
		  try {
			  
			  if(s.getCell(2, i).getContents().equalsIgnoreCase("homepage"))
			  {
				//System.out.println("in check box");
				  System.out.println("On Home Page : " + driver.findElement(By.xpath(s.getCell(0,i).getContents())).isDisplayed()); 
			  }
			  else if(s.getCell(2, i).getContents().equalsIgnoreCase("checkbox"))
			  {
				//System.out.println("in check box");
				  driver.findElement(By.xpath(s.getCell(0,i).getContents())).click();
			  }
			  else if(s.getCell(2, i).getContents().equalsIgnoreCase("signuppage"))
			  {
				//System.out.println("in check box");
				  System.out.println("On Sign UP Page : " + driver.findElement(By.xpath(s.getCell(0,i).getContents())).isDisplayed()); 
			  }
			  else if(s.getCell(2, i).getContents().equalsIgnoreCase("textbox"))
			  {
				//System.out.println("in text box");
				  driver.findElement(By.name(s.getCell(0,i).getContents())).sendKeys(s.getCell(3,i).getContents());
			  }
			  else if((s.getCell(2, i).getContents().equalsIgnoreCase("radiobtn")))
			  {
				  //System.out.println("in radiobtn");
				  driver.findElement(By.id(s.getCell(0, i).getContents())).click();
			  }
			  else if(s.getCell(2, i).getContents().equalsIgnoreCase("dropdown"))
			  {
				  //System.out.println("in dropdown");
				  new Select(driver.findElement(By.xpath(s.getCell(0, i).getContents()))).selectByVisibleText(s.getCell(3, i).getContents());
			  }
			  else if(s.getCell(2, i).getContents().equalsIgnoreCase("button"))
			  {
				  //System.out.println("button");
				  driver.findElement(By.xpath(s.getCell(0, i).getContents())).click();
			  }
			  else if(s.getCell(2, i).getContents().equalsIgnoreCase("wait"))
			  {
				  //System.out.println("in wait");
				  Thread.sleep(5000);
			  }
			  else if(s.getCell(2, i).getContents().equalsIgnoreCase("ajax"))
			  {
				  //System.out.println("button");
				  driver.findElement(By.xpath(s.getCell(0, i).getContents())).click();
			  }
			  else if(s.getCell(2, i).getContents().equalsIgnoreCase("ajaxDate"))
			  {
				  //System.out.println("button");
				  driver.findElement(By.xpath(s.getCell(0, i).getContents())).click();
			  }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
  }
}
