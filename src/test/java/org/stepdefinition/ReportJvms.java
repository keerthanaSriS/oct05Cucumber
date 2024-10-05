package org.stepdefinition;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportJvms {

	public static void reports(String jsonPath) {

		// Step1
		File f = new File("C:\\Users\\Srikeerthana\\eclipse-workspace\\Cucumber12pm\\Reports\\JvmReport");

		// step2
		Configuration c = new Configuration(f, "Fb");
		c.addClassifications("filebrowser", "chrome");
		c.addClassifications("featurefile", "chrome");

		// step3
		List<String> li = new LinkedList<String>();
		li.add(jsonPath);

		// step4
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();

	}

}
