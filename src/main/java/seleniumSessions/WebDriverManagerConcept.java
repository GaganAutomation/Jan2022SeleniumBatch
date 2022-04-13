package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\gagan.tyagi\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new EdgeDriver();
		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		
		driver.quit();
		
		
	}
}
