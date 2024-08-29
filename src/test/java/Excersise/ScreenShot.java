package Excersise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class ScreenShot extends BaseDriver{
	
 WebDriver driver;
	
	
	@Test
	public void excuteUrl() throws IOException {
		driver = Web.Automation.BaseDriver.driver;
		
		
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
//		driver.manage().addCookie("");
//		driver.manage().deleteCookieNamed("");
//		driver.manage().deleteCookie(null);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "aa" +".png";
		File destination = new File(dest);
		FileUtils.copyFile(src, destination);
	}
	
	

}
