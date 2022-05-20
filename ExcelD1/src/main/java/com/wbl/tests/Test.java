package com.wbl.tests;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wbl.pages.LoginPage;
import com.wbl.pages.MainPage;
import com.wbl.pages.WelcomePage;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Test {

	public static void main(String[] args) {
		
		
		
		
		
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("http://www.whiteboxqa.com/index.php");

		driver.manage().window().maximize();
		
	
		WelcomePage w=new WelcomePage();
		w.clickOnsignIn(driver);
		
		
		
		
		LoginPage l=new LoginPage();
		l.typeEmail("vinaymanthena100@gmail.com");
		l.typePassword("Innovapath123");
		
		l.clickOnLogin();
			
		MainPage m=new MainPage();
		m.clickOnLogOut();
		
		
	
	}
} 
