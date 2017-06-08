package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Jad
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "feature"
		,glue={"stepDef"}
		)
public class TestRunner {
	
}
