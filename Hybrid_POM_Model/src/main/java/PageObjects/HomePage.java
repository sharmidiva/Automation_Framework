package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage {

	

	 public void lnk_MyAccount(WebDriver driver) {

	   driver.findElement(By.id("loginButton")).click();;
	   
	 
	    }

	 public void lnk_LogOut(WebDriver driver){

	    driver.findElement(By.id("logout")).click();;

	 

	    }

	}

