package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// 1. Create webElement + perform Action
//		driver.findElement(By.id("input-email")).sendKeys("Test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Test@123");

		// 2. Using WebElement
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password =  driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("gagan@test.com");
//		password.sendKeys("test@123");

		// 3. Using By Locator
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailId = driver.findElement(email);
//		WebElement password =  driver.findElement(pwd);
//		
//		emailId.sendKeys("naveen@test.com");
//		password.sendKeys("test@123456");

		// 4.Using Generic functions

		By email = By.id("input-email");
		By pwd = By.id("input-password");

		WebElement emailId = getElement(email);
		WebElement password = getElement(pwd);

		doSendKeys(email, "hamid@test.com");
		doSendKeys(pwd, "Test@123");
		
		//5. Using ElementUtil class
		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
