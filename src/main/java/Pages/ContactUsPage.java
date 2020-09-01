package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ContactUsPage extends BasePage {
    public static final String NAME_TEXTBOX = "//input[@data-name='first_name']";
    public static final String EMAIL_TEXTBOX = "//input[@data-name='email']";
    public static final String MSG_TEXTBOX = "//textarea[@data-name='your_message']";
    public static final String CONTACT_US_OPTION = "//a[text()='Contact us']";
    public static final String CONTACT_US_HEADER = "//h1[text()='Contact us']";
    public static final String THANK_YOU_BANNER = "//*[@class='_form-thank-you']";
    public static final String ERROR_NAME_BOX = "//*[contains(text(),'This field is required')]";
    public static final String ERROR_EMAIL_BOX = "//*[contains(text(),'This field is required')]";
    public static final String ERROR_MESSAGE_BOX = "//*[contains(text(),'This field is required')]";
    public static final String SEND_MSG_BUTTON = "//button[text()=' Send your message ']";

    private static final Logger Logger = LogManager.getLogger(ContactUsPage.class);


    public boolean isPageTitleVisible() {
        Logger.info("Verifying if the page title is displayed");
        return elementExists(CONTACT_US_HEADER);
    }
    public boolean isNameErrorVisible(){
        Logger.info("Verifying if error message is displayed for Name text box");
        return elementExists(ERROR_NAME_BOX);
    }
    public boolean isEmailErrorVisible(){
        Logger.info("Verifying if error message is displayed for Email text box");
        return elementExists(ERROR_EMAIL_BOX);
    }
    public boolean isMessageErrorVisible(){
        Logger.info("Verifying if error is displayed for Message text box");
        return elementExists(ERROR_MESSAGE_BOX);
    }
    public boolean isThankYouMsgVisible(){
        Logger.info("Verifying if Thank You message is displayed");
        return elementExists(THANK_YOU_BANNER);
    }
    public ContactUsPage fillContactUsForm(String name, String email, String message){

        clickElementByXpath(CONTACT_US_OPTION);

        sendTextToElementByXpath(NAME_TEXTBOX, name);

        sendTextToElementByXpath(EMAIL_TEXTBOX, email);

        sendTextToElementByXpath(MSG_TEXTBOX, message);

        clickElementByXpath(SEND_MSG_BUTTON);
        return new ContactUsPage();

    }
}
