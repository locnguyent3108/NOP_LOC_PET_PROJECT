package actions;

import org.openqa.selenium.WebDriver;

import static Interfaces.LoginPageUI.*;

public class LoginPage extends BasePage implements checkloadpage{
    String LOGIN_URL = "https://demo.nopcommerce.com/login?returnUrl=%2Fdigital-downloads";
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void load() {
        String PAGE_TITLE = "Welcome, Please Sign In!";
        driver.get(LOGIN_URL);
        waitElementByText(CLASS_PAGE_TITLE, );
    }

    @Override
    public boolean isloaded() {
        return false;
    }



}
