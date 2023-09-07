import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to your feature files
    glue = "stepdefination", // Package where your step definitions are located
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class Runner {
    // This class will not have any code. It simply acts as a runner for Cucumber tests.
}
