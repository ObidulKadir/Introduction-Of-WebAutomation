package Web.Automation;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class TabHandling extends BaseDriver{
	String url1= "https://demoqa.com/frames";
	String url2 = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";

	@Test
	public void tabHandling() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url1);
		String firstWindow = driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		String secondWindow = driver.getWindowHandle();
		driver.get(url2);
		Thread.sleep(5000);
		
		driver.switchTo().window(firstWindow);
		driver.close();
		Thread.sleep(5000);
		
		driver.switchTo().window(secondWindow);
		Thread.sleep(5000);
		
		driver.switchTo().window(firstWindow);
		Thread.sleep(10000);
		
		
		
		}
	
	public void clickTAB() {
		driver.switchTo().newWindow(WindowType.TAB);
	}
	
	
	
}

