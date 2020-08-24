package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EBooksPolishPage extends BasePage {


    public static final String EBOOKS_POLISH_PAGE_HEADER = "//h1[text()='eBooks in Polish-Polski']";
    private static final Logger Logger = LogManager.getLogger(EBooksPolishPage.class);

    public boolean isPageTitleVisible() {
        Logger.info("Verifying if page header is displayed");
        return elementExists(EBOOKS_POLISH_PAGE_HEADER);
    }

}
