package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UptakeHomePage {

	static UptakeHeaderMenu headerMenu;
	private static String pageTitle="Analytics for the industrial internet";

	private static String AboutLearnMore = "//*[@id=\"home\"]//div[contains(@class,'section')]//div[contains(@class,'section__content__cropper')]//button[contains(@class,'homeSlide__button')]";
	private static String BlogLearnMore = "//*[@id=\"home\"]//div[contains(@class,'section video')]//div[contains(@class,'grid')]//button[contains(@class,'homeSlide__button')]";
	private static String ProductsLearnMore = "//*[@id=\"home\"]/div[contains(@class,'section')]//div[contains(@class,'section__content homeSlide')]//div[contains(@class,'section__content__cropper')]//button[text()='Ready for Results?']";
	private static String OpenPositionsBtn = "//*[@id=\"home\"]/div[contains(@class,'section')]//div[contains(@class,'section__content homeSlide')]//div[contains(@class,'section__content__cropper')]//button[text()='View Open Positions']";

	public static String getPageTitle(WebDriver driver) {
//		pageTitle = driver.getTitle();
		return pageTitle;
	}

	public static WebElement getAboutLearnMore(WebDriver driver) {
		return driver.findElement(By.xpath(AboutLearnMore));
	}

	public static WebElement getBlogLearnMore(WebDriver driver) {
		return driver.findElement(By.xpath(BlogLearnMore));
	}

	public static WebElement getProductsLearnMore(WebDriver driver) {
		return driver.findElement(By.xpath(ProductsLearnMore));
	}

	public static WebElement getOpenPositionsBtn(WebDriver driver) {
		return driver.findElement(By.xpath(OpenPositionsBtn));
	}
}
