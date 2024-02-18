package hwSelenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise6 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		String pageTitle = driver.getTitle();
		
		if (pageTitle.equals("Alerts")) {

			System.out.println("Page tittle is Alerts");

		} else {

			System.out.println("Page title is NOT Alerts");
		}
		
		Thread.sleep(2000);
		
		WebElement alertwTextBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		
		alertwTextBtn.click();
		Thread.sleep(2000);
		
		WebElement alertPrompt =driver.findElement(By.xpath("//*[@id=\"Textbox\"]"));
		
		alertPrompt.click();
		Thread.sleep(2000);
		
		
		  
        Alert alert = driver.switchTo().alert();

        
        System.out.println("Alert text: " + alert.getText());

      
        alert.sendKeys("Monica");

      
        alert.accept();
        
    	Thread.sleep(2000);
	
        WebElement MsgDisplayed = driver.findElement(By.id("demo1"));
        
        String MessageStr= MsgDisplayed.getText();
        
        if (MessageStr.contains("How are you today")) {
        	
        	System.out.println("It does contain How are you today");
        	
        } else {
        	
        	System.out.println("It DOES NOT contain How are you today");
        }
	
        driver.navigate().refresh();
        
        Thread.sleep(2000);
        
        WebElement okAndCancel = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
        
        okAndCancel.click();
        
        WebElement confirmBox = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
        
        confirmBox.click();
        
        Alert alert1 = driver.switchTo().alert();
        
        String alertText = alert1.getText();
        
        boolean isTextPresent = alertText.contains("Press a Button !");
        
        if (isTextPresent) {
            alert.dismiss(); 
        } else {
            alert.accept(); 
             
        }
        WebElement messageElement = driver.findElement(By.id("demo"));
        
        String msgText = messageElement.getText();
        
        if (msgText.contains("You Pressed")) {
            System.out.println("Message contains 'You Pressed'");
        } else {
            System.out.println("Message DOES NOT contain 'You Pressed'");
        }
        
        driver.quit();
        
       // Homework done, ready to push
        
		tearDown();
		
	}

}
