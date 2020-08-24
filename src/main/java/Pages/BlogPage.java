package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BlogPage extends BasePage {
    public static final String BLOG_HEADER = "//h1[text()='Blog']";
    private static final Logger Logger = LogManager.getLogger(BlogPage.class);

    public boolean isPageTitleVisible() {
        Logger.info("Verifying that page header is displayed");
        return elementExists(BLOG_HEADER);
    }
}
