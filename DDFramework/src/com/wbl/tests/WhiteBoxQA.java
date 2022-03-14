package com.wbl.tests;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WhiteBoxQA {

	
	public static void main(String[] args) throws IOException, InterruptedException {
	
		// declaring file class
	FileInputStream fis=new FileInputStream("/Users/innovapathinc/Desktop/Sahas/DDFramework/src/com/wbl/utilites/DataDriven.properties");
	
	//Initializing properties object
	
	Properties  pro=new Properties();
	pro.load(fis);
	
	String myacctlocator=pro.getProperty("myaccount1");
	String emaillocator=pro.getProperty("email");
	String passlocator=pro.getProperty("pass");
	String loginlocator=pro.getProperty("login1");
	String logoutlocator=pro.getProperty("logout");
	
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("http://www.whiteboxqa.com/index.php");

driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.xpath(myacctlocator)).click();
Thread.sleep(5000);
driver.findElement(By.xpath(emaillocator)).sendKeys("vinayreddy3337");
driver.findElement(By.xpath(passlocator)).sendKeys("Innovapath123");
driver.findElement(By.xpath(loginlocator)).click();
driver.findElement(By.xpath(logoutlocator)).click();
}

}
