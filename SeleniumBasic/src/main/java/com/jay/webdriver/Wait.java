/**
 * 
 */
package com.jay.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author spatil28
 *
 */
public class Wait {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spatil28\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement username=driver.findElement(By.name("userName"));
		WebElement pwd=driver.findElement(By.name("password"));
		
		sendKeys(driver, username, 20, "Jayshree");
		sendKeys(driver, pwd, 20, "Jayshree");

		
	}
public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value) {
	new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
}
}
