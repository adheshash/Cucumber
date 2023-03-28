package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Featurefiles",
		glue="StepDefinition",
		dryRun=false,
		monochrome=false,
		tags= "@Login"
		
		)
		
		
		
public class RunnerClass {

}
//plugin= {"html:report/WebReport","json:report/jsonreport.json"}