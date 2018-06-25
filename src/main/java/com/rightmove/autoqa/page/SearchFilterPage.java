package com.rightmove.autoqa.page;

import java.util.List;

import com.rightmove.autoqa.commons.WebDriverCommons;

import cucumber.api.DataTable;

/**
 * 
 * @author Auto QA team
 *
 */
public class SearchFilterPage extends Page<SearchFilterPageElements> {

    WebDriverCommons webDriverCommons = new WebDriverCommons();

    SearchFilterPageElements searchFilterPageElements;

    @Override
    public boolean isPageLoaded() {

        return webDriverCommons.isDisplayed(searchFilterPageElements.headerTitle);
    }

    @Override
    public void init() {
        searchFilterPageElements = new SearchFilterPageElements();
        super.initialiseElements(searchFilterPageElements);

    }

    @Override
    public SearchFilterPageElements getPageElements() {
        return searchFilterPageElements;
    }

    public String getHeadeText() {
        return webDriverCommons.getText(searchFilterPageElements.headerTitle);

    }

    public void enterSearchVauleAsGiven(DataTable data) {
        List<List<String>> obj = data.raw();
        webDriverCommons.selectFromDropdown(searchFilterPageElements.radiusInput, obj.get(0)
                                                                                     .get(0));
        webDriverCommons.selectFromDropdown(searchFilterPageElements.minPriceDropdown, obj.get(0)
                                                                                          .get(1));
        webDriverCommons.selectFromDropdown(searchFilterPageElements.maxPriceDropdown, obj.get(0)
                                                                                          .get(2));
        webDriverCommons.selectFromDropdown(searchFilterPageElements.minBedroomsDropdown, obj.get(0)
                                                                                             .get(3));
        webDriverCommons.selectFromDropdown(searchFilterPageElements.maxBedroomsDropdown, obj.get(0)
                                                                                             .get(4));

        webDriverCommons.selectFromDropdown(searchFilterPageElements.displayPropertyTypeDropdown, obj.get(0)
                                                                                                     .get(5));
        webDriverCommons.selectFromDropdown(searchFilterPageElements.maxDaysSinceAddedDropdown, obj.get(0)
                                                                                                   .get(6));

    }

}
