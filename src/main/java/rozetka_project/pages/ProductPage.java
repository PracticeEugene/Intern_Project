package rozetka_project.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class ProductPage extends BasePage {
    protected final By buyButtonProductPage = By.xpath("//span[text()=' Купити ']");
    protected final By logoCustomerRozetka = By.xpath("//span[@class='product-seller__logo ng-star-inserted']");
    protected final By carouselRightButton = By.xpath("//app-slider[@class='main-slider ng-star-inserted']//button[@class='simple-slider__control simple-slider__control--next']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }
}
