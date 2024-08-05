package tek.bbd.base.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class setupTeststeps extends SeleniumUtility {

   @Given("open browser and navigate to retail app")
   public void openBrowserandnavigate() {
        setupBrowser();
    }
    @Then("validate top left corner")
    public void validateTopleftlogo() {
        String topleftcornertext = getElementText(By.className("top-nav__logo"));
        Assert.assertEquals("TEKSCHOOL", topleftcornertext);
    }
    @Then("close the browser")
   public void closeBrowser() {
        quitBrowser();
    }
}
