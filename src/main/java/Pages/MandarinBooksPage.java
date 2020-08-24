package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MandarinBooksPage extends BasePage {
    public static final String MANDARIN_BOOKS_HEADER = "//h1[text()='Mandarin Chinese - 中文']";
    private static final Logger Logger = LogManager.getLogger(MandarinBooksPage.class);

    public boolean isPageTitleVisible() {
        Logger.info("Verifying if page header is displayed");
        return elementExists(MANDARIN_BOOKS_HEADER);
    }
}
