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

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleHTTPSCertifications {
	
public static WebDriver driver;
	
	@BeforeSuite
	public void StartBrowser() {
		String browserName = System.getProperty("browser", "edge");
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(options);
			
		}
		else if(browserName.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.setAcceptInsecureCerts(true);
			driver = new FirefoxDriver(options);
			
		}else {
			EdgeOptions options = new EdgeOptions();
			options.setAcceptInsecureCerts(true);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(options);
		}
	}
	
	@Test
	public void excuteUrl() {
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}
	
	
	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}

}
