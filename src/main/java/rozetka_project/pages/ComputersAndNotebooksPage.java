package rozetka_project.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class ComputersAndNotebooksPage extends BasePage {
    protected final By laptopsCategoryInTheListTiles = By.xpath("//a[@title='Ноутбуки']");

    public ComputersAndNotebooksPage(WebDriver driver) {
        super(driver);
    }
}
