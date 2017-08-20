package Uptake.com.uptake.test;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.UptakeAboutPage;
import pageObjects.UptakeHomePage;

/**
 * Navigation Test for Uptake Home Page and About Page
 */
public class UptakeTest {
	WebDriver driver;
	WebDriverWait wait;

	/**
	 * Before test initializes the driver and system properties
	 */
	@org.testng.annotations.BeforeTest
	public void BeforeTest() throws InterruptedException {
		System.out.println("BEFORE TEST");
		System.setProperty("webdriver.chrome.driver",
				"F:/Sid/Eclipse/Selenium WebDrivers (IE, Chrome)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	/**
	 * Test navigates to Home page of Uptake and verifies it with title of the
	 * Page. Once we get the Home Page, We Navigate to About page and then from
	 * About Page Object assert the title of the page
	 */
	@Test
	public void testNavigation() throws InterruptedException {
		wait = new WebDriverWait(driver, 2);
		driver.get("https://www.uptake.com/");
		Thread.sleep(5000);
		assertEquals(driver.getTitle(), UptakeHomePage.getPageTitle(driver));

		// Get the About Page from Home Page
		UptakeHomePage.getAboutLearnMore(driver).click();
		Thread.sleep(10000);
		assertEquals(driver.getTitle(), UptakeAboutPage.getPageTitle(driver));
	}

	/**
	 * After test closes the driver session and quit
	 */
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("AFTER TEST");
		driver.quit();
	}
}
