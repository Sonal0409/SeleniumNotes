package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigurationTest {
	
	public static WebDriver driver;
	
	public static void config()
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (29)\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	}
	

	




}
