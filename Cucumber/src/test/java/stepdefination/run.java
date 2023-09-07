package stepdefination;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepdefination",
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class run {
    // This class will not have any code. It simply acts as a runner for Cucumber tests.
}
