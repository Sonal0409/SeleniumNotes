package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.live.com/");
		
		driver.findElement(By.id("idSIButton9")).click();
		
		Thread.sleep(3000);
		
		// inspect the error message and get the text of error
		
		String text =driver.findElement(By.id("usernameError")).getText();
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("i0116")).sendKeys("username1");
	

	}

}
