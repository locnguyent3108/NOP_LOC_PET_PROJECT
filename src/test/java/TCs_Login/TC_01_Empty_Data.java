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
    HomePage homePageInstance;
    LoginPage loginPageInstance;
    @BeforeClass
    public void prepareTest() {
        driver = DriverManager.getDriverInstance();
        homePageInstance = PageGenerator.getHomePage(driver);
        loginPageInstance = PageGenerator.getLoginPage(driver);

    }

    @BeforeMethod
    public void precondition() {
    }

    @Test
    public void test() {

    }

    @AfterClass
    public void cleanup() {
        DriverManager.closeBrowser(driver);
    }
}
