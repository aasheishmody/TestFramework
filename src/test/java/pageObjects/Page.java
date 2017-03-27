package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Retrier;
import util.WebConnector;

public abstract class Page extends WebConnector {

    protected void click(WebElement element, int timeout) {
        Retrier.retry("click " + element, () -> singleClick(element, timeout), 5, 250l);
    }

    protected void singleClick(WebElement element, int timeout) {
        getLogger().info("Waiting for " + element + " to be displayed");
        WebDriverWait wait = buidWebDriverWait(timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
        getLogger().info(element + " found after waiting for it to be displayed");
        getLogger().info("Waiting for element to be clickable - " + element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        getLogger().info("Clicking " + element);
        element.click();
        getLogger().info("Clicked " + element);
    }

    protected WebDriverWait buidWebDriverWait(int timeout) {
        long sleepInMillis = 250L;
        return new WebDriverWait(getDriver(), timeout, sleepInMillis);
    }

    protected void waitForElementToBeDisplayed(WebElement element, int timeout) {
        Retrier.retry("waitForElementToBeDisplayed " + element,
                () -> singleWaitForElementToBeDisplayed(element, timeout),
                4, 250l);
    }

    protected void singleWaitForElementToBeDisplayed(WebElement element, int timeout) {
        getLogger().info("Waiting for " + element + " to be displayed");
        WebDriverWait wait = buidWebDriverWait(timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
        getLogger().info(element + " found after waiting for it to be displayed");
    }

    protected void waitForURLtoContain(String text, int timeout) {
        getLogger().info("Waiting for URL to contain text - " + text);
        WebDriverWait wait = buidWebDriverWait(timeout);
        wait.until(ExpectedConditions.urlContains(text));
        getLogger().info("Waited for URL to contain text - " + text);
    }

    protected void sendKeys(WebElement element, String text, int timeout) {
        waitForElementToBeDisplayed(element, timeout);
        getLogger().info("Sending text - " + text + " to element - " + element);
        element.sendKeys(text);
        getLogger().info("Sent text - " + text + " to element - " + element);
    }

    protected void hover(WebElement element) {
        Actions builder = new Actions(getDriver());
        Actions mouseOver = builder.moveToElement(element);
        mouseOver.build().perform();
    }

}
