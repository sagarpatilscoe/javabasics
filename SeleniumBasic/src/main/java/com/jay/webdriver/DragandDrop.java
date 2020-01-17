/**
 * 
 */
package com.jay.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author spatil28
 *
 */
public class DragandDrop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\spatil28\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("Getting webelemnts");
		
		WebElement source = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
		WebElement target=driver.findElement(By.xpath("//li[@class='placeholder']"));
		//source.
		System.out.println("Performing drag and drop");
		Actions act= new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		

		
	}

}
