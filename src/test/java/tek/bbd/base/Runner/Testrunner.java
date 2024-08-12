package tek.bbd.base.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "tek.bbd.base.steps",
        dryRun = false,
        tags = "@Smoke",
        plugin = {
            "html:target/cucumber_report/index.html"
        }

)
public class Testrunner {
}

// running Multiple tags = @smoke or @Regression
