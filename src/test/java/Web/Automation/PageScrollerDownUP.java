package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


/*
 * Scroll automatically BOTTOM to TOP, Specific location.
 * 
 * 1. create javascriptExecutor js = (javascriptexecutor)driver;
 *  scroll to bottom
 * 2. js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
 * scroll to TOP
 * 3. js.executeScript("window.scrollTo(0,0));
 * specific location
 *  4. find that location using xpath
 *  js.executeScript("arguments[0].scrollIntoView(true)", Location);
 *  
 * 
 */

public class PageScrollerDownUP extends BaseDriver{
	
	String url = "https://www.daraz.com.bd/";
	
	@Test
	public void ExcetueURL() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		
		
		//scroller 
		// down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll Down - Bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//scroll up - top
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		
		// scroll to specifc position.
		WebElement location = driver.findElement(By.xpath("//h3[contains(text(),'Just For You')]"));
		js.executeScript("arguments[0].scrollIntoView(true)",location);
		Thread.sleep(3000);
	}
	
	public void scrollDown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollheight)");
		Thread.sleep(3000);
	}
	
	public void scrollTop() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,0");
		Thread.sleep(3000);
	}
	
	public void scrollToSpecific(WebElement elementLocation) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", elementLocation);
		Thread.sleep(3000);
	}
}
