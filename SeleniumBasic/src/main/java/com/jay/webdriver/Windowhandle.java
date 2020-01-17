/**
 * 
 */
package com.jay.webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author spatil28
 *
 */
public class Windowhandle {
	
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spatil28\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();		
		
		String parentWindow=driver.getWindowHandle();
		
		Set<String>s1=driver.getWindowHandles();
		for(String winhandle:s1) {
			driver.switchTo().window(winhandle);
			
		}
		driver.close();
		driver.switchTo().window(parentWindow);
		
		

		
	}

}
