package Streams;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import Web.Automation.BaseDriver;
import dev.failsafe.internal.util.Assert;

public class Search  extends BaseDriver{

	WebDriver driver;
	
	@Test
	public void excuteUrl() throws InterruptedException {
		
		driver = Web.Automation.BaseDriver.driver;
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("rice");
		
		List<WebElement> vaggislist=  driver.findElements(By.xpath("//tbody/tr/td[1]"));
		vaggislist.stream().map(s->s.getText()).forEach(s->System.out.println(s));
		
		
		List<WebElement> filteredList = vaggislist.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		
		try {
			System.out.println("The vaggis list size "+vaggislist.size()+ " Filtered Size: "+ filteredList.size());
			org.testng.Assert.assertEquals(vaggislist.size(), filteredList.size());
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
