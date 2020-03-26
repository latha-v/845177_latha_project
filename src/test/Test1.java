package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import excelutil.Read;
import pages.Page1;
import pages.page4;
import uitility.Drivers;


public class Test1 {
	WebDriver dr;
	Page1 p1;
	Read r;
	Drivers d;
	String url="https://jpetstore.cfapps.io/catalog";
	@BeforeClass
	public void t1()
	{
		d= new Drivers();
		dr=d.String("chrome",url);
		
	}

	@Test(dataProvider="logindata")
	public void t5(String uid,String pwd,String eres)
	{
	
		page4 p4 = new page4(dr);	
		 WebElement  e5 = p4.w.waitforElement(p4.out,20);
		 e5.click();
		String name=p4.login(uid,pwd);
		System.out.println(name);
		Assert.assertTrue(name.equals(eres));	
	}
	
	@DataProvider(name="logindata")
	public String[][]dp()
	{
		r= new Read();
		 
		String datalist[][]=new String[3][3];
		datalist=r.read();
		
		 return datalist;
	}
@AfterClass
	public void ac()
	{
		
		
		dr.close();
		}
	}
	

