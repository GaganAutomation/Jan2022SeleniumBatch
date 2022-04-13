package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("Chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		System.out.println(br.getPageTitle());
		
		ElementUtil e = new ElementUtil(driver);
		By firstNameid = e.getBy("id", "input-firstname");
		By lastNameid = e.getBy("id", "input-lastname");
		By emailid = e.getBy("id", "input-email");
		By telephoneid = e.getBy("id", "input-telephone");
		By pwdid = e.getBy("id", "input-password");
		By pwdcid = e.getBy("id", "input-confirm");
		
//		WebElement firstName =  e.getElement(firstNameid);
//		WebElement lastName = e.getElement(lastNameid);
//		WebElement email = e.getElement(emailid);
//		WebElement telephone = e.getElement(telephoneid);
//		WebElement pwd = e.getElement(pwdid);
//		WebElement pwdC = e.getElement(pwdcid);
		
		e.doSendkeys(firstNameid, "Gagan");
		e.doSendkeys(lastNameid, "Tyagi");
		e.doSendkeys(emailid, "gagantyagi2012@gmail.com");
		e.doSendkeys(telephoneid, "0987654321");
		e.doSendkeys(pwdid, "test@1234");
		e.doSendkeys(pwdcid, "test@1234");
		
		br.closeBrowser();
		
	}

}
