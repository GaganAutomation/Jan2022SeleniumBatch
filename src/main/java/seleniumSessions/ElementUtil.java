package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public By getBy(String locatortype, String locatorValue) {
		By locator = null;
		
		switch (locatortype.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;

		default:
			break;
		}
		return locator;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}
	
	

}
