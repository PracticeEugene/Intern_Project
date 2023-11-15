package rozetka_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import rozetka_project.steps.*;

import javax.swing.*;
import java.time.Duration;

import static rozetka_project.configuration.Constants.TimeoutVariable.EXPLICIT_WAIT;
import static rozetka_project.configuration.Constants.TimeoutVariable.IMPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver;
    private Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

    public Actions setActions(){
        return new Actions(driver);
    }

    public void implicitWaitElement() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
    }

    public WebElement explicitWaitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
