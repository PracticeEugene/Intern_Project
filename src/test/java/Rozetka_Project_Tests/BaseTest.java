package Rozetka_Project_Tests;

import rozetka_project.configuration.CreateDriver;
import rozetka_project.pages.*;
import rozetka_project.steps.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static rozetka_project.configuration.Configuration.CLEAR_COOKIES_AND_STORAGE;
import static rozetka_project.configuration.Configuration.HOLD_BROWSER_OPEN;
import static rozetka_project.configuration.Constants.Url.ROZETKA_COM;

public class BaseTest {
    protected WebDriver driver = CreateDriver.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePageSteps homePageSteps = new HomePageSteps(driver);
    protected ComputersAndNotebooksPageSteps computersNotebooksPageSteps = new ComputersAndNotebooksPageSteps(driver);
    protected NotebooksPageSteps notebooksPageSteps = new NotebooksPageSteps(driver);
    protected ProductPageSteps productPageSteps = new ProductPageSteps(driver);
    protected CartPopupSteps cartPopupPageSteps = new CartPopupSteps(driver);
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
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
