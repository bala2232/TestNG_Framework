package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Utilities.BrowserManager;

public class TC_SmokeCheck {
	
	String url="https://www.boconcept.com/en-us/";
	
	@Test
	public void t_01_search() {
		WebDriver driver = BrowserManager.getDriver("chrome");
		
		driver.get(url);
		driver.findElement(By.id("q")).sendKeys("sofa");
		
		
		
	}
}
