package Rozetka_Project_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPopupTests extends BaseTest {

    @Test
    public void checkThatProductCanAddToCart() {
        homePageSteps.clickLaptopsAndComputersCategoryInTheMainMenu();
        computersNotebooksPageSteps.clickLaptopsCategoryInTheListTiles();
        notebooksPageSteps.clickOnTheFirstLaptopInTheProductList();
        basePage.setActions().moveToElement(driver.findElement(productPageSteps.getCarouselRightButton())).perform();
        productPageSteps.clickBuyButtonOnTheProductPage();
        Assert.assertTrue(driver.findElement(cartPopupPageSteps.getProductInCart()).isDisplayed());
        Assert.assertEquals(driver.findElement(homePageSteps.getCartIconInMainHeaders()).getText(), "1");
    }

    @Test
    public void checkThatProductCanDeleteFromCart() {
        homePageSteps.clickLaptopsAndComputersCategoryInTheMainMenu();
        computersNotebooksPageSteps.clickLaptopsCategoryInTheListTiles();
        notebooksPageSteps.clickOnTheFirstLaptopInTheProductList();
        basePage.setActions().moveToElement(driver.findElement(productPageSteps.getCarouselRightButton())).perform();
        productPageSteps.clickBuyButtonOnTheProductPage();
        cartPopupPageSteps.clickThreeDotsProductButtonOnTheCartPopup();
        cartPopupPageSteps.clickDeleteProductButtonOnTheCartPopup();
        Assert.assertEquals(driver.findElement(cartPopupPageSteps.getCartIsEmptyMassage()).getText(), "Кошик порожній");
    }
}
