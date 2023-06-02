package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
		plugin={"html:target/cucmber_html_report","pretty"},
		features= {"Features"},
		glue= {"StepDefinations"},
		tags= "@demo"	
		)

public class Runner {

}
