package tek.bbd.base.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/SetupTest.feature",
        glue = "tek.bbd.base.steps"
)
public class Testrunner {
}
