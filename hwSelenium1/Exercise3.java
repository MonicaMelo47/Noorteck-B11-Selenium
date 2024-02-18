package hwSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise3 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(1000);

		WebElement registerLink = driver.findElement(By.linkText("Register"));

		registerLink.click();
		Thread.sleep(2000);

		String pageTitle = driver.getTitle();

		if (pageTitle.equals("nopCommerce demo store. Register")) {

			System.out.println("Page Title is nopCommerce demo store. Register");
		} else {
			System.out.println("Page Title is NOT nopCommerce demo store. Register");

		}

		WebElement firstName = driver.findElement(By.name("FirstName"));

		firstName.sendKeys("Monica");

		WebElement lastName = driver.findElement(By.name("LastName"));

		lastName.sendKeys("Melo");

		WebElement DayofBirth = driver.findElement(By.name("DateOfBirthDay"));

		Select selectObj = new Select(DayofBirth);

		selectObj.selectByValue("2");
		Thread.sleep(2000);

		WebElement MonthofBirth = driver.findElement(By.name("DateOfBirthMonth"));

		Select selectObj1 = new Select(MonthofBirth);

		selectObj1.selectByVisibleText("November");

		Thread.sleep(2000);

		WebElement YearofBirth = driver.findElement(By.name("DateOfBirthYear"));

		Select selectObj2 = new Select(YearofBirth);

		selectObj2.selectByVisibleText("1995");
		Thread.sleep(2000);

		WebElement emailField = driver.findElement(By.name("Email"));

		emailField.sendKeys("mmfrannyandzooey@gmail.com");

		WebElement Company = driver.findElement(By.name("Company"));

		Company.sendKeys("CrowdStrike");

		WebElement Checkbox = driver.findElement(By.name("Newsletter"));

		Checkbox.click();
		Thread.sleep(2000);

		WebElement passwordField = driver.findElement(By.name("Password"));

		passwordField.sendKeys("Crazie Doo");

		WebElement passwordConfirm = driver.findElement(By.name("ConfirmPassword"));

		passwordConfirm.sendKeys("Crazie Doo");
		Thread.sleep(2000);

		WebElement registerBtn = driver.findElement(By.name("register-button"));
		registerBtn.click();

		WebElement confirmMsg = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));

		String confirmText = confirmMsg.getText();

		if (confirmText.equals("Your registration completed!!!")) {

			System.out.println("TESTCASE PASSED");

		} else {
			System.out.println("TESTCASE FAILED");
		}

		driver.quit();
		tearDown();

	}
}