package Excersise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Web.Automation.BaseDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteCookies extends BaseDriver{
	
 WebDriver driver;
	
	
	@Test
	public void excuteUrl() {
		driver = Web.Automation.BaseDriver.driver;
		
		
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
//		driver.manage().addCookie("");
//		driver.manage().deleteCookieNamed("");
//		driver.manage().deleteCookie(null);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}
	
	

}
