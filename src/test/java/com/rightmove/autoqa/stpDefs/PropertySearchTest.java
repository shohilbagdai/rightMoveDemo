package com.rightmove.autoqa.stpDefs;

import org.junit.Assert;
import org.junit.runner.RunWith;
import com.rightmove.autoqa.commons.WebDriverCommons;
import com.rightmove.autoqa.page.HomePage;
import com.rightmove.autoqa.page.PropertyDetailsPage;
import com.rightmove.autoqa.page.PropertySearchResultPage;
import com.rightmove.autoqa.page.SearchFilterPage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

/**
 * 
 * @author Auto QA team
 *
 */
@RunWith(Cucumber.class)
public class PropertySearchTest {

    WebDriverCommons webDriverCommons = new WebDriverCommons();

    HomePage homePage = new HomePage();

    SearchFilterPage searchFilterPage = new SearchFilterPage();

    PropertySearchResultPage propertySearchResultPage = new PropertySearchResultPage();

    PropertyDetailsPage propertyDetailsPage = new PropertyDetailsPage();

    @Before
    public void init() {
        homePage.init();
        searchFilterPage.init();
        propertySearchResultPage.init();
        propertyDetailsPage.init();
    }

    @Given("^I am on Rightmove home page$")
    public void iAmOnRightmoveHomePage() {
        Assert.assertTrue("Rightmove home page is not loaded", homePage.isPageLoaded());
    }

    @When("^I search properties \"([^\"]*)\" at \"([^\"]*)\"$")
    public void iSearchPropertiesAtGivenValue(String searchType, String address) {
        homePage.serchForPropertyWithGivenAddressGivenSearchType(searchType, address);

    }

    @Then("^I should be on search filter page$")
    public void iShouldBeOnSearchFilterPage() {
        Assert.assertTrue("Search filter page is not loaded", searchFilterPage.isPageLoaded());
    }

    @Then("^Search filter heading should display \"([^\"]*)\"$")
    public void searchFilterHeadingShouldDisplayGivenAddress(String address) {
        Assert.assertTrue("Heading on search result page does not contain address which we searched for : " + address, searchFilterPage.getHeadeText()
                                                                                                                                       .contains(
                                                                                                                                               address));
    }

    @When("^I select filter as per following$")
    public void iSelectFilterAsPerFollowing(DataTable data) {
        searchFilterPage.enterSearchVauleAsGiven(data);

    }

    @Then("^I submit to see properties$")
    public void iSubmitToSeeProperties() {
        webDriverCommons.click(searchFilterPage.getPageElements().submitButton);
    }

    @Then("^I should be on search result page$")
    public void iShouldBeOnPropertiesResultPage() {
        Assert.assertTrue("Property search result page is not loaded", propertySearchResultPage.isPageLoaded());
    }

    @Then("^I should see properties displayed as per selected filter$")
    public void iShouldSeePropertiesDisplayedAsPerSelectedFilter(DataTable data) {
    }

    @When("^I select \"([^\"]*)\" from sort drop down$")
    public void iSelectGivenValueFromSortDropdown(String option) {
        propertySearchResultPage.selectGivenOptinFromSortByDropdown(option);

    }

    @Then("^I should see properties are displayed as per selected sort list \"([^\"]*)\"$")
    public void iShouldSeePropertiesAreDisplayedAsPerSelectedSortList(String option) {
    }

    @When("^I click on first Non Features property$")
    public void iClickOnFirstNonFeaturesProperty() throws InterruptedException {
        propertySearchResultPage.selectFirstNonFeatureProperty();
    }

    @Then("^I should see properties details page is displayed$")
    public void iShouldSeePropertiesDetailsPageIsDisplayed() {
        Assert.assertTrue("Property details page is not loaded", propertyDetailsPage.isPageLoaded());
    }

}
