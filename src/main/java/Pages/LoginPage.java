package Pages;

import org.apache.logging.log4j.LogManager;

public class LoginPage extends BasePage {
    public static final String LOGIN_BUTTON = "//a[text()='site-header__account']";
    public static final String CUSTOMER_EMAIL_TEXTBOX = "//input[@data-name='customer[email]']";
    public static final String PASSWORD_TEXTBOX = "//input[@data-name='customer[password]']";
    public static final String SIGN_IN_BUTTON = "////button[text()='Sign In']";
    public static final String ERROR_SIGNIN = "//*[text()='Incorrect email or password']";
    public static final String RECOVER_LINK = "//a[text()='RecoverPassword']";
    public static final String RECOVER_PWD_TITLE = "//h2[text()='Reset your password']";


    private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(LoginPage.class);


    public boolean isErrorVisible() {
        Logger.info("Verifying if error message is displayed for Login Page");
        return elementExists(ERROR_SIGNIN);
    }
    public boolean isRecoverPswVisible() {
        Logger.info("Verifying if Recover Password Page is displayed");
        return elementExists(RECOVER_PWD_TITLE);
    }

    public LoginPage fillInCredentials(String email, String password) {

        clickElementByXpath(LOGIN_BUTTON);

        sendTextToElementByXpath(CUSTOMER_EMAIL_TEXTBOX, email);

        sendTextToElementByXpath(PASSWORD_TEXTBOX, password);

        clickElementByXpath(SIGN_IN_BUTTON);
        return new LoginPage();
    }
    public LoginPage openRecoverPswPage(){
        clickElementByXpath(LOGIN_BUTTON);
        clickElementByXpath(RECOVER_LINK);
        return new LoginPage();
    }
}
