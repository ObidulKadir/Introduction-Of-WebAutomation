package Web.Automation;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	/*
	 * TestNG is a tool that helps in testing computer programs, especially those written in Java. It offers a bunch of features that make testing easier and more organized:

1. **Setting up Tests**: TestNG helps set up and organize your tests, allowing you to easily define what tests to run and how to run them.

2. **Annotations**: It provides special labels (annotations) that you can put on your test code to specify what each part of the code does, like marking a method as a test.

3. **Testing with Different Data**: TestNG lets you run the same test with different input values, which is helpful to see how your program behaves in various situations.

4. **Grouping Tests**: You can group tests together, so you can run related tests as a unit. This helps in organizing your tests better.

5. **Running Tests in a Specific Order**: TestNG allows you to control the order in which your tests run, which is important in some cases.

6. **Getting Detailed Reports**: It generates clear and detailed reports about the tests you ran, helping you understand what worked and what didn't.

7. **Custom Actions during Testing**: You can do special actions (like taking a screenshot or capturing logs) at specific points in your tests, which can be very useful.

8. **Running Tests Faster**: TestNG helps in running tests quickly by allowing them to run at the same time, saving a lot of time when you have many tests to run.

Overall, TestNG makes testing your software more efficient and organized, making it easier to find and fix issues in your code.
	 * 
	 */
	
	
	@Test (priority = 2)
	public void firstTest() {
		System.out.println("Test 2.......!");
	}
	
	
	@Test (priority = 1)
	public void Sum() {
		System.out.println("Sum 1st  position & priority 1.......!");
	}
	
	@Test (priority = 2) //0 = high 
	public void Testzxample() {
		System.out.println("Test 3 and priority 2..........!");
	}
	@Test (priority = 2)
	public void Sum2() {
		System.out.println("Sum 2nd position, priority 2.......!");
	}


	@BeforeSuite
	public void beforeSuiteExample() {
		System.out.println("Before Suite example");
	}
	
	@AfterSuite
	public void afterSuiteExample() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTestExample() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTestExample() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void beforeClassExample() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClassExample() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void beforeMethodExample() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethodExample() {
		System.out.println("After Method");
	}

}

