package Streams;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Web.Automation.BaseDriver;

public class PartialScreenShot extends BaseDriver{
	int id;
	String Name;
	float price;
	
 WebDriver driver;
 @Test
public void excuteUrl() throws InterruptedException, IOException {
		
		driver = Web.Automation.BaseDriver.driver;
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		WebElement searchField = driver.findElement(By.id("search-field"));
		searchField.sendKeys("Rice");
		
		// partial screenshot
		
		File file =  searchField.getScreenshotAs(OutputType.FILE);
		
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "partialScreenShot" +".png";
		FileUtils.copyFile(file, new File(dest));
		
	}
	 
}
