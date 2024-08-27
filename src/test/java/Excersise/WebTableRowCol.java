package Excersise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Web.Automation.BaseDriver;

public class WebTableRowCol extends BaseDriver {
	String url = "http://qaclickacademy.com/practice.php";
	WebDriver driver;
	
	@Test
	public void excuteUrl() throws InterruptedException {
		driver = Web.Automation.BaseDriver.driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.id("product"));
		
		System.out.println(table.findElements(By.tagName("tr")).size());
		
		//table column
		System.out.println(table.findElement(By.tagName("tbody")).findElements(By.xpath("//tbody/tr/th")).size());
		
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(secondrow.get(0).getText());

		System.out.println(secondrow.get(1).getText());

		System.out.println(secondrow.get(2).getText());
	}
}
