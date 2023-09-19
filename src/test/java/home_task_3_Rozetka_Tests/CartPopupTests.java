package home_task_3_Rozetka_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPopupTests extends BaseTest {

    @Test
    public void test() {
        homePageSteps.clickLaptopsAndComputersCategoryInTheMainMenu();
        computersNotebooksPageSteps.clickLaptopsCategoryInTheListTiles();
        notebooksPageSteps.clickCheckboxFilterRozetkaInTheFilterMenu();
        notebooksPageSteps.clickOnTheFirstLaptopInTheProductList();
        productPageSteps.clickBuyButtonOnTheProductPage();
        cartPopupPageSteps.clickContinueShoppingButtonOnTheCartPopup();
        basePage.implicitWait();
        Assert.assertEquals(driver.findElement(homePageSteps.getCartIconInMainHeaders()).getText(), "1");
    }
}
