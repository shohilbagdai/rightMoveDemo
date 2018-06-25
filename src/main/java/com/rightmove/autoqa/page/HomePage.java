package com.rightmove.autoqa.page;

import com.rightmove.autoqa.commons.WebDriverCommons;

/**
 * 
 * @author Auto QA team
 *
 */
public class HomePage extends Page<HomePageElements> {

    WebDriverCommons webDriverCommons = new WebDriverCommons();

    HomePageElements homePageElements;

    /**
     * 
     */
    @Override
    public boolean isPageLoaded() {
        return webDriverCommons.isDisplayed(homePageElements.rmSiteLogo);
    }

    /**
     * 
     */
    @Override
    public void init() {
        homePageElements = new HomePageElements();
        super.initialiseElements(homePageElements);

    }

    /**
     * 
     */
    @Override
    public HomePageElements getPageElements() {
        return homePageElements;
    }

    /**
     * 
     * @param address
     * @param searchType
     */
    public void serchForPropertyWithGivenAddressGivenSearchType(String searchType, String address) {
        webDriverCommons.sendKeys(homePageElements.searchLocationInput, address);

        if (searchType.equalsIgnoreCase("For sale")) {
            webDriverCommons.click(homePageElements.forSaleButton);
        }
    }

}
