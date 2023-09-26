package home_task_3_Rozetka.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class FilterPage extends BasePage {
    protected final By checkboxFilterRozetkaInTheFilterMenu = By.xpath("//a[@data-id='Rozetka']");
    protected final By filterIconRozetka = By.xpath("//a[text()=' Rozetka ']");
    protected final By filterIconApple = By.xpath("//a[text()=' Apple ']");
    protected final By searchBrandField = By.xpath("(//input[@type='search'])[1]");
    protected final By checkboxApple = By.xpath("//a[@data-id='Apple']");
    protected final By minPriceFilterField = By.cssSelector("[formcontrolname='min']");
    protected final By maxPriceFilterField = By.cssSelector("[formcontrolname='max']");
    protected final By okPriceFilterButton = By.cssSelector("[type='submit']");
    protected final By deleteFilterButton = By.xpath("//button[text()=' Скасувати ']");

    public FilterPage(WebDriver driver) {
        super(driver);
    }
}
