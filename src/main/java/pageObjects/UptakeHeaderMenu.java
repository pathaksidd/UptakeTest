package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UptakeHeaderMenu {

//	private static WebElement element = null;

	private static String HomePage = "//*[@id=\"header\"]//div[contains(@class,'navbar')]//div[contains(@class,'logo-container')]/a";
	private static String AboutPage = "//*[@id=\"header\"]//div[contains(@class,'navbar')]/nav/a[text()='About']";
	private static String ProductsPage = "//*[@id=\"header\"]//div[contains(@class,'navbar')]/nav/a[text()='Products']";
	private static String IndustriesPage = "//*[@id=\"header\"]//div[contains(@class,'navbar')]/nav/a[text()='Industries']";
	private static String NewsRoomPage = "//*[@id=\"header\"]//div[contains(@class,'navbar')]/nav/a[text()='Newsroom']";
	private static String BeyondUptakePage = "//*[@id=\"header\"]//div[contains(@class,'navbar')]/nav/a[text()='Beyond.Uptake']";
	private static String Blog = "//*[@id=\"header\"]//div[contains(@class,'navbar')]/nav/a[text()='Blog']";
	private static String InfoBtn = "//*[@id=\"header\"]//div[contains(@class,'navbar')]//div[contains(@class,'cta-container')]/button[contains(@class,'ui primary button cta')]";
	
	public static WebElement getUptakeHomePage(WebDriver driver) {
		return driver.findElement(By.xpath(HomePage));
	}
	
	public static WebElement getUptakeAboutPage(WebDriver driver) {
		return driver.findElement(By.xpath(AboutPage));
	}
	
	public static WebElement getUptakeProductsPage(WebDriver driver) {
		return driver.findElement(By.xpath(ProductsPage));
	}

	public static WebElement getUptakeIndustriesPage(WebDriver driver) {
		return driver.findElement(By.xpath(IndustriesPage));
	}

	public static WebElement getUptakeNewsRoomPage(WebDriver driver) {
		return driver.findElement(By.xpath(NewsRoomPage));
	}

	public static WebElement getUptakeBeyondUptakePage(WebDriver driver) {
		return driver.findElement(By.xpath(BeyondUptakePage));
	}

	public static WebElement getUptakeBlogPage(WebDriver driver) {
		return driver.findElement(By.xpath(Blog));
	}

	public static WebElement getUptakeInfoBtn(WebDriver driver) {
		return driver.findElement(By.xpath(InfoBtn));
	}

}
