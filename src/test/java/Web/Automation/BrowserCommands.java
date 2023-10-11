package Web.Automation;

import org.testng.annotations.Test;

public class BrowserCommands extends BaseDriver{
	String url = "https://www.daraz.com.bd/";
	@Test
	public void ExceuteUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		
		System.out.println("The page source: "+driver.getPageSource());
		System.out.println("The page currentUrl: "+driver.getCurrentUrl());
		System.out.println("The page title: "+driver.getTitle());
		
		
	}
}
