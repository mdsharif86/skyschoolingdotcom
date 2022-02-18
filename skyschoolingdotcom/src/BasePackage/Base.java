package BasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static void driverSetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void click(By by) {
		driver.findElement(by).click();
	}
	
	public static void sendKeys(By by, String keyValue) {
		driver.findElement(by).sendKeys(keyValue);
	}
}
