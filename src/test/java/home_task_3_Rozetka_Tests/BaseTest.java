package home_task_3_Rozetka_Tests;

import home_task_3_Rozetka.configuration.CreateDriver;
import home_task_3_Rozetka.pages.*;
import home_task_3_Rozetka.steps.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static home_task_3_Rozetka.configuration.Configuration.CLEAR_COOKIES_AND_STORAGE;
import static home_task_3_Rozetka.configuration.Configuration.HOLD_BROWSER_OPEN;
import static home_task_3_Rozetka.configuration.Constants.Url.ROZETKA_COM;

public class BaseTest {
    protected WebDriver driver = CreateDriver.createDriver();

    protected BasePage basePage = new BasePage(driver);
    protected HomePageSteps homePageSteps = new HomePageSteps(driver);
    protected ComputersNotebooksPageSteps computersNotebooksPageSteps = new ComputersNotebooksPageSteps(driver);
    protected NotebooksPageSteps notebooksPageSteps = new NotebooksPageSteps(driver);
    protected ProductPageSteps productPageSteps = new ProductPageSteps(driver);
    protected CartPopupPageSteps cartPopupPageSteps = new CartPopupPageSteps(driver);

    @BeforeTest
    public void openUrl() {
        basePage.open(ROZETKA_COM);
    }

    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
