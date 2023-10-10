package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CssSelectorLocator extends BaseDriver{
	
	/*
	 CssSelector.
	1. Element Selector
	Ex: p, div, a
	2. Id Selector
	Ex: #register, attribute#id, input#firstname
	3. ClassSelector.
	Ex: .ClassName, .register, input.register
	4. Attribute selector
	Ex: [attribute = 'value'], [data-toggle="dropdown"]
	5. Combining Selector.
	Ex: ul#menu > li
	 * 
	 * 
	 */
	
	String url = "https://demo.nopcommerce.com/";
	
	@Test
	public void StartUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		
		String WebSiteTitle = driver.getTitle();
		System.out.println("Website title is : "+WebSiteTitle);
		
		//Element Selector
		WebElement TagName = driver.findElement(By.cssSelector("div.topic-block-title"));
		System.out.println("Tag Name Selector: "+TagName.getText());
		
		Thread.sleep(1000);
		
		//classSelector
		
		WebElement ClassSelector = driver.findElement(By.cssSelector(".topic-block-title"));
		System.out.println("Class Name Selector : "+ClassSelector.getText());
		
		Thread.sleep(1000);
		
		//attribute selector
		
		WebElement AttributeSelector = driver.findElement(By.cssSelector("[src='https://demo.nopcommerce.com/images/thumbs/0000009_apparel_450.jpeg']"));
		System.out.println("location of the element: "+AttributeSelector.getLocation());
		System.out.println("Tagname: "+AttributeSelector.getTagName());
		
		AttributeSelector.click();
		Thread.sleep(3000);
		
		//attribute selector
		Actions action = new Actions(driver);
		WebElement CustomeTag = driver.findElement(By.cssSelector(".notmobile>li>a[href='/computers']"));
		action.moveToElement(CustomeTag).perform();
		Thread.sleep(3000);
		
		//attribute selector
		
		WebElement desktop = driver.findElement(By.cssSelector(".notmobile>li>ul.sublist>li>a[href='/desktops']"));
		System.out.println("TagName: "+desktop.getTagName()+" & title is: "+desktop.getText());
		desktop.click();
		Thread.sleep(3000);
		
	
	
	}
	
}
