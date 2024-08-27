package Excersise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Web.Automation.BaseDriver;

public class Scrolling extends BaseDriver {
	String url = "http://qaclickacademy.com/practice.php";
	WebDriver driver;
	
	@Test
	public void excuteUrl() throws InterruptedException {
		driver = Web.Automation.BaseDriver.driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(url);
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		
//		document.querySelector(".tableFixHead").scrollBy(0,30)
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=11\r\n"
				+ "");
		
		/*
		 * querySelector is a JavaScript method used to select and return the first element that matches a specified CSS selector from the DOM (Document Object Model). It allows you to use any valid CSS selector to find elements within the HTML document.

		Here's how it works:
		
		Syntax:
		
			let element = document.querySelector('selector');
			
		'selector': A string representing a CSS selector (e.g., '.class', '#id', 'tag', or attribute selectors).
		Returns: The first matching element, or null if no element matches the selector.
		 */
	}
}
