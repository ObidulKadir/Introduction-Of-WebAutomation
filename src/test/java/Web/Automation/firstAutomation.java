package Web.Automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class firstAutomation extends BaseDriver{
	
	String url = "https://www.selenium.dev/downloads/";
		
		@Test
		public void OpenUrl() throws InterruptedException {
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(5000);
			
		}
}
