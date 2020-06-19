package testhelper;

import actions.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageGenerator {
    WebDriver driver;
    public static LoginPage getLoginPage(WebDriver driver) {
        return new LoginPage(driver);
    }
}
