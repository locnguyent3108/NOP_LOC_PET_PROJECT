package testhelper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static WebDriver driver;

    private DriverManager() {}

    public static WebDriver getDriverInstance() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void closeBrowser(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
        driver = null;
    }
}
