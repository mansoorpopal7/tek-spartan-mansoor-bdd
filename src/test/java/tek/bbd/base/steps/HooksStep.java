package tek.bbd.base.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tek.bdd.utility.SeleniumUtility;

public class HooksStep extends SeleniumUtility {
    @Before
    public void beforeeachscenario() {
        setupBrowser();
    }
    @After
    public void aftereachscenario() {
        quitBrowser();
    }

}
