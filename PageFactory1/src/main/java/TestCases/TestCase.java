package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.booking.com/index.html?aid=378266;label=booking-name-"
				+ "IquAp*EbiLS6jPVl_he8yQS461499016258:pl:ta:p1:p22,563,000:ac:ap:neg:fi:tikwd-65526620:lp9302242:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YYriJK-Ikd_dLBPOo0BdMww;ws=&gclid=EAIaIQobChMIgPDPqpXs9gIVgSQrCh2slQi9EAAYASAAEgJdg_D_BwE");
		
		LoginPage login= PageFactory.initElements(driver, LoginPage.class);
				login.Login_actions(driver);
		
		
	
	}
	
	
	
	
}
