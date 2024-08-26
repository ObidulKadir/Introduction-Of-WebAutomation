package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Synchronization extends BaseDriver {

	String url = "https://rahulshettyacademy.com/loginpagePractise/";

	@Test
	public void executeUrl() throws InterruptedException {
		// Initialize WebDriver and open the browser
		driver.manage().window().maximize();

		// Implicit Wait - Applies globally
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(url);

		// Example of elements using implicit wait
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		String userNameValue = "rahulshettyacademy";
		String passwordValue = "learning";

		// Using Explicit Wait for specific element (like prompt button)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement user = driver.findElement(By.xpath("//span[contains(text(),'User')]"));
		wait.until(ExpectedConditions.elementToBeClickable(user));

		// Interacting with elements
		userName.sendKeys(userNameValue);
		password.sendKeys(passwordValue);
		user.click();

		// Explicit Wait for prompt button
		WebElement promptOkay = driver.findElement(By.xpath("//button[@id='okayBtn']"));
		wait.until(ExpectedConditions.elementToBeClickable(promptOkay));
		promptOkay.click();

		// Example of using implicit wait for another element
		WebElement tc = driver.findElement(By.xpath("//input[@id='terms']"));
		WebElement submitBtn = driver.findElement(By.xpath("//input[@id='signInBtn']"));
		tc.click();
		submitBtn.click();

	
		multipleSelect(driver);
		driver.findElement(By.xpath("//a[contains(text(), 'Checkout')]")).click();
		Thread.sleep(3000);

	}
	
	public void multipleSelect(WebDriver driver) {
		List<WebElement> product = driver.findElements(By.xpath("//button[contains(text(), 'Add ')]"));
		
//		for(int i=0;i<product.size();i++) {
//			product.get(i).click();
//		}
		
		for(WebElement p : product) {
			p.click();
		}
	}
	

	
	
}
