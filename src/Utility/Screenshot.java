package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Screenshot {
	static int i=0;

	WebDriver dr;
	
	public Screenshot(WebDriver dr)
	{
		this.dr=dr;
	}
	public void take_screenshot()
	{
		File f1=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
        File f2=new File("/YOURLOGA1/src/test/resources/Screenshots/loga["+i+"].png");
        try {
FileUtils.copyFile(f1,f2);
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
        i++;
        System.out.println("in sst");
	}
	
}
