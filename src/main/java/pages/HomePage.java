package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage {
    private WebDriver driver;
    private By formLoginLink = By.linkText("Form authentication");
    private By javaScriptAlertsLink = By.linkText("JavaScript Alerts");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthenticantion(){
        driver.findElement(formLoginLink).click();
        return new LoginPage(driver);
    }

    public AlertPage clickJavaScriptAlerts(){
        driver.findElement(javaScriptAlertsLink).click();
        return new AlertPage(driver);
    }
}
