package cucumberScript.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "",
		plugin = {"pretty", //to generate reports
				"html:target/cucumber-report.html",
				"json:target/cucumber-json-report.json",
				
		},
		dryRun=false
		
		)
public class RunTest {
	
	
	

}
