package testhelper;

import actions.HomePage;
import actions.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageGenerator {
    public static LoginPage getLoginPage(WebDriver driver) {
        return new LoginPage(driver);
    }

    public static HomePage getHomePage(WebDriver driver) {
        return new HomePage(driver);
    }
}
