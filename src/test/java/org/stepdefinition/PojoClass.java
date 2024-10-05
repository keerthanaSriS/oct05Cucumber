package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	// WebElement txtUser = driver.findElement(By.id("email"));

	public PojoClass() {

		PageFactory.initElements(driver, this);

	}

//	@FindBy(id = "email")

	@FindAll({ // AND
			@FindBy(id = "email"), // f
			@FindBy(xpath = "//input[@type='text']") // T
	})

//	@CacheLookup
//	@FindAll({ //OR
//		@FindBy(id = "emai"), //f
//		@FindBy(xpath = "//input[@type='text']") //T
//	})
	private WebElement txtUser;

	// WebElement txtPass = driver.findElement(By.id("pass"));

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {

		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	@FindBy(id = "pass")
	private WebElement txtPass;

	// WebElement btnLogin =
	// driver.findElement(By.xpath("//button[@name='login']"));

	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;

	public WebElement getFrgtBtn() {
		return frgtBtn;
	}

	public WebElement getTxtValue() {
		return txtValue;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement frgtBtn;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement txtValue;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchBtn;

}
