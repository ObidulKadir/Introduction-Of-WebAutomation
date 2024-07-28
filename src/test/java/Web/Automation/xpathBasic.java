package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class xpathBasic extends BaseDriver{
	String url = "https://demoqa.com/elements";
	
	@Test
	public void StartUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		/*
		 * Xpath
		 * Relational Xpath
		 * 1. //*[@attribute ='value']
		 * 2. //tagName[@attribute='value']
		 * 
		 *  for string related data:
		 *  
		 * 3. //tagname[contains(text(),"string"]
		 * 4. //tagname[starts-with(text(),"string"]
		 *  For table:(5,6)
		 * 5. // * [ position() = 3]
		 * 6. // * [ last()]
		 * 7. // *[ normalize-space ( text() ) = 'Option1' ]
		 * 8.   // *[ normalize-space (@id) = 'Option1' ]
		 * 
		 *  Abs xpath - /html/body/div......
		 */
		
		// Relational Xpath 
		// //tagName[contains(text(), "string")]
		
		WebElement TextBoxElement = driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));
		TextBoxElement.click();
		Thread.sleep(3500);
		
		//Relt xpath - //tagName[@attribute ='value']
		WebElement FullName = driver.findElement(By.xpath("//input[@id='userName']"));
		FullName.click();
		FullName.sendKeys("Birani");
		Thread.sleep(3500);
		
		// relt xpath
		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.click();
		Email.sendKeys("Birani@gmail.com");
		Thread.sleep(3500);
		
		// syntax - //*[@id="currentAddress"]
		
		WebElement CurrentAddress = driver.findElement(By.xpath("//*[@id='currentAddress']"));
		CurrentAddress.click();
		CurrentAddress.sendKeys("Dhaka, Bangladesh");
		Thread.sleep(3500);
		
		// Abs Path - /html[1]/body[1]/div
		WebElement PermanentAddress = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]"));
		PermanentAddress.click();
		PermanentAddress.sendKeys("Dhaka, Bangladesh, uganda");
		Thread.sleep(3500);
		
		
		WebElement SubmitButton = driver.findElement(By.xpath("//button[starts-with(text(),'Submit')]"));
		SubmitButton.click();
		Thread.sleep(3500);
		
	}
}
