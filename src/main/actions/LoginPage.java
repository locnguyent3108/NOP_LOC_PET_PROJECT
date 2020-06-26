package actions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static Interfaces.LoginPageUI.*;

public class LoginPage extends BasePage implements checkloadpage{
    String LOGIN_URL = "https://demo.nopcommerce.com/login?returnUrl=%2Fdigital-downloads";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void load() {
        openPage(LOGIN_URL);
        waitElementToAction(CLASS_PAGE_TITLE);
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

    public void submitLogin() throws NoSuchFieldException {
        waitElementClickable(XPATH_LOGIN_BUTTON);
        click(XPATH_LOGIN_BUTTON);
    }
}
