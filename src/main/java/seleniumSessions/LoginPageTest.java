package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {
    
	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		String title = bUtil.getPageTitle();
		System.out.println(title);
		
		System.out.println(bUtil.getPageUrl());
		
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendkeys(email,"Test@test.com");
		elUtil.doSendkeys(pwd, "Test@1234");
		
		bUtil.quitBrowser();

		
	}

}
