package login;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import pages.SecureArePage;

public class LoginTests extends BaseTests {
    public void testLoginSuccessful(){
        LoginPage loginPage = homePage.clickFormAuthenticantion();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureArePage secureArePage = loginPage.clickLoginButton();
        String alertText = secureArePage.getAlertText();
        Assertions.assertTrue(alertText.contains("You logged into a secure area"), "Aleat text is incorrect!");
    }
}
