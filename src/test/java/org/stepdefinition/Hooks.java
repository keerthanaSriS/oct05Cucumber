package org.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void bfr() {
		System.out.println("before");
		edgeBrowser();
		maxWindow();
	}

	@After
	public void aftr(Scenario s) {

		if (s.isFailed()) {

			TakesScreenshot tk = (TakesScreenshot) driver;

			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);

			s.embed(screenshotAs, "image/png");
		}

		browserClose();
		System.out.println("end");
	}

}
