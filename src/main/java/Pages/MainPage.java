package Pages;

import Consts.Consts;

public class MainPage extends BasePage {
    private final String LOGO_IMG = "//img[@itemprop='logo']";
    private final String CONTACT_US_OPTION = "//a[text()='Contact us']";
    private final String HOME_OPTION = "//a[text()='Home']";
    private final String BOOKS_BY_LANGUAGE = "(//*[@class='site-nav__link site-nav__link--main'])[2]";
    private final String EBOOKS_BY_LANGUAGE = "(//*[@class='site-nav__link site-nav__link--main'])[3]";
    private final String ESPANOL_OPTION = "//a[text()='Español']";
    private final String FRANCAIS_OPTION = "//a[text()='Français']";
    private final String CHINESE_OPTION = "//a[text()='中文']";
    private final String ALL_LANGUAGE_OPTION = "(//*[@class='site-nav__link site-nav__link--main'])[7]";
    private final String RESOURCES_OPTION = "(//*[@class='site-nav__link site-nav__link--main'])[8]";
    private final String FAQS_OPTION = "(//*[@class='site-nav__link site-nav__link--main'])[9]";
    private final String BLOG_OPTION = "(//*[@class='site-nav__link site-nav__link--main'])[11]";
    private final String BULGARIAN_OPTION = "//*[@id=\"SiteNavLabel-all-languages\"]/ul/li[2]/a";
    private final String FRENCH_OPTION = "//*[@id=\"SiteNavLabel-all-languages\"]/ul/li[7]/a";
    private final String CART_ICON = "//*[@class='icon icon-cart']";
    private final String CART_TITLE = "//h1[text()='Your cart']";
    private final String CURRENCY_BUTTON = "//*[@class='cbb-currency-updown-icon']";
    private final String AUD_CURRENCY = "(//span[text()='AUD'])[2]";
    private final String USD_CURRENCY = "(//span[text()='USD'])[2]";
    public static final String ENGLISH = "//a[text()='English Only']";
    public static final String BOOK1 = "//img[@alt='childrens-bedtime-story-book-for-girls-mom-Sweet-Dreams-My-Love-KidKiddos-cover.jpg']";
    public static final String BOOK2 = "//img[@alt='I-Love-to-Eat-Fruits-and-Vegetables-kids-bunnies-bedtime-story-Shelley-Admont-English-cover']";
    public static final String BOOK3 = "//img[@alt='English-Bulgarian-Bilingual-childrens-book-I-Love-Autumn-Cover']";
    public static final String BOOK4 = "//img[@alt='English-Turkish-bilingual-kids-bedtime-story-My-Mom-is-Awesome-Shelley-Admont-cover']";
    public static final String ADD_TO_CART_BUTTON = "//button[@id='AddToCart-product-template']";
    public static final String BOOKS_QTY = "//*[@class='cart__qty-input']";
    public static final String BOOK1_CART_ITEM = "//a[contains(text(),'Sweet Dreams My Love')]";
    public static final String BOOK2_CART_ITEM = "//a[contains(text(),'I Love to Eat Fruits and Vegetables')]";
    public static final String BOOK3_CART_ITEM = "//a[contains(text(),'I Love Autumn')]";
    public static final String BOOK4_CART_ITEM = "//a[contains(text(),'My Mom is Awesome')]";
    public static final String PRICE = "//*[@class='cbb-price-digits']";
    public static final String QTY_INPUT_BOX = "//input[@id='Quantity']";


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
        clickElementByXpath(BULGARIAN_OPTION);
        return new BooksCollections();
    }

    public BooksCollections openFrenchBooks() {
        clickElementByXpath(ALL_LANGUAGE_OPTION);
        clickElementByXpath(FRENCH_OPTION);
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

    public MainPage openCart() {
        clickElementByXpath(CART_ICON);
        return new MainPage();
    }

    public boolean isMyCartTitleVisible() {
        boolean isVisible = elementExists(CART_TITLE);
        return isVisible;
    }

    public MainPage selectAudCurrency() {
        clickElementByXpath(CURRENCY_BUTTON);
        clickElementByXpath(AUD_CURRENCY);
        return new MainPage();
    }

    public boolean isAUDCurrencySelected() {
        boolean isSelected = elementExists(AUD_CURRENCY);
        return isSelected;
    }

    public MainPage selectUsdCurrency() {
        clickElementByXpath(CURRENCY_BUTTON);
        clickElementByXpath(USD_CURRENCY);
        return new MainPage();
    }

    public boolean isUsdCurrencySelected() {
        boolean isSelected = elementExists(USD_CURRENCY);
        return isSelected;
    }

    public MainPage addOneBookToCart(String bookXpath) {
        clickElementByXpath(bookXpath);
        clickElementByXpath(ADD_TO_CART_BUTTON);
        return new MainPage();
    }

    public MainPage addManyBooksToCart(String bookXpath) {
        clickElementByXpath(bookXpath);
        findElementByXpath(QTY_INPUT_BOX).clear();
        sendTextToElementByXpath(QTY_INPUT_BOX, "5");
        clickElementByXpath(ADD_TO_CART_BUTTON);
        return new MainPage();
    }

    public boolean isBookTitleVisible(String bookTitle) {
        return elementExists(bookTitle);
    }

    public boolean isPriceVisibleInCart() {
        boolean isVisible = elementExists(PRICE);
        return isVisible;
    }

    public boolean isQuantityVisibleInCart() {
        boolean isVisible = elementExists(BOOKS_QTY);
        return isVisible;
    }

}