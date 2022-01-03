package com.tests;

import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.HomePage;
import com.basetest.BaseTest;
import com.deque.axe.AXE;

public class HomePage_Test extends BaseTest {

	HomePage homepage;
	private static final URL scriptUrl = HomePage_Test.class.getResource("/axe.min.js"); // path to the axe.min.js file

	@BeforeClass
	public void setup() {
		initializeWebDriver();
		driver.get("https://www.navori.com/");
		AXE.inject(driver, scriptUrl);
		JSONObject responseJSON = new AXE.Builder(driver,    scriptUrl).analyze();
		JSONArray violations = responseJSON.getJSONArray("violations");
		 if (violations.length() == 0)
		 {
		    Assert.assertTrue(true, "No violations found");
		 }
		 else {
		    AXE.writeResults("target/Axe", responseJSON);
		    Assert.assertTrue(false, AXE.report(violations));
		 }
		homepage = new HomePage(driver);
		
	}

	@Test
	public void firstTest() {
		homepage.clickTrialButton();
	}
}
