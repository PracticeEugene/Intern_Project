package rozetka_project.steps;

import rozetka_project.pages.NotebooksPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;

@Log4j
public class NotebooksPageSteps extends NotebooksPage {
    public NotebooksPageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click on the first laptop in the product list")
    public void clickOnTheFirstLaptopInTheProductList() {
        driver.findElement(firstLaptopOnTheProductList).click();
        log.info("The first laptop in the product list selected");
    }
}
