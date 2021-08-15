package seleniumScripts;

import org.openqa.selenium.By;

public class DemoTest extends ConfigurationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		config();
		//driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
      
		// Absolute Xpath
		///html/body/div[2]/div[5]/table/tbody/tr[1]/td[3]
		driver.findElement(By.xpath("/html/body/div[2]/div[5]/table/tbody/tr/td[3]"));
		
		// Relative Xpath: //tagname[@attribute='value']
		
		// XPATH functions: text(), contains() & starts-with
		
		// text() funtion is used text node
		//tagname[text()='value']
		
		//td[text()='62.10']
		
			
		// Contains function: 
		
		// //tagname[contains(text(),'value')]
		
		//a[contains(text(),'India')]
		
		
		// Starts-with function
		
		//div[starts-with(text(),'Top')]
		
		
		//xpath Axis
		
		//tagname[@attribute='value]/axis::tagname
		
		// 1. child 
		
		//div[@id='telcom']/child::h5
		
		//2. Descendant
		
		//div[@class='div_secto_tabs']/descendant::h5[1]
		
		//div[@class='div_secto_tabs']/descendant::h5[5]
		
		// 3. Following
		//div[@class='div_secto_tabs']/following::li[5]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
