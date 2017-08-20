package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UptakeAboutPage {

	static UptakeHeaderMenu headerMenu;
	private static String pageTitle = "About";

	private static String ProductivityBtn = ".//*[@id='about']//div[contains(@class, 'section__content skills')]//div[contains(@class, 'skills__container')]//a//div[text()='Productivity']";
	private static String ReliabilityBtn = ".//*[@id='about']//div[contains(@class, 'section__content skills')]//div[contains(@class, 'skills__container')]//a//div[text()='Reliability']";
	private static String SafetyBtn = ".//*[@id='about']//div[contains(@class, 'section__content skills')]//div[contains(@class, 'skills__container')]//a//div[text()='Safety']";
	private static String CyberSecurityBtn = ".//*[@id='about']//div[contains(@class, 'section__content skills')]//div[contains(@class, 'skills__container')]//a//div[text()='Cyber Security']";
	private static String ProductsLink = ".//*[@id='about']//div[contains(@class, 'section__content nextPage__content')]//a[text()='See Our Products']";

	public static String getPageTitle(WebDriver driver) {
//		pageTitle = driver.getTitle();
		return pageTitle;
	}

	public static WebElement getProductivityBtn(WebDriver driver) {
		return driver.findElement(By.xpath(ProductivityBtn));
	}

	public static WebElement getReliabilityBtn(WebDriver driver) {
		return driver.findElement(By.xpath(ReliabilityBtn));
	}

	public static WebElement getSafetyBtn(WebDriver driver) {
		return driver.findElement(By.xpath(SafetyBtn));
	}

	public static WebElement getCyberSecurityBtn(WebDriver driver) {
		return driver.findElement(By.xpath(CyberSecurityBtn));
	}

	public static WebElement getProductsLink(WebDriver driver) {
		return driver.findElement(By.xpath(ProductsLink));
	}

}
