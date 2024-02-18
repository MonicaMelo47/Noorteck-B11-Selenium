package hwSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
  driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
  Thread.sleep(2000);
  
  
   WebElement usernameField = driver.findElement(By.name("username"));
   
   usernameField.sendKeys("ntk-admin");
   
   
   WebElement passwordField = driver.findElement(By.name("password"));
   
   passwordField.sendKeys("Ntk-orange!admin.123");
   
   Thread.sleep(2000);
   
   WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
   
   loginButton.click();
   
   Thread.sleep(1000);
   
   WebElement headerText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
   
   String headerStr = headerText.getText();
   Thread.sleep(2000);
   
   if (headerStr.equals("Dashboard")) {
	   System.out.println("Verifying Dashboard is the header");
   } else {
	   
	   System.out.println("Dashboard is not the header");
   }
   
   driver.quit();
   
		tearDown();
		
		
		
	}
	
	

}
