package home_task_3_Rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComputersNotebooksPage extends BasePage {
    protected final By laptopsCategoryInTheListTiles = By.xpath("//a[@title=\"Ноутбуки\"]");

    public ComputersNotebooksPage(WebDriver driver) {
        super(driver);
    }
}
