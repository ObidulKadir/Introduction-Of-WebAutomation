package Streams;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Web.Automation.BaseDriver;
import dev.failsafe.internal.util.Assert;

public class filter  {
//	String url = "http://qaclickacademy.com/practice.php";
	WebDriver driver;
	
	@Test
	public void excuteUrl() throws InterruptedException {
//		driver = Web.Automation.BaseDriver.driver;
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
////		driver.get(url);
//		driver.manage().window().maximize();
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("abir");
		names.add("sabbir");
		names.add("don");
		names.add("ram");
		
		int count =0;
		for(int i =0;i<names.size();i++) {
			names.get(i);
			
			if(names.get(i).startsWith("a")) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("abir");
		names.add("sabbir");
		names.add("don");
		names.add("ram");
		names.add("aram");
		
		long a = names.stream().filter(bon->bon.startsWith("a")).count();
		System.out.println(a);
		
		long d = Stream.of("Abir","kadir","rizean", "irfan").filter(s->s.startsWith("a")).count();
	
		System.out.println(a);
		
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}


	@Test
	public void streamMap() {
		Stream.of("Abir","kadir","rizean", "irfan").filter(s->s.endsWith("n")).map(s->s.toUpperCase())
		.sorted()		
		.forEach(s->System.out.println(s));

	}
	@Test
	public void streamMapConcat() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("fahad");
		names.add("sabbir");
		names.add("don");
		names.add("ram");
		names.add("aram");
		
		
		Stream<String> d = Stream.of("Abir","kadir","rizean", "irfan");

		Stream<String> concating = Stream.concat(names.stream(), d);
//		concating.sorted().forEach(s->System.out.println(s));
		
		boolean flag = concating.anyMatch(s->s.equalsIgnoreCase("DWSD"));
		System.out.println(flag);
		org.testng.Assert.assertTrue(flag);
		
		
	}
	@Test
	public void streamCollect() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("fahad");
		names.add("sabbir");
		names.add("don");
		names.add("ram");
		names.add("aram");
		
		
		List<String> ls = names.stream().filter(s->s.startsWith("s")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		
		System.out.println(ls.get(0));
		
		List<Integer> values = Arrays.asList(2,1,3,3,1,2,3,55,5);
		values.stream().distinct().forEach(s->System.out.println(s));
	}


}
