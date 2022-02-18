package sitDotSkyscooling;

import org.openqa.selenium.By;

import BasePackage.Base;

public class addEmployee extends Base {

	public static void main(String[] args) throws InterruptedException {
		driverSetUp();
		getUrl("http://sit.skyschooling.com/");
		
		UserLogin userLogin;
		userLogin = new UserLogin();
		
		userLogin.login("mdtanvirsharif@gmail.com", "Anupom12345");
		
		click(By.xpath("//button[@class='openbtn']"));
		click(By.xpath("//a[@href='http://sit.skyschooling.com/employee']"));
		click(By.xpath("//a[@href='http://sit.skyschooling.com/employee/create']"));
		sendKeys(By.xpath("//input[@id='first_name']"), "Mohammad Ajmal");
		sendKeys(By.xpath("//input[@id='last_name']"), "Sharif");
		sendKeys(By.xpath("//input[@name='photo']"), "C:\\Java\\dp2.jpg");
		sendKeys(By.xpath("//input[@id='email']"), "anupomrulz@gmail.com");
		sendKeys(By.xpath("//input[@id='phone']"), "11-111");
		sendKeys(By.xpath("//select[@name='country']"), "USA");
		click(By.xpath("//input[@value='graduation']"));
		sendKeys(By.xpath("//textarea[@name='address']"), "5012, SW 122th Street");
		click(By.xpath("//select[@name='salary_range']/option[3]"));
		sendKeys(By.xpath("//input[@name='department']"), "Engineer");
		click(By.xpath("//input[@id='hr']"));
		sendKeys(By.xpath("//input[@name='salary']"), "40000");
		click(By.xpath("//input[@name='status'][@value='0']"));
		click(By.xpath("//input[@name='check_me']"));
		click(By.xpath("//button[@type='submit']"));
		click(By.xpath("//button[@class='openbtn']"));
		click(By.xpath("//a[@href='http://sit.skyschooling.com/employee']"));
		
		
		//driver.findElement(By.xpath("//button[@class='openbtn']")).click();
		//driver.findElement(By.xpath("//a[@href='http://sit.skyschooling.com/employee']")).click();
		//driver.findElement(By.xpath("//a[@href='http://sit.skyschooling.com/employee/create']")).click();
		//driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("MD");
		//driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Sharif");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='photo']")).sendKeys("C:\\Java\\dp.jpg");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mdsharif@gmail.com");
		//driver.findElement(By.xpath("//input[@id='ccode']"));
		//driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("111-1111");
		//driver.findElement(By.xpath("//select[@name='country']")).sendKeys("USA");
		//driver.findElement(By.xpath("//input[@value='graduation']")).click();
		//driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("12314, South Land Avenue, OK-73173");
		//driver.findElement(By.xpath("//select[@name='salary_range']/option[3]")).click();
		//driver.findElement(By.xpath("//input[@name='department']")).sendKeys("Psychology");
		//driver.findElement(By.xpath("//input[@id='hr']")).click();
		//driver.findElement(By.xpath("//input[@name='salary']")).sendKeys("50000");
		//driver.findElement(By.xpath("//input[@name='status'][@value='0']")).click();
		//driver.findElement(By.xpath("//input[@name='check_me']")).click();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//button[@class='openbtn']")).click();
		//driver.findElement(By.xpath("//a[@href='http://sit.skyschooling.com/employee']")).click();
	}

}
