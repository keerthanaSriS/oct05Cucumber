package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionality extends BaseClass {

	PojoClass p;

	@Given("User is in facebook login page")
	public void userIsInFacebookLoginPage() {

		getUrl("https://www.facebook.com/");
	}

	@When("User enter invalid username and valid password")
	public void userEnterInvalidUsernameAndValidPassword() {
		p = new PojoClass();
		WebElement txtUser = p.getTxtUser();
		sendValue(txtUser, "smart");

		WebElement txtPass = p.getTxtPass();
		sendValue(txtPass, "12345");
	}

	@When("User enter invalid username {string} and valid password {string}")
	public void userEnterInvalidUsernameAndValidPassword(String string, String string2) {
		p = new PojoClass();
		WebElement txtUser = p.getTxtUser();
		sendValue(txtUser, string);
		Assert.assertEquals("hello", txtUser.getAttribute("value"));

		WebElement txtPass = p.getTxtPass();
		sendValue(txtPass, string2);

	}

	@When("User click login button")
	public void userClickLoginButton() {
		p = new PojoClass();
		WebElement btnLogin = p.getBtnLogin();
		btnClick(btnLogin);
	}

	@Then("User should be in invalid credentials page")
	public void userShouldBeInInvalidCredentialsPage() {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("url message", currentUrl.contains("privacy_mutation_token"));
		System.out.println("user enter invalid credential page");

	}

	@When("User click the forgetten password button")
	public void userClickTheForgettenPasswordButton() {
		p = new PojoClass();
		WebElement frgtBtn = p.getFrgtBtn();
		btnClick(frgtBtn);
	}

	@When("User enter the mail address or phone number")
	public void userEnterTheMailAddressOrPhoneNumber(DataTable d) {

		p = new PojoClass();

		List<Map<String, String>> asMaps = d.asMaps(String.class, String.class);

		String string = asMaps.get(2).get("password");// jenkins

		WebElement txtValue = p.getTxtValue();
		sendValue(txtValue, string);
	

	}

	@When("User click the search btn")
	public void userClickTheSearchBtn() {
		p = new PojoClass();
		WebElement searchBtn = p.getSearchBtn();
		btnClick(searchBtn);

	}

	@Then("User enter into invalid credentials page")
	public void userEnterIntoInvalidCredentialsPage() {
		System.out.println("enter invalid credentials page");

	}

}
