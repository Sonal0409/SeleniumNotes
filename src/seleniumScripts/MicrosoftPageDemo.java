package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MicrosoftPageDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (29)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.get("https://login.live.com/");
			
			Thread.sleep(2000);
			
		driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("sonal04xyz");	
			
		Thread.sleep(2000);
		
		////*[@id="idSIButton9"]
		
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
			
		Thread.sleep(3000);	
		
		// capturing error message on webpage using selenium
		
		String errText= driver.findElement(By.xpath("//*[@id=\"usernameError\"]")).getText();
		
		System.out.println(errText);
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}

}
