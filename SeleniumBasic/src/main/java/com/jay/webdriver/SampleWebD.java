/**
 * 
 */
package com.jay.webdriver;

import java.util.List;
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
public class SampleWebD {

	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\spatil28\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		String str=driver.getTitle();
		System.out.println(str);
		
		driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("CAR");	
		driver.findElement(By.xpath("//input[contains(@class,'btn btn-prim gh-spr')]")).click();
		
		List<WebElement> linklist= driver.findElements(By.tagName("a"));
		
		System.out.println("Total links=" +linklist.size());
		
		for(WebElement list:linklist) {
			
			System.out.println(list.getText());
			
		}
		
		Actions act = new Actions(driver);
		
		
	
	}
	
}
