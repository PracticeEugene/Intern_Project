package home_task_3_Rozetka.steps;

import home_task_3_Rozetka.pages.ComputersNotebooksPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;

@Log4j
public class ComputersNotebooksPageSteps extends ComputersNotebooksPage {
    public ComputersNotebooksPageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click 'Ноутбуки' category in the list tiles")
    public void clickLaptopsCategoryInTheListTiles() {
        driver.findElement(laptopsCategoryInTheListTiles).click();
        log.info("'Ноутбуки' category in the list tiles selected");
    }
}

