package test.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/main/resource",
		glue = "test.steps",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:src/test/resource/Reports/reports.html"}
		)

public class Run {
	
}
