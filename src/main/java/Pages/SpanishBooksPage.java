package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SpanishBooksPage extends BasePage {
    public static final String SPANISH_BOOKS_HEADER = "//h1[text()='Spanish - Español']";
    private static final Logger Logger = LogManager.getLogger(SpanishBooksPage.class);

    public boolean isPageTitleVisible() {
        Logger.info("Verifying if the page header is displayed");
        return elementExists(SPANISH_BOOKS_HEADER);
    }
}
