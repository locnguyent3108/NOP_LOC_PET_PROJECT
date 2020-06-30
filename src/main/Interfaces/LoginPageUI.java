package Interfaces;

public class LoginPageUI {
    public static final String XPATH_PAGE_TITLE = "//div[@class='header-logo']//a//img";
    public static final String XPATH_LOGIN_BUTTON = "//input[@class='button-1 login-button']";
    public static final String XPATH_ERROR_EMAIL = "//span[@class='field-validation-error']";
    public static final String XPATH_EMAIL_TEXT_FIELD = "//input[@id='Email']";

    private LoginPageUI() {
    }
}
