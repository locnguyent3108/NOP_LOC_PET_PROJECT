package actions;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage implements checkloadpage{
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void load() {

    }

    @Override
    public boolean isloaded() {
        return false;
    }

}
