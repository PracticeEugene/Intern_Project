package Rozetka_Project.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class ComputersNotebooksPage extends BasePage {
    protected final By laptopsCategoryInTheListTiles = By.xpath("//a[@title='Ноутбуки']");

    public ComputersNotebooksPage(WebDriver driver) {
        super(driver);
    }
}
