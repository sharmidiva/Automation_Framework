package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchPage {

	
	
	public void Search_Page(WebDriver driver) {
	
		WebElement w1= driver.findElement(By.id("recordingSearch"));
		
		w1.click();
	}
}
