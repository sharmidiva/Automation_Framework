package com.wbl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

	WebDriver driver;
	By logout=By.id("logout");
	public void main(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void clickOnLogOut() {
		driver.findElement(logout).click();;
	}
	
}
