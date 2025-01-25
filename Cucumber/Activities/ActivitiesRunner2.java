package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepDefinitions",
    tags = "@activity2",  // This line runs only the test with the @activity2 tag
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class ActivitiesRunner2 {
    // This class will run only the test cases marked with the @activity2 tag
}
