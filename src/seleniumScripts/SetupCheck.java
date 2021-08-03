package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// invoke chromedriver
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (29)\\chromedriver.exe");
		
		// step2: start the session chrome browser
		
		WebDriver driver= new ChromeDriver();
		
		// Step 3: open a url on chrome browser
		
		driver.get("https://www.wikipedia.org/");
		
		
		
		
		
		

	}

}
