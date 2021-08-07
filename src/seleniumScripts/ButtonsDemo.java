package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (29)\\chromedriver.exe");
			
					WebDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					
					Thread.sleep(2000);
					
					driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
					
	// click on Button
					
					
// XPATH: //tagname[@attributename='value']
					//*[@id="n-contactpage"]/a
					
			//button[@id='wpCreateaccount']
	//<input id="wpName2" name="wpName" size="20" class="loginText mw-ui-input"
	//placeholder="Enter your username" tabindex="1" required="" autocomplete="username">	
		
		driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("sonal");
		
		driver.findElement(By.xpath("//input[@id='wpPassword2']")).sendKeys("password");
					
		driver.findElement(By.xpath("//button[@id='wpCreateaccount']")).click();		
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
	
	
	}

}
