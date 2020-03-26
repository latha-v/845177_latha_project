package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import uitility.DriverWait;
import uitility.Screenshot;



public class Page1 {
	WebDriver dr;
	DriverWait w;
	Screenshot s;
	
public Page1(WebDriver dr) {
		// TODO Auto-generated constructor stub
	
	this.dr=dr;
	w= new DriverWait(dr);
	s= new Screenshot(dr);
}
By log=By.xpath("//a[@href='/login']");
public void sign()
{
	
	WebElement e= w.elementToBeClickable(log, 20);
	e.click();
}
}
