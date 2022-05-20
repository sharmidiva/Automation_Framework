package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Recordings {

	
	
	@SuppressWarnings("deprecation")
	public void Recordings_page(WebDriver driver) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		
		Actions act = new Actions(driver);
	    
		WebElement w1=driver.findElement(By.linkText("Recordings"));
		
		act.moveToElement(w1).perform();
		w1.click();

		Thread.sleep(5000);
		
	}
		
	}

