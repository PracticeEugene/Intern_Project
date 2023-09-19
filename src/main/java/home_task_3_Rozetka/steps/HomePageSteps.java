package home_task_3_Rozetka.steps;

import home_task_3_Rozetka.pages.HomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomePageSteps extends HomePage {
    public HomePageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click 'Ноутбуки та комп’ютери' category in the main menu")
    public void clickLaptopsAndComputersCategoryInTheMainMenu() {
        driver.findElement(laptopsAndComputersCategoryInTheMainManu).click();
    }

    @Step("Click on the cart icon in main headers menu")
    public void clickOnTheCartIconInMainHeadersMenu() {
        driver.findElement(cartIconInMainHeaders).click();
    }
}
