package stepDefinitions.search;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import static util.LoggerHelper.*;

public class Search extends Page {

    private final CategoryPage categoryPage;
    private final LandingPage landingPage;
    private final SearchResultsPage searchResultsPage;
    private final MenuItemPage menuItemPage;

    public Search() {
        categoryPage = PageFactory.initElements(getDriver(), CategoryPage.class);
        landingPage = PageFactory.initElements(getDriver(), LandingPage.class);
        searchResultsPage = PageFactory.initElements(getDriver(), SearchResultsPage.class);
        menuItemPage = PageFactory.initElements(getDriver(), MenuItemPage.class);
    }

    @Given("^I am on the 'Landing' page$")
    public void iAmOnTheLandingPage() throws Throwable {
        navigating("to the Landing page", () -> landingPage.open());
    }

    @When("^I search for (.*) using the input box$")
    public void iSearchForProductUsingTheInputBox(String searchItem) throws Throwable {
        searching("for "+searchItem+" using the input box", () -> landingPage.searchForProductUsingTheInputBox(searchItem));
    }

    @Then("^the 'Search Results' page for (.*) is displayed$")
    public void theResultsForIPhoneIsDisplayed(String searchItem) throws Throwable {
        asserting("that the search results for "+searchItem+" is displayed", () -> Assert.assertTrue(searchResultsPage.resultsForSearchItemIsDisplayed(searchItem)));
    }

    @When("^I click 'Bangles' using the drop-down menu$")
    public void iClickBanglesUsingTheDropDownMenu() throws Throwable {
        clicking("'Bangles' using the drop-down menu", () -> landingPage.clickBanglesUsingDropDownMenu());
    }

    @Then("^the 'Menu Item' page for (.*) is displayed$")
    public void theMenuItemPageIsDisplayed(String menuItem) throws Throwable {
        asserting("that the 'Menu Item' page for "+menuItem+" is displayed", () -> Assert.assertTrue(menuItemPage.pageIsDisplayed(menuItem)));
    }

    @When("^I click the 'Clothing' icon$")
    public void iClickTheClothingIcon() throws Throwable {
        clicking("'Clothing' icon", () -> landingPage.clickClothingIcon());
    }

    @Then("^the 'Category' page for (.*) is displayed$")
    public void theCategoryPageIsDisplayed(String category) throws Throwable {
        asserting("that the 'Category' page for "+category+" is displayed", () -> Assert.assertTrue(categoryPage.pageIsDisplayed(category)));
    }
}


