package com.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.HomePage;
import com.basetest.BaseTest;

public class HomePage_Test extends BaseTest {

	HomePage homepage;

	@BeforeClass
	public void setup() {
		initializeWebDriver();
		homepage = new HomePage(driver);
		driver.get("https://www.navori.com/");
	}

	@Test
	public void firstTest() {
		homepage.clickTrialButton();
	}
}
