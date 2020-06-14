package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    private WebDriver driver;
    Actions act;

    public BasePage(WebDriver driver, Actions act) {
        this.driver = driver;
        this.act = act;
    }


    public BasePage(WebDriver driver) {
        this.driver = driver;
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

    /*
    wait method implements:
    waitAlertPresence

     */

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

    //WAIT METHODS

}
