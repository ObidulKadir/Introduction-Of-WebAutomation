package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert extends BaseDriver{
	
	/*
	 * Alert commands.
	 * 1. import the alert ; Alert alert = driver.switchTo().alert();
	 * alert.accept()
	 * alert.dismiss()
	 * alert.sendkeys()
	 */
		
	String url = "https://demoqa.com/alerts";
	@Test
	public void ExceuteUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		// accept the alert
		WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertButton.click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		
		// cancel the alert
		WebElement alert2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		alert2.click();
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(3000);
		
		//accept the alert
		WebElement alert3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		alert3.click();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(3000);
		
		// promote the dialog box. 
		WebElement alert4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		alert4.click();
		Thread.sleep(2000);
		alert.sendKeys("Qa Testing....");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(3000);
		
		
	}

}
