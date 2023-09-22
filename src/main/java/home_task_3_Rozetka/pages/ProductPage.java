package home_task_3_Rozetka.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class ProductPage extends BasePage {
    protected final By buyButtonProductPage = By.xpath("//span[text()=' Купити ']");
    protected final By logoCustomerRozetka = By.xpath("//span[@class='product-seller__logo ng-star-inserted']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }
}
