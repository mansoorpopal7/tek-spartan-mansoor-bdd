package tek.bbd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bbd.base.Basesetup;

import java.time.Duration;

public class Seleniumutility extends Basesetup {

    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }
    private WebElement waitfotvisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    // create a method to click on a given locator
    public void clickonElemnet(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();

    }
    public void sendText(By locator, String value) {
        waitfotvisibility(locator).sendKeys(value);
    }
    public String getElementText(By locator) {
        return waitfotvisibility(locator).getText();
    }

}
