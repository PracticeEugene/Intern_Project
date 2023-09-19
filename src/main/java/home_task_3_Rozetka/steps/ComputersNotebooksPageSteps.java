package home_task_3_Rozetka.steps;

import home_task_3_Rozetka.pages.ComputersNotebooksPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ComputersNotebooksPageSteps extends ComputersNotebooksPage {
    public ComputersNotebooksPageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click 'Ноутбуки' category in the list tiles")
    public void clickLaptopsCategoryInTheListTiles() {
        driver.findElement(laptopsCategoryInTheListTiles).click();
    }
}

