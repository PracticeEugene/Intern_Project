package home_task_3_Rozetka.steps;

import home_task_3_Rozetka.pages.FilterPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;

@Log4j
public class FilterPageSteps extends FilterPage {
    public FilterPageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click 'Rozetka' checkbox filter in the filter menu")
    public void clickCheckboxFilterRozetkaInTheFilterMenu() {
        driver.findElement(checkboxFilterRozetkaInTheFilterMenu).click();
        log.info("'Rozetka' checkbox filter in the filter menu pressed");
    }

    @Step("Complete the search brand field value 'Apple' ")
    public void completeTheSearchBrandFieldValueApple() {
        driver.findElement(searchBrandField).sendKeys("Apple");
        log.info("The search brand field value 'Apple' completed");
    }

    @Step("Click to the product checkbox after searching")
    public void clickOnTheProductCheckboxAfterSearching() {
        driver.findElement(checkboxApple).click();
        log.info("The product checkbox after searching pressed");
    }

    @Step("Clear to the price filter fields")
    public void clearThePriceFilterFields() {
        driver.findElement(minPriceFilterField).clear();
        driver.findElement(maxPriceFilterField).clear();
        log.info("The price filter fields cleared");
    }

    @Step("Complete to the price filter fields invalid value")
    public void completeThePriceFilterFieldsInvalidValue() {
        driver.findElement(minPriceFilterField).sendKeys("x");
        driver.findElement(maxPriceFilterField).sendKeys("x");
        log.info("The price filter fields completed invalid value");
    }

    @Step("Click 'ok' button price filter")
    public void clickOkButtonPriceFilter() {
        driver.findElement(okPriceFilterButton).click();
        log.info("'ok' button is pressed");
    }

    @Step("Click delete filter button")
    public void clickDeleteFilterButton() {
        driver.findElement(deleteFilterButton).click();
        log.info("Filter fields deleted");
    }
}
