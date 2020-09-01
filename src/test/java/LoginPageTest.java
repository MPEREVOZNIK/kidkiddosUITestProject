import Pages.LoginPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest extends UseCaseBase {

    private static LoginPage loginPage;

    @BeforeAll
    public static void classSetup() {
        loginPage = new LoginPage();
    }
    @BeforeEach
    public void beforeTest() {
        loginPage.navigateToLoginPage();
    }
    @Test
    public void SignInError() {
        LoginPage loginPage1 = loginPage.fillInCredentials(" ", "123456");
        boolean isDisplayed = loginPage1.isErrorVisible();
        assertTrue(isDisplayed);
    }

    @Test
    public void openRecoverPasswordPage() {
        LoginPage loginPage1 = loginPage.openRecoverPswPage();
        boolean isDisplayed = loginPage1.isRecoverPswVisible();
        assertTrue(isDisplayed);
    }

    @Test
    public void openSignUpPage() {
        LoginPage loginPage1 = loginPage.openSignUpPage();
        boolean isDisplayed = loginPage1.isSignUpPageVisible();
        assertTrue(isDisplayed);
    }
}
