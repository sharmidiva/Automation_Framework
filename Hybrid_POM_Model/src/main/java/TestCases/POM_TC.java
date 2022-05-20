package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.HomePage;
import PageObjects.LoginPage;

import PageObjects.Recordings;
import PageObjects.SearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;



public class POM_TC {


		public static void main(String[] args) throws InterruptedException {

			   WebDriverManager.chromedriver().setup();
		     WebDriver driver = new ChromeDriver();

		     driver.manage().window().maximize();

		     driver.get("http://www.whiteboxqa.com/login.php?returnurl=/recordings.php");

		     // Use page Object library now

		     HomePage hp=new HomePage();
		     hp.lnk_MyAccount(driver);
		    

		     LoginPage lp=new LoginPage();
		    lp.txtbx_UserName(driver);
		    
		    LoginPage lp1=new LoginPage();
		     lp1.txtbx_Password(driver);

	
		     LoginPage lp2=new LoginPage();
		     lp2.btn_LogIn(driver);
		     
		    Recordings rc=new Recordings();
		     rc.Recordings_page(driver);
		     
		     SearchPage sp=new SearchPage();
		     sp.Search_Page(driver);
			
			Thread.sleep(10000);
		     HomePage log= new HomePage();
		     log.lnk_LogOut(driver);
		

		     }

		}



