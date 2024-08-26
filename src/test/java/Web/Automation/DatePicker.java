package Web.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DatePicker extends BaseDriver {

	String url = "https://demoqa.com/";
	
	@Test
	public void exceuteUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		sleepTime(2000);
		
		WebElement widget = driver.findElement(By.xpath("//h5[contains(text(),'Widgets')]"));
		WebElement DatePickerSelection = driver.findElement(By.xpath("//span[contains(text(),'Date Picker')]"));
		
		widget.click();
		sleepTime(5000);
		
		driver.findElement(By.xpath("//div[normalize-space()='Widgets']")).click();
		
		DatePickerSelection.click();
		sleepTime(2000);
		
		WebElement SelectDateField = driver.findElement(By.id("datePickerMonthYearInput"));
		SelectDateField.click();
		
		Select MonthDropdown =new Select(driver.findElement(By.className("react-datepicker__month-select")));
		MonthDropdown.selectByVisibleText("May");
		
		sleepTime(3000);
		
		
	}
	
	public void sleepTime(int a) throws InterruptedException {
		Thread.sleep(a);
	}
}
