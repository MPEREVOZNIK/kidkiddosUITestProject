package Pages;

import Consts.Consts;

public class MainPage extends BasePage {
    private final String LOGO_IMG = "//img[@itemprop='logo']";
    private final String CONTACT_US_OPTION = "//a[text()='Contact us']";
    private final String HOME_OPTION = "//a[text()='Home']";
    private final String BOOKS_BY_LANGUAGE = "//*[@id=\"SiteNav\"]/li[2]/a";
    private final String EBOOKS_BY_LANGUAGE = "//*[@id=\"SiteNav\"]/li[3]/a";
    private final String ESPANOL_OPTION = "//a[text()='Español']";
    private final String FRANCAIS_OPTION = "//a[text()='Français']";
    private final String CHINESE_OPTION = "//a[text()='中文']";
    private final String ALL_LANGUAGE_OPTION = "//a[text()='All Languages']";
    private final String RESOURCES_OPTION = "//a[text()='Resources']";
    private final String FAQS_OPTION = "//a[text()='FAQS']";
    private final String BLOG_OPTION = "//a[text()='Blog']";
//    private final String NAME_TEXTBOX = "//*[@id=\"_form_44_\"]/div[1]/div[1]/div/input";
//    private final String EMAIL_TEXTBOX = "//*[@id=\"_form_44_\"]/div[1]/div[2]/div/input";
//    private final String MSG_TEXTBOX = "//*[@id=\"_form_44_\"]/div[1]/div[3]/div/textarea";
    private final String BULGARIAN = "//a[text()='Bulgarian-Български']";

    private final String SEND_MSG_BUTTON = "//button[text()='Send your message']";


    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_URL);
    }

    public boolean isLogoVisible() {
        boolean isVisible = elementExists(LOGO_IMG);
        return isVisible;
    }

    public ContactUsPage openContactUsTab() {
        clickElementByXpath(CONTACT_US_OPTION);
        return new ContactUsPage();

    }

    public MainPage openHomeTab() {
        clickElementByXpath(HOME_OPTION);
        return new MainPage();
    }

    public BooksCollections openCatalog(String langXpath) {
        clickElementByXpath(BOOKS_BY_LANGUAGE);
        clickElementByXpath(langXpath);
        return new BooksCollections();
    }
    public BooksCollections openEbooksCatalog(String langXpath) {
        clickElementByXpath(EBOOKS_BY_LANGUAGE);
        clickElementByXpath(langXpath);
        return new BooksCollections();
    }

    public AllLanguagesCollectionPage openAllLanguagesCollection() {
        clickElementByXpath(BOOKS_BY_LANGUAGE);
        clickElementByXpath(BOOKS_BY_LANGUAGE);
        return new AllLanguagesCollectionPage();
    }

    public EBooksByLanguagePage openEBooksCollection() {
        clickElementByXpath(EBOOKS_BY_LANGUAGE);
        clickElementByXpath(EBOOKS_BY_LANGUAGE);
        return new EBooksByLanguagePage();
    }

    public BooksCollections openSpanishBooksPage() {
        clickElementByXpath(ESPANOL_OPTION);
        return new BooksCollections();

    }

    public BooksCollections openFrenchBooksTab() {
        clickElementByXpath(FRANCAIS_OPTION);
        return new BooksCollections();

    }

    public BooksCollections openMandarinBooksTab() {
        clickElementByXpath(CHINESE_OPTION);
        return new BooksCollections();
    }

    public AllLanguagesCollectionPage openAllLanguagesList() {
        clickElementByXpath(ALL_LANGUAGE_OPTION);
        clickElementByXpath(ALL_LANGUAGE_OPTION);
        return new AllLanguagesCollectionPage();
    }

    public BooksCollections openBulgarianBooks() {
        clickElementByXpath(ALL_LANGUAGE_OPTION);
        clickElementByXpath("//*[@id=\"SiteNavLabel-all-languages\"]/ul/li[2]/a");
        return new BooksCollections();
    }

    public BooksCollections openFrenchBooks() {
        clickElementByXpath(ALL_LANGUAGE_OPTION);
        clickElementByXpath("//*[@id=\"SiteNavLabel-all-languages\"]/ul/li[7]/a");
        return new BooksCollections();
    }

    public ResourcesPage openResourcesPage() {
        clickElementByXpath(RESOURCES_OPTION);
        clickElementByXpath(RESOURCES_OPTION);
        return new ResourcesPage();
    }

    public ResourcesPage openVideoListOption() {
        clickElementByXpath(RESOURCES_OPTION);
        clickElementByXpath("//*[@id=\"SiteNavLabel-resources\"]/ul/li[1]/a");
        return new ResourcesPage();

    }

    public BlogPage openBlogListOption() {
        clickElementByXpath(RESOURCES_OPTION);
        clickElementByXpath("//*[@id=\"SiteNavLabel-resources\"]/ul/li[2]/a");
        return new BlogPage();

    }

    public FAQPage openFAQPage() {
        clickElementByXpath(FAQS_OPTION);
        return new FAQPage();
    }

    public BlogPage openBlogPage() {
        clickElementByXpath(BLOG_OPTION);
        return new BlogPage();
    }
    public ContactUsPage fillContactUsForm(String name, String email, String message){

//        clickElementByXpath(CONTACT_US_OPTION);
//
//        sendTextToElementByXpath(NAME_TEXTBOX, name);
//
//        sendTextToElementByXpath(EMAIL_TEXTBOX, email);
//
//        sendTextToElementByXpath(MSG_TEXTBOX, message);
//
//        clickElementByXpath(SEND_MSG_BUTTON);

        return new ContactUsPage();

    }

}
