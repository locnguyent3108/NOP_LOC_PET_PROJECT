package TCs_Login;

import actions.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testhelper.DriverManager;
import testhelper.PageGenerator;

public class TC_02_Invalid_email {
    WebDriver driver;
    LoginPage loginPageInstance;
    String invalidEmail = "abc";
    String errorMessage = "Wrong email";
    @BeforeClass
    public void prepareTest() {
        driver = DriverManager.getDriverInstance();
        loginPageInstance = PageGenerator.getLoginPage(driver);
    }

    @BeforeMethod
    public void preCondition() {
        loginPageInstance.get();
    }

    @Test
    public void test() throws NoSuchFieldException {
        loginPageInstance.inputEmail(invalidEmail)
                .submitLogin();
        loginPageInstance.isInvalidErrorDisplay(errorMessage);
    }

    @AfterClass
    public void cleanup() {
        DriverManager.closeBrowser(driver);
    }
}
