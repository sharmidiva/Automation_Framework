package com.wbl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {

	
	
WebDriver driver;

		public  void Welcome(WebDriver driver)
		{
			this.driver=driver;
			 
		}
		
		public void clickOnsignIn(WebDriver driver)
		{
			driver.findElement(By.linkText("Login")).click();
		}
	}


