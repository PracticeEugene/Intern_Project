package home_task_3_Rozetka.steps;

import home_task_3_Rozetka.pages.CartPopupPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPopupPageSteps extends CartPopupPage {
    protected final By continueShoppingButton = By.xpath("//button[text()=' Продовжити покупки ']");

    public CartPopupPageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click 'Продовжити покупки' button on the cart popup")
    public void clickContinueShoppingButtonOnTheCartPopup() {
        driver.findElement(continueShoppingButton).click();
    }
}
