package rozetka_project.steps;

import rozetka_project.pages.CartPopupPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;

@Log4j
public class CartPopupSteps extends CartPopupPage {
    public CartPopupSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click 'Продовжити покупки' button on the cart popup")
    public void clickContinueShoppingButtonOnTheCartPopup() {
        driver.findElement(continueShoppingButton).click();
        log.info("'Продовжити покупку' button on the cart popup pressed");
    }

    @Step("Click three dots product button on the cart popup")
    public void clickThreeDotsProductButtonOnTheCartPopup() {
        driver.findElement(threeDotsProductButton).click();
        log.info("Three dots product button on the cart popup pressed");
    }

    @Step("Click 'Видалити' product button on the cart popup")
    public void clickDeleteProductButtonOnTheCartPopup() {
        driver.findElement(deleteProductButton).click();
        log.info("'Видалити' product button on the cart popup pressed");
    }

}
