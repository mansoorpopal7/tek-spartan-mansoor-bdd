package tek.bbd.base.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.bdd.utility.SeleniumUtility;

public class HooksStep extends SeleniumUtility {
    @Before
    public void beforeeachscenario() {
        setupBrowser();
    }
    @After
    public void aftereachscenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte [] screenshot = takeScreenShot();
            scenario.attach(screenshot, "image,png", "failed_scenario");
        }
        quitBrowser();
    }

}
