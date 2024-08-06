package tek.bbd.base.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;
import tek.pages.HomePage;
import tek.pages.SignInPage;

public class SecurityTestSteps extends SeleniumUtility {
    @When("user click on sign in link")
    public void user_click_on_sign_in_link() {
        clickOnElement(HomePage.SIGN_IN_LINK);
    }
    @Then("validate user is in sign in page")
    public void validate_user_is_in_sign_in_page() {
        String pagesubtitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign in", pagesubtitle);
    }
    @When("user enter username and password and click on login")
    public void user_enter_username_and_password_and_click_on_login() {
        sentText(SignInPage.EMAIL_INPUT, "mnsrpopal1@gmail.com");
        sentText(SignInPage.PASSWORD_INPUT, "Kbl00135!");
        clickOnElement(SignInPage.LOGIN_BUTTON);
    }
    @When("user enter {string} and {string} and click on logins")
    public void userenterusernameandpassword(String username, String password) {
       sentText(SignInPage.EMAIL_INPUT, username);
       sentText(SignInPage.PASSWORD_INPUT, password);
       clickOnElement(SignInPage.LOGIN_BUTTON);
    }


    @Then("user should be able to see account link")
    public void user_should_be_able_to_see_account_link() {
        boolean isaccountdisplayed = iselementdiplayed(HomePage.ACCOUNT_LINK);
        Assert.assertTrue(isaccountdisplayed);
    }
    @When("user enter {string} and {string} and click on login")
    public void user_enter_and_and_click_on_login(String usereamail, String passinput) {
        sentText(SignInPage.EMAIL_INPUT,usereamail);
        sentText(SignInPage.PASSWORD_INPUT,passinput);
        clickOnElement(SignInPage.LOGIN_BUTTON);
    }
    @Then("user should see error {string}")
    public void usershouldseeerrormessage(String expectederrormessage) {
        String errormessage = getElementText(SignInPage.ERROR_MESSAGE);
        Assert.assertEquals(expectederrormessage, errormessage);

    }




}



