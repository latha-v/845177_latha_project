package uitility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
	

	WebDriver dr;
logc l= new logc();
	
	public WebDriver String(String browser, String url)
	{
		switch(browser)
		{
		case "chrome":
		{
		System.setProperty("webdriver.chrome.driver", "chrome_v79.exe");
		dr= new ChromeDriver();
		dr.get(url);
		l.logup("chrome browser is launched");
	    break;
		
	    }
		case "firefox":
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			dr= new FirefoxDriver();
			dr.get(url);
			l.logup(" firefox browser is launched");
			break ;
			
		}
		
}
		return dr;
}
}