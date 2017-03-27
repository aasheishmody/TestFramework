package pageObjects;

public class CategoryPage extends Page {

    public boolean pageIsDisplayed(String category) {
        waitForURLtoContain(category.toLowerCase(), getMediumTimeout());
        return getDriver().getTitle().contains(category) && getDriver().getCurrentUrl().contains(category.toLowerCase());
    }
}