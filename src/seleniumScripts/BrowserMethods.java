package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (29)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		
		driver.manage().window().maximize();
		
		//1. Open the url on the browser
		
		driver.get("https://www.wikipedia.org/");
		
		
		//3. Fetch the title of the Page
		
		String title= driver.getTitle(); // returns a String
		
		System.out.println(title);
		
		// wikipedia == Wikipedia
		
		if(title.contains("Wikipedia"))
		{
			System.out.println("Title of the Page is Correct");
		}
		else
		{
			System.out.println("Title of the Page is not Correct");
		}
		
		// Fetch the URL of the webpage
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(2000);
		
		driver.close();

		
		
			
		
	}

}
