package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends Page {

    @FindBy(id = "search-query")
    private WebElement SearchInputBox;
    @FindBy(css = ".btn.btn-primary")
    private WebElement SearchButton;
    @FindBy(id = "catnav-primary-link-1179-link")
    private WebElement ItemCategoryHeaderForJewellery;
    @FindBy(id = "category-nav-side-nav-1193-link")
    private WebElement BraceletsSubheaderUnderJewelleryCategoryHeader;
    @FindBy(id = "catnav-l3-1194-link")
    private WebElement BanglesMenuItemUnderBraceletsSubheaderForJewellery;
    //change locator
    @FindBy(css = "#content > div > div > span.vesta-hp-category-default > div > div > div:nth-child(3) > a")
    private WebElement ClothingIcon;

    public void open() {
        getDriver().get(getBaseURL());
    }

    public void searchForProductUsingTheInputBox(String searchItem) {
          enterSearchItemInSearchInputBox(searchItem);
          clickSearchButton();
    }

    private void clickSearchButton() {
        click(SearchButton, getMediumTimeout());
    }

    private void enterSearchItemInSearchInputBox(String searchItem) {
        sendKeys(SearchInputBox, searchItem, getMediumTimeout());
    }

    public void clickBanglesUsingDropDownMenu() {
        clickItemCategoryHeaderForJewellery();
        hoverMouseToBraceletsSubheaderUnderJewelleryCategoryHeader();
        clickBanglesMenuItemUnderBraceletsSubheaderForJewellery();
    }

    private void clickBanglesMenuItemUnderBraceletsSubheaderForJewellery() {
        click(BanglesMenuItemUnderBraceletsSubheaderForJewellery, getMediumTimeout());
    }

    private void hoverMouseToBraceletsSubheaderUnderJewelleryCategoryHeader() {
        waitForElementToBeDisplayed(BraceletsSubheaderUnderJewelleryCategoryHeader, getShortTimeout());
        hover(BraceletsSubheaderUnderJewelleryCategoryHeader);
    }

    private void clickItemCategoryHeaderForJewellery() {
        click(ItemCategoryHeaderForJewellery, getMediumTimeout());
    }

    public void clickClothingIcon() {
        click(ClothingIcon, getMediumTimeout());
    }
}