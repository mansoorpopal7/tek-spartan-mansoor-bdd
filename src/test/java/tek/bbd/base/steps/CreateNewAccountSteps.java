package tek.bbd.base.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.utility.RandomGenerator;
import tek.bdd.utility.SeleniumUtility;
import tek.pages.SignInPage;
import tek.pages.SignUpPages;

public class CreateNewAccountSteps extends SeleniumUtility {
    private static String emailTOUse;
    @When("user enter {string} and {string} and {string}")
    public void user_enter_and_and(String name, String email, String password) {
        emailTOUse = email.equalsIgnoreCase("random")
                ? RandomGenerator.generateRandomEmail() : email;
        sentText(SignUpPages.NAME_INPUT, name);
        sentText(SignUpPages.EMAIL_INPUT, emailTOUse);
        sentText(SignUpPages.PASSWORD_INPUT, password);
        sentText(SignUpPages.CONFIRM_PASSWORD, password);
    }

    @Then("validate user is in account page")
    public void validate_user_is_in_account_page() {
        String actualtext = getElementText(AccountPages.PROFILE_PAGE_TITLE);
        Assert.assertEquals("Your Profile", actualtext);
    }
    @Then("validate email address in account page match")
    public void validate_email_address_in_account_page_match() {
       String actualEmail = getElementText(AccountPages.PROFILE_EMAIL_TEXT);
       Assert.assertEquals(emailTOUse, actualEmail);
    }

}
