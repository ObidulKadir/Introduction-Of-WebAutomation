package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locator extends BaseDriver{
	
	String url = "https://demo.nopcommerce.com/";
	
	@Test
	public void StartUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		/*
		 CssSelector.
		1. Element Selector
		Ex: p, div, a
		2. Id Selector
		Ex: #register, attribute#id, input#firstname
		3. ClassSelector.
		Ex: .ClassName, .register, input.register
		4. Attribute selector
		Ex: [attribute = 'value'], [data-toggle="dropdown"
		5. Combining Selector.
		Ex: ul#menu > li
		 * 
		 * 
		 */
		WebElement register = driver.findElement(By.cssSelector(".ico-register"));
		register.click();
		Thread.sleep(5000);
		
		//ID
		WebElement FirstName = driver.findElement(By.id("FirstName"));
		FirstName.click();
		FirstName.sendKeys("Rikta");
		
		
		
		
		
	}
}
