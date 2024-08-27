package Excersise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Web.Automation.BaseDriver;

public class AutoSuggestiveDropdown extends BaseDriver{
	
	String url = "http://qaclickacademy.com/practice.php";
	WebDriver driver;
	
	@Test
	public void excuteUrl() throws InterruptedException {
		driver = Web.Automation.BaseDriver.driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ban");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value"));
		
	}

}
