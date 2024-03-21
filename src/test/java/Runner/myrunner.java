package Runner;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 


@CucumberOptions(
    features = {"C:\\Users\\91630\\eclipse-workspace\\DBankProject_RLL\\src\\test\\resources\\Feature\\transfer.feature"}, // Path to your feature files
    glue = {"Steps"},
    dryRun=false,  // it means you want Cucumber to execute the actual test code associated with the Gherkin's steps during the test run and if you give true it will only provide the steps that are not glued.
    plugin = {
        "html:target/Digital_bank.html",
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "timeline:test-output-thread/"
    }
// Package where your step definitions are located
)
public class myrunner extends AbstractTestNGCucumberTests { 
	
}