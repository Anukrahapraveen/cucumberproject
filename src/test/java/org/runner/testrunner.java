package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefn.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\vprav\\eclipse-workspace\\cucumber\\src\\test\\resources\\featurefiles\\facebooklogin.feature",
glue="org.stepdefn",monochrome=true,plugin="json:jsonreport\\JSONREPORT.json")



public class testrunner {
	@AfterClass
	public static void aft() {

		JVMReport.generateJvmReport("C:\\Users\\vprav\\eclipse-workspace\\cucumber\\jsonreport\\JSONREPORT.json");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
