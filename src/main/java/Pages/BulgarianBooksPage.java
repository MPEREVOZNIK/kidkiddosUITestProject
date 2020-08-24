package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BulgarianBooksPage extends BasePage {
    public static final String BULGARIAN_HEADER = "//h1[text()='Bulgarian-Български']";
    private static final Logger Logger = LogManager.getLogger(BulgarianBooksPage.class);

    public boolean isPageTitleVisible() {
        Logger.info("Verifying that the page header is displayed");
        return elementExists(BULGARIAN_HEADER);
    }


}
