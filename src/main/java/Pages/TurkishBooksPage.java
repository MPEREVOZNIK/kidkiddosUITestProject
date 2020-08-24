package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TurkishBooksPage extends BasePage {
    public static final String TURKISH_HEADER = "//h1[text()='Turkish-Türkçe']";
    private static final Logger Logger = LogManager.getLogger(TurkishBooksPage.class);

    public boolean isPageTitleVisible() {
        Logger.info("Verifying if page header is displayed");
        return elementExists(TURKISH_HEADER);
    }

}
