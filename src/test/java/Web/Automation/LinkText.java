package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LinkText extends BaseDriver{
	
String url = "https://www.daraz.com.bd/";

/*
 * linkText matches the complete visible text of a link, 
 whereas partialLinkText matches a partial or substring
 of the visible text of a link.

 */
	
	@Test
	public void ExceuteUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		//LinkText
		
		WebElement login = driver.findElement(By.linkText("Login"));
		System.out.println("Link text :"+login.getText());
		login.click();
		
		Thread.sleep(3000);
		
		//partialLink text
		
		WebElement resetPwd = driver.findElement(By.partialLinkText("Reset Your Password"));
		
		System.out.println("Partial Link text :"+resetPwd.getText());
		resetPwd.click();
		Thread.sleep(3000);
		
		
	}

}
