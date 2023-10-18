package Web.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
 * Step 1: Iframes - elements fetching
 * - driver.switchTo().frame("iframeID OR Name");
 * - then, exceute the inner side of the element
 * 
 * step 2: out side element of the iframe
 * - driver.swichTo().defaultContent();
 * -then exceute the desire element
 * 
 * step 3: again, dive into another iframe
 *  - if you outside of the ifram, then follow Step 1;
 *  - if inside of the ifram and you want exceute another iframe elements. exceute step 2 then step 1.
 *  
 *  Note:  Always switch to frame then default content before switching to another iframe.
 *  
 */

public class iframes extends BaseDriver {
String url = "https://demoqa.com/frames";
	
	@Test
	public void ExcetueURL() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		int iframeNumber = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframeNumber);
		
		driver.switchTo().frame("frame1");
		
		//inner elements of iframe
		WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(text.getText());
		Thread.sleep(2000);
		
		
		//outside of the iframe
		driver.switchTo().defaultContent();
		WebElement OusideText = driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page There are 2 Iframes in this pag')]"));
		System.out.println(OusideText.getText());
		
		
		
}
}
