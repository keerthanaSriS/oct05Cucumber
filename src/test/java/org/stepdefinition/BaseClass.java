package org.stepdefinition;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void edgeBrowser() {
		driver = new EdgeDriver();

	}

	public static void maxWindow() {

		driver.manage().window().maximize();

	}

	public static String currentUrl() {

		String currentUrl = driver.getCurrentUrl();

		return currentUrl;
	}

	public static String title() {

		String title = driver.getTitle();

		return title;

	}

	public static void getUrl(String url) {

		driver.get(url);
	}

	public static void sendValue(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void btnClick(WebElement btn) {

		btn.click();
	}

	public static void refereshPage() {

		driver.navigate().refresh();
	}

	public static void dateAndTime() {
		Date d = new Date();
		System.out.println(d);

	}
	
	public static void browserClose() {
		driver.close();
	}
	
	

}
