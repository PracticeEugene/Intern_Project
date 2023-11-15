package rozetka_project.pages;

import lombok.Getter;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j
@Getter
public class CartPopupPage extends BasePage {
    protected final By continueShoppingButton = By.xpath("//button[text()=' Продовжити покупки ']");
    protected final By threeDotsProductButton = By.id("cartProductActions0");
    protected final By deleteProductButton = By.xpath("//button[text()=' Видалити ']");
    protected final By cartIsEmptyMassage = By.xpath("//div/h4[text()='Кошик порожній']");
    protected final By productInCart = By.cssSelector("[class=cart-product__main]");

    public CartPopupPage(WebDriver driver) {
        super(driver);
    }
}
