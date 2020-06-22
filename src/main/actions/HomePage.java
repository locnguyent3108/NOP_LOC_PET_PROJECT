package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage implements checkloadpage{

    private WebDriver driver;
    private BasePage page;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected void load() {

    }

    @Override
    public boolean isloaded() {
        return false;
    }

    @Override
    protected void isLoaded() throws Error {

    }
}
