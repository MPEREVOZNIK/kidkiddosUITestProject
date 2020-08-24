package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EBooksArabicPage extends BasePage {
    public static final String EBOOKS_ARABIC_PAGE_HEADER = "//h1[text()='eBooks in Arabic - عربي']";
    private static final Logger Logger = LogManager.getLogger(EBooksArabicPage.class);

    public boolean isPageTitleVisible() {
        Logger.info("Verifying that page header is displayed");
        return elementExists(EBOOKS_ARABIC_PAGE_HEADER);
    }
}
