package com.rightmove.autoqa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author Auto QA team
 *
 */
public class HomePageElements extends PageElements {

    @FindBy(id = "rm-site-logo")
    public WebElement rmSiteLogo;

    @FindBy(id = "searchLocation")
    public WebElement searchLocationInput;

    @FindBy(id = "buy")
    public WebElement forSaleButton;
    


}
