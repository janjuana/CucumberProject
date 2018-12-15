package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features"}, glue= {"src/test/java/stepDefinitions"}, 
plugin = {"pretty","html:test-output"}, dryRun=false, monochrome=true)
				
public class TestRunner {

}
