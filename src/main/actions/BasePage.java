package actions;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Assert.*;
public class BasePage {
    private WebDriver driver;
    Actions act;
    WebDriverWait wait;
    public BasePage(WebDriver driver, Actions act) {
        this.driver = driver;
        this.act = act;

    }


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    /*
    actions browsers need:
    openURL
    getPageTitle
    getCurrentTitle
    navigateBack
    refresh page
    forward
    acceptAlert
    cancelAlert
    sendKeyToAlert
    getTextInAlert
     */
    public void openPage(String url) {
        driver.get(url);
    }

    public WebElement findElement(String locator){
        return driver.findElement(By.xpath(locator));
    }
    /*
    wait method implements:
    waitAlertPresence
     */
    public void waitElementClickable(String locator){
        WebElement e = findElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(e));
    }

    public void waitElementToAction(String locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    //page actions method:
    public void click(String clickLocatorXpath) {
      driver.findElement(By.xpath(clickLocatorXpath)).click();
    }

    public void sendKeys(String textFieldLocation, String value) {
        WebElement inputField = driver.findElement(By.xpath(textFieldLocation));
        inputField.sendKeys(value);
    }

    public void getText(String location) {
        driver.findElement(By.xpath(location)).getText();
    }

    public void dragAndDrop(String sourcelocation, String destinationLocation) {
        act = new Actions(driver);
        WebElement sourceElement = driver.findElement(By.xpath(sourcelocation));
        WebElement destinationElement = driver.findElement(By.xpath(destinationLocation));

        act.clickAndHold(sourceElement)
                .moveByOffset(0,-10)
                .moveToElement(destinationElement)
                .build()
                .perform();
    }

    public void clearTextBeforeEdit(String location) {
        WebElement textFieldLocation = driver.findElement(By.xpath(location));
        textFieldLocation.clear();
    }

    public void clearTextWithActionClass(String location) {
        WebElement element = driver.findElement(By.xpath(location));
        act = new Actions(driver);
        int i = 0;
        act.click(element);
        while (i <= element.getText().length()) {
            act.moveToElement(element, element.getSize().getWidth(),0)
                .pause(50)
                .sendKeys(Keys.BACK_SPACE);
        }
        act.build().perform();
    }

    //Assert
    public void isElementDisplayed(String locator) {
        WebElement element = findElement(locator);
        try {
            Assert.assertTrue(element.isDisplayed());
        } catch (ElementNotVisibleException e) {
            System.out.println("%s not display: " + e.getMessage());
        }
    }

    public void checkElementContent(String locator, String expectedValue){
        WebElement e = findElement(locator);
        Assert.assertEquals(e.getText(), expectedValue);
    }
}
