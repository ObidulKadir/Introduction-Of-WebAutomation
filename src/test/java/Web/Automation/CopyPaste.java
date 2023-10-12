package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyPaste extends BaseDriver{
	String url = "https://demoqa.com/elements";
	
	@Test
	public void StartUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		// //tagName[contains(text(), "string")]
		WebElement TextBoxElement = driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));
		TextBoxElement.click();
		Thread.sleep(3500);
		
		
		//first name 
		WebElement FullName = driver.findElement(By.xpath("//input[@id='userName']"));
		FullName.click();
		FullName.sendKeys("Birani");
		Thread.sleep(3500);
		
		// select
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		// copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//tab
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
		// paste
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(5000);
		
		
		
	}
}
