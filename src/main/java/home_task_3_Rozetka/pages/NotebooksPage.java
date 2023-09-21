package home_task_3_Rozetka.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class NotebooksPage extends BasePage {
    protected final By checkboxFilterRozetkaInTheFilterMenu = By.xpath("//a[@data-id=\"Rozetka\"]");
    protected final By firstLaptopOnTheProductList = By.xpath("//a[@class=\"goods-tile__heading ng-star-inserted\"]");

    public NotebooksPage(WebDriver driver) {
        super(driver);
    }
}
