package com.wbl.pages;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
		
		WebDriver driver;
	
		By email=By.id("username");
		By pass=By.id("password");
		By login=By.linkText("Login");
				
		File file=new File("/Users/innovapathinc/Desktop/Sahas/ExcelD1/src/main/java/ExcelD1/ExcelD1");
				
				
		
				
		public void login(WebDriver driver) {
			this.driver=driver;
		}
			public void typeEmail(String ema) {
				driver.findElement(email).sendKeys(ema);
			}
			
			
			public void clickOnLogin() {
				driver.findElement(login).click();
				
			}
			
			public void typePassword(String pa) {
				driver.findElement(pass).sendKeys(pa);
			}
		}
		
		
		
		
		
		
		
		
		
	
	

