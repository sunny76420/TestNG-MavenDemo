package com.basetest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends Base {
	
//	@BeforeTest
	public void initializeWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
