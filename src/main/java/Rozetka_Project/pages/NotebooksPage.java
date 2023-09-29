package Rozetka_Project.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class NotebooksPage extends BasePage {
    protected final By firstLaptopOnTheProductList = By.xpath("//a[@class='goods-tile__heading ng-star-inserted']");
    protected final By listLaptopWithoutFilterOnThePage = By.xpath("//li[@class='catalog-grid__cell catalog-grid__cell_type_slim ng-star-inserted']");
    protected final By listAppleLaptopOnThePage = By.xpath("//li[@class='catalog-grid__cell catalog-grid__cell_type_slim ng-star-inserted']");

    public NotebooksPage(WebDriver driver) {
        super(driver);
    }
}
