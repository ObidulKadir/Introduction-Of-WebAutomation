package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Argument;

public class hoverSystemRokomari extends BaseDriver	{
	String url = "https://www.rokomari.com/book";
	
	@Test
	public void start() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		//login
		WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		signIn.click();
		
		WebElement googleBtn = driver.findElement(By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/button[2]"));
		googleBtn.click();
		
		WebElement userEmail = driver.findElement(By.xpath("//input[@id='identifierId']"));
		userEmail.click();
		userEmail.sendKeys("96demotests@gmail.com");
		Thread.sleep(2000);
		
		WebElement userNext = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		userNext.click();
		Thread.sleep(3000);
		
		WebElement userPwd = driver.findElement(By.xpath("//input[@type='password']"));
		userPwd.click();
		userPwd.sendKeys("Demo123!!");
		Thread.sleep(2000);
		
		WebElement pwdNext = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		pwdNext.click();
		Thread.sleep(3000);
		
		WebElement dimissBtn = driver.findElement(By.xpath("//*[@id=\"js--AB-test-popup\"]/div[1]/button/i"));
		dimissBtn.click();

		//hover
		Actions action = new Actions(driver);
		WebElement writer = driver.findElement(By.xpath("//a[@id='js--authors']"));
		Thread.sleep(5000);
		action.moveToElement(writer).perform();
		Thread.sleep(2000);
		
		WebElement writerName = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[3]/div[1]/div[1]/li[1]/a[1]"));
		writerName.click();
		Thread.sleep(3000);
		
		WebElement selectFirstCategory = driver.findElement(By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]"));
		selectFirstCategory.click();
		Thread.sleep(3000);
		
		WebElement selectSecondCategory = driver.findElement(By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]"));
		selectSecondCategory.click();
		Thread.sleep(3000);
		
		//scrolling the page.
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement scrollSpecificLocation = driver.findElement(By.xpath("//div[@class='pagination']"));
//		js.executeScript("arguments[0].scrollIntoView();", scrollSpecificLocation);
		
		js.executeScript("window.scrollBy(0,4000)", "");
		
		Thread.sleep(2000);
		
		//next button clicked
		WebElement nextBtn = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
		nextBtn.click();
		Thread.sleep(0);
		
	}

}
