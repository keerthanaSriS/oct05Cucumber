package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@C:\\Users\\Srikeerthana\\eclipse-workspace\\Cucumber12pm\\fblogin\\failed.txt", 
glue = "org\\stepdefinition")

public class RunnerFailedCls {

	
	
	
}