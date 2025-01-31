package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.stepdefinition.JvmReport;
import org.stepdefinition.ReportJvms;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org\\stepdefinition", dryRun = false, monochrome = true,
strict = true, tags= {"@regression"}, snippets = SnippetType.CAMELCASE,
plugin = {
		 "html:Reports\\HTMLReport", 
		 "junit:Reports\\JunitReport\\jreports.xml",
		"json:Reports\\JsonReport\\jsreport.json",
		"rerun:C:\\Users\\Srikeerthana\\eclipse-workspace\\Cucumber12pm\\FailedScenario\\failure.txt"

})

public class Rerunner {

	@AfterClass
	public static void generate() {

		ReportJvms.reports(
				"C:\\Users\\Srikeerthana\\eclipse-workspace\\Cucumber12pm\\Reports\\JsonReport\\jsreport.json");
	}

}
