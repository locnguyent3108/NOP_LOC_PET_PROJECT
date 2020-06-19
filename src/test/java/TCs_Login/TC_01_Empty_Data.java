package TCs_Login;

import testhelper.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_01_Empty_Data {
    WebDriver driver;
    @BeforeClass
    public WebDriver prepareTest() {
        WebDriver driver = DriverManager.getDriverInstance();
        return driver;
    }

    @Test
    public void test() {

    }

    @AfterClass
    public void cleanup() {
        DriverManager.closeBrowser(driver);
    }
}
