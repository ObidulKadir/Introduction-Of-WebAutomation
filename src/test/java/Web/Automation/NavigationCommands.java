package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


/* Navigation Commands syntax: 
 * 	driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		note: forward() command will be exceuted Once after loading the page you backward.
		
		driver.navigate().to(url);
 */
public class NavigationCommands extends BaseDriver {
	String url = "https://www.daraz.com.bd/";
	@Test
	public void ExceuteUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		login.click();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(3000);
		
		
	}
}
