package Web.Automation;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
 * ASSERTIONS
 * 
 * Mainly used to verify something and get rid of if else method.
 * 
 * 1. Hard Assertions.
 * 	- it is compare something such two elements if hard assertions method is passed then it 
 * 	will exceute next line. but if failed, it has not runned further elment of the same method 
 * 	but next method if available it will exceute.
 * 
 * Syntax: Assert.assertEquals(actual, expected);
 * 
 * 2. Soft Assertions.
 *  - its exceute all method including their elements either it is pass or fail.
 *  - if soft assertions has been failed it will exceute next elements in the same method.
 *  - if failed, it will also exceute next method also once the exceuting done elements of method where the soft element introduce.
 *  - To see error in console use assertAll() method.
 *  
 *  Syntax: SoftAssert soft = new SoftAssert();
		soft.assertEquals(ActualTitle, expectedTitle);
		System.out.println("Pass");
		soft.assertAll();
 */

public class Assertions extends BaseDriver{
String url = "https://www.daraz.com.bd/";
	
	@Test
	public void ExcetueURL() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		
		String expectedTitle = "Daraz";
		String ActualTitle = driver.getTitle();
		
		//hard assertion
		
		Assert.assertEquals(ActualTitle, expectedTitle);
		System.out.println("After failed, hard assertion");
		
		// soft Assertion.
//		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(ActualTitle, expectedTitle);
//		System.out.println("Pass");
//		soft.assertAll();
		
}
	@Test
	public void test2() {
		System.out.println("outside of method");
	}
	
}
