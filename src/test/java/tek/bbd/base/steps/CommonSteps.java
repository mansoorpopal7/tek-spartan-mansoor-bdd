package tek.bbd.base.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class CommonSteps extends SeleniumUtility {
    @Given("user click on {string} link")
    public void userclickonlinltext(String linkText) {
        clickOnElement(By.linkText(linkText));
    }
    @When("user click on {string} button")
    public void user_click_on_button(String buttonvisibletext) {
        String btnvisibletext = "//button[text() = '"+ buttonvisibletext +"']";
        clickOnElement(By.xpath(btnvisibletext));

    }


}

