package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Locator extends BaseDriver{
	
	String url = "https://demo.nopcommerce.com/";
	
	@Test
	public void StartUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		
		String WebSiteTitle = driver.getTitle();
		System.out.println("Website title is : "+WebSiteTitle);
		
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
		
		// print the title using cssSelector. tag
		WebElement title = driver.findElement(By.cssSelector("h1"));
		System.out.println("Page title: "+title.getText());
		
		//xpath - //tagname[contains(text(), 'String')]
		WebElement SubTitle = driver.findElement(By.xpath("//strong[contains(text(), 'Your Personal Details')]"));
		System.out.println("SubTitle : "+SubTitle.getText());
		
		//ID
		WebElement FirstName = driver.findElement(By.id("FirstName"));
		FirstName.click();
		FirstName.sendKeys("Kadir");
		
		//cssSelector
		WebElement LastName = driver.findElement(By.xpath("//input[@name ='LastName']"));
		LastName.click();
		LastName.sendKeys("Ahmed");
		Thread.sleep(3000);
		
		//dropdown
		//select a dob
		WebElement DOB = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		Select selectDOB = new Select(DOB);
		selectDOB.selectByIndex(5);
		Thread.sleep(3000);
		
//		select.selectByVisibleText("10");
//		Thread.sleep(1000);
		
		
		//Months
		WebElement months = driver.findElement(By.xpath("//*[@name='DateOfBirthMonth']"));
		Select Month = new Select(months);
		Month.selectByVisibleText("April");
		Thread.sleep(2000);
		
		// year
		//cssSelector - [attribute ='value']
		WebElement year = driver.findElement(By.cssSelector("[name='DateOfBirthYear']"));
		Select SelectYear = new Select(year);
		SelectYear.selectByIndex(10);
		Thread.sleep(2000);
		
		
	}
}
