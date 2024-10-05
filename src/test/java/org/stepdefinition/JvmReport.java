package org.stepdefinition;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateReport(String Jsonpath) {
		File f = new File("C:\\Users\\Srikeerthana\\eclipse-workspace\\Cucumber12pm\\Jvm");

		Configuration c = new Configuration(f, "facebook");
		c.addClassifications("browsername", "chrome");
		c.addClassifications("browserversion", "chrome");
		c.addClassifications("platformname", "chrome");
		c.addClassifications("p.v", "chrome");

		List<String> li = new LinkedList();
		li.add(Jsonpath);

		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();

	}

}
