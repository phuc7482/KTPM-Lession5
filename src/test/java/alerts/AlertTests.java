package alerts;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;

public class AlertTests extends BaseTests {
    public void testAcceptAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.clickButtonJSAlert();
        alertPage.acceptJSAlert();
        Assertions.assertEquals(alertPage.getAlertResult(), "You succesfully clicked an alert",
                "Result alert is incorrect");
    }

    public void testConfirmAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.clickButtonJSConfirm();
        String text = alertPage.getAlertText();
        alertPage.clickToCancel();
        Assertions.assertEquals(text, "I am a JS Confirm", "Alert text incorrect!");
    }

    public void testPromtAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.clickButtonJSPrompt();
        String textToInput = "ldbphuc.19it3@vku.udn.vn";
        alertPage.sendTextToAlert(textToInput);
        alertPage.acceptJSAlert();
        Assertions.assertEquals(alertPage.getAlertResult(), "You entered" + textToInput, "Result text incorrect!");

    }
}
