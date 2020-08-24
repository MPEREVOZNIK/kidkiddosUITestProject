package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ResourcesPage extends BasePage {
    public static final String RESOURCES_PAGE_HEADER = "//h1[text()='Fun and Educational Videos for Kids']";
    private static final Logger Logger = LogManager.getLogger(ResourcesPage.class);

    public boolean isPageTitleVisible() {
        Logger.info("Verifying if page header is displayed");
        return elementExists(RESOURCES_PAGE_HEADER);
    }

}
