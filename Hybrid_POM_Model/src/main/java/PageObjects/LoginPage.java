package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public  void txtbx_UserName(WebDriver driver){

          WebElement w1=driver.findElement(By.id("username"));
          w1.click();
          w1.sendKeys("Vinayreddy3337");

         }
    

     public void txtbx_Password(WebDriver driver){

      WebElement w2=driver.findElement(By.id("password"));
      w2.click();
      w2.sendKeys("Innovapath123");

         }
     

     public void btn_LogIn(WebDriver driver){

         driver.findElement(By.id("login")).click();; 

         

         }


	
}

