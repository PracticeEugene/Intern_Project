package home_task_3_Rozetka.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static home_task_3_Rozetka.configuration.Constants.WindowScroll.WINDOW_SCROLL;
import static home_task_3_Rozetka.configuration.Constants.TimeoutVariable.EXPLICIT_WAIT;
import static home_task_3_Rozetka.configuration.Constants.TimeoutVariable.IMPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void windowScroll() {
        js.executeScript(WINDOW_SCROLL);
    }
}
