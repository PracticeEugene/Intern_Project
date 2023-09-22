package home_task_3_Rozetka_Tests;

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
    public void checkThatSearchBrandFieldLookForBrand() {
        homePageSteps.clickLaptopsAndComputersCategoryInTheMainMenu();
        computersNotebooksPageSteps.clickLaptopsCategoryInTheListTiles();
        filterPageSteps.completeTheSearchBrandFieldValueApple();
        filterPageSteps.clickOnTheProductCheckboxAfterSearching();
        basePage.explicitWaitElementIsVisible(driver.findElement(filterPageSteps.getCheckboxApple())).isDisplayed();
        String str = driver.findElement(notebooksPageSteps.getFirstLaptopOnTheProductList()).getAttribute("title");
        System.out.println(str);
    }
}
