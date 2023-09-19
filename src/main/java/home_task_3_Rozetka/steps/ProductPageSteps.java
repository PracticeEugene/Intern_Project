package home_task_3_Rozetka.steps;

import home_task_3_Rozetka.pages.HomePage;
import home_task_3_Rozetka.pages.ProductPage;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ProductPageSteps extends ProductPage {
    public ProductPageSteps(WebDriver driver) {
        super(driver);
    }


    WebElement item = driver.findElement(By.xpath("//li[@class=\"header-actions__item header-actions__item--user\"]//button[@class=\"header__button ng-star-inserted\"]"));
    HomePage homePage = new HomePage(driver);
    Actions actions = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;


    @Step("Click buy button on the product page")
    public void clickBuyButtonOnTheProductPage() {
        //actions.scrollToElement((WebElement)getBuyButtonProductPage());
        actions.scrollByAmount();
        actions.moveToElement(item);
        //driver.findElement(buyButtonProductPage).click();
        //actions.click((WebElement) buyButtonProductPage).perform();
        //js.executeScript("arguments[0].click", buyButtonProductPage);
    }
}
