package TCs_Login;

import actions.HomePage;
import actions.LoginPage;
import org.testng.annotations.BeforeMethod;
import testhelper.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testhelper.PageGenerator;

public class TC_01_Empty_Data {
    WebDriver driver;
    LoginPage loginPageInstance;

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
        loginPageInstance.submitLogin()
                .isEmptyAlertDisplayed();
    }

    @AfterClass
    public void cleanup() {
        DriverManager.closeBrowser(driver);
    }
}
