package seleniumScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (29)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		
		driver.manage().window().maximize();
		
		//1. Open the url on the browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//div[@class='floatL leftwidth']/descendant::input[3]")).click();
		
		Thread.sleep(3000);
		
		//Switch from current window to Alert box
		
		// Alert is a class in selenium, responsible to handle alert box element
		
		Alert a= driver.switchTo().alert();
		
		System.out.println(	a.getText());
		
		Thread.sleep(2000);
		
		a.accept();  // click on ok or Yes
		
		//a.dismiss();  // click on NO, cancel button on the alert box
		
	driver.findElement(By.xpath("//div[@class=\"table\"]/descendant::input[1]")).clear();
		driver.findElement(By.xpath("//div[@class=\"table\"]/descendant::input[1]")).sendKeys("sonal");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
