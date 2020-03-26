package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel_read {

	
	public String[][] Read(String sheet_name , int r, int c)
	{
		String[][] data = new String[r][c];
		File f= new File("src/test/resources/Data/loga.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet(sheet_name);
			for(int i=1;i<=r;r++)
			{
			
			XSSFRow row=sheet.getRow(r);
			for(int j=0;j<=c;c++)
			{
				
			XSSFCell cell=row.getCell(c);
			data[i-1][j]=cell.getStringCellValue();
			
			
		    }
			
			}
			
			}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		return data;
	
}
}