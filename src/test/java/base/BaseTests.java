package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class BaseTests {
    public WebDriver driver;
    public HomePage homePage;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    public void tearDown(){
        driver.quit();
    }

    public static void main(String[] args){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
