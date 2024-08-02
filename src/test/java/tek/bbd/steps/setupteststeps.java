package tek.bbd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import tek.bbd.utility.Seleniumutility;

public class setupteststeps extends Seleniumutility {
    @Given("open browser and navigate to retail app")
    public void openbrowserandnavigate() {
        setupbrowser();
    }
    @Then("validate top left corner is TEKSCHOOL")
    public void validatetopleftlogo() {
         String text = getElementText(By.className("top-nav__logo active"));
        System.out.println(text);
    }
    @Then("close the browser")
    public void closebrowser() {
        quitbrowser();
    }

}
