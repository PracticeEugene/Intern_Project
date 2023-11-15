package rozetka_project.steps;

import rozetka_project.pages.ComputersAndNotebooksPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;

@Log4j
public class ComputersAndNotebooksPageSteps extends ComputersAndNotebooksPage {
    public ComputersAndNotebooksPageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click 'Ноутбуки' category in the list tiles")
    public void clickLaptopsCategoryInTheListTiles() {
        driver.findElement(laptopsCategoryInTheListTiles).click();
        log.info("'Ноутбуки' category in the list tiles selected");
    }
}

