package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends LoadableComponent<HomePage> {

    private WebDriver driver;
    private WebDriverWait wait;
    private BasePage page;

    public HomePage(WebDriver driver, WebDriverWait wait, BasePage page) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.page = new BasePage(driver);
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }
}
