package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
 * WebElement Elements.
 * -isDisplayed()
 * -isSelected
 * -isEnabled
 */

public class VisibilityExamples extends BaseDriver {
String url = "https://demo.nopcommerce.com/";
	
	@Test
	public void ExceuteUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement search = driver.findElement(By.id("small-searchterms"));
		
		try {
			if(search.isDisplayed()) {
				search.click();
				search.sendKeys("macbook");
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println("Locator not found!!!");
		}
	}
}
