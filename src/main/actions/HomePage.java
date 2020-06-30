package actions;

import org.openqa.selenium.WebDriver;

import static Nop_UI.HomePageUI.XPATH_FOOTER_POWERED;

public class HomePage extends BasePage implements checkloadpage{
    static final  String homePageUrl = "https://demo.nopcommerce.com/";

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @Override
    public void load() {
        openPage(homePageUrl);
    }

    @Override
    public boolean isloaded() throws NoSuchFieldException {
        waitElementToAction(XPATH_FOOTER_POWERED);
        return findElement(XPATH_FOOTER_POWERED).isDisplayed();
    }

    public void get() {
        try {
            load();
            isloaded();
        } catch (Exception e) {
            System.out.println("Page error: " + e.toString());
        }
    }
}
