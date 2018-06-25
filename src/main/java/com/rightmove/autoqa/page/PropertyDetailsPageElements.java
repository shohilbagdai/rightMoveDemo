package com.rightmove.autoqa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author Auto QA team
 *
 */
public class PropertyDetailsPageElements extends PageElements{

    @FindBy(linkText = "Description")
    WebElement descriptionTab;
}
