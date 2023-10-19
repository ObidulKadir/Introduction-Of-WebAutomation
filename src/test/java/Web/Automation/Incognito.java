package Web.Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

/*
 * Website open in incognito
 * - to get open the web in ingonito need robot clas
 * - create Robot robot = new Robot().  object
 * - keypress, ctrl, shift, n
 * - then relase the in a bckwards way : n, shift, ctrl
 * - create method for counting the window using Set<String> getWindowHandles = driver.getWindowHandles();
   - all count push to array list and return that method.
   - from intial method just call the count.
   - inital web count - 0, ignito count - 1
   - switchTo the tab.
   driver.switchTo().window(windowHandling().get(1));
   
 */
public class Incognito<string> extends BaseDriver{
	
	String url = "https://demoqa.com/frames";
	
	@Test
	public void ExcetueURL() throws InterruptedException, AWTException {
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		// for incognito: need Robot() class
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(100);	
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.delay(100);	
		robot.keyPress(KeyEvent.VK_N);
		robot.delay(100);
		
		robot.keyRelease(KeyEvent.VK_N);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(100);
		
		driver.switchTo().window(windowHandling().get(1));
		driver.get(url);
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(windowHandling().get(0));
		driver.get(url);
		driver.close();
		
		
		
	}
	
	public List<String> windowHandling() {
		Set<String> getWindowHandles = driver.getWindowHandles();
		List<String> getHandleList = new ArrayList<String>(getWindowHandles);
		return getHandleList;
		
	}

}
