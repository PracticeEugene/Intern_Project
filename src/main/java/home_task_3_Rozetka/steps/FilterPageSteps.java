package home_task_3_Rozetka.steps;

import home_task_3_Rozetka.pages.FilterPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class FilterPageSteps extends FilterPage {
    public FilterPageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click 'Rozetka' checkbox filter in the filter menu")
    public void clickCheckboxFilterRozetkaInTheFilterMenu() {
        driver.findElement(checkboxFilterRozetkaInTheFilterMenu).click();
    }

    @Step("Complete the search brand field value 'Apple' ")
    public void completeTheSearchBrandFieldValueApple() {
        driver.findElement(searchBrandField).sendKeys("Apple");
    }

    @Step("Click to the product checkbox after searching")
    public void clickOnTheProductCheckboxAfterSearching() {
        driver.findElement(checkboxApple).click();
    }
}
