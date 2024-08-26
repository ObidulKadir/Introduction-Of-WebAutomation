package Web.Automation;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWait extends BaseDriver {

	String url = "https://the-internet.herokuapp.com/dynamic_loading/1";
	
	/*
	 * 
	 * ExplicitWait achieved in two ways: 1. WebDriverWait & 2. FluentWait
	 * 
	 * Note: WebDriverWait and FluentWait class are implementing the "Wait" interface.
	 * 
	 * Diff: FluentWait is regularly wait at the regular intervals of time based on the polling seconds whatever you provide until the timeout is achieved or till the object is found.
	 * Whereas, Webdriver continuously monitoring and if the element is found then its executed.
	 * 
	 * Cons: FluntWait has to customized the method based on needs. 
	 **/
	 

	@Test
	public void executeUrl() throws InterruptedException {
		// Initialize WebDriver and open the browser
		driver.manage().window().maximize();
		driver.get(url);

		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		WebElement helloworld = driver.findElement(By.cssSelector("div[id='finish'] h4"));
		
		//fluent syntax
		
		Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       if(helloworld.isDisplayed()) {
		    	   return helloworld;
		       }
		       else {
		    	   return null;
		       }
		     }
		}
		     );
	
	System.out.println(helloworld.getText());
}
}
