package com.syntax.cucumberproject.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="\\Users\\DELL\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Features\\Login.feature"
				, glue="\\Users\\DELL\\eclipse-workspace\\CucumberProject\\src\\test\\java\\com\\syntax\\cucumberproject\\test\\stepDefinitions")
public class LoginRunner {

}
