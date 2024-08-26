package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dyanimicAlert extends BaseDriver{
	String url = "https://www.daraz.com.bd/";
	
	
	@Test
	public void executeUrl() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		sleepTime(2000);
		
		Actions action = new Actions(driver);
		WebElement fashion = driver.findElement(By.xpath("//span[contains(text(),\"Women's & Girls' Fashion\")]"));
		
		WebElement clothes = driver.findElement(By.xpath("//li[@class=\"lzd-site-menu-sub-item\"]/a[@class='hover']"));
		
		WebElement saree = driver.findElement(By.xpath("//a[@class='catLink']/img[@alt='Sarees']"));
		
		try {
			if(fashion.isDisplayed()) {
				System.out.println("Element is found!!");
				action.moveToElement(fashion);
				sleepTime(3000);
				
				try {
					if(clothes.isDisplayed()) {
						System.out.println("clothes is hovered");
						action.moveToElement(clothes);
						sleepTime(3000);
						
						try {
							if(saree.isDisplayed()) {
								System.out.println("clicked on the saree item.");
								saree.click();
								sleepTime(2000);
							}
						} catch (Exception e) {
							System.out.println("Saree element is not found.");
						}
						
					}
				} catch (Exception e) {
					System.out.println("clothes element is not found.");
				}

			}
		} catch (Exception e) {
			System.out.println("Fashion element is not found.");
		}
			
		
		
	}
	
	public void hover(WebElement hoveElement) {
		
//		action.moveToElement(hoveElement).perform();
	}
	public void sleepTime(int time) throws InterruptedException {
		
		Thread.sleep(time);
	}
}
