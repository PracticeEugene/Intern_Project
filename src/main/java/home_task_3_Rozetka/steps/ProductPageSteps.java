package home_task_3_Rozetka.steps;

import home_task_3_Rozetka.pages.ProductPage;
import io.qameta.allure.Step;
import org.openqa.selenium.*;

public class ProductPageSteps extends ProductPage {
    public ProductPageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click buy button on the product page")
    public void clickBuyButtonOnTheProductPage() {
        driver.findElement(buyButtonProductPage).click();
    }
}
