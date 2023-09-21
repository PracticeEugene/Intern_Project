package home_task_3_Rozetka.steps;

import home_task_3_Rozetka.pages.CartPopupPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CartPopupPageSteps extends CartPopupPage {
    public CartPopupPageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click 'Продовжити покупки' button on the cart popup")
    public void clickContinueShoppingButtonOnTheCartPopup() {
        driver.findElement(continueShoppingButton).click();
    }

    @Step("Click three dots product button on the cart popup")
    public void clickThreeDotsProductButtonOnTheCartPopup() {
        driver.findElement(threeDotsProductButton).click();
    }

    @Step("Click 'Видалити' product button on the cart popup")
    public void clickDeleteProductButtonOnTheCartPopup() {
        driver.findElement(deleteProductButton).click();
    }
}
