package Streams;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Web.Automation.BaseDriver;
import dev.failsafe.internal.util.Assert;

public class PaginationScenarios extends BaseDriver {
//	String url = "http://qaclickacademy.com/practice.php";
	WebDriver driver;

	@Test
	public void excuteUrl() throws InterruptedException {
		driver = Web.Automation.BaseDriver.driver;
//		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column

		driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all webelements into list
		List<WebElement> elementList = driver.findElements(By.xpath("//tbody/tr[1]/td[1]"));
		// capture text of all webelements into new(original) list
		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort on the original list of step 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// compare original list vs sorted list

		org.testng.Assert.assertTrue(originalList.equals(sortedList));

		List<Object> price;

		// scan the name column with getText ->Beans->print the price of the Rice
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr/td[1]"));
					rows.stream().map(s->s.getText()).forEach(aa->System.out.println(aa));
			

			price = rows.stream().filter(s -> s.getText().contains("Almond")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());

			price.forEach(a -> System.out.println("Almond:"+a));

			if (price.size() < 1)

			{
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
				

			}

		} while (price.size() < 1);

	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		return pricevalue;
	}

}
