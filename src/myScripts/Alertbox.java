package myScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (29)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
		

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Thread.sleep(2000);

		// click on submit button without entering the username and password
	
		driver.findElement(By.name("proceed")).click();
		
		//Thread.sleep(3000);
		
		// An Alert box is displayed
		
	// to switch from main window to alert box
	
		// if we have to perform any operations like press ok button, press cancel button, get the error message
		// we need to create an object for Alert
	
		Alert a= driver.switchTo().alert();
		
		//a.accept();   // Use this method to click on Ok, Yes, Accept
		
		//a.dismiss(); //Use this method to click on Cancel, No, Dismiss
		
		String text = a.getText();  // to fetch the error message from alert box
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		a.accept(); 
		
		//a.sendKeys("Sonal"); // to enter data on the text box present on ALert box
		
		
		
		
		
		
		

	}

}
