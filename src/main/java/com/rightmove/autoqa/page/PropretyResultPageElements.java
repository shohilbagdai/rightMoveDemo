package com.rightmove.autoqa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author Auto QA team
 *
 */
public class PropretyResultPageElements extends PageElements {

    @FindBy(className = "info-message")
    WebElement infoMessageHeader;

    @FindBy(id = "sortType")
    WebElement sortTypeDropdown;

}
