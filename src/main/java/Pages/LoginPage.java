package Pages;

import Consts.Consts;
import org.apache.logging.log4j.LogManager;

public class LoginPage extends BasePage {
    public static final String LOGIN_BUTTON = "//*[@class='icon icon-login']";
    public static final String CUSTOMER_EMAIL_TEXTBOX = "//*[@id='CustomerEmail']";
    public static final String PASSWORD_TEXTBOX = "//*[@id='CustomerPassword']";
    public static final String SIGN_IN_BUTTON = "//*[@id=\"customer_login\"]/div/input";
    public static final String ERROR_SIGNIN = "//*[text()='Incorrect email or password.']";
    public static final String RECOVER_LINK = "//a[text()='Forgot your password?']";
    public static final String RECOVER_PWD_TITLE = "//h2[text()='Reset your password']";
    public static final String CREATE_ACCOUNT = "//a[text()='Create account']";
    public static final String CREATE_ACCOUNT_TITLE = "//h1[text()='Create Account']";


    private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(LoginPage.class);
    public void navigateToLoginPage() {
        webDriver.get(Consts.LOGIN_PAGE_URL);
    }


    public boolean isErrorVisible() {
        Logger.info("Verifying if error message is displayed for Login Page");
        return elementExists(ERROR_SIGNIN);
    }
    public boolean isRecoverPswVisible() {
        Logger.info("Verifying if Recover Password Page is displayed");
        return elementExists(RECOVER_PWD_TITLE);
    }
    public boolean isSignUpPageVisible() {
        Logger.info("Verifying if SignUp Page is displayed");
        return elementExists(CREATE_ACCOUNT_TITLE);
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
    public LoginPage openSignUpPage(){
        clickElementByXpath(LOGIN_BUTTON);
        clickElementByXpath(CREATE_ACCOUNT);
        return new LoginPage();
    }
}
