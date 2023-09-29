package Rozetka_Project_Tests;

import Rozetka_Project.configuration.CreateDriver;
import Rozetka_Project.pages.*;
import Rozetka_Project.steps.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

import static Rozetka_Project.configuration.Configuration.CLEAR_COOKIES_AND_STORAGE;
import static Rozetka_Project.configuration.Configuration.HOLD_BROWSER_OPEN;
import static Rozetka_Project.configuration.Constants.Url.ROZETKA_COM;

public class BaseTest {
    protected WebDriver driver = CreateDriver.createDriver();

    protected BasePage basePage = new BasePage(driver);
    protected HomePageSteps homePageSteps = new HomePageSteps(driver);
    protected ComputersNotebooksPageSteps computersNotebooksPageSteps = new ComputersNotebooksPageSteps(driver);
    protected NotebooksPageSteps notebooksPageSteps = new NotebooksPageSteps(driver);
    protected ProductPageSteps productPageSteps = new ProductPageSteps(driver);
    protected CartPopupPageSteps cartPopupPageSteps = new CartPopupPageSteps(driver);
    protected FilterPageSteps filterPageSteps = new FilterPageSteps(driver);

    @BeforeMethod
    public void openUrl() {
        basePage.open(ROZETKA_COM);
    }

    @AfterMethod
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite
    public void close() throws IOException {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
            //Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        }
    }
}
