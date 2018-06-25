package com.rightmove.autoqa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author Auto QA team
 *
 */
public class SearchFilterPageElements extends PageElements {

    @FindBy(id = "headerTitle")
    public WebElement headerTitle;

    @FindBy(id = "radius")
    public WebElement radiusInput;

    @FindBy(id = "minPrice")
    public WebElement minPriceDropdown;
    
    @FindBy(id = "maxPrice")
    public WebElement maxPriceDropdown;
    
    @FindBy(id = "minBedrooms")
    public WebElement minBedroomsDropdown;
    
    @FindBy(id = "maxBedrooms")
    public WebElement maxBedroomsDropdown;

    @FindBy(id = "displayPropertyType")
    public WebElement displayPropertyTypeDropdown;

    @FindBy(id = "maxDaysSinceAdded")
    public WebElement maxDaysSinceAddedDropdown;

    @FindBy(id = "submit")
    public WebElement submitButton;

}
