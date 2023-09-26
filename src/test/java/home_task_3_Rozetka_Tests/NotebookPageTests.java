package home_task_3_Rozetka_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NotebookPageTests extends BaseTest {

    @Test
    public void checkThatListProductsOnThePageHasNecessaryCountItems() {
        homePageSteps.clickLaptopsAndComputersCategoryInTheMainMenu();
        computersNotebooksPageSteps.clickLaptopsCategoryInTheListTiles();
        Assert.assertEquals(driver.findElements(notebooksPageSteps.getListLaptopWithoutFilterOnThePage()).size(), 60);
    }
}
