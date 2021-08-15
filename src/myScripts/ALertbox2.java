package myScripts;

import org.openqa.selenium.By;

public class ALertbox2 extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setup("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("Sonal");
		

	}

}
