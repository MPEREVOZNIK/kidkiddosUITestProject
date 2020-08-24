import Pages.*;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Pages.BooksCollections.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTest extends UseCaseBase {
    private static MainPage mainPage;
    private static ContactUsPage contactUs;
    private static LoginPage loginPage;
    private static final Logger Logger = LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();

        contactUs = new ContactUsPage();
    }
//    public static void classSetup2() {
//        contactUs = new ContactUsPage();
//    }

    public static void classSetup3() {
        loginPage = new LoginPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void mainPageLoadTest() {
        Logger.info("The page is loading");
        Boolean success = mainPage.isLogoVisible();
        mainPage.takeScreenshot("MainPageTest");
        assertTrue(success);
    }

    @Test
    public void openContactUsPage() {
        Logger.info("Opening Contact Us page");
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        boolean isLoaded = contactUsPage.isPageTitleVisible();
        mainPage.takeScreenshot("ContactUsPage");
        assertTrue(isLoaded);
    }

    @Test
    public void openHomeTab() {
        Logger.info("Opening Home Tab");
        MainPage mainPage1 = mainPage.openHomeTab();
        boolean isLoaded = mainPage1.isLogoVisible();
        mainPage.takeScreenshot("Home Page");
        assertTrue(isLoaded);
    }

    @Test
    public void openBulgarianListOption() {
        Logger.info("Opening Bulgarian Books page");
        BooksCollections booksCollections = mainPage.openCatalog(BULGARIAN);
        boolean isLoaded = booksCollections.isPageTitleVisible(BULGARIAN_HEADER);
        mainPage.takeScreenshot("Bulgarian Books collection page");
        assertTrue(isLoaded);
    }

    @Test
    public void TurkishBooksListOption() {
        Logger.info("Opening Turkish Books page");
        BooksCollections booksCollections = mainPage.openCatalog(TURKISH);
        boolean isLoaded = booksCollections.isPageTitleVisible(TURKISH_HEADER);
        mainPage.takeScreenshot("Turkish Books collection page");
        assertTrue(isLoaded);
    }

    @Test
    public void openAllLanguagesTab() {
        AllLanguagesCollectionPage allLanguagesCollectionPage = mainPage.openAllLanguagesCollection();
        boolean isLoaded = allLanguagesCollectionPage.isPageTitleVisible();
        mainPage.takeScreenshot("All languages Page");
        assertTrue(isLoaded);
    }

    @Test
    public void openEBooksCollectionTab() {
        EBooksByLanguagePage eBooksByLanguagePage = mainPage.openEBooksCollection();
        boolean isLoaded = eBooksByLanguagePage.isPageTitleVisible();
        mainPage.takeScreenshot("All EBooks Page");
        assertTrue(isLoaded);
    }

    @Test
    public void openArabicEbooksCatalog() {
        Logger.info("Opening Arabic Books page");
        BooksCollections booksCollections = mainPage.openEbooksCatalog(EBOOKS_ARABIC);
        boolean isLoaded = booksCollections.isPageTitleVisible(EBOOKS_ARABIC_PAGE_HEADER);
        mainPage.takeScreenshot("Arabic eBooks collection page");
        assertTrue(isLoaded);
    }

    @Test
    public void openPolishEbooksTab() {
        Logger.info("Opening Polish EBooks page");
        BooksCollections booksCollections = mainPage.openEbooksCatalog(EBOOKS_POLISH);
        boolean isLoaded = booksCollections.isPageTitleVisible(EBOOKS_POLISH_PAGE_HEADER);
        mainPage.takeScreenshot("Polish eBooks collection page");
        assertTrue(isLoaded);

    }

    @Test
    public void openSpanishBooksTab() {
        BooksCollections booksCollections = mainPage.openSpanishBooksPage();
        boolean isLoaded = booksCollections.isPageTitleVisible(SPANISH_BOOKS_HEADER);
        mainPage.takeScreenshot("Spanish Books collection page");
        assertTrue(isLoaded);
    }

    @Test
    public void openFrenchBooksTab() {
        BooksCollections booksCollections = mainPage.openFrenchBooksTab();
        boolean isLoaded = booksCollections.isPageTitleVisible(FRENCH_BOOKS_HEADER);
        mainPage.takeScreenshot("French Books Page");
        assertTrue(isLoaded);
    }

    @Test
    public void openMandarinBooksTab() {
        BooksCollections booksCollections = mainPage.openMandarinBooksTab();
        boolean isLoaded = booksCollections.isPageTitleVisible(MANDARIN_BOOKS_HEADER);
        mainPage.takeScreenshot("Chinese-Mandarin Books Page");
        assertTrue(isLoaded);
    }

    @Test
    public void openAllLanguagesList() {
        AllLanguagesCollectionPage allLanguages = mainPage.openAllLanguagesList();
        boolean isLoaded = allLanguages.isPageTitleVisible();
        mainPage.takeScreenshot("All Languages Page");
        assertTrue(isLoaded);
    }

    @Test
    public void BulgarianListOption() {
        BooksCollections booksCollections = mainPage.openBulgarianBooks();
        boolean isLoaded = booksCollections.isPageTitleVisible(BULGARIAN_HEADER);
        mainPage.takeScreenshot("Bulgarian Books Page");
        assertTrue(isLoaded);
    }

    @Test
    public void FrenchListOption() {
        BooksCollections booksCollections = mainPage.openFrenchBooks();
        boolean isLoaded = booksCollections.isPageTitleVisible(FRENCH_BOOKS_HEADER);
        mainPage.takeScreenshot("French Books Page");
        assertTrue(isLoaded);
    }

    @Test
    public void openResourcesPage() {
        ResourcesPage resourcesPage = mainPage.openResourcesPage();
        boolean isLoaded = resourcesPage.isPageTitleVisible();
        mainPage.takeScreenshot("Resources Page");
        assertTrue(isLoaded);
    }

    @Test
    public void openResourcesVideoOption() {
        ResourcesPage resourcesPage = mainPage.openVideoListOption();
        boolean isLoaded = resourcesPage.isPageTitleVisible();
        mainPage.takeScreenshot("Video Resources Page");
        assertTrue(isLoaded);
    }

    @Test
    public void openResourcesBlogOption() {
        BlogPage blogPage = mainPage.openBlogListOption();
        boolean isLoaded = blogPage.isPageTitleVisible();
        mainPage.takeScreenshot("Blog Page");
        assertTrue(isLoaded);
    }

    @Test
    public void openFAQPage() {
        FAQPage faqPage = mainPage.openFAQPage();
        boolean isLoaded = faqPage.isPageTitleVisible();
        mainPage.takeScreenshot("FAQ Page");
        assertTrue(isLoaded);
    }

    @Test
    public void openBlogPage() {
        BlogPage blogPage = mainPage.openBlogPage();
        boolean isLoaded = blogPage.isPageTitleVisible();
        mainPage.takeScreenshot("Blog Page");
        assertTrue(isLoaded);
    }

    @Test
    public void emptyNameTextBox() {
//      ContactUsPage contactUsPage =mainPage.openContactUsTab();
        ContactUsPage contactUsPage2 = contactUs.fillContactUsForm(" ", "m.perevoznik@gmail.com", "Hello ");
        boolean isDisplayed = contactUsPage2.isNameErrorVisible();
        mainPage.takeScreenshot("Contact Us Page/ Error message for Name text box");
        assertTrue(isDisplayed);
    }

    @Test
    public void emptyEmailTextBox() {
        ContactUsPage contactUsPage = contactUs.fillContactUsForm("M", " ", "Hello");
        boolean isDisplayed = contactUsPage.isEmailErrorVisible();
        mainPage.takeScreenshot("Contact Us Page/ Error message for Email text box");
        assertTrue(isDisplayed);
    }

    @Test
    public void emptyMsgTextBox() {
        ContactUsPage contactUsPage = mainPage.fillContactUsForm("M", " m.perev@gmail.com", " ");
        boolean isDisplayed = contactUsPage.isMessageErrorVisible();
        mainPage.takeScreenshot("Contact Us Page/ Error message for empty Message");
        assertTrue(isDisplayed);
    }

    @Test
    public void invalidEmail() {
        ContactUsPage contactUsPage = mainPage.fillContactUsForm("M", "m.perev@", "Hello");
        boolean isDisplayed = contactUsPage.isEmailErrorVisible();
        mainPage.takeScreenshot("Contact Us Page/ Error message for invalid Email");
        assertTrue(isDisplayed);
    }

    @Test
    public void NameEdgeTest() {
        contactUs = new ContactUsPage();
        ContactUsPage contactUsPage = mainPage.fillContactUsForm("#$@", "m.perev@gmail.com", "Hello");
        boolean isDisplayed = contactUsPage.isThankYouMsgVisible();
        mainPage.takeScreenshot("Contact Us page/Thank you message");
        assertTrue(isDisplayed);

    }

    @Test
    public void SignInError() {
        loginPage.fillInCredentials(" ", "123456");
        LoginPage loginPage = new LoginPage();
        boolean isDisplayed = loginPage.isErrorVisible();
        assertTrue(isDisplayed);
    }

    @Test
    public void openRecoverPasswordPage() {
        LoginPage loginPage1 = loginPage.openRecoverPswPage();
        boolean isDisplayed = loginPage1.isRecoverPswVisible();
        assertTrue(isDisplayed);
    }
}
