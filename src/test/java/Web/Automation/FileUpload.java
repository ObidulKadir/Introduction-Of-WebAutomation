package Web.Automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload extends BaseDriver {
	String url = "https://demoqa.com/upload-download";

	/*
	 * RULES to upload files.
	 * 
	 * 1. IF YOU WANT TO GET THE FILE FROM THE DEVICE JUST ASSIGN THE DIRECTORY OF
	 * THE FILE TO VARIABLE THEN USE SENDKEYS TO SEND THE FILE.
	 * 
		 String upload1 = "E:\Codemen\Test Artifacts\Image\png\tesla-2865003.png"; directory of the file.
		 driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys(upload1);
	 * 
	 * 
	 * 2. WHILE You want to retrieve the file from the project folder just follow
	 * this steps: 
		 File file1 =new File("./resources/1.png"); // file directory
		 String Upload1 =file1.getAbsolutePath(); WebElement ChooseFile =
		 driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys(upload1);
		 
	 */

	@Test
	public void excuteUrl() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);

		File file1 = new File("./resources/1.png");
		String Upload1 = file1.getAbsolutePath();
		


//		String Upload1 = "./resources/1.png";

		File file2 = new File("./resources/2.png");
		String Upload2 = file2.getAbsolutePath();
		
		WebElement ChooseFile = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		ChooseFile.sendKeys(Upload1);

		Thread.sleep(5000);

		ChooseFile.sendKeys(Upload2);
		Thread.sleep(5000);

		System.out.println("Original path: " + file1.getPath());
		System.out.println("Absolute path: " + file1.getAbsolutePath());

	}

}
