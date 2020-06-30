package actions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Interfaces.LoginPageUI.*;

public class LoginPage extends BasePage implements checkloadpage{
    String LOGIN_URL = "https://demo.nopcommerce.com/login?returnUrl=%2Fdigital-downloads";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void load() {
        openPage(LOGIN_URL);
        waitElementToAction(XPATH_PAGE_TITLE);
    }

    @Override
    public boolean isloaded() {
        return true;
    }

    public void get() {
        try {
            load();
            isloaded();
        } catch (NoSuchElementException e) {
            System.out.println("Page error: " + e.toString());
        }
    }

    public LoginPage submitLogin() throws NoSuchFieldException {
        waitElementClickable(XPATH_LOGIN_BUTTON);
        click(XPATH_LOGIN_BUTTON);
        return this;
    }

    public LoginPage isEmptyAlertDisplayed(){
        waitElementToAction(XPATH_ERROR_EMAIL);
        isElementDisplayed(XPATH_ERROR_EMAIL);
        return this;
    }

    public LoginPage inputEmail(String value) {
        waitElementToAction(XPATH_EMAIL_TEXT_FIELD);
        sendKeys(XPATH_EMAIL_TEXT_FIELD, value);
        return this;
    }

    public void isInvalidErrorDisplay(String errorText) {
        WebElement e = findElement(XPATH_ERROR_EMAIL);
        waitElementToAction(XPATH_ERROR_EMAIL);
        checkElementContent(XPATH_ERROR_EMAIL,errorText);
    }

    public void isEmailNonExists(String errorText) {
        WebElement e = findElement(XPATH_ERROR_EMAIL_NOT_FOUND);
        waitElementToAction(XPATH_ERROR_EMAIL_NOT_FOUND);
        checkElementContent(XPATH_ERROR_EMAIL_NOT_FOUND,errorText);

    }
}
