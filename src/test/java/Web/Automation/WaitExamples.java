package Web.Automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitExamples extends BaseDriver{
	
		String url = "https://demo.nopcommerce.com/";
	
	@Test
	public void ExceuteUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		//implicit 
//		((Object) driver.manage()).implicitlyWait(60, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement search = (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("mall-searchterms")));
}
}