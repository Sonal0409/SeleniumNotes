package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (29)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
			
			// To find an element on webpage and test it
			
			// Locators and action method
			
			// locators value from attributes of elements
			
// 1. element: Textbox: Username
			
		// find an element : findElement(using a locator & value).perform action onit
			
		// id locator	: unique for an element
/*			
	driver.findElement(By.id("wpName2")).sendKeys("Sonal");	
	driver.findElement(By.id("wpPassword2")).sendKeys("abc@123");*/
	
	// name Locator
			
 /* driver.findElement(By.name("wpName")).sendKeys("abc");
  driver.findElement(By.name("wpPassword")).sendKeys("abc@123");*/
			

// ClassName & tagName
			
//	driver.findElement(By.className("loginText mw-ui-input")).sendKeys("selenium");
			
/*driver.findElement(By.tagName("input")).sendKeys("abc");

driver.findElement(By.tagName("input")).sendKeys("abc@123");	*/
			

			
			
	Thread.sleep(3000);
	

	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}
	

}
