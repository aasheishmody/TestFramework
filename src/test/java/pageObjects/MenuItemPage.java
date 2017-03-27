package pageObjects;

public class MenuItemPage extends Page {

    //can also add additional checks in the form of breadcrumbs and page header
    public boolean pageIsDisplayed(String menuItem) {
        waitForURLtoContain(menuItem.toLowerCase(), getMediumTimeout());
        return getDriver().getTitle().contains(menuItem) && getDriver().getCurrentUrl().contains(menuItem.toLowerCase());
    }
}
