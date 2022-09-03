package com.zoopla.myrunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
	    plugin= {"pretty","html:Extend_Report/smokeresult.html"},
		features="./Features",
		glue="com.zoopla.stepdefs",
		tags="@sanity"
	//	dryRun=false,
	//	monochrome= true
		
		
		
		
		
		)

public class MyRunner extends AbstractTestNGCucumberTests {

}
