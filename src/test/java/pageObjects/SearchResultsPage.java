package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends Page {

    @FindBy(css = "h4.pb-xs-1-5")
    private WebElement TopCategoriesHeader;
    @FindBy(css = "h1.conform-heading.display-inline")
    private WebElement AllCategoriesHeader;

    public boolean resultsForSearchItemIsDisplayed(String searchItem) {
        waitForURLtoContain(searchItem, getMediumTimeout());
        return TopCategoriesHeader.getText().contains(searchItem) && AllCategoriesHeader.getText().contains(searchItem);
    }
}