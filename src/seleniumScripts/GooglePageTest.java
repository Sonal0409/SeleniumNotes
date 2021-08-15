package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (29)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
	
		//driver.findElement(By.xpath("//div[@class='SDkEP']/descendant::input[1]")).sendKeys("edureka");

	driver.findElement(By.xpath("//div[@class='a4bIc']/child::input[1]")).sendKeys("edureka");
	
	Thread.sleep(7000);
	
	List<WebElement> l1 = driver.findElements(By.xpath("//ul[@role='listbox']/child::li"));
	
	System.out.println(" total list items are: " + l1.size());
	
	for(int i=0;i<l1.size();i++)
	{
		String text=l1.get(i).getText();
		System.out.println(text);
		
		if(text.contains("careers"))
		{
			l1.get(i).click();
			break;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	}

}
