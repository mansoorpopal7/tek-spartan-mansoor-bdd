package tek.bbd.base.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class setupTeststeps extends SeleniumUtility {



    @Then("validate top left corner")
    public void validateTopleftlogo() {
        String topleftcornertext = getElementText(By.className("top-nav__logo"));
        Assert.assertEquals("TEKSCHOOL", topleftcornertext);
    }
    @Then("validate sign in button is enabled")
    public void validatesigninbtnisenabled() {
            boolean issigninbtnenabled =   iselementenabled(By.id("signinLink"));
            Assert.assertTrue(issigninbtnenabled);
    }

}
