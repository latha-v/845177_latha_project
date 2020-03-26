package uitility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	WebDriver dr;
	public Screenshot(WebDriver dr)
	{
	this.dr=dr;
	}
	static int i=1;
	public void sst()
	{

	File f1=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	         File f2=new File("C:\\Users\\BLTuser.BLTuser-PC\\Desktop\\programming\\screenshots\\pet2["+i+"].png");
	         try {
	FileUtils.copyFile(f1,f2);
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	         i++;
	}
}
