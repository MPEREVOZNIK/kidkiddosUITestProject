package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EBooksByLanguagePage extends BasePage {
    public static final String EBOOKS_PAGE_HEADER = "//h1[text()='ebooks']";
    private static final Logger Logger = LogManager.getLogger(EBooksByLanguagePage.class);

    public boolean isPageTitleVisible() {
        Logger.info("Verifying if page header is displayed");

        return elementExists(EBOOKS_PAGE_HEADER);
    }


}