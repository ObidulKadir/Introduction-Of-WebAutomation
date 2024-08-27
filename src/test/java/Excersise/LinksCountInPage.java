package Excersise;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Web.Automation.BaseDriver;

public class LinksCountInPage extends BaseDriver {

    String url = "http://qaclickacademy.com/practice.php";
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
        
        //All Page Links count
        System.out.println(driver.findElements(By.tagName("a")).size());
        
        //Specific section links count
        
        WebElement footerSection =  driver.findElement(By.id("gf-BIG"));
        
        System.out.println(footerSection.findElements(By.tagName("a")).size());
        
        WebElement latestNews = footerSection.findElement(By.xpath("//tbody/tr[1]/td[1]/ul"));
        
        System.out.println(latestNews.findElements(By.tagName("a")).size());
        
        int columnsLinkSize = latestNews.findElements(By.tagName("a")).size();
        
        // click each link
        for(int i = 1; i<columnsLinkSize;i++) {
        	String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
        	latestNews.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
        	Thread.sleep(5000);
        }
        
       Set<String> windows =  driver.getWindowHandles();
       Iterator<String> it =  windows.iterator();
       
       String parentChild = it.next();
       
       while (it.hasNext()) {
    	   driver.switchTo().window(it.next());
    	   System.out.println(driver.getTitle());
		
	}
        
        driver.switchTo().window(parentChild);
        
        
    }
}
