package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IdLocator extends BaseDriver{
	
	String url = "https://demo.nopcommerce.com/";
	
	@Test
	public void ExceuteUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		/*
		 * Id Selector
		 * Ex: element = driver.findElement(By.id("idName"))
		 * 
		 */
		//ID
		
		Actions action = new Actions(driver);
		WebElement ShoppingCart = driver.findElement(By.id("topcartlink"));
		
		action.moveToElement(ShoppingCart).perform();
		
		System.out.println("Tag name:"+ShoppingCart.getTagName()+" Inner text: "+ShoppingCart.getText());
		
		Thread.sleep(3000);
		
		// cssSelector Class
		WebElement ShoppingCartHoverText = driver.findElement(By.cssSelector(".count"));
		System.out.println("Hover element text : "+ShoppingCartHoverText.getText());
		
		
		
		
	}

}
