package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	private String trialButton = "[data-text='FREE 30-DAY TRIAL']";
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickTrialButton() {
		driver.findElement(By.cssSelector(trialButton)).click();
	}
	
		
}
