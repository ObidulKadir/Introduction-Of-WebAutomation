package Web.Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MultipleWindowHandle extends BaseDriver{
	String url = "https://rahulshettyacademy.com/loginpagePractise/";
	
	@Test
	public void excuteUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement blinkLink = driver.findElement(By.cssSelector(".blinkingText"));
		blinkLink.click();
		
		Set<String> windows = driver.getWindowHandles();//[parentid,childid,subchildId]
		Iterator<String> it =  windows.iterator();
		
		String parentWindow = it.next();
		String childWindow	= it.next();
		
		driver.switchTo().window(childWindow);
		
		String text = driver.findElement(By.cssSelector("p.im-para.red")).getText();
		System.out.println(text);
		
		driver.findElement(By.cssSelector("p.im-para.red")).getText();
		
		
		String emailExtract = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentWindow);
		driver.findElement(By.cssSelector("#username")).sendKeys(emailExtract);
		Thread.sleep(5000);
		

		
	}
}
