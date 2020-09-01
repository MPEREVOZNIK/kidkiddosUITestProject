package Pages;

import org.apache.logging.log4j.LogManager;

public class BooksCollections extends BasePage {
    public static final String BULGARIAN_HEADER = "//h1[text()='Bulgarian-Български']";
    public static final String BULGARIAN = "//a[text()='Bulgarian-Български']";
    public static final String EBOOKS_ARABIC_PAGE_HEADER = "//h1[text()='eBooks in Arabic - عربي']";
    public static final String EBOOKS_ARABIC = "(//a[contains(text(),'Arabic')])[5]";
    public static final String EBOOKS_POLISH_PAGE_HEADER = "//h1[text()='eBooks in Polish-Polski']";
    public static final String EBOOKS_POLISH = "(//a[contains(text(),'Polish')])[5]";
    public static final String FRENCH_BOOKS_HEADER = "//h1[text()='French - Français']";
    public static final String MANDARIN_BOOKS_HEADER = "//h1[text()='Mandarin Chinese - 中文']";
    public static final String SPANISH_BOOKS_HEADER = "//h1[text()='Spanish - Español']";
    public static final String TURKISH_HEADER = "//h1[text()='Turkish-Türkçe']";
    public static final String TURKISH = "//a[text()='Turkish-Türkçe']";
    private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(BooksCollections.class);

    public boolean isPageTitleVisible(String headerXpath) {
        Logger.info("Verifying if page header is displayed");
        return elementExists(headerXpath);
    }

}
