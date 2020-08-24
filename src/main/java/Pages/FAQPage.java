package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FAQPage extends BasePage {
    public static final String FAQ_HEADER = "//h1[text()='FAQ/addition info']";
    private static final Logger Logger = LogManager.getLogger(FAQPage.class);

    public boolean isPageTitleVisible() {
        Logger.info("Verifying the page header");
        return elementExists(FAQ_HEADER);
    }
}
