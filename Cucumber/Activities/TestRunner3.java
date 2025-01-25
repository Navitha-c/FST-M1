package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepDefinitions",
    tags = "@activity3",  // This tag ensures that only tests from Activity 3 are run
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner3 {
    // This class will run only tests marked with the @activity3 tag
}
