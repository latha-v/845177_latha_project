package excelutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read  {
	String[][] datalist=new String[3][3];
public 	String[][] read()
{
	
	try
	{

		File f= new File("C:\\Users\\BLTuser.BLTuser-PC\\Desktop\\programming\\book3.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		for(int r=1;r<4;r++)
		{
		
		XSSFRow row=sheet.getRow(r);
		for(int c=0;c<3;c++)
		{
			
		XSSFCell cell=row.getCell(c);
		
		
		String value=cell.getStringCellValue();
		
		if(c==0)
		{
			
			datalist[r-1][c]=value.substring(1,(value.length())-1);
			System.out.println(datalist[r-1][c]);
		}
		else
		{
			datalist[r-1][c]=value;
		System.out.println(datalist[r-1][c]);
		}
		}
		}
		
    }

	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return(datalist);
}
/*(public void write()
{
	File f= new File("C:\\Users\\BLTuser.BLTuser-PC\\Desktop\\programming\\book3.xlsx");
	FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet1");
}*/
}
