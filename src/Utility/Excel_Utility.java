package Utility;

import java.io.FileInputStream;

//import org.apache.commons.collections.bag.SynchronizedSortedBag;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Utility{
		
	private static FileInputStream fis;
	private static Workbook Excel_Wb;
	private static Sheet Excel_Sheet;
	
	
	public static void open_ExcelFile(String path,String sheetName) throws Exception
	{
		
		fis = new FileInputStream(path);
		Excel_Wb = Workbook.getWorkbook(fis);
		Excel_Sheet = Excel_Wb.getSheet(sheetName);
		
		
	}
	
	public static String getCellData(int col,int row)
	{
		//System.out.println(Excel_Sheet.);
		String data = Excel_Sheet.getCell(col,row).getContents();
		return data;
	}
}
