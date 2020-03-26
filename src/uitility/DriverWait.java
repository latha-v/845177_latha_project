package uitility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWait {

	WebDriver dr;
	public DriverWait(WebDriver dr)
	{
		this.dr=dr;
	}
	public WebElement waitforElement(By locator,int timeout)
	{
WebElement element=null;
		try {
			WebDriverWait wait=new WebDriverWait(dr,timeout);
			element =wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
				
	}
	catch(Exception e)
	{
		System.out.println("Element not located  "+e);
	}
	return element	;
	}

	public WebElement elementToBeClickable(By loc,int timeout)
	{
WebElement element=null;
		try {
			WebDriverWait wait=new WebDriverWait(dr,timeout);
			element =wait.until(ExpectedConditions.elementToBeClickable(loc));
			
			
	}
	catch(Exception e)
	{
		System.out.println("Element not located  "+e);
	}
	return element;	
	}
}
