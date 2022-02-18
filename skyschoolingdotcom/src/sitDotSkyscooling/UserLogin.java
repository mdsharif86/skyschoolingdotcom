package sitDotSkyscooling;

import org.openqa.selenium.By;

import BasePackage.Base;

public class UserLogin extends Base {
	void login(String emailId, String password) throws InterruptedException {
		
		click(By.xpath("//button[text()='Login'][@type='button']"));
		Thread.sleep(500);
		sendKeys(By.xpath("//input[@id='email'][@name='email'][@class='form-control ']"), emailId);
		sendKeys(By.xpath("//input[@id='password'][@autocomplete='current-password']"), password);
		click(By.xpath("//label[@for='remember']"));
		click(By.xpath("//button[text()='Login'][@type='submit']"));
		
		//driver.findElement(By.xpath("//button[text()='Login'][@type='button']")).click();
		//driver.findElement(By.xpath("//input[@id='email'][@name='email'][@class='form-control ']")).sendKeys("mdtanvirsharif@gmail.com");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='password'][@autocomplete='current-password']")).sendKeys("Anupom12345");
		//driver.findElement(By.xpath("//label[@for='remember']")).click();
		//driver.findElement(By.xpath("//button[text()='Login'][@type='submit']")).click();
	}
}
