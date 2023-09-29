package Rozetka_Project_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPopupPageTests extends BaseTest {

    @Test
    public void checkThatProductCanAddToCart() {
        homePageSteps.clickLaptopsAndComputersCategoryInTheMainMenu();
        computersNotebooksPageSteps.clickLaptopsCategoryInTheListTiles();
        notebooksPageSteps.clickOnTheFirstLaptopInTheProductList();
        productPageSteps.clickBuyButtonOnTheProductPage();
        cartPopupPageSteps.clickContinueShoppingButtonOnTheCartPopup();
        basePage.implicitWaitElement();
        Assert.assertEquals(driver.findElement(homePageSteps.getCartIconInMainHeaders()).getText(), "1");
    }

    @Test
    public void checkThatProductCanDeleteFromCart() {
        homePageSteps.clickLaptopsAndComputersCategoryInTheMainMenu();
        computersNotebooksPageSteps.clickLaptopsCategoryInTheListTiles();
        notebooksPageSteps.clickOnTheFirstLaptopInTheProductList();
        productPageSteps.clickBuyButtonOnTheProductPage();
        cartPopupPageSteps.clickThreeDotsProductButtonOnTheCartPopup();
        cartPopupPageSteps.clickDeleteProductButtonOnTheCartPopup();
        Assert.assertEquals(driver.findElement(cartPopupPageSteps.getCartIsEmptyMassage()).getText(), "Кошик порожній");
    }
}
