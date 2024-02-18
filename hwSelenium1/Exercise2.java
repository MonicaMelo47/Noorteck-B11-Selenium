package hwSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise2 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);

		WebElement registerLink = driver.findElement(
				By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));

		registerLink.click();
		Thread.sleep(2000);

		String pageTitle = driver.getTitle();

		if (pageTitle.equals("MERCURY Tours")) {

			System.out.println("Page tittle is Mercury Tours");

		} else {

			System.out.println("Page title is NOT Mercury tours");
		}

		Thread.sleep(1000);

		WebElement firstName = driver.findElement(By.name("firstName"));

		firstName.sendKeys("Monica");

		WebElement lastName = driver.findElement(By.name("lastName"));

		lastName.sendKeys("Melo");

		Thread.sleep(2000);

		WebElement phoneField = driver.findElement(By.name("phone"));

		phoneField.sendKeys("1234567");

		Thread.sleep(2000);

		WebElement emailField = driver.findElement(By.name("userName"));

		emailField.sendKeys("alexamebu14@gmail.com");

		Thread.sleep(2000);

		WebElement addressField = driver.findElement(By.name("address1"));

		addressField.sendKeys("123 New York Boulevard");

		Thread.sleep(2000);

		WebElement cityField = driver.findElement(By.name("city"));

		cityField.sendKeys("Las Vegas");

		Thread.sleep(2000);

		WebElement stateField = driver.findElement(By.name("state"));

		stateField.sendKeys("New York");

		Thread.sleep(2000);

		WebElement PostalField = driver.findElement(By.name("postalCode"));

		PostalField.sendKeys("8520");

		Thread.sleep(2000);

		WebElement UserName = driver.findElement(By.name("email"));

		UserName.sendKeys("alexamebu14@gmail.com");

		Thread.sleep(2000);

		WebElement passwordField = driver.findElement(By.name("password"));

		passwordField.sendKeys("CrazieDooo");

		Thread.sleep(2000);

		WebElement Confirmpassword = driver.findElement(By.name("confirmPassword"));

		Confirmpassword.sendKeys("CrazieDooo");

		WebElement SubmitBtn = driver.findElement(By.name("submit"));

		SubmitBtn.click();

		Thread.sleep(2000);

		WebElement confirmText = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]"));

		String ConfirmationMsg = confirmText.getText();

		if (ConfirmationMsg.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");

		} else {

			System.out.println("TESTCASE FAILED");
		}

		driver.quit();

		tearDown();

	}
}