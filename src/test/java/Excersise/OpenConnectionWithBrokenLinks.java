package Excersise;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.http.HttpConnection;
import org.bouncycastle.oer.its.etsi102941.Url;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Web.Automation.BaseDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenConnectionWithBrokenLinks extends BaseDriver{
	
 WebDriver driver;
	
	
	@Test
	public void excuteUrl() throws IOException {
		driver = Web.Automation.BaseDriver.driver;
		
		
		driver.manage().window().fullscreen();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 //broken URL

        //Step 1 - Is to get all urls tied up to the links using Selenium

        //  Java methods will call URL's and gets you the status code

        //if status code >400 then that url is not working-> link which tied to url is broken

        //a[href*="soapui"]'
		
		  List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));

	      SoftAssert a =new SoftAssert();
	      
	      for(WebElement link: links) {
	    	  String url = link.getAttribute("href");
	    	  HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

	          conn.setRequestMethod("HEAD");

	          conn.connect();
	          
	          int responseCode = conn.getResponseCode();
	          System.out.println(responseCode);
	          
	          a.assertTrue(responseCode<400,"The link with Test: "+link.getText()+"  is broken with code "+responseCode);
	      }
	      a.assertAll();
	}
	
	

}
