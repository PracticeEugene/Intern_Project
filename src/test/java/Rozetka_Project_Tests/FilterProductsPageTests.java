package Rozetka_Project_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterProductsPageTests extends BaseTest {

    @Test
    public void checkThatTheProductFilterFiltersByValueRozetka() {
        homePageSteps.clickLaptopsAndComputersCategoryInTheMainMenu();
        computersNotebooksPageSteps.clickLaptopsCategoryInTheListTiles();
        filterPageSteps.clickCheckboxFilterRozetkaInTheFilterMenu();
        basePage.explicitWaitElementIsVisible(driver.findElement(filterPageSteps.getFilterIconRozetka()));
        notebooksPageSteps.clickOnTheFirstLaptopInTheProductList();
        Assert.assertTrue(driver.findElement(productPageSteps.getLogoCustomerRozetka()).isDisplayed());
    }

    @Test
    public void checkThatSearchBrandFieldLookForNeededBrand() {
        homePageSteps.clickLaptopsAndComputersCategoryInTheMainMenu();
        computersNotebooksPageSteps.clickLaptopsCategoryInTheListTiles();
        filterPageSteps.completeTheSearchBrandFieldValueApple();
        basePage.explicitWaitElementIsVisible(driver.findElement(filterPageSteps.getCheckboxApple()));
        filterPageSteps.clickOnTheProductCheckboxAfterSearching();
        driver.findElement(filterPageSteps.getFilterIconApple()).isDisplayed();
        Assert.assertTrue(driver.findElement(notebooksPageSteps.getFirstLaptopOnTheProductList()).getText().contains("Apple"));
    }

    @Test
    public void checkThatPriceFilterDoesNotWorkWithInvalidValue() {
        homePageSteps.clickLaptopsAndComputersCategoryInTheMainMenu();
        computersNotebooksPageSteps.clickLaptopsCategoryInTheListTiles();
        filterPageSteps.clearThePriceFilterFields();
        filterPageSteps.completeThePriceFilterFieldsInvalidValue();
        Assert.assertFalse(driver.findElement(filterPageSteps.getOkPriceFilterButton()).isEnabled());
    }

    @Test
    public void checkThatUserCanToDeleteFilterFields() {
        homePageSteps.clickLaptopsAndComputersCategoryInTheMainMenu();
        computersNotebooksPageSteps.clickLaptopsCategoryInTheListTiles();
        filterPageSteps.clickCheckboxFilterRozetkaInTheFilterMenu();
        filterPageSteps.clickOkButtonPriceFilter();
        filterPageSteps.clickDeleteFilterButton();
        Assert.assertFalse(driver.findElement(filterPageSteps.getDeleteFilterButton()).isDisplayed());
    }
}

