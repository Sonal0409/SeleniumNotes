package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (29)\\chromedriver.exe");
			
					WebDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					
					Thread.sleep(2000);
					
					driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
					
	/*driver.findElement(By.linkText("Main page")).click();
	
	// fetch txt of the link
	
	String text=driver.findElement(By.linkText("Main page")).getText();
	
	System.out.println(text);*/
					
					
	driver.findElement(By.linkText("Contents")).click();
	
	//PartialLinkText
					
					// link : Forgot Username
					//        forgot user
					//        forgot email
					
			driver.findElement(By.partialLinkText("Community")).click();	
	
	
					
					
					
					
					
					
					

	}

}
