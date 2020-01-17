/**
 * 
 */
package com.jay.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author spatil28
 *
 */
public class Dropdown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spatil28\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		Select select= new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("ANGOLA");
		driver.switchTo().frame(0);
//m,opoop./args;,8;;;;;;;;.98
	//	select.deselectByVisibleText("ANGOLA"); can't deselPPOHNIU09H dd value
		
	}

}
