package Excersise;

import java.time.Duration;
import java.util.List;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Web.Automation.BaseDriver;
import org.testng.Assert;

public class CalendarTest extends BaseDriver{
	

	    String url = "https://rahulshettyacademy.com/seleniumPractise/#/offers";
	    WebDriver driver;

	    @Test
	    public void executeUrl() throws InterruptedException {
	        // Initialize the driver
	        driver = Web.Automation.BaseDriver.driver;

	        // Ensure the driver is not null before using it
	        if (driver != null) {
	            driver.get(url);
	            driver.manage().window().maximize();
	        } else {
	            System.out.println("Driver is not initialized!");
	        }
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        String monthNumber = "8";

	        String date = "15";

	        String year = "2027";
	        String[] expectedList = {monthNumber,date,year};
	        
	        driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
	        Thread.sleep(3000);

	        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
	        Thread.sleep(3000);

	        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
	        Thread.sleep(3000);

	        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();

	        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();

	        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();

	        List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

	        for(int i =0; i<actualList.size();i++)

	        {

		        System.out.println(actualList.get(i).getAttribute("value"));
		       
	
		        Assert.assertEquals(actualList.get(i).getAttribute("value"),
		        		expectedList[i]);

	        }
	        Thread.sleep(3000);
	      
	}

}
