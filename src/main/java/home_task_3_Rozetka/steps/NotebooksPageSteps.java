package home_task_3_Rozetka.steps;

import home_task_3_Rozetka.pages.NotebooksPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class NotebooksPageSteps extends NotebooksPage {
    public NotebooksPageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click 'Rozetka' checkbox filter in the filter menu")
    public void clickCheckboxFilterRozetkaInTheFilterMenu() {
        driver.findElement(checkboxFilterRozetkaInTheFilterMenu).click();
    }

    @Step("Click on the first laptop in the product list")
    public void clickOnTheFirstLaptopInTheProductList() {
        driver.findElement(firstLaptopOnTheProductList).click();
    }
}
