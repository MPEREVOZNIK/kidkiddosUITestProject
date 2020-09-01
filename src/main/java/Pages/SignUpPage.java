package Pages;

import org.apache.logging.log4j.LogManager;

import static Pages.LoginPage.CREATE_ACCOUNT;
import static Pages.LoginPage.LOGIN_BUTTON;

public class SignUpPage extends BasePage {
    public static final String FIRSTNAME_TEXTBOX = "//input[@name='customer[first_name]']";
    public static final String LASTNAME_TEXTBOX = "//input[@name='customer[last_name]']";
    public static final String EMAIL_TEXTBOX_SIGNUP = "//input[@name='customer[email]']";
    public static final String PASSWORD_TEXTBOX_SIGNUP = "//input[@name='customer[password]']";
    public static final String CREATE_BUTTON = "//*[@class='btn']";
    public static final String SUBMIT_BUTTON = "//*[@class ='shopify-challenge__button btn']";

    private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(SignUpPage.class);

    public boolean isSubmitBtnVisible() {
        Logger.info("Verifying if Submit button is displayed");
        return elementExists(SUBMIT_BUTTON);
    }

    public SignUpPage fillSignUpForm(String name, String lastname, String email, String password) {

        clickElementByXpath(LOGIN_BUTTON);
        clickElementByXpath(CREATE_ACCOUNT);
        sendTextToElementByXpath(FIRSTNAME_TEXTBOX, name);
        sendTextToElementByXpath(LASTNAME_TEXTBOX, lastname);
        sendTextToElementByXpath(EMAIL_TEXTBOX_SIGNUP, email);
        sendTextToElementByXpath(PASSWORD_TEXTBOX_SIGNUP, password);
        clickElementByXpath(CREATE_BUTTON);
        return new SignUpPage();
    }
}
