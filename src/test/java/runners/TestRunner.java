package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
                 glue = "stepDefs",
                 tags = "@wip",
                 plugin = { "pretty", "html:target/cucumber-reports" },
                 monochrome = true)
public class TestRunner {
}
