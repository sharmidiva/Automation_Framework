package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	
		
		
		@FindBy(xpath="//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[6]/a/span")
		WebElement loginBtn;
		
		@FindBy(id="username")
		WebElement userid;
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button/span")
		WebElement submit1;
		
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(xpath="//button[@type=\"submit\"]")
		WebElement submit2;
		
		@FindBy(linkText="Press and hold")
		WebElement hold;
	
	
		public void Login_actions(WebDriver driver) throws InterruptedException {
			
			loginBtn.click();
		
			Thread.sleep(3000);
		userid.sendKeys("vinaykiller577@gmail.com");
		
		submit1.click();
			Thread.sleep(3000);
			
			password.sendKeys("Vinay@3337");
			
			Thread.sleep(3000);
			submit2.click();
			
			
		Actions act= new Actions(driver);
		act.clickAndHold(hold);
			
		}
}
