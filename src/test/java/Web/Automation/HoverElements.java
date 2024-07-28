package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/*
 * Hover Elements:
 * Actions action = new Actions(driver);
 * action.moveToElement(webelement)
 */


public class HoverElements extends BaseDriver {
	String url = "https://www.daraz.com.bd/";
	@Test
	public void ExceuteUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		
////		WebElement alertElement = driver.findElement(By.xpath("/html/body/div[8]//div/div/div[3]/button[1]"));
//		org.openqa.selenium.Alert alert = driver.switchTo().alert();
//		alert.accept();
//		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		WebElement HoverElement = driver.findElement(By.xpath("//span[contains(text(),'Groceries')]"));
		action.moveToElement(HoverElement).perform();
		Thread.sleep(2000);
		
		WebElement HoverElement2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[9]/li[2]/a[1]/span[1]"));
		action.moveToElement(HoverElement2).perform();
		Thread.sleep(2000);
		
		WebElement HoverElement3 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[9]/li[2]/ul[1]/ul[1]/li[1]/a[1]/img[1]"));
		HoverElement3.click();
		Thread.sleep(2000);
}
	
	public void hoverElements(WebElement actionElement) throws InterruptedException {
		Actions action = new Actions(driver);
		
		action.moveToElement(actionElement).perform();
		
		Thread.sleep(3000);
		
	}
}
