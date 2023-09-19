package home_task_3_Rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPopupPage extends BasePage{
    protected final By continueShoppingButton = By.xpath("//button[text()=' Продовжити покупки ']");

    public CartPopupPage(WebDriver driver) {
        super(driver);
    }
}
