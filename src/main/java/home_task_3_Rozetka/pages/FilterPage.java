package home_task_3_Rozetka.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class FilterPage extends BasePage {
    protected final By checkboxFilterRozetkaInTheFilterMenu = By.xpath("//a[@data-id='Rozetka']");
    protected final By filterIconRozetka = By.xpath("//a[text()=' Rozetka ']");
    protected final By filterIconApple = By.xpath("//li[@class='catalog-selection__item ng-star-inserted']/a[text()=' Apple ']");
    protected final By searchBrandField = By.xpath("//input[@class='sidebar-search__input ng-pristine ng-valid ng-touched']");
    protected final By checkboxApple = By.xpath("//a[@data-id='Apple']");

    public FilterPage(WebDriver driver) {
        super(driver);
    }
}
