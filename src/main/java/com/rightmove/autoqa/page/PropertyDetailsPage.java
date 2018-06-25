package com.rightmove.autoqa.page;

import com.rightmove.autoqa.commons.WebDriverCommons;

/**
 * 
 * @author Auto QA team
 *
 */
public class PropertyDetailsPage extends Page<PropertyDetailsPageElements> {

    WebDriverCommons webDriverCommons = new WebDriverCommons();

    PropertyDetailsPageElements propertyDetailsPageElements;

    @Override
    public boolean isPageLoaded() {
        return webDriverCommons.isDisplayed(propertyDetailsPageElements.descriptionTab);
    }

    @Override
    public void init() {
        propertyDetailsPageElements = new PropertyDetailsPageElements();
        super.initialiseElements(propertyDetailsPageElements);
    }

    @Override
    public PropertyDetailsPageElements getPageElements() {
        return propertyDetailsPageElements;
    }

}
