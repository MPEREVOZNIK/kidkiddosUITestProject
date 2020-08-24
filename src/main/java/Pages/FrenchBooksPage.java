package Pages;

import org.apache.logging.log4j.LogManager;
 import org.apache.logging.log4j.Logger;

public class FrenchBooksPage extends BasePage {
    public static final String FRENCH_BOOKS_HEADER = "//h1[text()='French - Français']";

    private static final Logger Logger = LogManager.getLogger(FrenchBooksPage.class);

    public boolean isPageTitleVisible() {
        Logger.info("Verifying if page header is displayed");
        return elementExists(FRENCH_BOOKS_HEADER);

    }
}
