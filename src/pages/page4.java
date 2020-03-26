package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import uitility.DriverWait;
import uitility.Screenshot;
import uitility.logc;


public class page4 {
//String[][] dtatalist= new String[3][2];

	WebDriver dr;
	public DriverWait w;
	Screenshot s;
	logc l;
public page4(WebDriver dr) {
		// TODO Auto-generated constructor stub
	
	this.dr=dr;
	w= new DriverWait(dr);
	s= new Screenshot(dr);
	l= new logc();
}
By id=By.xpath("//div[@id='Catalog']//following::input[2]");
By pwd=By.xpath("//div[@id='Catalog']//following::input[3]");
By log=By.xpath("//div[@id='Catalog']//following::input[4]");
public By out=By.xpath("//div[@id='MenuContent']//following::a[2]");
By act1=By.xpath("//div[@id='Content']//following::li");
By act2=By.xpath("//div[@id='WelcomeContent']//span ");
String ares=null;

public String login(String m,String p)
{
	

	 
	
	WebElement  e1 = w.waitforElement(id,20);
	 e1.sendKeys(m);
	 WebElement  e2 = w.waitforElement(pwd,20);
	 e2.sendKeys(p);
	 s.sst();
	 WebElement  e3 = w.waitforElement(log,20);
	 e3.click();

	 WebElement  e5 = w.waitforElement(out,20);
	 String text=e5.getText();
	 if(text.equals("Sign Out"))
	 {
		 WebElement  e6 = w.waitforElement(act2,20);
		  ares=e6.getText();
		  l.logup("log in successful for user id    "+m+"  and  password   "+p);
		 
		  e5 = w.waitforElement(out,20);
	     e5.click();
	 }
	 else
	 {
		 WebElement  e7 = w.waitforElement(act1,20);
	     ares=e7.getText();
	 }
	 return ares;
}
}
