package rozetka_project.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class HomePage extends BasePage {
    protected final By laptopsAndComputersCategoryInTheMainManu = By.xpath("//li[@class='menu-categories__item ng-star-inserted']/a[text()='Ноутбуки та комп’ютери']");
    protected final By cartIconInMainHeaders = By.xpath("//li[@class='header-actions__item header-actions__item--cart']//span[text()]");

    public HomePage(WebDriver driver) {
        super(driver);
    }
}

