package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "Features",
	    glue = {
	    		"stepDefinations"
	    	   },
	    tags = "@activity2_5",
	    plugin = { "pretty", "html:target/cucumber-reports.html" },
//	    plugin = {"html: test-reports"},
//	    plugin = {"json: test-reports/json-report.json"},
	    monochrome = true,
	    dryRun = false
	)

public class ActivitiesRunner {

}
