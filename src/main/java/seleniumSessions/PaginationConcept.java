package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		int pageCount = 1;
		while (true) {

			if (driver.findElements(By.xpath("//td[text()='Brno']")).size() > 0) {
				selectCheckBox("Brno");
				System.out.println("Page count: " + pageCount);
				break;
			} else {
				WebElement next = driver.findElement(By.linkText("Next"));
				if (next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination over..and no record found..");
					break;
				}

				next.click();
				pageCount++;
			}

		}

	}

	public static void selectCheckBox(String name) {

		driver.findElement(By.xpath("//td[text()='" + name + "']//preceding-sibling::td/input")).click();

	}

}
