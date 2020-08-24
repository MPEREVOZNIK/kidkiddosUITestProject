package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AllLanguagesCollectionPage extends BasePage {
    public static final String ALL_LANGUAGES_HEADER = "//h1[text()='Find your language']";
    private static final Logger Logger = LogManager.getLogger(AllLanguagesCollectionPage.class);

    public boolean isPageTitleVisible() {
        Logger.info("Verifying the page header");
        return elementExists(ALL_LANGUAGES_HEADER);
    }

}
