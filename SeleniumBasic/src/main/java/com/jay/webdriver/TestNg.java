/**
 * 
 */
package com.jay.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author spatil28
 *
 */
public class TestNg {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spatil28\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//button[contains(@class,\"btn btn-default\")]"));
		button.click();
		
		Alert alert =  driver.switchTo().alert();
		String alertmsg=driver.switchTo().alert().getText();
		
		System.out.println(alertmsg);
		Thread.sleep(5000);
		alert.accept();
		
		
		
		
		
	}

}
